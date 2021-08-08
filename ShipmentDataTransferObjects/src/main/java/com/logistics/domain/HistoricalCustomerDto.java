package com.logistics.domain;

public class HistoricalCustomerDto {
	
	private Long id;
	private String name;
	private String mobileNumber;
	private Integer yearLastBooked;
	
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
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public Integer getYearLastBooked() {
		return yearLastBooked;
	}
	public void setYearLastBooked(Integer yearLastBooked) {
		this.yearLastBooked = yearLastBooked;
	}
	
	

}
