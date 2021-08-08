package com.logistics.shipmentmanagementmicroservice.services;

import java.util.List;

import com.logistics.shipmentmanagementmicroservice.domain.HistoricalCustomer;

public interface HistoricalCustomerService {

	void addHistoricalCustomer(HistoricalCustomer historicalCustomer);
	void modifyHistoricalCustomer(HistoricalCustomer historicalCustomer);
	HistoricalCustomer getHistoricalCustomer(Long id);
	List<HistoricalCustomer> getAllHistoricalCustomers();
	
}
