package com.logistics.invoicemanagementmicroservice.convertors;

import java.util.ArrayList;
import java.util.List;

import com.logistics.domain.CustomerTaxInvoiceDto;
import com.logistics.invoicemanagementmicroservice.model.CustomerTaxInvoice;

public class CustomerTaxInvoiceConvertor {
	
	private static CustomerTaxInvoiceConvertor _instance;
	
	private CustomerTaxInvoiceConvertor () {
		
	}
	
	public static CustomerTaxInvoiceConvertor getInstance() {
		if(_instance == null)
			_instance = new CustomerTaxInvoiceConvertor();
		return _instance;
	}
	
	public CustomerTaxInvoiceDto convert(CustomerTaxInvoice taxInvoice) {
		CustomerTaxInvoiceDto invoiceDto = new CustomerTaxInvoiceDto();
		
		invoiceDto.setContentType(taxInvoice.getContentType());
		invoiceDto.setCreatedOn(taxInvoice.getCreatedOn());
		invoiceDto.setFileName(taxInvoice.getFileName());
		invoiceDto.setId(taxInvoice.getId());
		invoiceDto.setTaxInvoice(taxInvoice.getTaxInvoice());
		invoiceDto.setUserId(taxInvoice.getUserId());
		invoiceDto.setShipperId(taxInvoice.getShipperId());
		
		return invoiceDto;
	}
	
	public List<CustomerTaxInvoiceDto> convertList(List<CustomerTaxInvoice> taxInvoices) {
		List<CustomerTaxInvoiceDto> invoiceDtos = new ArrayList<>(1);
		
		for(CustomerTaxInvoice invoice: taxInvoices) {
			invoiceDtos.add(convert(invoice));
		}
		
		return invoiceDtos;
	}

}
