package com.logistics.invoicemanagementmicroservice.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
public class CustomerTaxInvoice {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String userId;
	private LocalDate createdOn;
	
	@Lob
	private byte[] taxInvoice;

	public CustomerTaxInvoice() {
		super();
	}

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

	public byte[] getTaxInvoice() {
		return taxInvoice;
	}

	public void setTaxInvoice(byte[] taxInvoice) {
		this.taxInvoice = taxInvoice;
	}
	
	

}
