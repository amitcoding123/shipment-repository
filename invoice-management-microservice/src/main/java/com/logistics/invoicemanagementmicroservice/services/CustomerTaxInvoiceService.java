package com.logistics.invoicemanagementmicroservice.services;

import java.util.List;

import com.logistics.domain.TaxInvoiceDto;
import com.logistics.invoicemanagementmicroservice.model.CustomerTaxInvoice;

public interface CustomerTaxInvoiceService {
	
	CustomerTaxInvoice generateTaxInvoice(TaxInvoiceDto dto);
	List<CustomerTaxInvoice> getCustomerTaxInvoicesForShipper(Long shipperId);

}
