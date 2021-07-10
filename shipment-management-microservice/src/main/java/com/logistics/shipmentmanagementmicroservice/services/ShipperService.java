package com.logistics.shipmentmanagementmicroservice.services;

import java.util.List;

import com.logistics.shipmentmanagementmicroservice.domain.Shipper;

public interface ShipperService {
	
	List<Shipper> getAllShippersForUser(String userId);
	Shipper saveShipper(Shipper shipper);

}
