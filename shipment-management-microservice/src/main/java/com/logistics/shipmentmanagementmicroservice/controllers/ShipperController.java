package com.logistics.shipmentmanagementmicroservice.controllers;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.logistics.domain.ShipmentDto;
import com.logistics.domain.ShipperDto;
import com.logistics.domain.TaxInvoiceDto;
import com.logistics.domain.UserDto;
import com.logistics.shipmentmanagementmicroservice.convertors.ShipperConvertor;
import com.logistics.shipmentmanagementmicroservice.services.ShipperService;

@RestController
public class ShipperController {

	private ShipperService shipperService;
	
	
	
	public ShipperController(ShipperService shipperService) {
		super();
		this.shipperService = shipperService;
	}

	@GetMapping("/shippers/{userId}")
	public List<ShipperDto> getShipperForUser(@PathVariable String userId) {
		return ShipperConvertor.getInstance().convertList(shipperService.getAllShippersForUser(userId));
	}
	
	@PostMapping("/shipments/taxInvoice")
    public void generateTaxInvoice(@RequestParam("userId") String userId, 
    		@RequestParam("shipments") ShipmentDto[] shipments,
    		@RequestParam("shipper") ShipperDto shipper) throws URISyntaxException {
		UserDto user = getUser(userId);
		TaxInvoiceDto taxInvoice = new TaxInvoiceDto();
		taxInvoice.setUser(user);
		taxInvoice.setShipments(Arrays.asList(shipments));
		taxInvoice.setShipper(shipper);
	}
	
	private UserDto getUser(String userId) throws URISyntaxException {
		RestTemplate template = new RestTemplate();
        URI uri = new URI("http://localhost:8081//user//" + userId);
        ResponseEntity<UserDto> response = template.getForEntity(uri, UserDto.class);
        UserDto user = response.getBody();        
        return user;
	}
	
}
