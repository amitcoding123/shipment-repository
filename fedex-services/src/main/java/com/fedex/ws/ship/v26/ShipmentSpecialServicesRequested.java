/**
 * ShipmentSpecialServicesRequested.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.ws.ship.v26;


/**
 * These special services are available at the shipment level for
 * some or all service types. If the shipper is requesting a special
 * service which requires additional data (such as the COD amount), the
 * shipment special service type must be present in the specialServiceTypes
 * collection, and the supporting detail must be provided in the appropriate
 * sub-object below.
 */
public class ShipmentSpecialServicesRequested  implements java.io.Serializable {
    /* Indicates the shipment special service types that are requested
     * on this shipment. For a list of the valid shipment special service
     * types, please consult your integration documentation or get the list
     * of the available special services from the getAllSpecialServices method
     * of the Validation Availability and Commitment service. */
    private java.lang.String[] specialServiceTypes;

    private com.fedex.ws.ship.v26.CodDetail codDetail;

    private com.fedex.ws.ship.v26.DeliveryOnInvoiceAcceptanceDetail deliveryOnInvoiceAcceptanceDetail;

    private com.fedex.ws.ship.v26.HoldAtLocationDetail holdAtLocationDetail;

    /* This replaces eMailNotificationDetail */
    private com.fedex.ws.ship.v26.ShipmentEventNotificationDetail eventNotificationDetail;

    private com.fedex.ws.ship.v26.ReturnShipmentDetail returnShipmentDetail;

    /* This field should be populated for pending shipments (e.g.
     * e-mail label) It is required by a PENDING_SHIPMENT special service
     * type. */
    private com.fedex.ws.ship.v26.PendingShipmentDetail pendingShipmentDetail;

    private com.fedex.ws.ship.v26.InternationalControlledExportDetail internationalControlledExportDetail;

    private com.fedex.ws.ship.v26.InternationalTrafficInArmsRegulationsDetail internationalTrafficInArmsRegulationsDetail;

    private com.fedex.ws.ship.v26.ShipmentDryIceDetail shipmentDryIceDetail;

    private com.fedex.ws.ship.v26.HomeDeliveryPremiumDetail homeDeliveryPremiumDetail;

    private com.fedex.ws.ship.v26.FlatbedTrailerOption[] flatbedTrailerDetail;

    private com.fedex.ws.ship.v26.FreightGuaranteeDetail freightGuaranteeDetail;

    /* Electronic Trade document references. */
    private com.fedex.ws.ship.v26.EtdDetail etdDetail;

    /* Specification for labor to be performed with the shipment. */
    private com.fedex.ws.ship.v26.ExtraLaborDetail extraLaborDetail;

    /* Specifications for pallets to be shrinkwrapped as part of a
     * Freight shipment. */
    private com.fedex.ws.ship.v26.PalletShrinkwrapDetail palletShrinkwrapDetail;

    /* Specifications for pallets to be provided on Freight shipment. */
    private com.fedex.ws.ship.v26.PalletsProvidedDetail palletsProvidedDetail;

    /* Specifications for pup/set or vehicle delayed for loading or
     * unloading. */
    private com.fedex.ws.ship.v26.DetentionDetail detentionDetail;

    /* Specification for marking or tagging of pieces in shipment. */
    private com.fedex.ws.ship.v26.MarkingOrTaggingDetail markingOrTaggingDetail;

    /* Specification for services performed during non-business hours
     * and/or days. */
    private com.fedex.ws.ship.v26.NonBusinessTimeDetail nonBusinessTimeDetail;

    /* Specification for assembly performed on shipment. */
    private com.fedex.ws.ship.v26.ShipmentAssemblyDetail shipmentAssemblyDetail;

    /* Specification for sorting and/or segregating performed on shipment. */
    private com.fedex.ws.ship.v26.SortAndSegregateDetail sortAndSegregateDetail;

    /* Specification for special equipment used in loading/unloading
     * shipment. */
    private com.fedex.ws.ship.v26.SpecialEquipmentLineItem[] specialEquipmentDetail;

    /* Specification for storage provided for shipment. */
    private com.fedex.ws.ship.v26.StorageDetail storageDetail;

    /* Specification for weighing services provided for shipment. */
    private com.fedex.ws.ship.v26.WeighingDetail weighingDetail;

    /* Specification for date or range of dates on which delivery
     * is to be attempted. */
    private com.fedex.ws.ship.v26.CustomDeliveryWindowDetail customDeliveryWindowDetail;

    public ShipmentSpecialServicesRequested() {
    }

    public ShipmentSpecialServicesRequested(
           java.lang.String[] specialServiceTypes,
           com.fedex.ws.ship.v26.CodDetail codDetail,
           com.fedex.ws.ship.v26.DeliveryOnInvoiceAcceptanceDetail deliveryOnInvoiceAcceptanceDetail,
           com.fedex.ws.ship.v26.HoldAtLocationDetail holdAtLocationDetail,
           com.fedex.ws.ship.v26.ShipmentEventNotificationDetail eventNotificationDetail,
           com.fedex.ws.ship.v26.ReturnShipmentDetail returnShipmentDetail,
           com.fedex.ws.ship.v26.PendingShipmentDetail pendingShipmentDetail,
           com.fedex.ws.ship.v26.InternationalControlledExportDetail internationalControlledExportDetail,
           com.fedex.ws.ship.v26.InternationalTrafficInArmsRegulationsDetail internationalTrafficInArmsRegulationsDetail,
           com.fedex.ws.ship.v26.ShipmentDryIceDetail shipmentDryIceDetail,
           com.fedex.ws.ship.v26.HomeDeliveryPremiumDetail homeDeliveryPremiumDetail,
           com.fedex.ws.ship.v26.FlatbedTrailerOption[] flatbedTrailerDetail,
           com.fedex.ws.ship.v26.FreightGuaranteeDetail freightGuaranteeDetail,
           com.fedex.ws.ship.v26.EtdDetail etdDetail,
           com.fedex.ws.ship.v26.ExtraLaborDetail extraLaborDetail,
           com.fedex.ws.ship.v26.PalletShrinkwrapDetail palletShrinkwrapDetail,
           com.fedex.ws.ship.v26.PalletsProvidedDetail palletsProvidedDetail,
           com.fedex.ws.ship.v26.DetentionDetail detentionDetail,
           com.fedex.ws.ship.v26.MarkingOrTaggingDetail markingOrTaggingDetail,
           com.fedex.ws.ship.v26.NonBusinessTimeDetail nonBusinessTimeDetail,
           com.fedex.ws.ship.v26.ShipmentAssemblyDetail shipmentAssemblyDetail,
           com.fedex.ws.ship.v26.SortAndSegregateDetail sortAndSegregateDetail,
           com.fedex.ws.ship.v26.SpecialEquipmentLineItem[] specialEquipmentDetail,
           com.fedex.ws.ship.v26.StorageDetail storageDetail,
           com.fedex.ws.ship.v26.WeighingDetail weighingDetail,
           com.fedex.ws.ship.v26.CustomDeliveryWindowDetail customDeliveryWindowDetail) {
           this.specialServiceTypes = specialServiceTypes;
           this.codDetail = codDetail;
           this.deliveryOnInvoiceAcceptanceDetail = deliveryOnInvoiceAcceptanceDetail;
           this.holdAtLocationDetail = holdAtLocationDetail;
           this.eventNotificationDetail = eventNotificationDetail;
           this.returnShipmentDetail = returnShipmentDetail;
           this.pendingShipmentDetail = pendingShipmentDetail;
           this.internationalControlledExportDetail = internationalControlledExportDetail;
           this.internationalTrafficInArmsRegulationsDetail = internationalTrafficInArmsRegulationsDetail;
           this.shipmentDryIceDetail = shipmentDryIceDetail;
           this.homeDeliveryPremiumDetail = homeDeliveryPremiumDetail;
           this.flatbedTrailerDetail = flatbedTrailerDetail;
           this.freightGuaranteeDetail = freightGuaranteeDetail;
           this.etdDetail = etdDetail;
           this.extraLaborDetail = extraLaborDetail;
           this.palletShrinkwrapDetail = palletShrinkwrapDetail;
           this.palletsProvidedDetail = palletsProvidedDetail;
           this.detentionDetail = detentionDetail;
           this.markingOrTaggingDetail = markingOrTaggingDetail;
           this.nonBusinessTimeDetail = nonBusinessTimeDetail;
           this.shipmentAssemblyDetail = shipmentAssemblyDetail;
           this.sortAndSegregateDetail = sortAndSegregateDetail;
           this.specialEquipmentDetail = specialEquipmentDetail;
           this.storageDetail = storageDetail;
           this.weighingDetail = weighingDetail;
           this.customDeliveryWindowDetail = customDeliveryWindowDetail;
    }


    /**
     * Gets the specialServiceTypes value for this ShipmentSpecialServicesRequested.
     * 
     * @return specialServiceTypes   * Indicates the shipment special service types that are requested
     * on this shipment. For a list of the valid shipment special service
     * types, please consult your integration documentation or get the list
     * of the available special services from the getAllSpecialServices method
     * of the Validation Availability and Commitment service.
     */
    public java.lang.String[] getSpecialServiceTypes() {
        return specialServiceTypes;
    }


    /**
     * Sets the specialServiceTypes value for this ShipmentSpecialServicesRequested.
     * 
     * @param specialServiceTypes   * Indicates the shipment special service types that are requested
     * on this shipment. For a list of the valid shipment special service
     * types, please consult your integration documentation or get the list
     * of the available special services from the getAllSpecialServices method
     * of the Validation Availability and Commitment service.
     */
    public void setSpecialServiceTypes(java.lang.String[] specialServiceTypes) {
        this.specialServiceTypes = specialServiceTypes;
    }

    public java.lang.String getSpecialServiceTypes(int i) {
        return this.specialServiceTypes[i];
    }

    public void setSpecialServiceTypes(int i, java.lang.String _value) {
        this.specialServiceTypes[i] = _value;
    }


    /**
     * Gets the codDetail value for this ShipmentSpecialServicesRequested.
     * 
     * @return codDetail
     */
    public com.fedex.ws.ship.v26.CodDetail getCodDetail() {
        return codDetail;
    }


    /**
     * Sets the codDetail value for this ShipmentSpecialServicesRequested.
     * 
     * @param codDetail
     */
    public void setCodDetail(com.fedex.ws.ship.v26.CodDetail codDetail) {
        this.codDetail = codDetail;
    }


    /**
     * Gets the deliveryOnInvoiceAcceptanceDetail value for this ShipmentSpecialServicesRequested.
     * 
     * @return deliveryOnInvoiceAcceptanceDetail
     */
    public com.fedex.ws.ship.v26.DeliveryOnInvoiceAcceptanceDetail getDeliveryOnInvoiceAcceptanceDetail() {
        return deliveryOnInvoiceAcceptanceDetail;
    }


    /**
     * Sets the deliveryOnInvoiceAcceptanceDetail value for this ShipmentSpecialServicesRequested.
     * 
     * @param deliveryOnInvoiceAcceptanceDetail
     */
    public void setDeliveryOnInvoiceAcceptanceDetail(com.fedex.ws.ship.v26.DeliveryOnInvoiceAcceptanceDetail deliveryOnInvoiceAcceptanceDetail) {
        this.deliveryOnInvoiceAcceptanceDetail = deliveryOnInvoiceAcceptanceDetail;
    }


    /**
     * Gets the holdAtLocationDetail value for this ShipmentSpecialServicesRequested.
     * 
     * @return holdAtLocationDetail
     */
    public com.fedex.ws.ship.v26.HoldAtLocationDetail getHoldAtLocationDetail() {
        return holdAtLocationDetail;
    }


    /**
     * Sets the holdAtLocationDetail value for this ShipmentSpecialServicesRequested.
     * 
     * @param holdAtLocationDetail
     */
    public void setHoldAtLocationDetail(com.fedex.ws.ship.v26.HoldAtLocationDetail holdAtLocationDetail) {
        this.holdAtLocationDetail = holdAtLocationDetail;
    }


    /**
     * Gets the eventNotificationDetail value for this ShipmentSpecialServicesRequested.
     * 
     * @return eventNotificationDetail   * This replaces eMailNotificationDetail
     */
    public com.fedex.ws.ship.v26.ShipmentEventNotificationDetail getEventNotificationDetail() {
        return eventNotificationDetail;
    }


    /**
     * Sets the eventNotificationDetail value for this ShipmentSpecialServicesRequested.
     * 
     * @param eventNotificationDetail   * This replaces eMailNotificationDetail
     */
    public void setEventNotificationDetail(com.fedex.ws.ship.v26.ShipmentEventNotificationDetail eventNotificationDetail) {
        this.eventNotificationDetail = eventNotificationDetail;
    }


    /**
     * Gets the returnShipmentDetail value for this ShipmentSpecialServicesRequested.
     * 
     * @return returnShipmentDetail
     */
    public com.fedex.ws.ship.v26.ReturnShipmentDetail getReturnShipmentDetail() {
        return returnShipmentDetail;
    }


    /**
     * Sets the returnShipmentDetail value for this ShipmentSpecialServicesRequested.
     * 
     * @param returnShipmentDetail
     */
    public void setReturnShipmentDetail(com.fedex.ws.ship.v26.ReturnShipmentDetail returnShipmentDetail) {
        this.returnShipmentDetail = returnShipmentDetail;
    }


    /**
     * Gets the pendingShipmentDetail value for this ShipmentSpecialServicesRequested.
     * 
     * @return pendingShipmentDetail   * This field should be populated for pending shipments (e.g.
     * e-mail label) It is required by a PENDING_SHIPMENT special service
     * type.
     */
    public com.fedex.ws.ship.v26.PendingShipmentDetail getPendingShipmentDetail() {
        return pendingShipmentDetail;
    }


    /**
     * Sets the pendingShipmentDetail value for this ShipmentSpecialServicesRequested.
     * 
     * @param pendingShipmentDetail   * This field should be populated for pending shipments (e.g.
     * e-mail label) It is required by a PENDING_SHIPMENT special service
     * type.
     */
    public void setPendingShipmentDetail(com.fedex.ws.ship.v26.PendingShipmentDetail pendingShipmentDetail) {
        this.pendingShipmentDetail = pendingShipmentDetail;
    }


    /**
     * Gets the internationalControlledExportDetail value for this ShipmentSpecialServicesRequested.
     * 
     * @return internationalControlledExportDetail
     */
    public com.fedex.ws.ship.v26.InternationalControlledExportDetail getInternationalControlledExportDetail() {
        return internationalControlledExportDetail;
    }


    /**
     * Sets the internationalControlledExportDetail value for this ShipmentSpecialServicesRequested.
     * 
     * @param internationalControlledExportDetail
     */
    public void setInternationalControlledExportDetail(com.fedex.ws.ship.v26.InternationalControlledExportDetail internationalControlledExportDetail) {
        this.internationalControlledExportDetail = internationalControlledExportDetail;
    }


    /**
     * Gets the internationalTrafficInArmsRegulationsDetail value for this ShipmentSpecialServicesRequested.
     * 
     * @return internationalTrafficInArmsRegulationsDetail
     */
    public com.fedex.ws.ship.v26.InternationalTrafficInArmsRegulationsDetail getInternationalTrafficInArmsRegulationsDetail() {
        return internationalTrafficInArmsRegulationsDetail;
    }


    /**
     * Sets the internationalTrafficInArmsRegulationsDetail value for this ShipmentSpecialServicesRequested.
     * 
     * @param internationalTrafficInArmsRegulationsDetail
     */
    public void setInternationalTrafficInArmsRegulationsDetail(com.fedex.ws.ship.v26.InternationalTrafficInArmsRegulationsDetail internationalTrafficInArmsRegulationsDetail) {
        this.internationalTrafficInArmsRegulationsDetail = internationalTrafficInArmsRegulationsDetail;
    }


    /**
     * Gets the shipmentDryIceDetail value for this ShipmentSpecialServicesRequested.
     * 
     * @return shipmentDryIceDetail
     */
    public com.fedex.ws.ship.v26.ShipmentDryIceDetail getShipmentDryIceDetail() {
        return shipmentDryIceDetail;
    }


    /**
     * Sets the shipmentDryIceDetail value for this ShipmentSpecialServicesRequested.
     * 
     * @param shipmentDryIceDetail
     */
    public void setShipmentDryIceDetail(com.fedex.ws.ship.v26.ShipmentDryIceDetail shipmentDryIceDetail) {
        this.shipmentDryIceDetail = shipmentDryIceDetail;
    }


    /**
     * Gets the homeDeliveryPremiumDetail value for this ShipmentSpecialServicesRequested.
     * 
     * @return homeDeliveryPremiumDetail
     */
    public com.fedex.ws.ship.v26.HomeDeliveryPremiumDetail getHomeDeliveryPremiumDetail() {
        return homeDeliveryPremiumDetail;
    }


    /**
     * Sets the homeDeliveryPremiumDetail value for this ShipmentSpecialServicesRequested.
     * 
     * @param homeDeliveryPremiumDetail
     */
    public void setHomeDeliveryPremiumDetail(com.fedex.ws.ship.v26.HomeDeliveryPremiumDetail homeDeliveryPremiumDetail) {
        this.homeDeliveryPremiumDetail = homeDeliveryPremiumDetail;
    }


    /**
     * Gets the flatbedTrailerDetail value for this ShipmentSpecialServicesRequested.
     * 
     * @return flatbedTrailerDetail
     */
    public com.fedex.ws.ship.v26.FlatbedTrailerOption[] getFlatbedTrailerDetail() {
        return flatbedTrailerDetail;
    }


    /**
     * Sets the flatbedTrailerDetail value for this ShipmentSpecialServicesRequested.
     * 
     * @param flatbedTrailerDetail
     */
    public void setFlatbedTrailerDetail(com.fedex.ws.ship.v26.FlatbedTrailerOption[] flatbedTrailerDetail) {
        this.flatbedTrailerDetail = flatbedTrailerDetail;
    }


    /**
     * Gets the freightGuaranteeDetail value for this ShipmentSpecialServicesRequested.
     * 
     * @return freightGuaranteeDetail
     */
    public com.fedex.ws.ship.v26.FreightGuaranteeDetail getFreightGuaranteeDetail() {
        return freightGuaranteeDetail;
    }


    /**
     * Sets the freightGuaranteeDetail value for this ShipmentSpecialServicesRequested.
     * 
     * @param freightGuaranteeDetail
     */
    public void setFreightGuaranteeDetail(com.fedex.ws.ship.v26.FreightGuaranteeDetail freightGuaranteeDetail) {
        this.freightGuaranteeDetail = freightGuaranteeDetail;
    }


    /**
     * Gets the etdDetail value for this ShipmentSpecialServicesRequested.
     * 
     * @return etdDetail   * Electronic Trade document references.
     */
    public com.fedex.ws.ship.v26.EtdDetail getEtdDetail() {
        return etdDetail;
    }


    /**
     * Sets the etdDetail value for this ShipmentSpecialServicesRequested.
     * 
     * @param etdDetail   * Electronic Trade document references.
     */
    public void setEtdDetail(com.fedex.ws.ship.v26.EtdDetail etdDetail) {
        this.etdDetail = etdDetail;
    }


    /**
     * Gets the extraLaborDetail value for this ShipmentSpecialServicesRequested.
     * 
     * @return extraLaborDetail   * Specification for labor to be performed with the shipment.
     */
    public com.fedex.ws.ship.v26.ExtraLaborDetail getExtraLaborDetail() {
        return extraLaborDetail;
    }


    /**
     * Sets the extraLaborDetail value for this ShipmentSpecialServicesRequested.
     * 
     * @param extraLaborDetail   * Specification for labor to be performed with the shipment.
     */
    public void setExtraLaborDetail(com.fedex.ws.ship.v26.ExtraLaborDetail extraLaborDetail) {
        this.extraLaborDetail = extraLaborDetail;
    }


    /**
     * Gets the palletShrinkwrapDetail value for this ShipmentSpecialServicesRequested.
     * 
     * @return palletShrinkwrapDetail   * Specifications for pallets to be shrinkwrapped as part of a
     * Freight shipment.
     */
    public com.fedex.ws.ship.v26.PalletShrinkwrapDetail getPalletShrinkwrapDetail() {
        return palletShrinkwrapDetail;
    }


    /**
     * Sets the palletShrinkwrapDetail value for this ShipmentSpecialServicesRequested.
     * 
     * @param palletShrinkwrapDetail   * Specifications for pallets to be shrinkwrapped as part of a
     * Freight shipment.
     */
    public void setPalletShrinkwrapDetail(com.fedex.ws.ship.v26.PalletShrinkwrapDetail palletShrinkwrapDetail) {
        this.palletShrinkwrapDetail = palletShrinkwrapDetail;
    }


    /**
     * Gets the palletsProvidedDetail value for this ShipmentSpecialServicesRequested.
     * 
     * @return palletsProvidedDetail   * Specifications for pallets to be provided on Freight shipment.
     */
    public com.fedex.ws.ship.v26.PalletsProvidedDetail getPalletsProvidedDetail() {
        return palletsProvidedDetail;
    }


    /**
     * Sets the palletsProvidedDetail value for this ShipmentSpecialServicesRequested.
     * 
     * @param palletsProvidedDetail   * Specifications for pallets to be provided on Freight shipment.
     */
    public void setPalletsProvidedDetail(com.fedex.ws.ship.v26.PalletsProvidedDetail palletsProvidedDetail) {
        this.palletsProvidedDetail = palletsProvidedDetail;
    }


    /**
     * Gets the detentionDetail value for this ShipmentSpecialServicesRequested.
     * 
     * @return detentionDetail   * Specifications for pup/set or vehicle delayed for loading or
     * unloading.
     */
    public com.fedex.ws.ship.v26.DetentionDetail getDetentionDetail() {
        return detentionDetail;
    }


    /**
     * Sets the detentionDetail value for this ShipmentSpecialServicesRequested.
     * 
     * @param detentionDetail   * Specifications for pup/set or vehicle delayed for loading or
     * unloading.
     */
    public void setDetentionDetail(com.fedex.ws.ship.v26.DetentionDetail detentionDetail) {
        this.detentionDetail = detentionDetail;
    }


    /**
     * Gets the markingOrTaggingDetail value for this ShipmentSpecialServicesRequested.
     * 
     * @return markingOrTaggingDetail   * Specification for marking or tagging of pieces in shipment.
     */
    public com.fedex.ws.ship.v26.MarkingOrTaggingDetail getMarkingOrTaggingDetail() {
        return markingOrTaggingDetail;
    }


    /**
     * Sets the markingOrTaggingDetail value for this ShipmentSpecialServicesRequested.
     * 
     * @param markingOrTaggingDetail   * Specification for marking or tagging of pieces in shipment.
     */
    public void setMarkingOrTaggingDetail(com.fedex.ws.ship.v26.MarkingOrTaggingDetail markingOrTaggingDetail) {
        this.markingOrTaggingDetail = markingOrTaggingDetail;
    }


    /**
     * Gets the nonBusinessTimeDetail value for this ShipmentSpecialServicesRequested.
     * 
     * @return nonBusinessTimeDetail   * Specification for services performed during non-business hours
     * and/or days.
     */
    public com.fedex.ws.ship.v26.NonBusinessTimeDetail getNonBusinessTimeDetail() {
        return nonBusinessTimeDetail;
    }


    /**
     * Sets the nonBusinessTimeDetail value for this ShipmentSpecialServicesRequested.
     * 
     * @param nonBusinessTimeDetail   * Specification for services performed during non-business hours
     * and/or days.
     */
    public void setNonBusinessTimeDetail(com.fedex.ws.ship.v26.NonBusinessTimeDetail nonBusinessTimeDetail) {
        this.nonBusinessTimeDetail = nonBusinessTimeDetail;
    }


    /**
     * Gets the shipmentAssemblyDetail value for this ShipmentSpecialServicesRequested.
     * 
     * @return shipmentAssemblyDetail   * Specification for assembly performed on shipment.
     */
    public com.fedex.ws.ship.v26.ShipmentAssemblyDetail getShipmentAssemblyDetail() {
        return shipmentAssemblyDetail;
    }


    /**
     * Sets the shipmentAssemblyDetail value for this ShipmentSpecialServicesRequested.
     * 
     * @param shipmentAssemblyDetail   * Specification for assembly performed on shipment.
     */
    public void setShipmentAssemblyDetail(com.fedex.ws.ship.v26.ShipmentAssemblyDetail shipmentAssemblyDetail) {
        this.shipmentAssemblyDetail = shipmentAssemblyDetail;
    }


    /**
     * Gets the sortAndSegregateDetail value for this ShipmentSpecialServicesRequested.
     * 
     * @return sortAndSegregateDetail   * Specification for sorting and/or segregating performed on shipment.
     */
    public com.fedex.ws.ship.v26.SortAndSegregateDetail getSortAndSegregateDetail() {
        return sortAndSegregateDetail;
    }


    /**
     * Sets the sortAndSegregateDetail value for this ShipmentSpecialServicesRequested.
     * 
     * @param sortAndSegregateDetail   * Specification for sorting and/or segregating performed on shipment.
     */
    public void setSortAndSegregateDetail(com.fedex.ws.ship.v26.SortAndSegregateDetail sortAndSegregateDetail) {
        this.sortAndSegregateDetail = sortAndSegregateDetail;
    }


    /**
     * Gets the specialEquipmentDetail value for this ShipmentSpecialServicesRequested.
     * 
     * @return specialEquipmentDetail   * Specification for special equipment used in loading/unloading
     * shipment.
     */
    public com.fedex.ws.ship.v26.SpecialEquipmentLineItem[] getSpecialEquipmentDetail() {
        return specialEquipmentDetail;
    }


    /**
     * Sets the specialEquipmentDetail value for this ShipmentSpecialServicesRequested.
     * 
     * @param specialEquipmentDetail   * Specification for special equipment used in loading/unloading
     * shipment.
     */
    public void setSpecialEquipmentDetail(com.fedex.ws.ship.v26.SpecialEquipmentLineItem[] specialEquipmentDetail) {
        this.specialEquipmentDetail = specialEquipmentDetail;
    }


    /**
     * Gets the storageDetail value for this ShipmentSpecialServicesRequested.
     * 
     * @return storageDetail   * Specification for storage provided for shipment.
     */
    public com.fedex.ws.ship.v26.StorageDetail getStorageDetail() {
        return storageDetail;
    }


    /**
     * Sets the storageDetail value for this ShipmentSpecialServicesRequested.
     * 
     * @param storageDetail   * Specification for storage provided for shipment.
     */
    public void setStorageDetail(com.fedex.ws.ship.v26.StorageDetail storageDetail) {
        this.storageDetail = storageDetail;
    }


    /**
     * Gets the weighingDetail value for this ShipmentSpecialServicesRequested.
     * 
     * @return weighingDetail   * Specification for weighing services provided for shipment.
     */
    public com.fedex.ws.ship.v26.WeighingDetail getWeighingDetail() {
        return weighingDetail;
    }


    /**
     * Sets the weighingDetail value for this ShipmentSpecialServicesRequested.
     * 
     * @param weighingDetail   * Specification for weighing services provided for shipment.
     */
    public void setWeighingDetail(com.fedex.ws.ship.v26.WeighingDetail weighingDetail) {
        this.weighingDetail = weighingDetail;
    }


    /**
     * Gets the customDeliveryWindowDetail value for this ShipmentSpecialServicesRequested.
     * 
     * @return customDeliveryWindowDetail   * Specification for date or range of dates on which delivery
     * is to be attempted.
     */
    public com.fedex.ws.ship.v26.CustomDeliveryWindowDetail getCustomDeliveryWindowDetail() {
        return customDeliveryWindowDetail;
    }


    /**
     * Sets the customDeliveryWindowDetail value for this ShipmentSpecialServicesRequested.
     * 
     * @param customDeliveryWindowDetail   * Specification for date or range of dates on which delivery
     * is to be attempted.
     */
    public void setCustomDeliveryWindowDetail(com.fedex.ws.ship.v26.CustomDeliveryWindowDetail customDeliveryWindowDetail) {
        this.customDeliveryWindowDetail = customDeliveryWindowDetail;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ShipmentSpecialServicesRequested)) return false;
        ShipmentSpecialServicesRequested other = (ShipmentSpecialServicesRequested) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.specialServiceTypes==null && other.getSpecialServiceTypes()==null) || 
             (this.specialServiceTypes!=null &&
              java.util.Arrays.equals(this.specialServiceTypes, other.getSpecialServiceTypes()))) &&
            ((this.codDetail==null && other.getCodDetail()==null) || 
             (this.codDetail!=null &&
              this.codDetail.equals(other.getCodDetail()))) &&
            ((this.deliveryOnInvoiceAcceptanceDetail==null && other.getDeliveryOnInvoiceAcceptanceDetail()==null) || 
             (this.deliveryOnInvoiceAcceptanceDetail!=null &&
              this.deliveryOnInvoiceAcceptanceDetail.equals(other.getDeliveryOnInvoiceAcceptanceDetail()))) &&
            ((this.holdAtLocationDetail==null && other.getHoldAtLocationDetail()==null) || 
             (this.holdAtLocationDetail!=null &&
              this.holdAtLocationDetail.equals(other.getHoldAtLocationDetail()))) &&
            ((this.eventNotificationDetail==null && other.getEventNotificationDetail()==null) || 
             (this.eventNotificationDetail!=null &&
              this.eventNotificationDetail.equals(other.getEventNotificationDetail()))) &&
            ((this.returnShipmentDetail==null && other.getReturnShipmentDetail()==null) || 
             (this.returnShipmentDetail!=null &&
              this.returnShipmentDetail.equals(other.getReturnShipmentDetail()))) &&
            ((this.pendingShipmentDetail==null && other.getPendingShipmentDetail()==null) || 
             (this.pendingShipmentDetail!=null &&
              this.pendingShipmentDetail.equals(other.getPendingShipmentDetail()))) &&
            ((this.internationalControlledExportDetail==null && other.getInternationalControlledExportDetail()==null) || 
             (this.internationalControlledExportDetail!=null &&
              this.internationalControlledExportDetail.equals(other.getInternationalControlledExportDetail()))) &&
            ((this.internationalTrafficInArmsRegulationsDetail==null && other.getInternationalTrafficInArmsRegulationsDetail()==null) || 
             (this.internationalTrafficInArmsRegulationsDetail!=null &&
              this.internationalTrafficInArmsRegulationsDetail.equals(other.getInternationalTrafficInArmsRegulationsDetail()))) &&
            ((this.shipmentDryIceDetail==null && other.getShipmentDryIceDetail()==null) || 
             (this.shipmentDryIceDetail!=null &&
              this.shipmentDryIceDetail.equals(other.getShipmentDryIceDetail()))) &&
            ((this.homeDeliveryPremiumDetail==null && other.getHomeDeliveryPremiumDetail()==null) || 
             (this.homeDeliveryPremiumDetail!=null &&
              this.homeDeliveryPremiumDetail.equals(other.getHomeDeliveryPremiumDetail()))) &&
            ((this.flatbedTrailerDetail==null && other.getFlatbedTrailerDetail()==null) || 
             (this.flatbedTrailerDetail!=null &&
              java.util.Arrays.equals(this.flatbedTrailerDetail, other.getFlatbedTrailerDetail()))) &&
            ((this.freightGuaranteeDetail==null && other.getFreightGuaranteeDetail()==null) || 
             (this.freightGuaranteeDetail!=null &&
              this.freightGuaranteeDetail.equals(other.getFreightGuaranteeDetail()))) &&
            ((this.etdDetail==null && other.getEtdDetail()==null) || 
             (this.etdDetail!=null &&
              this.etdDetail.equals(other.getEtdDetail()))) &&
            ((this.extraLaborDetail==null && other.getExtraLaborDetail()==null) || 
             (this.extraLaborDetail!=null &&
              this.extraLaborDetail.equals(other.getExtraLaborDetail()))) &&
            ((this.palletShrinkwrapDetail==null && other.getPalletShrinkwrapDetail()==null) || 
             (this.palletShrinkwrapDetail!=null &&
              this.palletShrinkwrapDetail.equals(other.getPalletShrinkwrapDetail()))) &&
            ((this.palletsProvidedDetail==null && other.getPalletsProvidedDetail()==null) || 
             (this.palletsProvidedDetail!=null &&
              this.palletsProvidedDetail.equals(other.getPalletsProvidedDetail()))) &&
            ((this.detentionDetail==null && other.getDetentionDetail()==null) || 
             (this.detentionDetail!=null &&
              this.detentionDetail.equals(other.getDetentionDetail()))) &&
            ((this.markingOrTaggingDetail==null && other.getMarkingOrTaggingDetail()==null) || 
             (this.markingOrTaggingDetail!=null &&
              this.markingOrTaggingDetail.equals(other.getMarkingOrTaggingDetail()))) &&
            ((this.nonBusinessTimeDetail==null && other.getNonBusinessTimeDetail()==null) || 
             (this.nonBusinessTimeDetail!=null &&
              this.nonBusinessTimeDetail.equals(other.getNonBusinessTimeDetail()))) &&
            ((this.shipmentAssemblyDetail==null && other.getShipmentAssemblyDetail()==null) || 
             (this.shipmentAssemblyDetail!=null &&
              this.shipmentAssemblyDetail.equals(other.getShipmentAssemblyDetail()))) &&
            ((this.sortAndSegregateDetail==null && other.getSortAndSegregateDetail()==null) || 
             (this.sortAndSegregateDetail!=null &&
              this.sortAndSegregateDetail.equals(other.getSortAndSegregateDetail()))) &&
            ((this.specialEquipmentDetail==null && other.getSpecialEquipmentDetail()==null) || 
             (this.specialEquipmentDetail!=null &&
              java.util.Arrays.equals(this.specialEquipmentDetail, other.getSpecialEquipmentDetail()))) &&
            ((this.storageDetail==null && other.getStorageDetail()==null) || 
             (this.storageDetail!=null &&
              this.storageDetail.equals(other.getStorageDetail()))) &&
            ((this.weighingDetail==null && other.getWeighingDetail()==null) || 
             (this.weighingDetail!=null &&
              this.weighingDetail.equals(other.getWeighingDetail()))) &&
            ((this.customDeliveryWindowDetail==null && other.getCustomDeliveryWindowDetail()==null) || 
             (this.customDeliveryWindowDetail!=null &&
              this.customDeliveryWindowDetail.equals(other.getCustomDeliveryWindowDetail())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getSpecialServiceTypes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSpecialServiceTypes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSpecialServiceTypes(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCodDetail() != null) {
            _hashCode += getCodDetail().hashCode();
        }
        if (getDeliveryOnInvoiceAcceptanceDetail() != null) {
            _hashCode += getDeliveryOnInvoiceAcceptanceDetail().hashCode();
        }
        if (getHoldAtLocationDetail() != null) {
            _hashCode += getHoldAtLocationDetail().hashCode();
        }
        if (getEventNotificationDetail() != null) {
            _hashCode += getEventNotificationDetail().hashCode();
        }
        if (getReturnShipmentDetail() != null) {
            _hashCode += getReturnShipmentDetail().hashCode();
        }
        if (getPendingShipmentDetail() != null) {
            _hashCode += getPendingShipmentDetail().hashCode();
        }
        if (getInternationalControlledExportDetail() != null) {
            _hashCode += getInternationalControlledExportDetail().hashCode();
        }
        if (getInternationalTrafficInArmsRegulationsDetail() != null) {
            _hashCode += getInternationalTrafficInArmsRegulationsDetail().hashCode();
        }
        if (getShipmentDryIceDetail() != null) {
            _hashCode += getShipmentDryIceDetail().hashCode();
        }
        if (getHomeDeliveryPremiumDetail() != null) {
            _hashCode += getHomeDeliveryPremiumDetail().hashCode();
        }
        if (getFlatbedTrailerDetail() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFlatbedTrailerDetail());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFlatbedTrailerDetail(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFreightGuaranteeDetail() != null) {
            _hashCode += getFreightGuaranteeDetail().hashCode();
        }
        if (getEtdDetail() != null) {
            _hashCode += getEtdDetail().hashCode();
        }
        if (getExtraLaborDetail() != null) {
            _hashCode += getExtraLaborDetail().hashCode();
        }
        if (getPalletShrinkwrapDetail() != null) {
            _hashCode += getPalletShrinkwrapDetail().hashCode();
        }
        if (getPalletsProvidedDetail() != null) {
            _hashCode += getPalletsProvidedDetail().hashCode();
        }
        if (getDetentionDetail() != null) {
            _hashCode += getDetentionDetail().hashCode();
        }
        if (getMarkingOrTaggingDetail() != null) {
            _hashCode += getMarkingOrTaggingDetail().hashCode();
        }
        if (getNonBusinessTimeDetail() != null) {
            _hashCode += getNonBusinessTimeDetail().hashCode();
        }
        if (getShipmentAssemblyDetail() != null) {
            _hashCode += getShipmentAssemblyDetail().hashCode();
        }
        if (getSortAndSegregateDetail() != null) {
            _hashCode += getSortAndSegregateDetail().hashCode();
        }
        if (getSpecialEquipmentDetail() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSpecialEquipmentDetail());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSpecialEquipmentDetail(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getStorageDetail() != null) {
            _hashCode += getStorageDetail().hashCode();
        }
        if (getWeighingDetail() != null) {
            _hashCode += getWeighingDetail().hashCode();
        }
        if (getCustomDeliveryWindowDetail() != null) {
            _hashCode += getCustomDeliveryWindowDetail().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ShipmentSpecialServicesRequested.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "ShipmentSpecialServicesRequested"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("specialServiceTypes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "SpecialServiceTypes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "CodDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "CodDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deliveryOnInvoiceAcceptanceDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "DeliveryOnInvoiceAcceptanceDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "DeliveryOnInvoiceAcceptanceDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("holdAtLocationDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "HoldAtLocationDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "HoldAtLocationDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventNotificationDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "EventNotificationDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "ShipmentEventNotificationDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("returnShipmentDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "ReturnShipmentDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "ReturnShipmentDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pendingShipmentDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "PendingShipmentDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "PendingShipmentDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("internationalControlledExportDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "InternationalControlledExportDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "InternationalControlledExportDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("internationalTrafficInArmsRegulationsDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "InternationalTrafficInArmsRegulationsDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "InternationalTrafficInArmsRegulationsDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipmentDryIceDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "ShipmentDryIceDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "ShipmentDryIceDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("homeDeliveryPremiumDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "HomeDeliveryPremiumDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "HomeDeliveryPremiumDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flatbedTrailerDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "FlatbedTrailerDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "FlatbedTrailerOption"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "Options"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("freightGuaranteeDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "FreightGuaranteeDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "FreightGuaranteeDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("etdDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "EtdDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "EtdDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("extraLaborDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "ExtraLaborDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "ExtraLaborDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("palletShrinkwrapDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "PalletShrinkwrapDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "PalletShrinkwrapDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("palletsProvidedDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "PalletsProvidedDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "PalletsProvidedDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("detentionDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "DetentionDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "DetentionDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("markingOrTaggingDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "MarkingOrTaggingDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "MarkingOrTaggingDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nonBusinessTimeDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "NonBusinessTimeDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "NonBusinessTimeDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipmentAssemblyDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "ShipmentAssemblyDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "ShipmentAssemblyDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sortAndSegregateDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "SortAndSegregateDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "SortAndSegregateDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("specialEquipmentDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "SpecialEquipmentDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "SpecialEquipmentLineItem"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "LineItems"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("storageDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "StorageDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "StorageDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("weighingDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "WeighingDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "WeighingDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customDeliveryWindowDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "CustomDeliveryWindowDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "CustomDeliveryWindowDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
