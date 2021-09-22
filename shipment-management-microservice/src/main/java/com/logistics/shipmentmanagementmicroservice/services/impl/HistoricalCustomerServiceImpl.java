package com.logistics.shipmentmanagementmicroservice.services.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.logistics.shipmentmanagementmicroservice.domain.HistoricalCustomer;
import com.logistics.shipmentmanagementmicroservice.repositories.HistoricalCustomerRepository;
import com.logistics.shipmentmanagementmicroservice.services.HistoricalCustomerService;

@Service
public class HistoricalCustomerServiceImpl implements HistoricalCustomerService {
	
	private HistoricalCustomerRepository repository;
	
	public HistoricalCustomerServiceImpl(HistoricalCustomerRepository repository) {
		super();
		this.repository = repository;
	}

	@Override
	public HistoricalCustomer addHistoricalCustomer(HistoricalCustomer historicalCustomer) {		
		return repository.save(historicalCustomer);
	}

	@Override
	public void modifyHistoricalCustomer(HistoricalCustomer historicalCustomer) {
		repository.save(historicalCustomer);
	}

	@Override
	public HistoricalCustomer getHistoricalCustomer(Long id) {
		return repository.findById(id).get();
	}

	@Override
	public List<HistoricalCustomer> getAllHistoricalCustomers() {
		return repository.findAll();
	}

}
