package com.logistics.invoicemanagementmicroservice.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.logistics.invoicemanagementmicroservice.model.CustomerTaxInvoice;

@Repository
public interface CustomerTaxInvoiceRepository extends JpaRepository<CustomerTaxInvoice, Long> {
	
	List<CustomerTaxInvoice> getTaxInvoicesByShipperId(Long shipperId);

}
