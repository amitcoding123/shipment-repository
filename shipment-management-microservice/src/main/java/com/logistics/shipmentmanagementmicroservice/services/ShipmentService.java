package com.logistics.shipmentmanagementmicroservice.services;

import com.logistics.shipmentmanagementmicroservice.domain.Shipment;

import java.util.List;

public interface ShipmentService {

    public List<Shipment> findUserShipments(String userId);
    
    public Integer findUserShipmentsCount(String userId);

    public Shipment findShipmentById(Long id);

    public Shipment findByTrackingNumber(Long trackingNumber);

    public Shipment saveShipment(Shipment shipment);

    public void deleteShipment(Long id);

    public Shipment updateShipment(Shipment shipment);

    public List<Shipment> getTodaysShipmentsForUser(String userId);
    
    public Shipment saveAadharDocument(Long id, String contentType, String fileName, byte[] content, String type);

}
