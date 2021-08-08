/**
 * CompletedShipmentDetail.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.ws.ship.v26;

public class CompletedShipmentDetail  implements java.io.Serializable {
    private java.lang.Boolean usDomestic;

    private com.fedex.ws.ship.v26.CarrierCodeType carrierCode;

    private com.fedex.ws.ship.v26.TrackingId masterTrackingId;

    private com.fedex.ws.ship.v26.ServiceDescription serviceDescription;

    private com.fedex.ws.ship.v26.PackagingDescription packagingDescription;

    private com.fedex.ws.ship.v26.SpecialServiceDescription[] specialServiceDescriptions;

    private com.fedex.ws.ship.v26.ShipmentOperationalDetail operationalDetail;

    /* Only used with pending shipments. */
    private com.fedex.ws.ship.v26.PendingShipmentAccessorDetail[] accessDetail;

    /* Only used in the reply to tag requests. */
    private com.fedex.ws.ship.v26.CompletedTagDetail tagDetail;

    private com.fedex.ws.ship.v26.CompletedSmartPostDetail smartPostDetail;

    /* Computed shipment level information about hazarous commodities. */
    private com.fedex.ws.ship.v26.CompletedHazardousShipmentDetail hazardousShipmentDetail;

    /* All shipment-level rating data for this shipment, which may
     * include data for multiple rate types. */
    private com.fedex.ws.ship.v26.ShipmentRating shipmentRating;

    /* Returns the default holding location information when HOLD_AT_LOCATION
     * special service is requested and the client does not specify the hold
     * location address. */
    private com.fedex.ws.ship.v26.CompletedHoldAtLocationDetail completedHoldAtLocationDetail;

    /* Returns any defaults or updates applied to RequestedShipment.exportDetail.exportComplianceStatement. */
    private java.lang.String exportComplianceStatement;

    /* This specifies what rules or requirements for documents are
     * applicable for this shipment. This may identify required or prohibited
     * documents. */
    private com.fedex.ws.ship.v26.DocumentRequirementsDetail documentRequirements;

    private com.fedex.ws.ship.v26.CompletedEtdDetail completedEtdDetail;

    /* All shipment-level shipping documents (other than labels and
     * barcodes). */
    private com.fedex.ws.ship.v26.ShippingDocument[] shipmentDocuments;

    private com.fedex.ws.ship.v26.AssociatedShipmentDetail[] associatedShipments;

    private com.fedex.ws.ship.v26.CompletedCodDetail completedCodDetail;

    private com.fedex.ws.ship.v26.CompletedPackageDetail[] completedPackageDetails;

    public CompletedShipmentDetail() {
    }

    public CompletedShipmentDetail(
           java.lang.Boolean usDomestic,
           com.fedex.ws.ship.v26.CarrierCodeType carrierCode,
           com.fedex.ws.ship.v26.TrackingId masterTrackingId,
           com.fedex.ws.ship.v26.ServiceDescription serviceDescription,
           com.fedex.ws.ship.v26.PackagingDescription packagingDescription,
           com.fedex.ws.ship.v26.SpecialServiceDescription[] specialServiceDescriptions,
           com.fedex.ws.ship.v26.ShipmentOperationalDetail operationalDetail,
           com.fedex.ws.ship.v26.PendingShipmentAccessorDetail[] accessDetail,
           com.fedex.ws.ship.v26.CompletedTagDetail tagDetail,
           com.fedex.ws.ship.v26.CompletedSmartPostDetail smartPostDetail,
           com.fedex.ws.ship.v26.CompletedHazardousShipmentDetail hazardousShipmentDetail,
           com.fedex.ws.ship.v26.ShipmentRating shipmentRating,
           com.fedex.ws.ship.v26.CompletedHoldAtLocationDetail completedHoldAtLocationDetail,
           java.lang.String exportComplianceStatement,
           com.fedex.ws.ship.v26.DocumentRequirementsDetail documentRequirements,
           com.fedex.ws.ship.v26.CompletedEtdDetail completedEtdDetail,
           com.fedex.ws.ship.v26.ShippingDocument[] shipmentDocuments,
           com.fedex.ws.ship.v26.AssociatedShipmentDetail[] associatedShipments,
           com.fedex.ws.ship.v26.CompletedCodDetail completedCodDetail,
           com.fedex.ws.ship.v26.CompletedPackageDetail[] completedPackageDetails) {
           this.usDomestic = usDomestic;
           this.carrierCode = carrierCode;
           this.masterTrackingId = masterTrackingId;
           this.serviceDescription = serviceDescription;
           this.packagingDescription = packagingDescription;
           this.specialServiceDescriptions = specialServiceDescriptions;
           this.operationalDetail = operationalDetail;
           this.accessDetail = accessDetail;
           this.tagDetail = tagDetail;
           this.smartPostDetail = smartPostDetail;
           this.hazardousShipmentDetail = hazardousShipmentDetail;
           this.shipmentRating = shipmentRating;
           this.completedHoldAtLocationDetail = completedHoldAtLocationDetail;
           this.exportComplianceStatement = exportComplianceStatement;
           this.documentRequirements = documentRequirements;
           this.completedEtdDetail = completedEtdDetail;
           this.shipmentDocuments = shipmentDocuments;
           this.associatedShipments = associatedShipments;
           this.completedCodDetail = completedCodDetail;
           this.completedPackageDetails = completedPackageDetails;
    }


    /**
     * Gets the usDomestic value for this CompletedShipmentDetail.
     * 
     * @return usDomestic
     */
    public java.lang.Boolean getUsDomestic() {
        return usDomestic;
    }


    /**
     * Sets the usDomestic value for this CompletedShipmentDetail.
     * 
     * @param usDomestic
     */
    public void setUsDomestic(java.lang.Boolean usDomestic) {
        this.usDomestic = usDomestic;
    }


    /**
     * Gets the carrierCode value for this CompletedShipmentDetail.
     * 
     * @return carrierCode
     */
    public com.fedex.ws.ship.v26.CarrierCodeType getCarrierCode() {
        return carrierCode;
    }


    /**
     * Sets the carrierCode value for this CompletedShipmentDetail.
     * 
     * @param carrierCode
     */
    public void setCarrierCode(com.fedex.ws.ship.v26.CarrierCodeType carrierCode) {
        this.carrierCode = carrierCode;
    }


    /**
     * Gets the masterTrackingId value for this CompletedShipmentDetail.
     * 
     * @return masterTrackingId
     */
    public com.fedex.ws.ship.v26.TrackingId getMasterTrackingId() {
        return masterTrackingId;
    }


    /**
     * Sets the masterTrackingId value for this CompletedShipmentDetail.
     * 
     * @param masterTrackingId
     */
    public void setMasterTrackingId(com.fedex.ws.ship.v26.TrackingId masterTrackingId) {
        this.masterTrackingId = masterTrackingId;
    }


    /**
     * Gets the serviceDescription value for this CompletedShipmentDetail.
     * 
     * @return serviceDescription
     */
    public com.fedex.ws.ship.v26.ServiceDescription getServiceDescription() {
        return serviceDescription;
    }


    /**
     * Sets the serviceDescription value for this CompletedShipmentDetail.
     * 
     * @param serviceDescription
     */
    public void setServiceDescription(com.fedex.ws.ship.v26.ServiceDescription serviceDescription) {
        this.serviceDescription = serviceDescription;
    }


    /**
     * Gets the packagingDescription value for this CompletedShipmentDetail.
     * 
     * @return packagingDescription
     */
    public com.fedex.ws.ship.v26.PackagingDescription getPackagingDescription() {
        return packagingDescription;
    }


    /**
     * Sets the packagingDescription value for this CompletedShipmentDetail.
     * 
     * @param packagingDescription
     */
    public void setPackagingDescription(com.fedex.ws.ship.v26.PackagingDescription packagingDescription) {
        this.packagingDescription = packagingDescription;
    }


    /**
     * Gets the specialServiceDescriptions value for this CompletedShipmentDetail.
     * 
     * @return specialServiceDescriptions
     */
    public com.fedex.ws.ship.v26.SpecialServiceDescription[] getSpecialServiceDescriptions() {
        return specialServiceDescriptions;
    }


    /**
     * Sets the specialServiceDescriptions value for this CompletedShipmentDetail.
     * 
     * @param specialServiceDescriptions
     */
    public void setSpecialServiceDescriptions(com.fedex.ws.ship.v26.SpecialServiceDescription[] specialServiceDescriptions) {
        this.specialServiceDescriptions = specialServiceDescriptions;
    }

    public com.fedex.ws.ship.v26.SpecialServiceDescription getSpecialServiceDescriptions(int i) {
        return this.specialServiceDescriptions[i];
    }

    public void setSpecialServiceDescriptions(int i, com.fedex.ws.ship.v26.SpecialServiceDescription _value) {
        this.specialServiceDescriptions[i] = _value;
    }


    /**
     * Gets the operationalDetail value for this CompletedShipmentDetail.
     * 
     * @return operationalDetail
     */
    public com.fedex.ws.ship.v26.ShipmentOperationalDetail getOperationalDetail() {
        return operationalDetail;
    }


    /**
     * Sets the operationalDetail value for this CompletedShipmentDetail.
     * 
     * @param operationalDetail
     */
    public void setOperationalDetail(com.fedex.ws.ship.v26.ShipmentOperationalDetail operationalDetail) {
        this.operationalDetail = operationalDetail;
    }


    /**
     * Gets the accessDetail value for this CompletedShipmentDetail.
     * 
     * @return accessDetail   * Only used with pending shipments.
     */
    public com.fedex.ws.ship.v26.PendingShipmentAccessorDetail[] getAccessDetail() {
        return accessDetail;
    }


    /**
     * Sets the accessDetail value for this CompletedShipmentDetail.
     * 
     * @param accessDetail   * Only used with pending shipments.
     */
    public void setAccessDetail(com.fedex.ws.ship.v26.PendingShipmentAccessorDetail[] accessDetail) {
        this.accessDetail = accessDetail;
    }


    /**
     * Gets the tagDetail value for this CompletedShipmentDetail.
     * 
     * @return tagDetail   * Only used in the reply to tag requests.
     */
    public com.fedex.ws.ship.v26.CompletedTagDetail getTagDetail() {
        return tagDetail;
    }


    /**
     * Sets the tagDetail value for this CompletedShipmentDetail.
     * 
     * @param tagDetail   * Only used in the reply to tag requests.
     */
    public void setTagDetail(com.fedex.ws.ship.v26.CompletedTagDetail tagDetail) {
        this.tagDetail = tagDetail;
    }


    /**
     * Gets the smartPostDetail value for this CompletedShipmentDetail.
     * 
     * @return smartPostDetail
     */
    public com.fedex.ws.ship.v26.CompletedSmartPostDetail getSmartPostDetail() {
        return smartPostDetail;
    }


    /**
     * Sets the smartPostDetail value for this CompletedShipmentDetail.
     * 
     * @param smartPostDetail
     */
    public void setSmartPostDetail(com.fedex.ws.ship.v26.CompletedSmartPostDetail smartPostDetail) {
        this.smartPostDetail = smartPostDetail;
    }


    /**
     * Gets the hazardousShipmentDetail value for this CompletedShipmentDetail.
     * 
     * @return hazardousShipmentDetail   * Computed shipment level information about hazarous commodities.
     */
    public com.fedex.ws.ship.v26.CompletedHazardousShipmentDetail getHazardousShipmentDetail() {
        return hazardousShipmentDetail;
    }


    /**
     * Sets the hazardousShipmentDetail value for this CompletedShipmentDetail.
     * 
     * @param hazardousShipmentDetail   * Computed shipment level information about hazarous commodities.
     */
    public void setHazardousShipmentDetail(com.fedex.ws.ship.v26.CompletedHazardousShipmentDetail hazardousShipmentDetail) {
        this.hazardousShipmentDetail = hazardousShipmentDetail;
    }


    /**
     * Gets the shipmentRating value for this CompletedShipmentDetail.
     * 
     * @return shipmentRating   * All shipment-level rating data for this shipment, which may
     * include data for multiple rate types.
     */
    public com.fedex.ws.ship.v26.ShipmentRating getShipmentRating() {
        return shipmentRating;
    }


    /**
     * Sets the shipmentRating value for this CompletedShipmentDetail.
     * 
     * @param shipmentRating   * All shipment-level rating data for this shipment, which may
     * include data for multiple rate types.
     */
    public void setShipmentRating(com.fedex.ws.ship.v26.ShipmentRating shipmentRating) {
        this.shipmentRating = shipmentRating;
    }


    /**
     * Gets the completedHoldAtLocationDetail value for this CompletedShipmentDetail.
     * 
     * @return completedHoldAtLocationDetail   * Returns the default holding location information when HOLD_AT_LOCATION
     * special service is requested and the client does not specify the hold
     * location address.
     */
    public com.fedex.ws.ship.v26.CompletedHoldAtLocationDetail getCompletedHoldAtLocationDetail() {
        return completedHoldAtLocationDetail;
    }


    /**
     * Sets the completedHoldAtLocationDetail value for this CompletedShipmentDetail.
     * 
     * @param completedHoldAtLocationDetail   * Returns the default holding location information when HOLD_AT_LOCATION
     * special service is requested and the client does not specify the hold
     * location address.
     */
    public void setCompletedHoldAtLocationDetail(com.fedex.ws.ship.v26.CompletedHoldAtLocationDetail completedHoldAtLocationDetail) {
        this.completedHoldAtLocationDetail = completedHoldAtLocationDetail;
    }


    /**
     * Gets the exportComplianceStatement value for this CompletedShipmentDetail.
     * 
     * @return exportComplianceStatement   * Returns any defaults or updates applied to RequestedShipment.exportDetail.exportComplianceStatement.
     */
    public java.lang.String getExportComplianceStatement() {
        return exportComplianceStatement;
    }


    /**
     * Sets the exportComplianceStatement value for this CompletedShipmentDetail.
     * 
     * @param exportComplianceStatement   * Returns any defaults or updates applied to RequestedShipment.exportDetail.exportComplianceStatement.
     */
    public void setExportComplianceStatement(java.lang.String exportComplianceStatement) {
        this.exportComplianceStatement = exportComplianceStatement;
    }


    /**
     * Gets the documentRequirements value for this CompletedShipmentDetail.
     * 
     * @return documentRequirements   * This specifies what rules or requirements for documents are
     * applicable for this shipment. This may identify required or prohibited
     * documents.
     */
    public com.fedex.ws.ship.v26.DocumentRequirementsDetail getDocumentRequirements() {
        return documentRequirements;
    }


    /**
     * Sets the documentRequirements value for this CompletedShipmentDetail.
     * 
     * @param documentRequirements   * This specifies what rules or requirements for documents are
     * applicable for this shipment. This may identify required or prohibited
     * documents.
     */
    public void setDocumentRequirements(com.fedex.ws.ship.v26.DocumentRequirementsDetail documentRequirements) {
        this.documentRequirements = documentRequirements;
    }


    /**
     * Gets the completedEtdDetail value for this CompletedShipmentDetail.
     * 
     * @return completedEtdDetail
     */
    public com.fedex.ws.ship.v26.CompletedEtdDetail getCompletedEtdDetail() {
        return completedEtdDetail;
    }


    /**
     * Sets the completedEtdDetail value for this CompletedShipmentDetail.
     * 
     * @param completedEtdDetail
     */
    public void setCompletedEtdDetail(com.fedex.ws.ship.v26.CompletedEtdDetail completedEtdDetail) {
        this.completedEtdDetail = completedEtdDetail;
    }


    /**
     * Gets the shipmentDocuments value for this CompletedShipmentDetail.
     * 
     * @return shipmentDocuments   * All shipment-level shipping documents (other than labels and
     * barcodes).
     */
    public com.fedex.ws.ship.v26.ShippingDocument[] getShipmentDocuments() {
        return shipmentDocuments;
    }


    /**
     * Sets the shipmentDocuments value for this CompletedShipmentDetail.
     * 
     * @param shipmentDocuments   * All shipment-level shipping documents (other than labels and
     * barcodes).
     */
    public void setShipmentDocuments(com.fedex.ws.ship.v26.ShippingDocument[] shipmentDocuments) {
        this.shipmentDocuments = shipmentDocuments;
    }

    public com.fedex.ws.ship.v26.ShippingDocument getShipmentDocuments(int i) {
        return this.shipmentDocuments[i];
    }

    public void setShipmentDocuments(int i, com.fedex.ws.ship.v26.ShippingDocument _value) {
        this.shipmentDocuments[i] = _value;
    }


    /**
     * Gets the associatedShipments value for this CompletedShipmentDetail.
     * 
     * @return associatedShipments
     */
    public com.fedex.ws.ship.v26.AssociatedShipmentDetail[] getAssociatedShipments() {
        return associatedShipments;
    }


    /**
     * Sets the associatedShipments value for this CompletedShipmentDetail.
     * 
     * @param associatedShipments
     */
    public void setAssociatedShipments(com.fedex.ws.ship.v26.AssociatedShipmentDetail[] associatedShipments) {
        this.associatedShipments = associatedShipments;
    }

    public com.fedex.ws.ship.v26.AssociatedShipmentDetail getAssociatedShipments(int i) {
        return this.associatedShipments[i];
    }

    public void setAssociatedShipments(int i, com.fedex.ws.ship.v26.AssociatedShipmentDetail _value) {
        this.associatedShipments[i] = _value;
    }


    /**
     * Gets the completedCodDetail value for this CompletedShipmentDetail.
     * 
     * @return completedCodDetail
     */
    public com.fedex.ws.ship.v26.CompletedCodDetail getCompletedCodDetail() {
        return completedCodDetail;
    }


    /**
     * Sets the completedCodDetail value for this CompletedShipmentDetail.
     * 
     * @param completedCodDetail
     */
    public void setCompletedCodDetail(com.fedex.ws.ship.v26.CompletedCodDetail completedCodDetail) {
        this.completedCodDetail = completedCodDetail;
    }


    /**
     * Gets the completedPackageDetails value for this CompletedShipmentDetail.
     * 
     * @return completedPackageDetails
     */
    public com.fedex.ws.ship.v26.CompletedPackageDetail[] getCompletedPackageDetails() {
        return completedPackageDetails;
    }


    /**
     * Sets the completedPackageDetails value for this CompletedShipmentDetail.
     * 
     * @param completedPackageDetails
     */
    public void setCompletedPackageDetails(com.fedex.ws.ship.v26.CompletedPackageDetail[] completedPackageDetails) {
        this.completedPackageDetails = completedPackageDetails;
    }

    public com.fedex.ws.ship.v26.CompletedPackageDetail getCompletedPackageDetails(int i) {
        return this.completedPackageDetails[i];
    }

    public void setCompletedPackageDetails(int i, com.fedex.ws.ship.v26.CompletedPackageDetail _value) {
        this.completedPackageDetails[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CompletedShipmentDetail)) return false;
        CompletedShipmentDetail other = (CompletedShipmentDetail) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.usDomestic==null && other.getUsDomestic()==null) || 
             (this.usDomestic!=null &&
              this.usDomestic.equals(other.getUsDomestic()))) &&
            ((this.carrierCode==null && other.getCarrierCode()==null) || 
             (this.carrierCode!=null &&
              this.carrierCode.equals(other.getCarrierCode()))) &&
            ((this.masterTrackingId==null && other.getMasterTrackingId()==null) || 
             (this.masterTrackingId!=null &&
              this.masterTrackingId.equals(other.getMasterTrackingId()))) &&
            ((this.serviceDescription==null && other.getServiceDescription()==null) || 
             (this.serviceDescription!=null &&
              this.serviceDescription.equals(other.getServiceDescription()))) &&
            ((this.packagingDescription==null && other.getPackagingDescription()==null) || 
             (this.packagingDescription!=null &&
              this.packagingDescription.equals(other.getPackagingDescription()))) &&
            ((this.specialServiceDescriptions==null && other.getSpecialServiceDescriptions()==null) || 
             (this.specialServiceDescriptions!=null &&
              java.util.Arrays.equals(this.specialServiceDescriptions, other.getSpecialServiceDescriptions()))) &&
            ((this.operationalDetail==null && other.getOperationalDetail()==null) || 
             (this.operationalDetail!=null &&
              this.operationalDetail.equals(other.getOperationalDetail()))) &&
            ((this.accessDetail==null && other.getAccessDetail()==null) || 
             (this.accessDetail!=null &&
              java.util.Arrays.equals(this.accessDetail, other.getAccessDetail()))) &&
            ((this.tagDetail==null && other.getTagDetail()==null) || 
             (this.tagDetail!=null &&
              this.tagDetail.equals(other.getTagDetail()))) &&
            ((this.smartPostDetail==null && other.getSmartPostDetail()==null) || 
             (this.smartPostDetail!=null &&
              this.smartPostDetail.equals(other.getSmartPostDetail()))) &&
            ((this.hazardousShipmentDetail==null && other.getHazardousShipmentDetail()==null) || 
             (this.hazardousShipmentDetail!=null &&
              this.hazardousShipmentDetail.equals(other.getHazardousShipmentDetail()))) &&
            ((this.shipmentRating==null && other.getShipmentRating()==null) || 
             (this.shipmentRating!=null &&
              this.shipmentRating.equals(other.getShipmentRating()))) &&
            ((this.completedHoldAtLocationDetail==null && other.getCompletedHoldAtLocationDetail()==null) || 
             (this.completedHoldAtLocationDetail!=null &&
              this.completedHoldAtLocationDetail.equals(other.getCompletedHoldAtLocationDetail()))) &&
            ((this.exportComplianceStatement==null && other.getExportComplianceStatement()==null) || 
             (this.exportComplianceStatement!=null &&
              this.exportComplianceStatement.equals(other.getExportComplianceStatement()))) &&
            ((this.documentRequirements==null && other.getDocumentRequirements()==null) || 
             (this.documentRequirements!=null &&
              this.documentRequirements.equals(other.getDocumentRequirements()))) &&
            ((this.completedEtdDetail==null && other.getCompletedEtdDetail()==null) || 
             (this.completedEtdDetail!=null &&
              this.completedEtdDetail.equals(other.getCompletedEtdDetail()))) &&
            ((this.shipmentDocuments==null && other.getShipmentDocuments()==null) || 
             (this.shipmentDocuments!=null &&
              java.util.Arrays.equals(this.shipmentDocuments, other.getShipmentDocuments()))) &&
            ((this.associatedShipments==null && other.getAssociatedShipments()==null) || 
             (this.associatedShipments!=null &&
              java.util.Arrays.equals(this.associatedShipments, other.getAssociatedShipments()))) &&
            ((this.completedCodDetail==null && other.getCompletedCodDetail()==null) || 
             (this.completedCodDetail!=null &&
              this.completedCodDetail.equals(other.getCompletedCodDetail()))) &&
            ((this.completedPackageDetails==null && other.getCompletedPackageDetails()==null) || 
             (this.completedPackageDetails!=null &&
              java.util.Arrays.equals(this.completedPackageDetails, other.getCompletedPackageDetails())));
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
        if (getUsDomestic() != null) {
            _hashCode += getUsDomestic().hashCode();
        }
        if (getCarrierCode() != null) {
            _hashCode += getCarrierCode().hashCode();
        }
        if (getMasterTrackingId() != null) {
            _hashCode += getMasterTrackingId().hashCode();
        }
        if (getServiceDescription() != null) {
            _hashCode += getServiceDescription().hashCode();
        }
        if (getPackagingDescription() != null) {
            _hashCode += getPackagingDescription().hashCode();
        }
        if (getSpecialServiceDescriptions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSpecialServiceDescriptions());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSpecialServiceDescriptions(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOperationalDetail() != null) {
            _hashCode += getOperationalDetail().hashCode();
        }
        if (getAccessDetail() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAccessDetail());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAccessDetail(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTagDetail() != null) {
            _hashCode += getTagDetail().hashCode();
        }
        if (getSmartPostDetail() != null) {
            _hashCode += getSmartPostDetail().hashCode();
        }
        if (getHazardousShipmentDetail() != null) {
            _hashCode += getHazardousShipmentDetail().hashCode();
        }
        if (getShipmentRating() != null) {
            _hashCode += getShipmentRating().hashCode();
        }
        if (getCompletedHoldAtLocationDetail() != null) {
            _hashCode += getCompletedHoldAtLocationDetail().hashCode();
        }
        if (getExportComplianceStatement() != null) {
            _hashCode += getExportComplianceStatement().hashCode();
        }
        if (getDocumentRequirements() != null) {
            _hashCode += getDocumentRequirements().hashCode();
        }
        if (getCompletedEtdDetail() != null) {
            _hashCode += getCompletedEtdDetail().hashCode();
        }
        if (getShipmentDocuments() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getShipmentDocuments());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getShipmentDocuments(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAssociatedShipments() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAssociatedShipments());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAssociatedShipments(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCompletedCodDetail() != null) {
            _hashCode += getCompletedCodDetail().hashCode();
        }
        if (getCompletedPackageDetails() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCompletedPackageDetails());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCompletedPackageDetails(), i);
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
        new org.apache.axis.description.TypeDesc(CompletedShipmentDetail.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "CompletedShipmentDetail"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usDomestic");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "UsDomestic"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("carrierCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "CarrierCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "CarrierCodeType"));
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
        elemField.setFieldName("serviceDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "ServiceDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "ServiceDescription"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("packagingDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "PackagingDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "PackagingDescription"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("specialServiceDescriptions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "SpecialServiceDescriptions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "SpecialServiceDescription"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operationalDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "OperationalDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "ShipmentOperationalDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accessDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "AccessDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "PendingShipmentAccessorDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "AccessorDetails"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tagDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "TagDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "CompletedTagDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("smartPostDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "SmartPostDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "CompletedSmartPostDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hazardousShipmentDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "HazardousShipmentDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "CompletedHazardousShipmentDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipmentRating");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "ShipmentRating"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "ShipmentRating"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("completedHoldAtLocationDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "CompletedHoldAtLocationDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "CompletedHoldAtLocationDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exportComplianceStatement");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "ExportComplianceStatement"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("documentRequirements");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "DocumentRequirements"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "DocumentRequirementsDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("completedEtdDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "CompletedEtdDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "CompletedEtdDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipmentDocuments");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "ShipmentDocuments"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "ShippingDocument"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("associatedShipments");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "AssociatedShipments"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "AssociatedShipmentDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("completedCodDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "CompletedCodDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "CompletedCodDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("completedPackageDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "CompletedPackageDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "CompletedPackageDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
