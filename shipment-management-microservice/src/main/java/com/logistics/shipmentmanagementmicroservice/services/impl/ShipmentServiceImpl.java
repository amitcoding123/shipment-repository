package com.logistics.shipmentmanagementmicroservice.services.impl;

import com.logistics.shipmentmanagementmicroservice.domain.Item;
import com.logistics.shipmentmanagementmicroservice.domain.ItemType;
import com.logistics.shipmentmanagementmicroservice.domain.Shipment;
import com.logistics.shipmentmanagementmicroservice.repositories.ItemTypeRepository;
import com.logistics.shipmentmanagementmicroservice.repositories.ShipmentRepository;
import com.logistics.shipmentmanagementmicroservice.services.ShipmentService;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;

@Service
public class ShipmentServiceImpl implements ShipmentService {

    private final ShipmentRepository shipmentRepository;
    private final ItemTypeRepository itemTypeRepository;

    public ShipmentServiceImpl(ShipmentRepository shipmentRepository, ItemTypeRepository itemTypeRepository) {
        this.shipmentRepository = shipmentRepository;
        this.itemTypeRepository = itemTypeRepository;
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
}
