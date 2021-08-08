package com.logistics.invoicemanagementmicroservice.services.impl;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import org.springframework.stereotype.Service;

import com.logistics.domain.CustomerTaxInvoiceDto;
import com.logistics.domain.TaxInvoiceDto;
import com.logistics.invoicemanagementmicroservice.helpers.TaxInvoicePdfHelper;
import com.logistics.invoicemanagementmicroservice.model.CustomerTaxInvoice;
import com.logistics.invoicemanagementmicroservice.repositories.CustomerTaxInvoiceRepository;
import com.logistics.invoicemanagementmicroservice.services.CustomerTaxInvoiceService;
import com.logistics.invoicemanagementmicroservice.utils.InvoiceUtils;

@Service
public class CustomerTaxInvoiceImpl implements CustomerTaxInvoiceService {
	
	private CustomerTaxInvoiceRepository repository;
	private TaxInvoicePdfHelper taxInvoicePdfHelper;
	
	

	public CustomerTaxInvoiceImpl(CustomerTaxInvoiceRepository repository,
			TaxInvoicePdfHelper taxInvoicePdfHelper) {
		super();
		this.repository = repository;
		this.taxInvoicePdfHelper = taxInvoicePdfHelper;
	}



	@Override
	public CustomerTaxInvoice generateTaxInvoice(TaxInvoiceDto dto) {
		//Set creation date
		dto.setCreatedBy(dto.getUser().getUserId());
		dto.setCreatedOn(LocalDateTime.now());
		dto.setInvoiceDate(LocalDate.now());
		InvoiceUtils invoiceUtils = new InvoiceUtils(7, ThreadLocalRandom.current());
		dto.setTaxInvoiceNumber(invoiceUtils.nextString());
		CustomerTaxInvoice taxInvoice = taxInvoicePdfHelper.generateTaxInvoice(dto);
		taxInvoice = repository.save(taxInvoice);
		return taxInvoice;
	}



	@Override
	public List<CustomerTaxInvoice> getCustomerTaxInvoicesForShipper(Long shipperId) {
		// TODO Auto-generated method stub
		return repository.getTaxInvoicesByShipperId(shipperId);
	}



	@Override
	public CustomerTaxInvoice getCustomerTaxInvoice(Long id) {
		// TODO Auto-generated method stub
		return repository.findById(id).get();
	}

	
	
}
