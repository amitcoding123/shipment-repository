package com.logistics.shipmentmanagementmicroservice.services.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.logistics.shipmentmanagementmicroservice.domain.Shipper;
import com.logistics.shipmentmanagementmicroservice.repositories.ShipperRepository;
import com.logistics.shipmentmanagementmicroservice.services.ShipperService;

@Service
public class ShipperServiceImpl implements ShipperService {
	
	private ShipperRepository shipperRepository;
	
	

	public ShipperServiceImpl(ShipperRepository shipperRepository) {
		super();
		this.shipperRepository = shipperRepository;
	}



	@Override
	public List<Shipper> getAllShippersForUser(String userId) {
		List<Shipper> shippers = null;
		if(userId.equals("all")) {
			shippers = shipperRepository.findAll();
		} else {			
			shippers = shipperRepository.findByCreatedBy(userId);
		}
		return shippers;		
	}



	@Override
	public Shipper saveShipper(Shipper shipper) {
		Shipper persistedShipper = null;
		if(shipper.getId() != null) {
			persistedShipper = shipperRepository.findById(shipper.getId()).get();			
		} else if(shipper != null) {
			persistedShipper = shipperRepository.findByAadharNumber(shipper.getAadharNumber());
		} 
		
		if(persistedShipper == null)
			persistedShipper = shipper;
		
		persistedShipper.setDob(shipper.getDob());;
		persistedShipper.setEmail(shipper.getEmail());
		persistedShipper.setGstin(shipper.getGstin());
		persistedShipper.setModifiedBy(shipper.getModifiedBy());
		persistedShipper.setModifiedOn(shipper.getModifiedOn());
		persistedShipper.setName(shipper.getName());
		persistedShipper.setPhoneNumber(shipper.getPhoneNumber());
		
		return shipperRepository.save(persistedShipper);
	}
	
	
}
