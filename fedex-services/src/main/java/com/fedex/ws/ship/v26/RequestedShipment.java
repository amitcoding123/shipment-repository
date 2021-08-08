/**
 * RequestedShipment.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.ws.ship.v26;

public class RequestedShipment  implements java.io.Serializable {
    private java.util.Calendar shipTimestamp;

    private com.fedex.ws.ship.v26.DropoffType dropoffType;

    /* This field contains the service type values, like PRIORITY_OVERNIGHT
     * and FEDEX_GROUND. */
    private java.lang.String serviceType;

    /* This field contains the packaging type values, like YOUR_PACKAGING
     * and FEDEX_ENVELOPE. */
    private java.lang.String packagingType;

    /* The client's shipping cycle to which this shipment belongs. */
    private java.lang.String shippingCycle;

    /* This specifies information related to the manifest associated
     * with the shipment. */
    private com.fedex.ws.ship.v26.ShipmentManifestDetail manifestDetail;

    /* The shipment variations for the current shipment expressed
     * in key-value pairs. */
    private com.fedex.ws.ship.v26.ShipmentVariationOptionDetail[] variationOptions;

    private com.fedex.ws.ship.v26.Weight totalWeight;

    /* Specifies the total declared value for carriage of the shipment.
     * The declared value for carriage represents the maximum liability of
     * FedEx in connection with a shipment, including, but not limited to,
     * any loss, damage, delay, mis-delivery, nondelivery, misinformation,
     * any failure to provide information, or mis-delivery of information
     * relating to the shipment. */
    private com.fedex.ws.ship.v26.Money totalInsuredValue;

    /* This attribute indicates the currency the caller requests to
     * have used in all returned monetary values (when a choice is possible). */
    private java.lang.String preferredCurrency;

    /* Specifies details about the entity responsible for the shipment. */
    private com.fedex.ws.ship.v26.ShipmentAuthorizationDetail shipmentAuthorizationDetail;

    private com.fedex.ws.ship.v26.Party shipper;

    private com.fedex.ws.ship.v26.Party recipient;

    private java.lang.String recipientLocationNumber;

    /* Physical starting address for the shipment, if different from
     * shipper's address. */
    private com.fedex.ws.ship.v26.ContactAndAddress origin;

    /* The sold-to party is used for customs clearance; for example,
     * in support of US import customs rules. The need for this field could
     * vary based on whether a sold-to party was specified on a consolidation. */
    private com.fedex.ws.ship.v26.Party soldTo;

    private com.fedex.ws.ship.v26.Payment shippingChargesPayment;

    private com.fedex.ws.ship.v26.ShipmentSpecialServicesRequested specialServicesRequested;

    /* Specifies any custom processing to be applied to this shipment. */
    private com.fedex.ws.ship.v26.ShipmentProcessingOptionsRequested processingOptionsRequested;

    private com.fedex.ws.ship.v26.ExpressFreightDetail expressFreightDetail;

    /* Data applicable to shipments using FEDEX_FREIGHT_ECONOMY and
     * FEDEX_FREIGHT_PRIORITY services. */
    private com.fedex.ws.ship.v26.FreightShipmentDetail freightShipmentDetail;

    /* Used with Ground Home Delivery and Freight. */
    private java.lang.String deliveryInstructions;

    private com.fedex.ws.ship.v26.VariableHandlingChargeDetail variableHandlingChargeDetail;

    /* Customs clearance data, used for both international and intra-country
     * shipping. */
    private com.fedex.ws.ship.v26.CustomsClearanceDetail customsClearanceDetail;

    /* For use in "process tag" transaction. */
    private com.fedex.ws.ship.v26.PickupDetail pickupDetail;

    /* Specifies the characteristics of a shipment pertaining to SmartPost
     * services. */
    private com.fedex.ws.ship.v26.SmartPostShipmentDetail smartPostDetail;

    /* If true, only the shipper/payor will have visibility of this
     * shipment. */
    private java.lang.Boolean blockInsightVisibility;

    /* Specifies the client-requested response in the event of errors
     * within shipment. */
    private com.fedex.ws.ship.v26.ErrorLabelBehaviorType errorLabelBehavior;

    private com.fedex.ws.ship.v26.LabelSpecification labelSpecification;

    /* Contains data used to create additional (non-label) shipping
     * documents. */
    private com.fedex.ws.ship.v26.ShippingDocumentSpecification shippingDocumentSpecification;

    /* Specifies whether and what kind of rates the customer wishes
     * to have quoted on this shipment. The reply will also be constrained
     * by other data on the shipment and customer. */
    private com.fedex.ws.ship.v26.RateRequestType[] rateRequestTypes;

    /* Specifies the type of rate the customer wishes to have used
     * as the actual rate type. */
    private com.fedex.ws.ship.v26.ReturnedRateType customerSelectedActualRateType;

    /* Specifies whether the customer wishes to have Estimated Duties
     * and Taxes provided with the rate quotation on this shipment. Only
     * applies with shipments moving under international services. */
    private com.fedex.ws.ship.v26.EdtRequestType edtRequestType;

    /* Specifies the details for the custom rates. */
    private com.fedex.ws.ship.v26.CustomRatingOptionDetail customRatingOptionDetail;

    /* Only used with multiple-transaction shipments, to identify
     * the master package in a multi-piece shipment. */
    private com.fedex.ws.ship.v26.TrackingId masterTrackingId;

    /* The total number of packages in the entire shipment (even when
     * the shipment spans multiple transactions.) */
    private org.apache.axis.types.NonNegativeInteger packageCount;

    /* Specifies data structures that may be re-used multiple times
     * with s single shipment. */
    private com.fedex.ws.ship.v26.DangerousGoodsDetail[] configurationData;

    /* One or more package-attribute descriptions, each of which describes
     * an individual package, a group of identical packages, or (for the
     * total-piece-total-weight case) common characteristics all packages
     * in the shipment. */
    private com.fedex.ws.ship.v26.RequestedPackageLineItem[] requestedPackageLineItems;

    public RequestedShipment() {
    }

    public RequestedShipment(
           java.util.Calendar shipTimestamp,
           com.fedex.ws.ship.v26.DropoffType dropoffType,
           java.lang.String serviceType,
           java.lang.String packagingType,
           java.lang.String shippingCycle,
           com.fedex.ws.ship.v26.ShipmentManifestDetail manifestDetail,
           com.fedex.ws.ship.v26.ShipmentVariationOptionDetail[] variationOptions,
           com.fedex.ws.ship.v26.Weight totalWeight,
           com.fedex.ws.ship.v26.Money totalInsuredValue,
           java.lang.String preferredCurrency,
           com.fedex.ws.ship.v26.ShipmentAuthorizationDetail shipmentAuthorizationDetail,
           com.fedex.ws.ship.v26.Party shipper,
           com.fedex.ws.ship.v26.Party recipient,
           java.lang.String recipientLocationNumber,
           com.fedex.ws.ship.v26.ContactAndAddress origin,
           com.fedex.ws.ship.v26.Party soldTo,
           com.fedex.ws.ship.v26.Payment shippingChargesPayment,
           com.fedex.ws.ship.v26.ShipmentSpecialServicesRequested specialServicesRequested,
           com.fedex.ws.ship.v26.ShipmentProcessingOptionsRequested processingOptionsRequested,
           com.fedex.ws.ship.v26.ExpressFreightDetail expressFreightDetail,
           com.fedex.ws.ship.v26.FreightShipmentDetail freightShipmentDetail,
           java.lang.String deliveryInstructions,
           com.fedex.ws.ship.v26.VariableHandlingChargeDetail variableHandlingChargeDetail,
           com.fedex.ws.ship.v26.CustomsClearanceDetail customsClearanceDetail,
           com.fedex.ws.ship.v26.PickupDetail pickupDetail,
           com.fedex.ws.ship.v26.SmartPostShipmentDetail smartPostDetail,
           java.lang.Boolean blockInsightVisibility,
           com.fedex.ws.ship.v26.ErrorLabelBehaviorType errorLabelBehavior,
           com.fedex.ws.ship.v26.LabelSpecification labelSpecification,
           com.fedex.ws.ship.v26.ShippingDocumentSpecification shippingDocumentSpecification,
           com.fedex.ws.ship.v26.RateRequestType[] rateRequestTypes,
           com.fedex.ws.ship.v26.ReturnedRateType customerSelectedActualRateType,
           com.fedex.ws.ship.v26.EdtRequestType edtRequestType,
           com.fedex.ws.ship.v26.CustomRatingOptionDetail customRatingOptionDetail,
           com.fedex.ws.ship.v26.TrackingId masterTrackingId,
           org.apache.axis.types.NonNegativeInteger packageCount,
           com.fedex.ws.ship.v26.DangerousGoodsDetail[] configurationData,
           com.fedex.ws.ship.v26.RequestedPackageLineItem[] requestedPackageLineItems) {
           this.shipTimestamp = shipTimestamp;
           this.dropoffType = dropoffType;
           this.serviceType = serviceType;
           this.packagingType = packagingType;
           this.shippingCycle = shippingCycle;
           this.manifestDetail = manifestDetail;
           this.variationOptions = variationOptions;
           this.totalWeight = totalWeight;
           this.totalInsuredValue = totalInsuredValue;
           this.preferredCurrency = preferredCurrency;
           this.shipmentAuthorizationDetail = shipmentAuthorizationDetail;
           this.shipper = shipper;
           this.recipient = recipient;
           this.recipientLocationNumber = recipientLocationNumber;
           this.origin = origin;
           this.soldTo = soldTo;
           this.shippingChargesPayment = shippingChargesPayment;
           this.specialServicesRequested = specialServicesRequested;
           this.processingOptionsRequested = processingOptionsRequested;
           this.expressFreightDetail = expressFreightDetail;
           this.freightShipmentDetail = freightShipmentDetail;
           this.deliveryInstructions = deliveryInstructions;
           this.variableHandlingChargeDetail = variableHandlingChargeDetail;
           this.customsClearanceDetail = customsClearanceDetail;
           this.pickupDetail = pickupDetail;
           this.smartPostDetail = smartPostDetail;
           this.blockInsightVisibility = blockInsightVisibility;
           this.errorLabelBehavior = errorLabelBehavior;
           this.labelSpecification = labelSpecification;
           this.shippingDocumentSpecification = shippingDocumentSpecification;
           this.rateRequestTypes = rateRequestTypes;
           this.customerSelectedActualRateType = customerSelectedActualRateType;
           this.edtRequestType = edtRequestType;
           this.customRatingOptionDetail = customRatingOptionDetail;
           this.masterTrackingId = masterTrackingId;
           this.packageCount = packageCount;
           this.configurationData = configurationData;
           this.requestedPackageLineItems = requestedPackageLineItems;
    }


    /**
     * Gets the shipTimestamp value for this RequestedShipment.
     * 
     * @return shipTimestamp
     */
    public java.util.Calendar getShipTimestamp() {
        return shipTimestamp;
    }


    /**
     * Sets the shipTimestamp value for this RequestedShipment.
     * 
     * @param shipTimestamp
     */
    public void setShipTimestamp(java.util.Calendar shipTimestamp) {
        this.shipTimestamp = shipTimestamp;
    }


    /**
     * Gets the dropoffType value for this RequestedShipment.
     * 
     * @return dropoffType
     */
    public com.fedex.ws.ship.v26.DropoffType getDropoffType() {
        return dropoffType;
    }


    /**
     * Sets the dropoffType value for this RequestedShipment.
     * 
     * @param dropoffType
     */
    public void setDropoffType(com.fedex.ws.ship.v26.DropoffType dropoffType) {
        this.dropoffType = dropoffType;
    }


    /**
     * Gets the serviceType value for this RequestedShipment.
     * 
     * @return serviceType   * This field contains the service type values, like PRIORITY_OVERNIGHT
     * and FEDEX_GROUND.
     */
    public java.lang.String getServiceType() {
        return serviceType;
    }


    /**
     * Sets the serviceType value for this RequestedShipment.
     * 
     * @param serviceType   * This field contains the service type values, like PRIORITY_OVERNIGHT
     * and FEDEX_GROUND.
     */
    public void setServiceType(java.lang.String serviceType) {
        this.serviceType = serviceType;
    }


    /**
     * Gets the packagingType value for this RequestedShipment.
     * 
     * @return packagingType   * This field contains the packaging type values, like YOUR_PACKAGING
     * and FEDEX_ENVELOPE.
     */
    public java.lang.String getPackagingType() {
        return packagingType;
    }


    /**
     * Sets the packagingType value for this RequestedShipment.
     * 
     * @param packagingType   * This field contains the packaging type values, like YOUR_PACKAGING
     * and FEDEX_ENVELOPE.
     */
    public void setPackagingType(java.lang.String packagingType) {
        this.packagingType = packagingType;
    }


    /**
     * Gets the shippingCycle value for this RequestedShipment.
     * 
     * @return shippingCycle   * The client's shipping cycle to which this shipment belongs.
     */
    public java.lang.String getShippingCycle() {
        return shippingCycle;
    }


    /**
     * Sets the shippingCycle value for this RequestedShipment.
     * 
     * @param shippingCycle   * The client's shipping cycle to which this shipment belongs.
     */
    public void setShippingCycle(java.lang.String shippingCycle) {
        this.shippingCycle = shippingCycle;
    }


    /**
     * Gets the manifestDetail value for this RequestedShipment.
     * 
     * @return manifestDetail   * This specifies information related to the manifest associated
     * with the shipment.
     */
    public com.fedex.ws.ship.v26.ShipmentManifestDetail getManifestDetail() {
        return manifestDetail;
    }


    /**
     * Sets the manifestDetail value for this RequestedShipment.
     * 
     * @param manifestDetail   * This specifies information related to the manifest associated
     * with the shipment.
     */
    public void setManifestDetail(com.fedex.ws.ship.v26.ShipmentManifestDetail manifestDetail) {
        this.manifestDetail = manifestDetail;
    }


    /**
     * Gets the variationOptions value for this RequestedShipment.
     * 
     * @return variationOptions   * The shipment variations for the current shipment expressed
     * in key-value pairs.
     */
    public com.fedex.ws.ship.v26.ShipmentVariationOptionDetail[] getVariationOptions() {
        return variationOptions;
    }


    /**
     * Sets the variationOptions value for this RequestedShipment.
     * 
     * @param variationOptions   * The shipment variations for the current shipment expressed
     * in key-value pairs.
     */
    public void setVariationOptions(com.fedex.ws.ship.v26.ShipmentVariationOptionDetail[] variationOptions) {
        this.variationOptions = variationOptions;
    }

    public com.fedex.ws.ship.v26.ShipmentVariationOptionDetail getVariationOptions(int i) {
        return this.variationOptions[i];
    }

    public void setVariationOptions(int i, com.fedex.ws.ship.v26.ShipmentVariationOptionDetail _value) {
        this.variationOptions[i] = _value;
    }


    /**
     * Gets the totalWeight value for this RequestedShipment.
     * 
     * @return totalWeight
     */
    public com.fedex.ws.ship.v26.Weight getTotalWeight() {
        return totalWeight;
    }


    /**
     * Sets the totalWeight value for this RequestedShipment.
     * 
     * @param totalWeight
     */
    public void setTotalWeight(com.fedex.ws.ship.v26.Weight totalWeight) {
        this.totalWeight = totalWeight;
    }


    /**
     * Gets the totalInsuredValue value for this RequestedShipment.
     * 
     * @return totalInsuredValue   * Specifies the total declared value for carriage of the shipment.
     * The declared value for carriage represents the maximum liability of
     * FedEx in connection with a shipment, including, but not limited to,
     * any loss, damage, delay, mis-delivery, nondelivery, misinformation,
     * any failure to provide information, or mis-delivery of information
     * relating to the shipment.
     */
    public com.fedex.ws.ship.v26.Money getTotalInsuredValue() {
        return totalInsuredValue;
    }


    /**
     * Sets the totalInsuredValue value for this RequestedShipment.
     * 
     * @param totalInsuredValue   * Specifies the total declared value for carriage of the shipment.
     * The declared value for carriage represents the maximum liability of
     * FedEx in connection with a shipment, including, but not limited to,
     * any loss, damage, delay, mis-delivery, nondelivery, misinformation,
     * any failure to provide information, or mis-delivery of information
     * relating to the shipment.
     */
    public void setTotalInsuredValue(com.fedex.ws.ship.v26.Money totalInsuredValue) {
        this.totalInsuredValue = totalInsuredValue;
    }


    /**
     * Gets the preferredCurrency value for this RequestedShipment.
     * 
     * @return preferredCurrency   * This attribute indicates the currency the caller requests to
     * have used in all returned monetary values (when a choice is possible).
     */
    public java.lang.String getPreferredCurrency() {
        return preferredCurrency;
    }


    /**
     * Sets the preferredCurrency value for this RequestedShipment.
     * 
     * @param preferredCurrency   * This attribute indicates the currency the caller requests to
     * have used in all returned monetary values (when a choice is possible).
     */
    public void setPreferredCurrency(java.lang.String preferredCurrency) {
        this.preferredCurrency = preferredCurrency;
    }


    /**
     * Gets the shipmentAuthorizationDetail value for this RequestedShipment.
     * 
     * @return shipmentAuthorizationDetail   * Specifies details about the entity responsible for the shipment.
     */
    public com.fedex.ws.ship.v26.ShipmentAuthorizationDetail getShipmentAuthorizationDetail() {
        return shipmentAuthorizationDetail;
    }


    /**
     * Sets the shipmentAuthorizationDetail value for this RequestedShipment.
     * 
     * @param shipmentAuthorizationDetail   * Specifies details about the entity responsible for the shipment.
     */
    public void setShipmentAuthorizationDetail(com.fedex.ws.ship.v26.ShipmentAuthorizationDetail shipmentAuthorizationDetail) {
        this.shipmentAuthorizationDetail = shipmentAuthorizationDetail;
    }


    /**
     * Gets the shipper value for this RequestedShipment.
     * 
     * @return shipper
     */
    public com.fedex.ws.ship.v26.Party getShipper() {
        return shipper;
    }


    /**
     * Sets the shipper value for this RequestedShipment.
     * 
     * @param shipper
     */
    public void setShipper(com.fedex.ws.ship.v26.Party shipper) {
        this.shipper = shipper;
    }


    /**
     * Gets the recipient value for this RequestedShipment.
     * 
     * @return recipient
     */
    public com.fedex.ws.ship.v26.Party getRecipient() {
        return recipient;
    }


    /**
     * Sets the recipient value for this RequestedShipment.
     * 
     * @param recipient
     */
    public void setRecipient(com.fedex.ws.ship.v26.Party recipient) {
        this.recipient = recipient;
    }


    /**
     * Gets the recipientLocationNumber value for this RequestedShipment.
     * 
     * @return recipientLocationNumber
     */
    public java.lang.String getRecipientLocationNumber() {
        return recipientLocationNumber;
    }


    /**
     * Sets the recipientLocationNumber value for this RequestedShipment.
     * 
     * @param recipientLocationNumber
     */
    public void setRecipientLocationNumber(java.lang.String recipientLocationNumber) {
        this.recipientLocationNumber = recipientLocationNumber;
    }


    /**
     * Gets the origin value for this RequestedShipment.
     * 
     * @return origin   * Physical starting address for the shipment, if different from
     * shipper's address.
     */
    public com.fedex.ws.ship.v26.ContactAndAddress getOrigin() {
        return origin;
    }


    /**
     * Sets the origin value for this RequestedShipment.
     * 
     * @param origin   * Physical starting address for the shipment, if different from
     * shipper's address.
     */
    public void setOrigin(com.fedex.ws.ship.v26.ContactAndAddress origin) {
        this.origin = origin;
    }


    /**
     * Gets the soldTo value for this RequestedShipment.
     * 
     * @return soldTo   * The sold-to party is used for customs clearance; for example,
     * in support of US import customs rules. The need for this field could
     * vary based on whether a sold-to party was specified on a consolidation.
     */
    public com.fedex.ws.ship.v26.Party getSoldTo() {
        return soldTo;
    }


    /**
     * Sets the soldTo value for this RequestedShipment.
     * 
     * @param soldTo   * The sold-to party is used for customs clearance; for example,
     * in support of US import customs rules. The need for this field could
     * vary based on whether a sold-to party was specified on a consolidation.
     */
    public void setSoldTo(com.fedex.ws.ship.v26.Party soldTo) {
        this.soldTo = soldTo;
    }


    /**
     * Gets the shippingChargesPayment value for this RequestedShipment.
     * 
     * @return shippingChargesPayment
     */
    public com.fedex.ws.ship.v26.Payment getShippingChargesPayment() {
        return shippingChargesPayment;
    }


    /**
     * Sets the shippingChargesPayment value for this RequestedShipment.
     * 
     * @param shippingChargesPayment
     */
    public void setShippingChargesPayment(com.fedex.ws.ship.v26.Payment shippingChargesPayment) {
        this.shippingChargesPayment = shippingChargesPayment;
    }


    /**
     * Gets the specialServicesRequested value for this RequestedShipment.
     * 
     * @return specialServicesRequested
     */
    public com.fedex.ws.ship.v26.ShipmentSpecialServicesRequested getSpecialServicesRequested() {
        return specialServicesRequested;
    }


    /**
     * Sets the specialServicesRequested value for this RequestedShipment.
     * 
     * @param specialServicesRequested
     */
    public void setSpecialServicesRequested(com.fedex.ws.ship.v26.ShipmentSpecialServicesRequested specialServicesRequested) {
        this.specialServicesRequested = specialServicesRequested;
    }


    /**
     * Gets the processingOptionsRequested value for this RequestedShipment.
     * 
     * @return processingOptionsRequested   * Specifies any custom processing to be applied to this shipment.
     */
    public com.fedex.ws.ship.v26.ShipmentProcessingOptionsRequested getProcessingOptionsRequested() {
        return processingOptionsRequested;
    }


    /**
     * Sets the processingOptionsRequested value for this RequestedShipment.
     * 
     * @param processingOptionsRequested   * Specifies any custom processing to be applied to this shipment.
     */
    public void setProcessingOptionsRequested(com.fedex.ws.ship.v26.ShipmentProcessingOptionsRequested processingOptionsRequested) {
        this.processingOptionsRequested = processingOptionsRequested;
    }


    /**
     * Gets the expressFreightDetail value for this RequestedShipment.
     * 
     * @return expressFreightDetail
     */
    public com.fedex.ws.ship.v26.ExpressFreightDetail getExpressFreightDetail() {
        return expressFreightDetail;
    }


    /**
     * Sets the expressFreightDetail value for this RequestedShipment.
     * 
     * @param expressFreightDetail
     */
    public void setExpressFreightDetail(com.fedex.ws.ship.v26.ExpressFreightDetail expressFreightDetail) {
        this.expressFreightDetail = expressFreightDetail;
    }


    /**
     * Gets the freightShipmentDetail value for this RequestedShipment.
     * 
     * @return freightShipmentDetail   * Data applicable to shipments using FEDEX_FREIGHT_ECONOMY and
     * FEDEX_FREIGHT_PRIORITY services.
     */
    public com.fedex.ws.ship.v26.FreightShipmentDetail getFreightShipmentDetail() {
        return freightShipmentDetail;
    }


    /**
     * Sets the freightShipmentDetail value for this RequestedShipment.
     * 
     * @param freightShipmentDetail   * Data applicable to shipments using FEDEX_FREIGHT_ECONOMY and
     * FEDEX_FREIGHT_PRIORITY services.
     */
    public void setFreightShipmentDetail(com.fedex.ws.ship.v26.FreightShipmentDetail freightShipmentDetail) {
        this.freightShipmentDetail = freightShipmentDetail;
    }


    /**
     * Gets the deliveryInstructions value for this RequestedShipment.
     * 
     * @return deliveryInstructions   * Used with Ground Home Delivery and Freight.
     */
    public java.lang.String getDeliveryInstructions() {
        return deliveryInstructions;
    }


    /**
     * Sets the deliveryInstructions value for this RequestedShipment.
     * 
     * @param deliveryInstructions   * Used with Ground Home Delivery and Freight.
     */
    public void setDeliveryInstructions(java.lang.String deliveryInstructions) {
        this.deliveryInstructions = deliveryInstructions;
    }


    /**
     * Gets the variableHandlingChargeDetail value for this RequestedShipment.
     * 
     * @return variableHandlingChargeDetail
     */
    public com.fedex.ws.ship.v26.VariableHandlingChargeDetail getVariableHandlingChargeDetail() {
        return variableHandlingChargeDetail;
    }


    /**
     * Sets the variableHandlingChargeDetail value for this RequestedShipment.
     * 
     * @param variableHandlingChargeDetail
     */
    public void setVariableHandlingChargeDetail(com.fedex.ws.ship.v26.VariableHandlingChargeDetail variableHandlingChargeDetail) {
        this.variableHandlingChargeDetail = variableHandlingChargeDetail;
    }


    /**
     * Gets the customsClearanceDetail value for this RequestedShipment.
     * 
     * @return customsClearanceDetail   * Customs clearance data, used for both international and intra-country
     * shipping.
     */
    public com.fedex.ws.ship.v26.CustomsClearanceDetail getCustomsClearanceDetail() {
        return customsClearanceDetail;
    }


    /**
     * Sets the customsClearanceDetail value for this RequestedShipment.
     * 
     * @param customsClearanceDetail   * Customs clearance data, used for both international and intra-country
     * shipping.
     */
    public void setCustomsClearanceDetail(com.fedex.ws.ship.v26.CustomsClearanceDetail customsClearanceDetail) {
        this.customsClearanceDetail = customsClearanceDetail;
    }


    /**
     * Gets the pickupDetail value for this RequestedShipment.
     * 
     * @return pickupDetail   * For use in "process tag" transaction.
     */
    public com.fedex.ws.ship.v26.PickupDetail getPickupDetail() {
        return pickupDetail;
    }


    /**
     * Sets the pickupDetail value for this RequestedShipment.
     * 
     * @param pickupDetail   * For use in "process tag" transaction.
     */
    public void setPickupDetail(com.fedex.ws.ship.v26.PickupDetail pickupDetail) {
        this.pickupDetail = pickupDetail;
    }


    /**
     * Gets the smartPostDetail value for this RequestedShipment.
     * 
     * @return smartPostDetail   * Specifies the characteristics of a shipment pertaining to SmartPost
     * services.
     */
    public com.fedex.ws.ship.v26.SmartPostShipmentDetail getSmartPostDetail() {
        return smartPostDetail;
    }


    /**
     * Sets the smartPostDetail value for this RequestedShipment.
     * 
     * @param smartPostDetail   * Specifies the characteristics of a shipment pertaining to SmartPost
     * services.
     */
    public void setSmartPostDetail(com.fedex.ws.ship.v26.SmartPostShipmentDetail smartPostDetail) {
        this.smartPostDetail = smartPostDetail;
    }


    /**
     * Gets the blockInsightVisibility value for this RequestedShipment.
     * 
     * @return blockInsightVisibility   * If true, only the shipper/payor will have visibility of this
     * shipment.
     */
    public java.lang.Boolean getBlockInsightVisibility() {
        return blockInsightVisibility;
    }


    /**
     * Sets the blockInsightVisibility value for this RequestedShipment.
     * 
     * @param blockInsightVisibility   * If true, only the shipper/payor will have visibility of this
     * shipment.
     */
    public void setBlockInsightVisibility(java.lang.Boolean blockInsightVisibility) {
        this.blockInsightVisibility = blockInsightVisibility;
    }


    /**
     * Gets the errorLabelBehavior value for this RequestedShipment.
     * 
     * @return errorLabelBehavior   * Specifies the client-requested response in the event of errors
     * within shipment.
     */
    public com.fedex.ws.ship.v26.ErrorLabelBehaviorType getErrorLabelBehavior() {
        return errorLabelBehavior;
    }


    /**
     * Sets the errorLabelBehavior value for this RequestedShipment.
     * 
     * @param errorLabelBehavior   * Specifies the client-requested response in the event of errors
     * within shipment.
     */
    public void setErrorLabelBehavior(com.fedex.ws.ship.v26.ErrorLabelBehaviorType errorLabelBehavior) {
        this.errorLabelBehavior = errorLabelBehavior;
    }


    /**
     * Gets the labelSpecification value for this RequestedShipment.
     * 
     * @return labelSpecification
     */
    public com.fedex.ws.ship.v26.LabelSpecification getLabelSpecification() {
        return labelSpecification;
    }


    /**
     * Sets the labelSpecification value for this RequestedShipment.
     * 
     * @param labelSpecification
     */
    public void setLabelSpecification(com.fedex.ws.ship.v26.LabelSpecification labelSpecification) {
        this.labelSpecification = labelSpecification;
    }


    /**
     * Gets the shippingDocumentSpecification value for this RequestedShipment.
     * 
     * @return shippingDocumentSpecification   * Contains data used to create additional (non-label) shipping
     * documents.
     */
    public com.fedex.ws.ship.v26.ShippingDocumentSpecification getShippingDocumentSpecification() {
        return shippingDocumentSpecification;
    }


    /**
     * Sets the shippingDocumentSpecification value for this RequestedShipment.
     * 
     * @param shippingDocumentSpecification   * Contains data used to create additional (non-label) shipping
     * documents.
     */
    public void setShippingDocumentSpecification(com.fedex.ws.ship.v26.ShippingDocumentSpecification shippingDocumentSpecification) {
        this.shippingDocumentSpecification = shippingDocumentSpecification;
    }


    /**
     * Gets the rateRequestTypes value for this RequestedShipment.
     * 
     * @return rateRequestTypes   * Specifies whether and what kind of rates the customer wishes
     * to have quoted on this shipment. The reply will also be constrained
     * by other data on the shipment and customer.
     */
    public com.fedex.ws.ship.v26.RateRequestType[] getRateRequestTypes() {
        return rateRequestTypes;
    }


    /**
     * Sets the rateRequestTypes value for this RequestedShipment.
     * 
     * @param rateRequestTypes   * Specifies whether and what kind of rates the customer wishes
     * to have quoted on this shipment. The reply will also be constrained
     * by other data on the shipment and customer.
     */
    public void setRateRequestTypes(com.fedex.ws.ship.v26.RateRequestType[] rateRequestTypes) {
        this.rateRequestTypes = rateRequestTypes;
    }

    public com.fedex.ws.ship.v26.RateRequestType getRateRequestTypes(int i) {
        return this.rateRequestTypes[i];
    }

    public void setRateRequestTypes(int i, com.fedex.ws.ship.v26.RateRequestType _value) {
        this.rateRequestTypes[i] = _value;
    }


    /**
     * Gets the customerSelectedActualRateType value for this RequestedShipment.
     * 
     * @return customerSelectedActualRateType   * Specifies the type of rate the customer wishes to have used
     * as the actual rate type.
     */
    public com.fedex.ws.ship.v26.ReturnedRateType getCustomerSelectedActualRateType() {
        return customerSelectedActualRateType;
    }


    /**
     * Sets the customerSelectedActualRateType value for this RequestedShipment.
     * 
     * @param customerSelectedActualRateType   * Specifies the type of rate the customer wishes to have used
     * as the actual rate type.
     */
    public void setCustomerSelectedActualRateType(com.fedex.ws.ship.v26.ReturnedRateType customerSelectedActualRateType) {
        this.customerSelectedActualRateType = customerSelectedActualRateType;
    }


    /**
     * Gets the edtRequestType value for this RequestedShipment.
     * 
     * @return edtRequestType   * Specifies whether the customer wishes to have Estimated Duties
     * and Taxes provided with the rate quotation on this shipment. Only
     * applies with shipments moving under international services.
     */
    public com.fedex.ws.ship.v26.EdtRequestType getEdtRequestType() {
        return edtRequestType;
    }


    /**
     * Sets the edtRequestType value for this RequestedShipment.
     * 
     * @param edtRequestType   * Specifies whether the customer wishes to have Estimated Duties
     * and Taxes provided with the rate quotation on this shipment. Only
     * applies with shipments moving under international services.
     */
    public void setEdtRequestType(com.fedex.ws.ship.v26.EdtRequestType edtRequestType) {
        this.edtRequestType = edtRequestType;
    }


    /**
     * Gets the customRatingOptionDetail value for this RequestedShipment.
     * 
     * @return customRatingOptionDetail   * Specifies the details for the custom rates.
     */
    public com.fedex.ws.ship.v26.CustomRatingOptionDetail getCustomRatingOptionDetail() {
        return customRatingOptionDetail;
    }


    /**
     * Sets the customRatingOptionDetail value for this RequestedShipment.
     * 
     * @param customRatingOptionDetail   * Specifies the details for the custom rates.
     */
    public void setCustomRatingOptionDetail(com.fedex.ws.ship.v26.CustomRatingOptionDetail customRatingOptionDetail) {
        this.customRatingOptionDetail = customRatingOptionDetail;
    }


    /**
     * Gets the masterTrackingId value for this RequestedShipment.
     * 
     * @return masterTrackingId   * Only used with multiple-transaction shipments, to identify
     * the master package in a multi-piece shipment.
     */
    public com.fedex.ws.ship.v26.TrackingId getMasterTrackingId() {
        return masterTrackingId;
    }


    /**
     * Sets the masterTrackingId value for this RequestedShipment.
     * 
     * @param masterTrackingId   * Only used with multiple-transaction shipments, to identify
     * the master package in a multi-piece shipment.
     */
    public void setMasterTrackingId(com.fedex.ws.ship.v26.TrackingId masterTrackingId) {
        this.masterTrackingId = masterTrackingId;
    }


    /**
     * Gets the packageCount value for this RequestedShipment.
     * 
     * @return packageCount   * The total number of packages in the entire shipment (even when
     * the shipment spans multiple transactions.)
     */
    public org.apache.axis.types.NonNegativeInteger getPackageCount() {
        return packageCount;
    }


    /**
     * Sets the packageCount value for this RequestedShipment.
     * 
     * @param packageCount   * The total number of packages in the entire shipment (even when
     * the shipment spans multiple transactions.)
     */
    public void setPackageCount(org.apache.axis.types.NonNegativeInteger packageCount) {
        this.packageCount = packageCount;
    }


    /**
     * Gets the configurationData value for this RequestedShipment.
     * 
     * @return configurationData   * Specifies data structures that may be re-used multiple times
     * with s single shipment.
     */
    public com.fedex.ws.ship.v26.DangerousGoodsDetail[] getConfigurationData() {
        return configurationData;
    }


    /**
     * Sets the configurationData value for this RequestedShipment.
     * 
     * @param configurationData   * Specifies data structures that may be re-used multiple times
     * with s single shipment.
     */
    public void setConfigurationData(com.fedex.ws.ship.v26.DangerousGoodsDetail[] configurationData) {
        this.configurationData = configurationData;
    }


    /**
     * Gets the requestedPackageLineItems value for this RequestedShipment.
     * 
     * @return requestedPackageLineItems   * One or more package-attribute descriptions, each of which describes
     * an individual package, a group of identical packages, or (for the
     * total-piece-total-weight case) common characteristics all packages
     * in the shipment.
     */
    public com.fedex.ws.ship.v26.RequestedPackageLineItem[] getRequestedPackageLineItems() {
        return requestedPackageLineItems;
    }


    /**
     * Sets the requestedPackageLineItems value for this RequestedShipment.
     * 
     * @param requestedPackageLineItems   * One or more package-attribute descriptions, each of which describes
     * an individual package, a group of identical packages, or (for the
     * total-piece-total-weight case) common characteristics all packages
     * in the shipment.
     */
    public void setRequestedPackageLineItems(com.fedex.ws.ship.v26.RequestedPackageLineItem[] requestedPackageLineItems) {
        this.requestedPackageLineItems = requestedPackageLineItems;
    }

    public com.fedex.ws.ship.v26.RequestedPackageLineItem getRequestedPackageLineItems(int i) {
        return this.requestedPackageLineItems[i];
    }

    public void setRequestedPackageLineItems(int i, com.fedex.ws.ship.v26.RequestedPackageLineItem _value) {
        this.requestedPackageLineItems[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RequestedShipment)) return false;
        RequestedShipment other = (RequestedShipment) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.shipTimestamp==null && other.getShipTimestamp()==null) || 
             (this.shipTimestamp!=null &&
              this.shipTimestamp.equals(other.getShipTimestamp()))) &&
            ((this.dropoffType==null && other.getDropoffType()==null) || 
             (this.dropoffType!=null &&
              this.dropoffType.equals(other.getDropoffType()))) &&
            ((this.serviceType==null && other.getServiceType()==null) || 
             (this.serviceType!=null &&
              this.serviceType.equals(other.getServiceType()))) &&
            ((this.packagingType==null && other.getPackagingType()==null) || 
             (this.packagingType!=null &&
              this.packagingType.equals(other.getPackagingType()))) &&
            ((this.shippingCycle==null && other.getShippingCycle()==null) || 
             (this.shippingCycle!=null &&
              this.shippingCycle.equals(other.getShippingCycle()))) &&
            ((this.manifestDetail==null && other.getManifestDetail()==null) || 
             (this.manifestDetail!=null &&
              this.manifestDetail.equals(other.getManifestDetail()))) &&
            ((this.variationOptions==null && other.getVariationOptions()==null) || 
             (this.variationOptions!=null &&
              java.util.Arrays.equals(this.variationOptions, other.getVariationOptions()))) &&
            ((this.totalWeight==null && other.getTotalWeight()==null) || 
             (this.totalWeight!=null &&
              this.totalWeight.equals(other.getTotalWeight()))) &&
            ((this.totalInsuredValue==null && other.getTotalInsuredValue()==null) || 
             (this.totalInsuredValue!=null &&
              this.totalInsuredValue.equals(other.getTotalInsuredValue()))) &&
            ((this.preferredCurrency==null && other.getPreferredCurrency()==null) || 
             (this.preferredCurrency!=null &&
              this.preferredCurrency.equals(other.getPreferredCurrency()))) &&
            ((this.shipmentAuthorizationDetail==null && other.getShipmentAuthorizationDetail()==null) || 
             (this.shipmentAuthorizationDetail!=null &&
              this.shipmentAuthorizationDetail.equals(other.getShipmentAuthorizationDetail()))) &&
            ((this.shipper==null && other.getShipper()==null) || 
             (this.shipper!=null &&
              this.shipper.equals(other.getShipper()))) &&
            ((this.recipient==null && other.getRecipient()==null) || 
             (this.recipient!=null &&
              this.recipient.equals(other.getRecipient()))) &&
            ((this.recipientLocationNumber==null && other.getRecipientLocationNumber()==null) || 
             (this.recipientLocationNumber!=null &&
              this.recipientLocationNumber.equals(other.getRecipientLocationNumber()))) &&
            ((this.origin==null && other.getOrigin()==null) || 
             (this.origin!=null &&
              this.origin.equals(other.getOrigin()))) &&
            ((this.soldTo==null && other.getSoldTo()==null) || 
             (this.soldTo!=null &&
              this.soldTo.equals(other.getSoldTo()))) &&
            ((this.shippingChargesPayment==null && other.getShippingChargesPayment()==null) || 
             (this.shippingChargesPayment!=null &&
              this.shippingChargesPayment.equals(other.getShippingChargesPayment()))) &&
            ((this.specialServicesRequested==null && other.getSpecialServicesRequested()==null) || 
             (this.specialServicesRequested!=null &&
              this.specialServicesRequested.equals(other.getSpecialServicesRequested()))) &&
            ((this.processingOptionsRequested==null && other.getProcessingOptionsRequested()==null) || 
             (this.processingOptionsRequested!=null &&
              this.processingOptionsRequested.equals(other.getProcessingOptionsRequested()))) &&
            ((this.expressFreightDetail==null && other.getExpressFreightDetail()==null) || 
             (this.expressFreightDetail!=null &&
              this.expressFreightDetail.equals(other.getExpressFreightDetail()))) &&
            ((this.freightShipmentDetail==null && other.getFreightShipmentDetail()==null) || 
             (this.freightShipmentDetail!=null &&
              this.freightShipmentDetail.equals(other.getFreightShipmentDetail()))) &&
            ((this.deliveryInstructions==null && other.getDeliveryInstructions()==null) || 
             (this.deliveryInstructions!=null &&
              this.deliveryInstructions.equals(other.getDeliveryInstructions()))) &&
            ((this.variableHandlingChargeDetail==null && other.getVariableHandlingChargeDetail()==null) || 
             (this.variableHandlingChargeDetail!=null &&
              this.variableHandlingChargeDetail.equals(other.getVariableHandlingChargeDetail()))) &&
            ((this.customsClearanceDetail==null && other.getCustomsClearanceDetail()==null) || 
             (this.customsClearanceDetail!=null &&
              this.customsClearanceDetail.equals(other.getCustomsClearanceDetail()))) &&
            ((this.pickupDetail==null && other.getPickupDetail()==null) || 
             (this.pickupDetail!=null &&
              this.pickupDetail.equals(other.getPickupDetail()))) &&
            ((this.smartPostDetail==null && other.getSmartPostDetail()==null) || 
             (this.smartPostDetail!=null &&
              this.smartPostDetail.equals(other.getSmartPostDetail()))) &&
            ((this.blockInsightVisibility==null && other.getBlockInsightVisibility()==null) || 
             (this.blockInsightVisibility!=null &&
              this.blockInsightVisibility.equals(other.getBlockInsightVisibility()))) &&
            ((this.errorLabelBehavior==null && other.getErrorLabelBehavior()==null) || 
             (this.errorLabelBehavior!=null &&
              this.errorLabelBehavior.equals(other.getErrorLabelBehavior()))) &&
            ((this.labelSpecification==null && other.getLabelSpecification()==null) || 
             (this.labelSpecification!=null &&
              this.labelSpecification.equals(other.getLabelSpecification()))) &&
            ((this.shippingDocumentSpecification==null && other.getShippingDocumentSpecification()==null) || 
             (this.shippingDocumentSpecification!=null &&
              this.shippingDocumentSpecification.equals(other.getShippingDocumentSpecification()))) &&
            ((this.rateRequestTypes==null && other.getRateRequestTypes()==null) || 
             (this.rateRequestTypes!=null &&
              java.util.Arrays.equals(this.rateRequestTypes, other.getRateRequestTypes()))) &&
            ((this.customerSelectedActualRateType==null && other.getCustomerSelectedActualRateType()==null) || 
             (this.customerSelectedActualRateType!=null &&
              this.customerSelectedActualRateType.equals(other.getCustomerSelectedActualRateType()))) &&
            ((this.edtRequestType==null && other.getEdtRequestType()==null) || 
             (this.edtRequestType!=null &&
              this.edtRequestType.equals(other.getEdtRequestType()))) &&
            ((this.customRatingOptionDetail==null && other.getCustomRatingOptionDetail()==null) || 
             (this.customRatingOptionDetail!=null &&
              this.customRatingOptionDetail.equals(other.getCustomRatingOptionDetail()))) &&
            ((this.masterTrackingId==null && other.getMasterTrackingId()==null) || 
             (this.masterTrackingId!=null &&
              this.masterTrackingId.equals(other.getMasterTrackingId()))) &&
            ((this.packageCount==null && other.getPackageCount()==null) || 
             (this.packageCount!=null &&
              this.packageCount.equals(other.getPackageCount()))) &&
            ((this.configurationData==null && other.getConfigurationData()==null) || 
             (this.configurationData!=null &&
              java.util.Arrays.equals(this.configurationData, other.getConfigurationData()))) &&
            ((this.requestedPackageLineItems==null && other.getRequestedPackageLineItems()==null) || 
             (this.requestedPackageLineItems!=null &&
              java.util.Arrays.equals(this.requestedPackageLineItems, other.getRequestedPackageLineItems())));
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
        if (getShipTimestamp() != null) {
            _hashCode += getShipTimestamp().hashCode();
        }
        if (getDropoffType() != null) {
            _hashCode += getDropoffType().hashCode();
        }
        if (getServiceType() != null) {
            _hashCode += getServiceType().hashCode();
        }
        if (getPackagingType() != null) {
            _hashCode += getPackagingType().hashCode();
        }
        if (getShippingCycle() != null) {
            _hashCode += getShippingCycle().hashCode();
        }
        if (getManifestDetail() != null) {
            _hashCode += getManifestDetail().hashCode();
        }
        if (getVariationOptions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVariationOptions());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVariationOptions(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTotalWeight() != null) {
            _hashCode += getTotalWeight().hashCode();
        }
        if (getTotalInsuredValue() != null) {
            _hashCode += getTotalInsuredValue().hashCode();
        }
        if (getPreferredCurrency() != null) {
            _hashCode += getPreferredCurrency().hashCode();
        }
        if (getShipmentAuthorizationDetail() != null) {
            _hashCode += getShipmentAuthorizationDetail().hashCode();
        }
        if (getShipper() != null) {
            _hashCode += getShipper().hashCode();
        }
        if (getRecipient() != null) {
            _hashCode += getRecipient().hashCode();
        }
        if (getRecipientLocationNumber() != null) {
            _hashCode += getRecipientLocationNumber().hashCode();
        }
        if (getOrigin() != null) {
            _hashCode += getOrigin().hashCode();
        }
        if (getSoldTo() != null) {
            _hashCode += getSoldTo().hashCode();
        }
        if (getShippingChargesPayment() != null) {
            _hashCode += getShippingChargesPayment().hashCode();
        }
        if (getSpecialServicesRequested() != null) {
            _hashCode += getSpecialServicesRequested().hashCode();
        }
        if (getProcessingOptionsRequested() != null) {
            _hashCode += getProcessingOptionsRequested().hashCode();
        }
        if (getExpressFreightDetail() != null) {
            _hashCode += getExpressFreightDetail().hashCode();
        }
        if (getFreightShipmentDetail() != null) {
            _hashCode += getFreightShipmentDetail().hashCode();
        }
        if (getDeliveryInstructions() != null) {
            _hashCode += getDeliveryInstructions().hashCode();
        }
        if (getVariableHandlingChargeDetail() != null) {
            _hashCode += getVariableHandlingChargeDetail().hashCode();
        }
        if (getCustomsClearanceDetail() != null) {
            _hashCode += getCustomsClearanceDetail().hashCode();
        }
        if (getPickupDetail() != null) {
            _hashCode += getPickupDetail().hashCode();
        }
        if (getSmartPostDetail() != null) {
            _hashCode += getSmartPostDetail().hashCode();
        }
        if (getBlockInsightVisibility() != null) {
            _hashCode += getBlockInsightVisibility().hashCode();
        }
        if (getErrorLabelBehavior() != null) {
            _hashCode += getErrorLabelBehavior().hashCode();
        }
        if (getLabelSpecification() != null) {
            _hashCode += getLabelSpecification().hashCode();
        }
        if (getShippingDocumentSpecification() != null) {
            _hashCode += getShippingDocumentSpecification().hashCode();
        }
        if (getRateRequestTypes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRateRequestTypes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRateRequestTypes(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCustomerSelectedActualRateType() != null) {
            _hashCode += getCustomerSelectedActualRateType().hashCode();
        }
        if (getEdtRequestType() != null) {
            _hashCode += getEdtRequestType().hashCode();
        }
        if (getCustomRatingOptionDetail() != null) {
            _hashCode += getCustomRatingOptionDetail().hashCode();
        }
        if (getMasterTrackingId() != null) {
            _hashCode += getMasterTrackingId().hashCode();
        }
        if (getPackageCount() != null) {
            _hashCode += getPackageCount().hashCode();
        }
        if (getConfigurationData() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getConfigurationData());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getConfigurationData(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRequestedPackageLineItems() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRequestedPackageLineItems());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRequestedPackageLineItems(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RequestedShipment.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "RequestedShipment"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipTimestamp");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "ShipTimestamp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dropoffType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "DropoffType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "DropoffType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "ServiceType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("packagingType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "PackagingType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shippingCycle");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "ShippingCycle"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("manifestDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "ManifestDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "ShipmentManifestDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("variationOptions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "VariationOptions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "ShipmentVariationOptionDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalWeight");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "TotalWeight"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "Weight"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalInsuredValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "TotalInsuredValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "Money"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("preferredCurrency");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "PreferredCurrency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipmentAuthorizationDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "ShipmentAuthorizationDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "ShipmentAuthorizationDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipper");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "Shipper"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "Party"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recipient");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "Recipient"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "Party"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recipientLocationNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "RecipientLocationNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("origin");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "Origin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "ContactAndAddress"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("soldTo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "SoldTo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "Party"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shippingChargesPayment");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "ShippingChargesPayment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "Payment"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("specialServicesRequested");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "SpecialServicesRequested"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "ShipmentSpecialServicesRequested"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("processingOptionsRequested");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "ProcessingOptionsRequested"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "ShipmentProcessingOptionsRequested"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expressFreightDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "ExpressFreightDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "ExpressFreightDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("freightShipmentDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "FreightShipmentDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "FreightShipmentDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deliveryInstructions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "DeliveryInstructions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("variableHandlingChargeDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "VariableHandlingChargeDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "VariableHandlingChargeDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customsClearanceDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "CustomsClearanceDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "CustomsClearanceDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pickupDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "PickupDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "PickupDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("smartPostDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "SmartPostDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "SmartPostShipmentDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("blockInsightVisibility");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "BlockInsightVisibility"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorLabelBehavior");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "ErrorLabelBehavior"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "ErrorLabelBehaviorType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("labelSpecification");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "LabelSpecification"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "LabelSpecification"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shippingDocumentSpecification");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "ShippingDocumentSpecification"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "ShippingDocumentSpecification"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rateRequestTypes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "RateRequestTypes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "RateRequestType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerSelectedActualRateType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "CustomerSelectedActualRateType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "ReturnedRateType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("edtRequestType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "EdtRequestType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "EdtRequestType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customRatingOptionDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "CustomRatingOptionDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "CustomRatingOptionDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("masterTrackingId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "MasterTrackingId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "TrackingId"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("packageCount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "PackageCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("configurationData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "ConfigurationData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "DangerousGoodsDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "DangerousGoodsPackageConfigurations"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestedPackageLineItems");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "RequestedPackageLineItems"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "RequestedPackageLineItem"));
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
