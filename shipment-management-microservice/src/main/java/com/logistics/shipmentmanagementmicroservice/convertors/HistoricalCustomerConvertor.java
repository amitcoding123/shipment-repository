package com.logistics.shipmentmanagementmicroservice.convertors;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.logistics.domain.HistoricalCustomerDto;
import com.logistics.shipmentmanagementmicroservice.domain.HistoricalCustomer;

@Component
public class HistoricalCustomerConvertor {
	
	public HistoricalCustomerDto convert(HistoricalCustomer historicalCustomer) {
		HistoricalCustomerDto dto = new HistoricalCustomerDto();
		
		dto.setId(historicalCustomer.getId());
		dto.setMobileNumber(historicalCustomer.getMobileNumber());
		dto.setName(historicalCustomer.getName());
		dto.setYearLastBooked(historicalCustomer.getYearLastBooked());		
		
		return dto;
	}
	
	public List<HistoricalCustomerDto> convertList(List<HistoricalCustomer> customers) {
		List<HistoricalCustomerDto> dtos = new ArrayList<>();
		
		for(HistoricalCustomer customer: customers) {			
			dtos.add(convert(customer));
		}
		
		return dtos;
	}
	
	public HistoricalCustomer reverseConvert(HistoricalCustomerDto historicalCustomer) {
		HistoricalCustomer dto = new HistoricalCustomer();
		
		dto.setId(historicalCustomer.getId());
		dto.setMobileNumber(historicalCustomer.getMobileNumber());
		dto.setName(historicalCustomer.getName());
		dto.setYearLastBooked(historicalCustomer.getYearLastBooked());		
		
		return dto;
	}

}
