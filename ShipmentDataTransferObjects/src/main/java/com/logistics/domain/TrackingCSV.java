package com.logistics.domain;

import com.opencsv.bean.CsvBindByName;

public class TrackingCSV {
	
	@CsvBindByName
	private String invoiceNumber;
	
	@CsvBindByName
	private Long trackingNumber;
	
	public TrackingCSV(String invoiceNumber, Long trackingNumber) {
		super();
		this.invoiceNumber = invoiceNumber;
		this.trackingNumber = trackingNumber;
	}
	
	

	public TrackingCSV() {
		super();
	}



	public String getInvoiceNumber() {
		return invoiceNumber;
	}

	public void setInvoiceNumber(String invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}

	public Long getTrackingNumber() {
		return trackingNumber;
	}

	public void setTrackingNumber(Long trackingNumber) {
		this.trackingNumber = trackingNumber;
	}
}
