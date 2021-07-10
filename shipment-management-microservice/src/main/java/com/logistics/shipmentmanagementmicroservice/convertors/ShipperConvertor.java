package com.logistics.shipmentmanagementmicroservice.convertors;

import java.util.ArrayList;
import java.util.List;

import com.logistics.domain.AddressDto;
import com.logistics.domain.ShipmentDto;
import com.logistics.domain.ShipperDto;
import com.logistics.shipmentmanagementmicroservice.domain.Shipment;
import com.logistics.shipmentmanagementmicroservice.domain.Shipper;

public class ShipperConvertor {
	
	private static ShipperConvertor instance;

    private ShipperConvertor() {
    }

    public static ShipperConvertor getInstance() {
        if(instance == null)
            instance = new ShipperConvertor();
        return instance;
    }
    
    public ShipperDto convert(Shipper shipper) {
    	ShipperDto shipperDto = new ShipperDto();
    	
    	shipperDto.setId(shipper.getId());
        shipperDto.setCreatedBy(shipper.getCreatedBy());
        shipperDto.setCreatedOn(shipper.getCreatedOn());
        shipperDto.setModifiedBy(shipper.getModifiedBy());
        shipperDto.setModifiedOn(shipper.getModifiedOn());
        shipperDto.setAadharNumber(shipper.getAadharNumber());
        shipperDto.setEmail(shipper.getEmail());
        shipperDto.setName(shipper.getName());
        shipperDto.setPhoneNumber(shipper.getPhoneNumber());
        shipperDto.setPanNumber(shipper.getPanNumber());
        shipperDto.setAadharContentType(shipper.getAadharContentType());
        shipperDto.setAadharDocument(shipper.getAadharDocument());
        shipperDto.setAadharFileName(shipper.getAadharFileName());
        shipperDto.setPanContentType(shipper.getPanContentType());
        shipperDto.setPanDocument(shipper.getPanDocument());
        shipperDto.setPanFileName(shipper.getPanFileName());
        shipperDto.setGstin(shipper.getGstin());
        shipperDto.setPlace(shipper.getPlace());
        shipperDto.setDob(shipper.getDob());
        AddressDto shipperAddress = new AddressDto();
        shipperAddress.setId(shipper.getAddress().getId());
        shipperAddress.setCreatedBy(shipper.getAddress().getCreatedBy());
        shipperAddress.setCreatedOn(shipper.getAddress().getCreatedOn());
        shipperAddress.setModifiedBy(shipper.getAddress().getModifiedBy());
        shipperAddress.setModifiedOn(shipper.getAddress().getModifiedOn());
        shipperAddress.setAddressLine1(shipper.getAddress().getAddressLine1());
        shipperAddress.setAddressLine2(shipper.getAddress().getAddressLine2());
        shipperAddress.setCity(shipper.getAddress().getCity());
        shipperAddress.setCountry(shipper.getAddress().getCountry());
        shipperAddress.setState(shipper.getAddress().getState());
        shipperAddress.setZipCode(shipper.getAddress().getZipCode());
        shipperDto.setAddress(shipperAddress);
        
        return shipperDto;
    }
    
    public List<ShipperDto> convertList(List<Shipper> shippers)
    {
        List<ShipperDto> shipperDtos = new ArrayList<>(1);

        for (Shipper shipper: shippers) {
        	shipperDtos.add(convert(shipper));
        }

        return shipperDtos;
    }
}
