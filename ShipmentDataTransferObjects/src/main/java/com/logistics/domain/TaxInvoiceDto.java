package com.logistics.domain;

import java.time.LocalDate;
import java.util.List;

public class TaxInvoiceDto extends BaseDto {
	
	private ShipperDto shipper;
	private OrganizationDto organization;
	private List<ShipmentDto> shipments;
	private UserDto user;
	private String taxInvoiceNumber;
	private LocalDate invoiceDate;
	
	public UserDto getUser() {
		return user;
	}

	public void setUser(UserDto user) {
		this.user = user;
	}

	public TaxInvoiceDto(ShipperDto shipper, OrganizationDto organization, List<ShipmentDto> shipments,
			UserDto user) {
		super();
		this.shipper = shipper;
		this.organization = organization;
		this.shipments = shipments;
		this.user = user;
	}
	
	

	public TaxInvoiceDto() {
		super();
	}

	public ShipperDto getShipper() {
		return shipper;
	}

	public void setShipper(ShipperDto shipper) {
		this.shipper = shipper;
	}

	public OrganizationDto getOrganization() {
		return organization;
	}

	public void setOrganization(OrganizationDto organization) {
		this.organization = organization;
	}

	public List<ShipmentDto> getShipments() {
		return shipments;
	}

	public void setShipments(List<ShipmentDto> shipments) {
		this.shipments = shipments;
	}

	public String getTaxInvoiceNumber() {
		return taxInvoiceNumber;
	}

	public void setTaxInvoiceNumber(String taxInvoiceNumber) {
		this.taxInvoiceNumber = taxInvoiceNumber;
	}

	public LocalDate getInvoiceDate() {
		return invoiceDate;
	}

	public void setInvoiceDate(LocalDate invoiceDate) {
		this.invoiceDate = invoiceDate;
	}
	
	

}
