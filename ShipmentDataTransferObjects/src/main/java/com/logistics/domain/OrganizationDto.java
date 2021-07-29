package com.logistics.domain;

import java.util.List;


public class OrganizationDto {
	
	private Long id;
	private String name;
	private String telephoneNumber;
	private String email;
	private String gstin;
	private String address;
	private String pan;
	
	private List<BankDetailsDto> bankDetails;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTelephoneNumber() {
		return telephoneNumber;
	}

	public void setTelephoneNumber(String telephoneNumber) {
		this.telephoneNumber = telephoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGstin() {
		return gstin;
	}

	public void setGstin(String gstin) {
		this.gstin = gstin;
	}

	public List<BankDetailsDto> getBankDetails() {
		return bankDetails;
	}

	public void setBankDetails(List<BankDetailsDto> bankDetails) {
		this.bankDetails = bankDetails;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPan() {
		return pan;
	}

	public void setPan(String pan) {
		this.pan = pan;
	}
	
	

}
