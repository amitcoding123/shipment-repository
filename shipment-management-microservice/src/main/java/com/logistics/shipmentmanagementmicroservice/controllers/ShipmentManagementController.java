package com.logistics.shipmentmanagementmicroservice.controllers;

import com.logistics.domain.*;
import com.logistics.shipmentmanagementmicroservice.convertors.ChargeConvertor;
import com.logistics.shipmentmanagementmicroservice.convertors.ShipmentConvertor;
import com.logistics.shipmentmanagementmicroservice.convertors.ShipmentDtoConvertor;
import com.logistics.shipmentmanagementmicroservice.domain.*;
import com.logistics.shipmentmanagementmicroservice.helper.TrackingNumberGenerator;
import com.logistics.shipmentmanagementmicroservice.services.ChargeService;
import com.logistics.shipmentmanagementmicroservice.services.ShipmentService;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.net.URISyntaxException;
import java.time.LocalDateTime;
import java.util.List;

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

}
