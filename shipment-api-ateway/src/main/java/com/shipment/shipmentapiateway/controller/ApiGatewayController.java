package com.shipment.shipmentapiateway.controller;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URISyntaxException;
import java.util.List;

import org.springframework.core.io.ByteArrayResource;
import org.springframework.core.io.InputStreamResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.logistics.domain.ChargeDto;
import com.logistics.domain.CustomerTaxInvoiceDto;
import com.logistics.domain.DSRDto;
import com.logistics.domain.InvoiceDto;
import com.logistics.domain.ItemTypeDto;
import com.logistics.domain.ShipmentDto;
import com.logistics.domain.ShipperDto;
import com.logistics.domain.TaxInvoiceDto;
import com.logistics.domain.TrackingCSV;
import com.logistics.domain.UserDto;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;
import com.shipment.shipmentapiateway.controller.rest.WebServiceInterface;

@RestController
public class ApiGatewayController {

    private WebServiceInterface webServiceInterface;

    public ApiGatewayController(WebServiceInterface webServiceInterface) {
        this.webServiceInterface = webServiceInterface;
    }

    @GetMapping("/users")
    public List<UserDto> getUsers() throws URISyntaxException {
        List<UserDto> users = webServiceInterface.getAllUsers();
        return users;
    }

    @PostMapping("/user/authenticate")
    public UserDto authenticateUser(@RequestBody UserDto user) throws URISyntaxException {
        System.out.println("In the user controller. UserId = " + user.getUserId());
        UserDto user1 = webServiceInterface.authenticate(user);
        System.out.println("API Gateway: Returning user = " + user1.getUserId());
        return user1;
    }

    @GetMapping("/otp/generate/{userId}")
    public Boolean generateOtp(@PathVariable String userId) throws URISyntaxException {
        return webServiceInterface.generaeOtp(userId);
    }

    @GetMapping("/otp/validate/{userId}/{otp}")
    public Boolean validateOtp(@PathVariable String userId, @PathVariable String otp) throws URISyntaxException {
        return webServiceInterface.validateOtp(userId, otp);
    }

    @PostMapping("/saveNewPassword")
    public void saveNewPassword(@RequestBody UserDto user) throws URISyntaxException {
        webServiceInterface.saveNewPassword(user);
    }

    @GetMapping("/shipments/user/{userId}")
    public List<ShipmentDto> getShipmentsForUser(@PathVariable String userId) throws URISyntaxException {
        return webServiceInterface.findUserShipments(userId);
    }

    @GetMapping("/shipments/{id}")
    public ShipmentDto getShipmentDetails(@PathVariable Long id) throws URISyntaxException {
        return webServiceInterface.getShipmentDetails(id);
    }

    @PostMapping("/shipments")
    public ShipmentDto saveShipment(@RequestBody ShipmentDto shipment) throws URISyntaxException {
        shipment = webServiceInterface.saveShipment(shipment);
        return shipment;
    }

    @DeleteMapping("/shipments/{id}")
    public ShipmentDto deleteShipment(@PathVariable Long id) throws URISyntaxException {
        webServiceInterface.deleteShipment(id);
        return null;
    }

    @PutMapping("/shipments")
    public ShipmentDto updateShipment(@RequestBody ShipmentDto shipment) throws URISyntaxException {
        return webServiceInterface.updateShipment(shipment);
    }

    @GetMapping("/shipments/charge/{country}/{category}/{weight}/{provider}")
    public ChargeDto getChargeForShipment(@PathVariable String country, @PathVariable String category, @PathVariable String weight, @PathVariable String provider) throws URISyntaxException {
        return webServiceInterface.getChargeForShipment(country, category, weight, provider);
    }

    @GetMapping("/shipments/itemtypes")
    public List<ItemTypeDto> getAllItemType() throws URISyntaxException {
        return webServiceInterface.getAllItemTypes();
    }

    @GetMapping("/invoice/{shipmentId}")
    public ResponseEntity<Resource> retrieveInvoice(@PathVariable Long shipmentId) throws URISyntaxException {
        String name = "invoice_" + shipmentId + ".xslx";
        InvoiceDto invoice = webServiceInterface.retrieveInvoice(shipmentId);
        String contentType = "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet";
//        ByteArrayInputStream stream = new ByteArrayInputStream(invoice.getInvoice());
//        HttpHeaders headers = new HttpHeaders();
//        headers.setContentType(new MediaType("vnd.ms-excel", "force-download"));
//        headers.add("Content-Disposition", "attachment; filename=" + name);
//        return new ResponseEntity<>(new ByteArrayResource(invoice.getInvoice()), headers
//        , HttpStatus.CREATED);
        Resource resource = new ByteArrayResource(invoice.getInvoice());
    	return ResponseEntity.ok()
    			.contentType(MediaType.parseMediaType(contentType))
    			.header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + 
    			name + "\"").body(resource);
    }

    @GetMapping("/dsrs/{userId}")
    public List<DSRDto> getDSRs(@PathVariable String userId) throws URISyntaxException {
        return webServiceInterface.getDSRs(userId);
    }

    @GetMapping("/dsrs/file/{id}")
    public ResponseEntity<InputStreamResource> retrieveDSR(@PathVariable Long id) throws URISyntaxException {
        String name = "dsr_" + id + ".xslx";
        DSRDto dsr = webServiceInterface.retrieveDSR(id);
        ByteArrayInputStream stream = new ByteArrayInputStream(dsr.getDsr());
        HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Disposition", "attachment; filename=" + name);
        return ResponseEntity.ok().headers(headers).body(new InputStreamResource(stream));
    }
    
    @PostMapping("/uploadFile")
    public void uploadFile(@RequestParam("file") MultipartFile file, @RequestParam("shipmentId") String shipmentId
    		, @RequestParam("type") String type) {
    	try {
	    	System.out.println(file);
	    	System.out.println(file.getContentType());
	    	System.out.println(file.getName());
	    	System.out.println(file.getBytes());
	    	System.out.println(file.getOriginalFilename());
	    	webServiceInterface.uploadDocument(file, shipmentId, type);
//	    	Shipment shipment = shipmentService.saveAadharDocument(shipmentId, file.getContentType(), file.getOriginalFilename(), 
//	    			file.getBytes(), type);
//	    	System.out.println(shipment);
    	} catch (Exception ex) {
    		System.out.println(ex);
    	} 	
    	
    }
    
    @PostMapping("/bulkUpdate")
    public void bulkUpdate(@RequestParam("file") MultipartFile file, @RequestParam("userId") String userId) {
    	try (Reader reader = new BufferedReader(new InputStreamReader(file.getInputStream()))) {
    		
    		CsvToBean<TrackingCSV> csvToBean = new CsvToBeanBuilder(reader)
    				.withType(TrackingCSV.class)
    				.withIgnoreLeadingWhiteSpace(true)
    				.build();
    		List<TrackingCSV> entries = csvToBean.parse();
    		System.out.println("Size = " + entries.size());
    		webServiceInterface.bulkUpdate(entries, userId);
	    	
    	} catch (Exception ex) {
    		System.out.println(ex);
    	}
    }
    
    @GetMapping("/downloadFile/{shipmentId}/{type}") 
    public ResponseEntity<Resource> downloadFile(@PathVariable Long shipmentId, @PathVariable String type) 
    throws URISyntaxException {
    	ShipmentDto shipment = webServiceInterface.getShipmentDetails(shipmentId);
    	Resource resource = null;    	
    	if(type.equals("A")) {
    		resource = new ByteArrayResource(shipment.getShipper().getAadharDocument());
	    	return ResponseEntity.ok()
	    			.contentType(MediaType.parseMediaType(shipment.getShipper().getAadharContentType()))
	    			.header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + 
	    			shipment.getShipper().getAadharFileName() + "\"").body(resource);
    	} else {
    		resource = new ByteArrayResource(shipment.getShipper().getPanDocument());
    		return ResponseEntity.ok()
	    			.contentType(MediaType.parseMediaType(shipment.getShipper().getPanContentType()))
	    			.header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + 
	    			shipment.getShipper().getPanFileName() + "\"").body(resource);
    	}
    }
    
    @PostMapping("/shipments/itemtypes")
    public ItemTypeDto createItemType(@RequestBody ItemTypeDto itemType) throws URISyntaxException {
    	return webServiceInterface.createItemType(itemType);
    }
    
    @GetMapping("/shippers/{userId}")
	public List<ShipperDto> getShipperForUser(@PathVariable String userId) throws URISyntaxException {
		return webServiceInterface.getShippersForUser(userId);
	}
    
    @PostMapping("/customerTaxInvoices") 
    public ResponseEntity<Resource> generateCustomerInvoice(@RequestBody TaxInvoiceDto taxInvoiceDto) 
    throws URISyntaxException {
    	CustomerTaxInvoiceDto dto = webServiceInterface.generateCustomerTaxInvoice(taxInvoiceDto);
    	Resource resource = null;    	
    	
		resource = new ByteArrayResource(dto.getTaxInvoice());
    	return ResponseEntity.ok()
    			.contentType(MediaType.parseMediaType(dto.getContentType()))
    			.header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + 
    			dto.getFileName() + "\"").body(resource);    	
    }
    
    @GetMapping("/taxInvoices/{shipperId}")
	public List<CustomerTaxInvoiceDto> getCustomerTaxInvoices(@PathVariable Long shipperId) throws URISyntaxException {
		List<CustomerTaxInvoiceDto> taxInvoices = 
				webServiceInterface.getTaxInvoicesForShipper(shipperId);
		return taxInvoices;
	}
    
    @GetMapping("/shipments/taxInvoices/{userId}/{shipperId}")
    public List<ShipmentDto> getEligibleShipments(@PathVariable String userId, @PathVariable Long shipperId) 
    	throws URISyntaxException{
    	return webServiceInterface.getEligibleShipments(userId, shipperId);
    }

}
