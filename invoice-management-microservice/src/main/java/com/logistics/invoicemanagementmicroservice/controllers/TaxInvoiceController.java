package com.logistics.invoicemanagementmicroservice.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.logistics.domain.CustomerTaxInvoiceDto;
import com.logistics.domain.TaxInvoiceDto;
import com.logistics.invoicemanagementmicroservice.convertors.CustomerTaxInvoiceConvertor;
import com.logistics.invoicemanagementmicroservice.services.CustomerTaxInvoiceService;

@RestController
public class TaxInvoiceController {
	
	private CustomerTaxInvoiceService taxInvoiceService;

	public TaxInvoiceController(CustomerTaxInvoiceService taxInvoiceService) {
		super();
		this.taxInvoiceService = taxInvoiceService;
	}
	
	@PostMapping("/taxInvoices")
	public CustomerTaxInvoiceDto generateCustomerTaxInvoice(@RequestBody TaxInvoiceDto taxInvoiceDto) {
		CustomerTaxInvoiceDto customerTaxInvoiceDto = 
				CustomerTaxInvoiceConvertor.getInstance().convert(taxInvoiceService.generateTaxInvoice(taxInvoiceDto));
		return customerTaxInvoiceDto;
		
	}
	
	@GetMapping("/taxInvoices/{shipperId}")
	public List<CustomerTaxInvoiceDto> getCustomerTaxInvoices(@PathVariable Long shipperId) {
		List<CustomerTaxInvoiceDto> taxInvoices = 
				CustomerTaxInvoiceConvertor.getInstance().convertList(taxInvoiceService.getCustomerTaxInvoicesForShipper(shipperId));
		return taxInvoices;
	}

}
