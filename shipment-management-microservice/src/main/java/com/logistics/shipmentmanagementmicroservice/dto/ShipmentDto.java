package com.logistics.shipmentmanagementmicroservice.dto;

import java.io.Serializable;
import java.util.List;

public class ShipmentDto implements Serializable {

    private Long shipmentId;
    private String shipperName;
    private Long shipperAadharCardNumber;
    private String consigneeName;
    private String phoneNumber;
    private String preCarriageBy;
    private String placeOfReceiptPreCarriage;
    private String vesselFlightNo;
    private String portOfLoading;
    private String portOfDischarge;
    private String finalDestination;
    private String invoiceNumber;
    private String invoiceDate;
    private String exporterRef;
    private String otherReference;
    private String weight;
    private String countryOfOrigin;
    private String countryOfFinalDestination;
    private String terms;
    private List<BoxDto> boxes;
    private String disclaimer;
    private String currency;
    private String lotName;

    public Long getShipmentId() {
        return shipmentId;
    }

    public void setShipmentId(Long shipmentId) {
        this.shipmentId = shipmentId;
    }

    public String getShipperName() {
        return shipperName;
    }

    public void setShipperName(String shipperName) {
        this.shipperName = shipperName;
    }

    public Long getShipperAadharCardNumber() {
        return shipperAadharCardNumber;
    }

    public void setShipperAadharCardNumber(Long shipperAadharCardNumber) {
        this.shipperAadharCardNumber = shipperAadharCardNumber;
    }

    public String getConsigneeName() {
        return consigneeName;
    }

    public void setConsigneeName(String consigneeName) {
        this.consigneeName = consigneeName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPreCarriageBy() {
        return preCarriageBy;
    }

    public void setPreCarriageBy(String preCarriageBy) {
        this.preCarriageBy = preCarriageBy;
    }

    public String getPlaceOfReceiptPreCarriage() {
        return placeOfReceiptPreCarriage;
    }

    public void setPlaceOfReceiptPreCarriage(String placeOfReceiptPreCarriage) {
        this.placeOfReceiptPreCarriage = placeOfReceiptPreCarriage;
    }

    public String getVesselFlightNo() {
        return vesselFlightNo;
    }

    public void setVesselFlightNo(String vesselFlightNo) {
        this.vesselFlightNo = vesselFlightNo;
    }

    public String getPortOfLoading() {
        return portOfLoading;
    }

    public void setPortOfLoading(String portOfLoading) {
        this.portOfLoading = portOfLoading;
    }

    public String getPortOfDischarge() {
        return portOfDischarge;
    }

    public void setPortOfDischarge(String portOfDischarge) {
        this.portOfDischarge = portOfDischarge;
    }

    public String getFinalDestination() {
        return finalDestination;
    }

    public void setFinalDestination(String finalDestination) {
        this.finalDestination = finalDestination;
    }

    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public String getInvoiceDate() {
        return invoiceDate;
    }

    public void setInvoiceDate(String invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    public String getExporterRef() {
        return exporterRef;
    }

    public void setExporterRef(String exporterRef) {
        this.exporterRef = exporterRef;
    }

    public String getOtherReference() {
        return otherReference;
    }

    public void setOtherReference(String otherReference) {
        this.otherReference = otherReference;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    public void setCountryOfOrigin(String countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
    }

    public String getCountryOfFinalDestination() {
        return countryOfFinalDestination;
    }

    public void setCountryOfFinalDestination(String countryOfFinalDestination) {
        this.countryOfFinalDestination = countryOfFinalDestination;
    }

    public String getTerms() {
        return terms;
    }

    public void setTerms(String terms) {
        this.terms = terms;
    }

    public List<BoxDto> getBoxes() {
        return boxes;
    }

    public void setBoxes(List<BoxDto> boxes) {
        this.boxes = boxes;
    }

    public String getDisclaimer() {
        return disclaimer;
    }

    public void setDisclaimer(String disclaimer) {
        this.disclaimer = disclaimer;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getLotName() {
        return lotName;
    }

    public void setLotName(String lotName) {
        this.lotName = lotName;
    }

}
