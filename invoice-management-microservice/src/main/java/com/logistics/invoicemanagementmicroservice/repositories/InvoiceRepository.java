package com.logistics.invoicemanagementmicroservice.repositories;

import com.logistics.invoicemanagementmicroservice.model.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface InvoiceRepository extends JpaRepository<Invoice, Long> {

    public Optional<Invoice> findInvoiceByShipmentId(Long shipmentId);

}
