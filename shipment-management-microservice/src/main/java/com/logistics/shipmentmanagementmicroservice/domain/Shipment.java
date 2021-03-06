package com.logistics.shipmentmanagementmicroservice.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.logistics.domain.CourierServiceProvider;
import com.logistics.domain.ShipementCategory;
import com.logistics.domain.ShipmentStatus;

@Entity
public class Shipment extends BaseEntity implements Serializable, Comparable<Shipment> {

    @OneToOne
    private Shipper shipper;

    @OneToOne(cascade = CascadeType.PERSIST)
    private Consignee consignee;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "shipment")
    private Set<Item> items;
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
    private Double sellingCost;
    private String paymentMode;
    private String custTaxInvoice;
    private Double covidSurcharge;
    private Double fuelSurcharge;
    private Double fuelChargePercentage;
    private String taxInvoiceGenerated;
    
    public ShipmentStatus getStatus() {
        return status;
    }

    public void setStatus(ShipmentStatus status) {
        this.status = status;
    }

    public Shipment() {
        super();
    }

    public Shipper getShipper() {
        return shipper;
    }

    public void setShipper(Shipper shipper) {
        this.shipper = shipper;
    }

    public Consignee getConsignee() {
        return consignee;
    }

    public void setConsignee(Consignee consignee) {
        this.consignee = consignee;
    }

    public Set<Item> getItems() {
        return items;
    }

    public void setItems(Set<Item> items) {
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

    @Override
    public int compareTo(Shipment o) {
        return this.getId() > o.getId() ? 1 : 0;
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

	public String getCustTaxInvoice() {
		return custTaxInvoice;
	}

	public void setCustTaxInvoice(String custTaxInvoice) {
		this.custTaxInvoice = custTaxInvoice;
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
