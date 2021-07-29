package com.logistics.shipmentmanagementmicroservice.services.impl;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.logistics.domain.TrackingCSV;
import com.logistics.shipmentmanagementmicroservice.domain.Item;
import com.logistics.shipmentmanagementmicroservice.domain.ItemType;
import com.logistics.shipmentmanagementmicroservice.domain.Shipment;
import com.logistics.shipmentmanagementmicroservice.domain.Shipper;
import com.logistics.shipmentmanagementmicroservice.repositories.ItemTypeRepository;
import com.logistics.shipmentmanagementmicroservice.repositories.ShipmentRepository;
import com.logistics.shipmentmanagementmicroservice.services.ShipmentService;
import com.logistics.shipmentmanagementmicroservice.services.ShipperService;

@Service
public class ShipmentServiceImpl implements ShipmentService {

    private final ShipmentRepository shipmentRepository;
    private final ItemTypeRepository itemTypeRepository;
    private final ShipperService shipperService;

    public ShipmentServiceImpl(ShipmentRepository shipmentRepository, ItemTypeRepository itemTypeRepository,
    		ShipperService shipperService) {
        this.shipmentRepository = shipmentRepository;
        this.itemTypeRepository = itemTypeRepository;
        this.shipperService = shipperService;
    }

    @Override
    public List<Shipment> findUserShipments(String userId) {
        List<Shipment> shipments;
        System.out.println("User ID = " + userId);        
        shipments = shipmentRepository.findByUserId(userId);
        Collections.sort(shipments);
        System.out.println("Shipments size = " + shipments.size());        
        return shipments;
    }

    @Override
    public Shipment findShipmentById(Long id) {
        Shipment shipment = shipmentRepository.findById(id).get();
        return shipment;
    }

    @Override
    public Shipment findByTrackingNumber(Long trackingNumber) {
        return shipmentRepository.findByTrackingNumber(trackingNumber);
    }

    @Override
    public Shipment saveShipment(Shipment shipment) {
        //Set the ItemType returned from database
    	Shipper shipper = shipperService.saveShipper(shipment.getShipper());
    	shipment.setShipper(shipper);
    	shipment.setTaxInvoiceGenerated("N");
        removeNullItems(shipment);
        return shipmentRepository.save(shipment);
    }

    private void removeNullItems(Shipment shipment) {
        Set<Item> items = new HashSet<>();
        for (Item item: shipment.getItems()) {
            if(item == null) {
                continue;
            }
            ItemType itemTypeFromDB = itemTypeRepository.findById(item.getItemType().getId()).get();
            item.setItemType(itemTypeFromDB);
            item.setShipment(shipment);
            items.add(item);
        }
        shipment.setItems(items);
    }

    @Override
    public void deleteShipment(Long id) {
        shipmentRepository.deleteById(id);
    }

    @Override
    public Shipment updateShipment(Shipment shipment) {
    	Shipper shipper = shipperService.saveShipper(shipment.getShipper());
    	shipment.setShipper(shipper);
    	shipment.setTaxInvoiceGenerated("N");
        removeNullItems(shipment);        
        return shipmentRepository.save(shipment);
    }

    @Override
    public List<Shipment> getTodaysShipmentsForUser(String userId) {

        List<Shipment> shipments = shipmentRepository.findByUserId(userId);
        List<Shipment> filtered = new ArrayList<>();
        for (Shipment shipment: shipments) {
            if(shipment.getModifiedOn().toLocalDate().equals(LocalDateTime.now().toLocalDate())) {
                filtered.add(shipment);
            }
        }
        return filtered;
    }
    
    @Override
    public Integer findUserShipmentsCount(String userId) {
    	return shipmentRepository.findByUserId(userId) != null ? shipmentRepository.findByUserId(userId).size() : 0;
    }

	@Override
	public Shipment saveAadharDocument(Long id, String contentType, String fileName, byte[] content, String type) {
		Shipment shipment = shipmentRepository.findById(id).get();
		if(type.equals("A")) {
			shipment.getShipper().setAadharContentType(contentType);
			shipment.getShipper().setAadharFileName(fileName);
			shipment.getShipper().setAadharDocument(content);
		} else {
			shipment.getShipper().setPanContentType(contentType);
			shipment.getShipper().setPanFileName(fileName);
			shipment.getShipper().setPanDocument(content);
		}
		shipmentRepository.save(shipment);
		return shipment;
	}

	@Override
	public void bulkUpdate(List<TrackingCSV> trackingList) {
		LocalDateTime currentDate = LocalDateTime.now();
		for(int i = 0; i < trackingList.size(); i++) {
			TrackingCSV item = trackingList.get(i);
			Shipment shipment = shipmentRepository.findByInvoiceNumber(item.getInvoiceNumber());
			shipment.setTrackingNumber(item.getTrackingNumber());
			shipment.setModifiedOn(currentDate);
			shipmentRepository.save(shipment);
		}
	}

	@Override
	public List<Shipment> getEligibleShipmentsForTaxInvoice(String userId, Long shipperId) {
		
		List<Shipment> shipments = shipmentRepository.findByUserId(userId);
		List<Shipment> filteredShipments = shipments.stream().filter(shipment -> 
			shipment.getShipper().getId().equals(shipperId) && shipment.getTaxInvoiceGenerated().equals("N")).collect(
				Collectors.toList());
		return filteredShipments;
	}
    
	
    
    
}
