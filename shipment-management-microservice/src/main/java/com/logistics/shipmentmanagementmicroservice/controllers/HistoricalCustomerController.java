package com.logistics.shipmentmanagementmicroservice.controllers;

import java.io.IOException;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.logistics.domain.HistoricalCustomerDto;
import com.logistics.domain.LostCustomer;
import com.logistics.shipmentmanagementmicroservice.convertors.HistoricalCustomerConvertor;
import com.logistics.shipmentmanagementmicroservice.services.HistoricalCustomerService;
import com.logistics.shipmentmanagementmicroservice.utils.HistoricalCustomerReportGenerator;

@RestController
public class HistoricalCustomerController {

	private HistoricalCustomerService service;
	private HistoricalCustomerConvertor convertor;
	private HistoricalCustomerReportGenerator reportGenerator;

	public HistoricalCustomerController(HistoricalCustomerService service, HistoricalCustomerConvertor convertor,
			HistoricalCustomerReportGenerator reportGenerator) {
		super();
		this.service = service;
		this.convertor = convertor;
		this.reportGenerator = reportGenerator;
	}



	@PostMapping("/historicalCustomers")
	public void createHistoricalCustomer(@RequestBody HistoricalCustomerDto historicalCustomerDto) {
		service.addHistoricalCustomer(convertor.reverseConvert(historicalCustomerDto));
	}
	
	@PutMapping("/historicalCustomers")
	public void updateHistoricalCustomer(@RequestBody HistoricalCustomerDto historicalCustomerDto) {
		service.modifyHistoricalCustomer(convertor.reverseConvert(historicalCustomerDto));
	}
	
	@GetMapping("/historicalCustomers/{id}")
	public HistoricalCustomerDto getHistoricalCustomer(@PathVariable Long id) {
		return convertor.convert(service.getHistoricalCustomer(id));
	}
	
	@GetMapping("/historicalCustomers")
	public List<HistoricalCustomerDto> getAllHistoricalCustomer() {
		return convertor.convertList(service.getAllHistoricalCustomers());
	}
	
	@GetMapping("historicalCustomers/report")
	public LostCustomer generateLostCustomersReport() throws IOException {
		LostCustomer lostCustomer = reportGenerator.generateHistoricalCustomerReport();
		return lostCustomer;
	}
	
}
