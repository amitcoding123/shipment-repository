package com.logistics.domain;

import java.math.BigDecimal;
import java.util.Set;

public class ShipmentDto extends BaseDto {

    private ShipperDto shipper;
    private ConsigneeDto consignee;
    private Set<ItemDto> items;
    private String comments;
    private String specialInstruction;
    private Long trackingNumber;
    private ShipmentStatus status;
    private String userId;
    private CourierServiceProvider provider;
    private BigDecimal boxWeight;
    private BigDecimal actualWeight;
    private Long boxLength;
    private Long boxWidth;
    private Long boxHeight;
    private String invoiceNumber;
    private ShipementCategory category;
    private BigDecimal frieghtCharge;
    private Double covidSurcharge;
    private Double fuelSurcharge;
    private Double fuelChargePercentage;
    private Double sellingCost;
    private String paymentMode;
    private String taxInvoiceGenerated;
    
    private Integer totalShipments;

    public ShipmentStatus getStatus() {
        return status;
    }

    public void setStatus(ShipmentStatus status) {
        this.status = status;
    }

    public ShipperDto getShipper() {
        return shipper;
    }

    public void setShipper(ShipperDto shipper) {
        this.shipper = shipper;
    }

    public ConsigneeDto getConsignee() {
        return consignee;
    }

    public void setConsignee(ConsigneeDto consignee) {
        this.consignee = consignee;
    }

    public Set<ItemDto> getItems() {
        return items;
    }

    public void setItems(Set<ItemDto> items) {
        this.items = items;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getSpecialInstruction() {
        return specialInstruction;
    }

    public void setSpecialInstruction(String specialInstruction) {
        this.specialInstruction = specialInstruction;
    }

    public Long getTrackingNumber() {
        return trackingNumber;
    }

    public void setTrackingNumber(Long trackingNumber) {
        this.trackingNumber = trackingNumber;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public CourierServiceProvider getProvider() {
        return provider;
    }

    public void setProvider(CourierServiceProvider provider) {
        this.provider = provider;
    }

    public BigDecimal getBoxWeight() {
        return boxWeight;
    }

    public void setBoxWeight(BigDecimal boxWeight) {
        this.boxWeight = boxWeight;
    }

    public Long getBoxLength() {
        return boxLength;
    }

    public void setBoxLength(Long boxLength) {
        this.boxLength = boxLength;
    }

    public Long getBoxWidth() {
        return boxWidth;
    }

    public void setBoxWidth(Long boxWidth) {
        this.boxWidth = boxWidth;
    }

    public Long getBoxHeight() {
        return boxHeight;
    }

    public void setBoxHeight(Long boxHeight) {
        this.boxHeight = boxHeight;
    }

    public BigDecimal getActualWeight() {
        return actualWeight;
    }

    public void setActualWeight(BigDecimal actualWeight) {
        this.actualWeight = actualWeight;
    }

    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public ShipementCategory getCategory() {
        return category;
    }

    public void setCategory(ShipementCategory category) {
        this.category = category;
    }

    public BigDecimal getFrieghtCharge() {
        return frieghtCharge;
    }

    public void setFrieghtCharge(BigDecimal frieghtCharge) {
        this.frieghtCharge = frieghtCharge;
    }

    public Double getSellingCost() {
        return sellingCost;
    }

    public void setSellingCost(Double sellingCost) {
        this.sellingCost = sellingCost;
    }

	public String getPaymentMode() {
		return paymentMode;
	}

	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}

	public Integer getTotalShipments() {
		return totalShipments;
	}

	public void setTotalShipments(Integer totalShipments) {
		this.totalShipments = totalShipments;
	}

	public Double getCovidSurcharge() {
		return covidSurcharge;
	}

	public void setCovidSurcharge(Double covidSurcharge) {
		this.covidSurcharge = covidSurcharge;
	}

	public Double getFuelSurcharge() {
		return fuelSurcharge;
	}

	public void setFuelSurcharge(Double fuelSurcharge) {
		this.fuelSurcharge = fuelSurcharge;
	}

	public Double getFuelChargePercentage() {
		return fuelChargePercentage;
	}

	public void setFuelChargePercentage(Double fuelChargePercentage) {
		this.fuelChargePercentage = fuelChargePercentage;
	}

	public String getTaxInvoiceGenerated() {
		return taxInvoiceGenerated;
	}

	public void setTaxInvoiceGenerated(String taxInvoiceGenerated) {
		this.taxInvoiceGenerated = taxInvoiceGenerated;
	}	
	
}
