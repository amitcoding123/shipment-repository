package com.logistics.domain;

import java.time.LocalDate;

public class CustomerTaxInvoiceDto {
	
	private Long id;
	private String userId;
	private LocalDate createdOn;
	private String fileName;
	private String contentType;	
	private byte[] taxInvoice;
	private Long shipperId;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public LocalDate getCreatedOn() {
		return createdOn;
	}
	public void setCreatedOn(LocalDate createdOn) {
		this.createdOn = createdOn;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public String getContentType() {
		return contentType;
	}
	public void setContentType(String contentType) {
		this.contentType = contentType;
	}
	public byte[] getTaxInvoice() {
		return taxInvoice;
	}
	public void setTaxInvoice(byte[] taxInvoice) {
		this.taxInvoice = taxInvoice;
	}
	public Long getShipperId() {
		return shipperId;
	}
	public void setShipperId(Long shipperId) {
		this.shipperId = shipperId;
	}
	
	

}
