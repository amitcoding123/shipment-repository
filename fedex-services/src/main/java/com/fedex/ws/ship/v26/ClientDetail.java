/**
 * ClientDetail.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.ws.ship.v26;


/**
 * Descriptive data for the client submitting a transaction.
 */
public class ClientDetail  implements java.io.Serializable {
    /* The FedEx account number associated with this transaction. */
    private java.lang.String accountNumber;

    /* The FedEx Ground account number. */
    private java.lang.String groundShipperNumber;

    /* This number is assigned by FedEx and identifies the unique
     * device from which the request is originating */
    private java.lang.String meterNumber;

    /* FedEx internal use only. */
    private java.lang.String masterMeterNumber;

    private java.lang.String meterInstance;

    /* FedEx internal use only. The PassKey company identifier. */
    private java.lang.String companyId;

    /* Client software component (e.g. "CAFE", "INET", "WBUS", etc.) */
    private java.lang.String softwareId;

    /* Client software component version/revision (e.g. "1800", "2630",
     * etc.) */
    private java.lang.String softwareRelease;

    /* A FedEx assigned identifier for a third party software product
     * used by customer to do business with FedEx. Such as a Compatible Solution
     * Provider's product. */
    private java.lang.String clientProductId;

    /* The version of the third party product. */
    private java.lang.String clientProductVersion;

    /* FedEx internal use only. */
    private java.lang.String middlewareProductId;

    /* FedEx internal use only. */
    private java.lang.String middlewareProductVersion;

    /* Only used in transactions which require identification of the
     * FedEx Office integrator. */
    private java.lang.String integratorId;

    /* Indicates the region from which the transaction is submitted. */
    private com.fedex.ws.ship.v26.ExpressRegionCode region;

    /* Used for off-line uploads only. */
    private com.fedex.ws.ship.v26.AutoConfigurationType autoConfigurationType;

    /* The language to be used for human-readable Notification.localizedMessages
     * in responses to the request containing this ClientDetail object. Different
     * requests from the same client may contain different Localization data.
     * (Contrast with TransactionDetail.localization, which governs data
     * payload language/translation.) */
    private com.fedex.ws.ship.v26.Localization localization;

    public ClientDetail() {
    }

    public ClientDetail(
           java.lang.String accountNumber,
           java.lang.String groundShipperNumber,
           java.lang.String meterNumber,
           java.lang.String masterMeterNumber,
           java.lang.String meterInstance,
           java.lang.String companyId,
           java.lang.String softwareId,
           java.lang.String softwareRelease,
           java.lang.String clientProductId,
           java.lang.String clientProductVersion,
           java.lang.String middlewareProductId,
           java.lang.String middlewareProductVersion,
           java.lang.String integratorId,
           com.fedex.ws.ship.v26.ExpressRegionCode region,
           com.fedex.ws.ship.v26.AutoConfigurationType autoConfigurationType,
           com.fedex.ws.ship.v26.Localization localization) {
           this.accountNumber = accountNumber;
           this.groundShipperNumber = groundShipperNumber;
           this.meterNumber = meterNumber;
           this.masterMeterNumber = masterMeterNumber;
           this.meterInstance = meterInstance;
           this.companyId = companyId;
           this.softwareId = softwareId;
           this.softwareRelease = softwareRelease;
           this.clientProductId = clientProductId;
           this.clientProductVersion = clientProductVersion;
           this.middlewareProductId = middlewareProductId;
           this.middlewareProductVersion = middlewareProductVersion;
           this.integratorId = integratorId;
           this.region = region;
           this.autoConfigurationType = autoConfigurationType;
           this.localization = localization;
    }


    /**
     * Gets the accountNumber value for this ClientDetail.
     * 
     * @return accountNumber   * The FedEx account number associated with this transaction.
     */
    public java.lang.String getAccountNumber() {
        return accountNumber;
    }


    /**
     * Sets the accountNumber value for this ClientDetail.
     * 
     * @param accountNumber   * The FedEx account number associated with this transaction.
     */
    public void setAccountNumber(java.lang.String accountNumber) {
        this.accountNumber = accountNumber;
    }


    /**
     * Gets the groundShipperNumber value for this ClientDetail.
     * 
     * @return groundShipperNumber   * The FedEx Ground account number.
     */
    public java.lang.String getGroundShipperNumber() {
        return groundShipperNumber;
    }


    /**
     * Sets the groundShipperNumber value for this ClientDetail.
     * 
     * @param groundShipperNumber   * The FedEx Ground account number.
     */
    public void setGroundShipperNumber(java.lang.String groundShipperNumber) {
        this.groundShipperNumber = groundShipperNumber;
    }


    /**
     * Gets the meterNumber value for this ClientDetail.
     * 
     * @return meterNumber   * This number is assigned by FedEx and identifies the unique
     * device from which the request is originating
     */
    public java.lang.String getMeterNumber() {
        return meterNumber;
    }


    /**
     * Sets the meterNumber value for this ClientDetail.
     * 
     * @param meterNumber   * This number is assigned by FedEx and identifies the unique
     * device from which the request is originating
     */
    public void setMeterNumber(java.lang.String meterNumber) {
        this.meterNumber = meterNumber;
    }


    /**
     * Gets the masterMeterNumber value for this ClientDetail.
     * 
     * @return masterMeterNumber   * FedEx internal use only.
     */
    public java.lang.String getMasterMeterNumber() {
        return masterMeterNumber;
    }


    /**
     * Sets the masterMeterNumber value for this ClientDetail.
     * 
     * @param masterMeterNumber   * FedEx internal use only.
     */
    public void setMasterMeterNumber(java.lang.String masterMeterNumber) {
        this.masterMeterNumber = masterMeterNumber;
    }


    /**
     * Gets the meterInstance value for this ClientDetail.
     * 
     * @return meterInstance
     */
    public java.lang.String getMeterInstance() {
        return meterInstance;
    }


    /**
     * Sets the meterInstance value for this ClientDetail.
     * 
     * @param meterInstance
     */
    public void setMeterInstance(java.lang.String meterInstance) {
        this.meterInstance = meterInstance;
    }


    /**
     * Gets the companyId value for this ClientDetail.
     * 
     * @return companyId   * FedEx internal use only. The PassKey company identifier.
     */
    public java.lang.String getCompanyId() {
        return companyId;
    }


    /**
     * Sets the companyId value for this ClientDetail.
     * 
     * @param companyId   * FedEx internal use only. The PassKey company identifier.
     */
    public void setCompanyId(java.lang.String companyId) {
        this.companyId = companyId;
    }


    /**
     * Gets the softwareId value for this ClientDetail.
     * 
     * @return softwareId   * Client software component (e.g. "CAFE", "INET", "WBUS", etc.)
     */
    public java.lang.String getSoftwareId() {
        return softwareId;
    }


    /**
     * Sets the softwareId value for this ClientDetail.
     * 
     * @param softwareId   * Client software component (e.g. "CAFE", "INET", "WBUS", etc.)
     */
    public void setSoftwareId(java.lang.String softwareId) {
        this.softwareId = softwareId;
    }


    /**
     * Gets the softwareRelease value for this ClientDetail.
     * 
     * @return softwareRelease   * Client software component version/revision (e.g. "1800", "2630",
     * etc.)
     */
    public java.lang.String getSoftwareRelease() {
        return softwareRelease;
    }


    /**
     * Sets the softwareRelease value for this ClientDetail.
     * 
     * @param softwareRelease   * Client software component version/revision (e.g. "1800", "2630",
     * etc.)
     */
    public void setSoftwareRelease(java.lang.String softwareRelease) {
        this.softwareRelease = softwareRelease;
    }


    /**
     * Gets the clientProductId value for this ClientDetail.
     * 
     * @return clientProductId   * A FedEx assigned identifier for a third party software product
     * used by customer to do business with FedEx. Such as a Compatible Solution
     * Provider's product.
     */
    public java.lang.String getClientProductId() {
        return clientProductId;
    }


    /**
     * Sets the clientProductId value for this ClientDetail.
     * 
     * @param clientProductId   * A FedEx assigned identifier for a third party software product
     * used by customer to do business with FedEx. Such as a Compatible Solution
     * Provider's product.
     */
    public void setClientProductId(java.lang.String clientProductId) {
        this.clientProductId = clientProductId;
    }


    /**
     * Gets the clientProductVersion value for this ClientDetail.
     * 
     * @return clientProductVersion   * The version of the third party product.
     */
    public java.lang.String getClientProductVersion() {
        return clientProductVersion;
    }


    /**
     * Sets the clientProductVersion value for this ClientDetail.
     * 
     * @param clientProductVersion   * The version of the third party product.
     */
    public void setClientProductVersion(java.lang.String clientProductVersion) {
        this.clientProductVersion = clientProductVersion;
    }


    /**
     * Gets the middlewareProductId value for this ClientDetail.
     * 
     * @return middlewareProductId   * FedEx internal use only.
     */
    public java.lang.String getMiddlewareProductId() {
        return middlewareProductId;
    }


    /**
     * Sets the middlewareProductId value for this ClientDetail.
     * 
     * @param middlewareProductId   * FedEx internal use only.
     */
    public void setMiddlewareProductId(java.lang.String middlewareProductId) {
        this.middlewareProductId = middlewareProductId;
    }


    /**
     * Gets the middlewareProductVersion value for this ClientDetail.
     * 
     * @return middlewareProductVersion   * FedEx internal use only.
     */
    public java.lang.String getMiddlewareProductVersion() {
        return middlewareProductVersion;
    }


    /**
     * Sets the middlewareProductVersion value for this ClientDetail.
     * 
     * @param middlewareProductVersion   * FedEx internal use only.
     */
    public void setMiddlewareProductVersion(java.lang.String middlewareProductVersion) {
        this.middlewareProductVersion = middlewareProductVersion;
    }


    /**
     * Gets the integratorId value for this ClientDetail.
     * 
     * @return integratorId   * Only used in transactions which require identification of the
     * FedEx Office integrator.
     */
    public java.lang.String getIntegratorId() {
        return integratorId;
    }


    /**
     * Sets the integratorId value for this ClientDetail.
     * 
     * @param integratorId   * Only used in transactions which require identification of the
     * FedEx Office integrator.
     */
    public void setIntegratorId(java.lang.String integratorId) {
        this.integratorId = integratorId;
    }


    /**
     * Gets the region value for this ClientDetail.
     * 
     * @return region   * Indicates the region from which the transaction is submitted.
     */
    public com.fedex.ws.ship.v26.ExpressRegionCode getRegion() {
        return region;
    }


    /**
     * Sets the region value for this ClientDetail.
     * 
     * @param region   * Indicates the region from which the transaction is submitted.
     */
    public void setRegion(com.fedex.ws.ship.v26.ExpressRegionCode region) {
        this.region = region;
    }


    /**
     * Gets the autoConfigurationType value for this ClientDetail.
     * 
     * @return autoConfigurationType   * Used for off-line uploads only.
     */
    public com.fedex.ws.ship.v26.AutoConfigurationType getAutoConfigurationType() {
        return autoConfigurationType;
    }


    /**
     * Sets the autoConfigurationType value for this ClientDetail.
     * 
     * @param autoConfigurationType   * Used for off-line uploads only.
     */
    public void setAutoConfigurationType(com.fedex.ws.ship.v26.AutoConfigurationType autoConfigurationType) {
        this.autoConfigurationType = autoConfigurationType;
    }


    /**
     * Gets the localization value for this ClientDetail.
     * 
     * @return localization   * The language to be used for human-readable Notification.localizedMessages
     * in responses to the request containing this ClientDetail object. Different
     * requests from the same client may contain different Localization data.
     * (Contrast with TransactionDetail.localization, which governs data
     * payload language/translation.)
     */
    public com.fedex.ws.ship.v26.Localization getLocalization() {
        return localization;
    }


    /**
     * Sets the localization value for this ClientDetail.
     * 
     * @param localization   * The language to be used for human-readable Notification.localizedMessages
     * in responses to the request containing this ClientDetail object. Different
     * requests from the same client may contain different Localization data.
     * (Contrast with TransactionDetail.localization, which governs data
     * payload language/translation.)
     */
    public void setLocalization(com.fedex.ws.ship.v26.Localization localization) {
        this.localization = localization;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ClientDetail)) return false;
        ClientDetail other = (ClientDetail) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.accountNumber==null && other.getAccountNumber()==null) || 
             (this.accountNumber!=null &&
              this.accountNumber.equals(other.getAccountNumber()))) &&
            ((this.groundShipperNumber==null && other.getGroundShipperNumber()==null) || 
             (this.groundShipperNumber!=null &&
              this.groundShipperNumber.equals(other.getGroundShipperNumber()))) &&
            ((this.meterNumber==null && other.getMeterNumber()==null) || 
             (this.meterNumber!=null &&
              this.meterNumber.equals(other.getMeterNumber()))) &&
            ((this.masterMeterNumber==null && other.getMasterMeterNumber()==null) || 
             (this.masterMeterNumber!=null &&
              this.masterMeterNumber.equals(other.getMasterMeterNumber()))) &&
            ((this.meterInstance==null && other.getMeterInstance()==null) || 
             (this.meterInstance!=null &&
              this.meterInstance.equals(other.getMeterInstance()))) &&
            ((this.companyId==null && other.getCompanyId()==null) || 
             (this.companyId!=null &&
              this.companyId.equals(other.getCompanyId()))) &&
            ((this.softwareId==null && other.getSoftwareId()==null) || 
             (this.softwareId!=null &&
              this.softwareId.equals(other.getSoftwareId()))) &&
            ((this.softwareRelease==null && other.getSoftwareRelease()==null) || 
             (this.softwareRelease!=null &&
              this.softwareRelease.equals(other.getSoftwareRelease()))) &&
            ((this.clientProductId==null && other.getClientProductId()==null) || 
             (this.clientProductId!=null &&
              this.clientProductId.equals(other.getClientProductId()))) &&
            ((this.clientProductVersion==null && other.getClientProductVersion()==null) || 
             (this.clientProductVersion!=null &&
              this.clientProductVersion.equals(other.getClientProductVersion()))) &&
            ((this.middlewareProductId==null && other.getMiddlewareProductId()==null) || 
             (this.middlewareProductId!=null &&
              this.middlewareProductId.equals(other.getMiddlewareProductId()))) &&
            ((this.middlewareProductVersion==null && other.getMiddlewareProductVersion()==null) || 
             (this.middlewareProductVersion!=null &&
              this.middlewareProductVersion.equals(other.getMiddlewareProductVersion()))) &&
            ((this.integratorId==null && other.getIntegratorId()==null) || 
             (this.integratorId!=null &&
              this.integratorId.equals(other.getIntegratorId()))) &&
            ((this.region==null && other.getRegion()==null) || 
             (this.region!=null &&
              this.region.equals(other.getRegion()))) &&
            ((this.autoConfigurationType==null && other.getAutoConfigurationType()==null) || 
             (this.autoConfigurationType!=null &&
              this.autoConfigurationType.equals(other.getAutoConfigurationType()))) &&
            ((this.localization==null && other.getLocalization()==null) || 
             (this.localization!=null &&
              this.localization.equals(other.getLocalization())));
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
        if (getAccountNumber() != null) {
            _hashCode += getAccountNumber().hashCode();
        }
        if (getGroundShipperNumber() != null) {
            _hashCode += getGroundShipperNumber().hashCode();
        }
        if (getMeterNumber() != null) {
            _hashCode += getMeterNumber().hashCode();
        }
        if (getMasterMeterNumber() != null) {
            _hashCode += getMasterMeterNumber().hashCode();
        }
        if (getMeterInstance() != null) {
            _hashCode += getMeterInstance().hashCode();
        }
        if (getCompanyId() != null) {
            _hashCode += getCompanyId().hashCode();
        }
        if (getSoftwareId() != null) {
            _hashCode += getSoftwareId().hashCode();
        }
        if (getSoftwareRelease() != null) {
            _hashCode += getSoftwareRelease().hashCode();
        }
        if (getClientProductId() != null) {
            _hashCode += getClientProductId().hashCode();
        }
        if (getClientProductVersion() != null) {
            _hashCode += getClientProductVersion().hashCode();
        }
        if (getMiddlewareProductId() != null) {
            _hashCode += getMiddlewareProductId().hashCode();
        }
        if (getMiddlewareProductVersion() != null) {
            _hashCode += getMiddlewareProductVersion().hashCode();
        }
        if (getIntegratorId() != null) {
            _hashCode += getIntegratorId().hashCode();
        }
        if (getRegion() != null) {
            _hashCode += getRegion().hashCode();
        }
        if (getAutoConfigurationType() != null) {
            _hashCode += getAutoConfigurationType().hashCode();
        }
        if (getLocalization() != null) {
            _hashCode += getLocalization().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ClientDetail.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "ClientDetail"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "AccountNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("groundShipperNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "GroundShipperNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("meterNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "MeterNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("masterMeterNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "MasterMeterNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("meterInstance");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "MeterInstance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("companyId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "CompanyId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("softwareId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "SoftwareId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("softwareRelease");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "SoftwareRelease"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clientProductId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "ClientProductId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clientProductVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "ClientProductVersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("middlewareProductId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "MiddlewareProductId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("middlewareProductVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "MiddlewareProductVersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("integratorId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "IntegratorId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("region");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "Region"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "ExpressRegionCode"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("autoConfigurationType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "AutoConfigurationType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "AutoConfigurationType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("localization");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "Localization"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "Localization"));
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
