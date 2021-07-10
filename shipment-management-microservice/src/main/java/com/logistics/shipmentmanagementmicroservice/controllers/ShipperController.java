package com.logistics.shipmentmanagementmicroservice.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.logistics.domain.ShipperDto;
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
	
}
