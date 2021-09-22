package com.logistics.shipmentmanagementmicroservice.utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.stereotype.Component;

import com.logistics.domain.LostCustomer;
import com.logistics.shipmentmanagementmicroservice.domain.HistoricalCustomer;
import com.logistics.shipmentmanagementmicroservice.domain.Shipper;
import com.logistics.shipmentmanagementmicroservice.repositories.HistoricalCustomerRepository;
import com.logistics.shipmentmanagementmicroservice.repositories.ShipperRepository;

@Component
public class HistoricalCustomerReportGenerator {
	
	private static final Long min = 1L;
	private static final Long max = 999999999999999999L;
	
	private ShipperRepository shipperRepository;
	private HistoricalCustomerRepository customerRepository;
	
	
	
	public HistoricalCustomerReportGenerator(ShipperRepository shipperRepository,
			HistoricalCustomerRepository customerRepository) {
		super();
		this.shipperRepository = shipperRepository;
		this.customerRepository = customerRepository;
	}

	public LostCustomer generateHistoricalCustomerReport() throws FileNotFoundException, IOException {
		Workbook workbook = new XSSFWorkbook();
		Long suffix = (long) (Math.random() * (max-min) + min);
		String fileName = "Lost_Customers_" + suffix + ".xlsx";
		String path = "C:/amit/temp/" + fileName;
		
		Font headerFont = workbook.createFont();
        headerFont.setBold(true);
        CellStyle headerStyle = workbook.createCellStyle();
        headerStyle.setFont(headerFont);
		
		Sheet worksheet = workbook.createSheet();
		
		Row headerRow = worksheet.createRow(0);
		
		Cell cell1 = headerRow.createCell(0);
		cell1.setCellValue("Customer Name");
		cell1.setCellStyle(headerStyle);
		
		Cell cell2 = headerRow.createCell(1);
		cell2.setCellValue("Mobile Number");
		cell2.setCellStyle(headerStyle);
		
		Cell cell3 = headerRow.createCell(2);
		cell3.setCellValue("Last booking year");
		cell3.setCellStyle(headerStyle);
		
		List<HistoricalCustomer> lostCustomers = getLostCustomers();
		int rowIndex = 1;
		for(HistoricalCustomer customer: lostCustomers) {
			Row dataRow = worksheet.createRow(rowIndex);
			Cell cell4 = dataRow.createCell(0);
			cell4.setCellValue(customer.getName());
			
			Cell cell5 = dataRow.createCell(1);
			cell5.setCellValue(customer.getMobileNumber());
			
			Cell cell6 = dataRow.createCell(2);
			cell6.setCellValue(customer.getYearLastBooked());
			rowIndex++;
		}
		
		
		FileOutputStream out = new FileOutputStream(path);
		
		worksheet.autoSizeColumn(0);
		worksheet.autoSizeColumn(1);
		worksheet.autoSizeColumn(2);
		
		workbook.write(out);
		out.close();
		workbook.close();
		
		File file = new File(path);
		
		LostCustomer lostCustomer = new LostCustomer();
		lostCustomer.setFileData(FileUtils.readFileToByteArray(file));
		lostCustomer.setFileName(fileName);
		lostCustomer.setContentType(Files.probeContentType(file.toPath()));
		
		return lostCustomer;
	}
	
	private List<HistoricalCustomer> getLostCustomers() {
		List<HistoricalCustomer> lostCustomers = new ArrayList<>();
		List<Shipper> shippers = shipperRepository.findAll();
		List<HistoricalCustomer> customers = customerRepository.findAll();
		
		for(HistoricalCustomer customer: customers) {
			List<Shipper> filteredShippers = shippers.stream().filter(shipper -> 
			shipper.getPhoneNumber().equalsIgnoreCase(customer.getMobileNumber())).collect(
					Collectors.toList());
			if(filteredShippers == null || filteredShippers.size() == 0) {
				lostCustomers.add(customer);
			}
		}
		
		return lostCustomers;
	}

}
