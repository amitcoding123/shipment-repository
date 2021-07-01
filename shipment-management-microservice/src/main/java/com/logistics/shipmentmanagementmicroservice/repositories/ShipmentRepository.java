package com.logistics.shipmentmanagementmicroservice.repositories;

import com.logistics.shipmentmanagementmicroservice.domain.Shipment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ShipmentRepository extends JpaRepository<Shipment, Long> {

    public List<Shipment> findByUserId(String userId);

    public Shipment findByTrackingNumber(Long trackingNumber);
    
    public Shipment findByInvoiceNumber(String invoiceNumber);

}
