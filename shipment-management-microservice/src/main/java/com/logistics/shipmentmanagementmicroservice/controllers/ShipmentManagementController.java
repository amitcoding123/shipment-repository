package com.logistics.shipmentmanagementmicroservice.controllers;

import java.net.URI;
import java.net.URISyntaxException;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.core.io.ByteArrayResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.multipart.MultipartFile;

import com.logistics.domain.ChargeDto;
import com.logistics.domain.CourierServiceProvider;
import com.logistics.domain.ItemDto;
import com.logistics.domain.ShipementCategory;
import com.logistics.domain.ShipmentDto;
import com.logistics.shipmentmanagementmicroservice.convertors.ChargeConvertor;
import com.logistics.shipmentmanagementmicroservice.convertors.ShipmentConvertor;
import com.logistics.shipmentmanagementmicroservice.convertors.ShipmentDtoConvertor;
import com.logistics.shipmentmanagementmicroservice.domain.Shipment;
import com.logistics.shipmentmanagementmicroservice.helper.TrackingNumberGenerator;
import com.logistics.shipmentmanagementmicroservice.services.ChargeService;
import com.logistics.shipmentmanagementmicroservice.services.ShipmentService;

@RestController
@EnableScheduling
public class ShipmentManagementController {

    private final ShipmentService shipmentService;
    private final TrackingNumberGenerator trackingNumberGenerator;
    private final ShipmentDtoConvertor shipmentDtoConvertor;
    private final ChargeService chargeService;

    public ShipmentManagementController(ShipmentService shipmentService, TrackingNumberGenerator trackingNumberGenerator, ShipmentDtoConvertor shipmentDtoConvertor, ChargeService chargeService) {
        this.shipmentService = shipmentService;
        this.trackingNumberGenerator = trackingNumberGenerator;
        this.shipmentDtoConvertor = shipmentDtoConvertor;
        this.chargeService = chargeService;
    }

    @GetMapping("/shipments/user/{userId}")
    public List<ShipmentDto> getShipmentsForUser(@PathVariable String userId) {
    	return ShipmentConvertor.getInstance().convertList(shipmentService.findUserShipments(userId));
    }

    @GetMapping("/shipments/{id}")
    public com.logistics.domain.ShipmentDto getShipmentDetails(@PathVariable Long id) {
        return ShipmentConvertor.getInstance().convert(shipmentService.findShipmentById(id));
    }
    
    @PostMapping("/shipments")
    public com.logistics.domain.ShipmentDto saveShipment(@RequestBody com.logistics.domain.ShipmentDto shipment) {
        shipment.setTrackingNumber(trackingNumberGenerator.generateTrackingNumber(12));
        setAuditDetails(shipment, true);
        System.out.println("Payment Mode : " + shipment.getPaymentMode());
        shipment = ShipmentConvertor.getInstance().convert(shipmentService.saveShipment(ShipmentConvertor.getInstance().reverseConvert(shipment)));
//        ShipmentDto dto = shipmentDtoConvertor.fromShipment(shipment);
        try {
            generateInvoice(shipment);
        } catch(Exception ex) {
            ex.printStackTrace();
        }
        return shipment;
    }

    @DeleteMapping("/shipments/{id}")
    public com.logistics.domain.ShipmentDto deleteShipment(@PathVariable Long id) {
        com.logistics.domain.ShipmentDto shipment = ShipmentConvertor.getInstance().convert(shipmentService.findShipmentById(id));
        shipmentService.deleteShipment(id);
        return shipment;
    }

    @PutMapping("/shipments")
    public com.logistics.domain.ShipmentDto updateShipment(@RequestBody com.logistics.domain.ShipmentDto shipment) {
        setAuditDetails(shipment, false);
        return ShipmentConvertor.getInstance().convert(shipmentService.updateShipment(ShipmentConvertor.getInstance().reverseConvert(shipment)));
    }

    @GetMapping("/shipments/charge/{country}/{category}/{weight}/{provider}")
    public ChargeDto getChargeForShipment(@PathVariable String country, @PathVariable String category, @PathVariable String weight, @PathVariable String provider) {
        ShipementCategory cat = null;
        if(category.equals("DOC") && Double.valueOf(weight) <= 2.5) {
            cat = ShipementCategory.DOC;
        } else if (category.equals("DOC") && Double.valueOf(weight) > 2.5) {
            cat = ShipementCategory.BOTH;
        } else if(category.equals("NON_DOC") && Double.valueOf(weight) <= 2.5) {
            cat = ShipementCategory.NON_DOC;
        } else {
            cat = ShipementCategory.BOTH;
        }
        CourierServiceProvider provider1 = null;
        if(provider.equals("FEDEX"))
            provider1 = CourierServiceProvider.FEDEX;
        else if(provider.equals("DHL"))
            provider1 = CourierServiceProvider.DHL;
        ChargeDto charge = ChargeConvertor.getInstance().convert(chargeService.getCharge(country, cat, Double.valueOf(weight), provider1));
        return charge;
    }

    private void generateInvoice(ShipmentDto dto) throws URISyntaxException {
        RestTemplate template = new RestTemplate();
        URI uri = new URI("http://localhost:8200/invoice");
        template.postForEntity(uri, dto, String.class);
    }

    private void setAuditDetails(com.logistics.domain.ShipmentDto shipment, Boolean createCase) {
        String user = shipment.getUserId();
        LocalDateTime currentTime = LocalDateTime.now();

        if(shipment.getId() == null) {
            shipment.setCreatedBy(user);
            shipment.setCreatedOn(currentTime);
        }
        if(shipment.getShipper().getId() == null) {
            shipment.getShipper().setCreatedOn(currentTime);
            shipment.getShipper().setCreatedBy(user);
        }
        if(shipment.getConsignee().getId() == null) {
            shipment.getConsignee().setCreatedBy(user);
            shipment.getConsignee().setCreatedOn(currentTime);
        }
        if(shipment.getShipper().getAddress().getId() == null) {
            shipment.getShipper().getAddress().setCreatedBy(user);
            shipment.getShipper().getAddress().setCreatedOn(currentTime);
        }
        if(shipment.getConsignee().getAddress().getId() == null) {
            shipment.getConsignee().getAddress().setCreatedBy(user);
            shipment.getConsignee().getAddress().setCreatedOn(currentTime);
        }

        shipment.setModifiedOn(currentTime);
        shipment.setModifiedBy(user);
        shipment.getShipper().setModifiedBy(user);
        shipment.getShipper().setModifiedOn(currentTime);
        shipment.getConsignee().setModifiedBy(user);
        shipment.getConsignee().setModifiedOn(currentTime);
        shipment.getShipper().getAddress().setModifiedBy(user);
        shipment.getShipper().getAddress().setModifiedOn(currentTime);
        shipment.getConsignee().getAddress().setModifiedBy(user);
        shipment.getConsignee().getAddress().setModifiedOn(currentTime);
        for (ItemDto item: shipment.getItems()
             ) {
            if(item != null) {
                if(item.getId() == null) {
                    item.setCreatedBy(user);
                    item.setCreatedOn(currentTime);
                }
                item.setModifiedBy(user);
                item.setModifiedOn(currentTime);
            }
        }
    }
    
    @PostMapping("/uploadFile")
    public void uploadFile(@RequestParam("file") byte[] file, @RequestParam("contentType") String contentType,
    		@RequestParam("fileName") String fileName,
    		@RequestParam("shipmentId") Long shipmentId
    		, @RequestParam("type") String type) {
    	try {
	    	System.out.println(file);
	    	System.out.println(contentType);
	    	System.out.println(fileName);
	    	Shipment shipment = shipmentService.saveAadharDocument(shipmentId, contentType, fileName, file, type);
	    	System.out.println(shipment);
    	} catch (Exception ex) {
    		System.out.println(ex);
    	}
    }
    
    @GetMapping("/downloadFile/{shipmentId}/{type}") 
    public ResponseEntity<Resource> downloadFile(@PathVariable Long shipmentId, @PathVariable char type) {
    	Shipment shipment = shipmentService.findShipmentById(shipmentId);
    	Resource resource = null;
    	resource = new ByteArrayResource(shipment.getShipper().getAadharDocument());
    	if(type == 'A') {
	    	return ResponseEntity.ok()
	    			.contentType(MediaType.parseMediaType(shipment.getShipper().getAadharContentType()))
	    			.header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + 
	    			shipment.getShipper().getAadharFileName() + "\"").body(resource);
    	} else {
    		return ResponseEntity.ok()
	    			.contentType(MediaType.parseMediaType(shipment.getShipper().getPanContentType()))
	    			.header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + 
	    			shipment.getShipper().getPanFileName() + "\"").body(resource);
    	}
    }

}
