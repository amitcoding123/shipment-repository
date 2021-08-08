/**
 * TransactionDetail.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.ws.ship.v26;

public class TransactionDetail  implements java.io.Serializable {
    /* Free form text to be echoed back in the reply. Used to match
     * requests and replies. */
    private java.lang.String customerTransactionId;

    /* Governs data payload language/translations (contrasted with
     * ClientDetail.localization, which governs Notification.localizedMessage
     * language selection). */
    private com.fedex.ws.ship.v26.Localization localization;

    /* Unique identifier assigned/forwarded by internal FAST services
     * only, to associate service transactions comprising a single business
     * work unit. */
    private java.lang.String internalTransactionId;

    /* Each FAST service should log request/reply pairs for any transaction
     * in which this attribute is true. This is for internal use only (capturing
     * transaction data for diagnostic purposes). */
    private java.lang.Boolean tracing;

    /* Indicates the format in which the transaction was presented
     * to FedEx, used to help identify error-translation context. */
    private com.fedex.ws.ship.v26.TransactionSourceFormat sourceFormat;

    /* Identifies the environment (level) in which the current transaction
     * should be processed. */
    private com.fedex.ws.ship.v26.WebServiceEnvironment environment;

    public TransactionDetail() {
    }

    public TransactionDetail(
           java.lang.String customerTransactionId,
           com.fedex.ws.ship.v26.Localization localization,
           java.lang.String internalTransactionId,
           java.lang.Boolean tracing,
           com.fedex.ws.ship.v26.TransactionSourceFormat sourceFormat,
           com.fedex.ws.ship.v26.WebServiceEnvironment environment) {
           this.customerTransactionId = customerTransactionId;
           this.localization = localization;
           this.internalTransactionId = internalTransactionId;
           this.tracing = tracing;
           this.sourceFormat = sourceFormat;
           this.environment = environment;
    }


    /**
     * Gets the customerTransactionId value for this TransactionDetail.
     * 
     * @return customerTransactionId   * Free form text to be echoed back in the reply. Used to match
     * requests and replies.
     */
    public java.lang.String getCustomerTransactionId() {
        return customerTransactionId;
    }


    /**
     * Sets the customerTransactionId value for this TransactionDetail.
     * 
     * @param customerTransactionId   * Free form text to be echoed back in the reply. Used to match
     * requests and replies.
     */
    public void setCustomerTransactionId(java.lang.String customerTransactionId) {
        this.customerTransactionId = customerTransactionId;
    }


    /**
     * Gets the localization value for this TransactionDetail.
     * 
     * @return localization   * Governs data payload language/translations (contrasted with
     * ClientDetail.localization, which governs Notification.localizedMessage
     * language selection).
     */
    public com.fedex.ws.ship.v26.Localization getLocalization() {
        return localization;
    }


    /**
     * Sets the localization value for this TransactionDetail.
     * 
     * @param localization   * Governs data payload language/translations (contrasted with
     * ClientDetail.localization, which governs Notification.localizedMessage
     * language selection).
     */
    public void setLocalization(com.fedex.ws.ship.v26.Localization localization) {
        this.localization = localization;
    }


    /**
     * Gets the internalTransactionId value for this TransactionDetail.
     * 
     * @return internalTransactionId   * Unique identifier assigned/forwarded by internal FAST services
     * only, to associate service transactions comprising a single business
     * work unit.
     */
    public java.lang.String getInternalTransactionId() {
        return internalTransactionId;
    }


    /**
     * Sets the internalTransactionId value for this TransactionDetail.
     * 
     * @param internalTransactionId   * Unique identifier assigned/forwarded by internal FAST services
     * only, to associate service transactions comprising a single business
     * work unit.
     */
    public void setInternalTransactionId(java.lang.String internalTransactionId) {
        this.internalTransactionId = internalTransactionId;
    }


    /**
     * Gets the tracing value for this TransactionDetail.
     * 
     * @return tracing   * Each FAST service should log request/reply pairs for any transaction
     * in which this attribute is true. This is for internal use only (capturing
     * transaction data for diagnostic purposes).
     */
    public java.lang.Boolean getTracing() {
        return tracing;
    }


    /**
     * Sets the tracing value for this TransactionDetail.
     * 
     * @param tracing   * Each FAST service should log request/reply pairs for any transaction
     * in which this attribute is true. This is for internal use only (capturing
     * transaction data for diagnostic purposes).
     */
    public void setTracing(java.lang.Boolean tracing) {
        this.tracing = tracing;
    }


    /**
     * Gets the sourceFormat value for this TransactionDetail.
     * 
     * @return sourceFormat   * Indicates the format in which the transaction was presented
     * to FedEx, used to help identify error-translation context.
     */
    public com.fedex.ws.ship.v26.TransactionSourceFormat getSourceFormat() {
        return sourceFormat;
    }


    /**
     * Sets the sourceFormat value for this TransactionDetail.
     * 
     * @param sourceFormat   * Indicates the format in which the transaction was presented
     * to FedEx, used to help identify error-translation context.
     */
    public void setSourceFormat(com.fedex.ws.ship.v26.TransactionSourceFormat sourceFormat) {
        this.sourceFormat = sourceFormat;
    }


    /**
     * Gets the environment value for this TransactionDetail.
     * 
     * @return environment   * Identifies the environment (level) in which the current transaction
     * should be processed.
     */
    public com.fedex.ws.ship.v26.WebServiceEnvironment getEnvironment() {
        return environment;
    }


    /**
     * Sets the environment value for this TransactionDetail.
     * 
     * @param environment   * Identifies the environment (level) in which the current transaction
     * should be processed.
     */
    public void setEnvironment(com.fedex.ws.ship.v26.WebServiceEnvironment environment) {
        this.environment = environment;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TransactionDetail)) return false;
        TransactionDetail other = (TransactionDetail) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.customerTransactionId==null && other.getCustomerTransactionId()==null) || 
             (this.customerTransactionId!=null &&
              this.customerTransactionId.equals(other.getCustomerTransactionId()))) &&
            ((this.localization==null && other.getLocalization()==null) || 
             (this.localization!=null &&
              this.localization.equals(other.getLocalization()))) &&
            ((this.internalTransactionId==null && other.getInternalTransactionId()==null) || 
             (this.internalTransactionId!=null &&
              this.internalTransactionId.equals(other.getInternalTransactionId()))) &&
            ((this.tracing==null && other.getTracing()==null) || 
             (this.tracing!=null &&
              this.tracing.equals(other.getTracing()))) &&
            ((this.sourceFormat==null && other.getSourceFormat()==null) || 
             (this.sourceFormat!=null &&
              this.sourceFormat.equals(other.getSourceFormat()))) &&
            ((this.environment==null && other.getEnvironment()==null) || 
             (this.environment!=null &&
              this.environment.equals(other.getEnvironment())));
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
        if (getCustomerTransactionId() != null) {
            _hashCode += getCustomerTransactionId().hashCode();
        }
        if (getLocalization() != null) {
            _hashCode += getLocalization().hashCode();
        }
        if (getInternalTransactionId() != null) {
            _hashCode += getInternalTransactionId().hashCode();
        }
        if (getTracing() != null) {
            _hashCode += getTracing().hashCode();
        }
        if (getSourceFormat() != null) {
            _hashCode += getSourceFormat().hashCode();
        }
        if (getEnvironment() != null) {
            _hashCode += getEnvironment().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TransactionDetail.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "TransactionDetail"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerTransactionId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "CustomerTransactionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("internalTransactionId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "InternalTransactionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tracing");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "Tracing"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourceFormat");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "SourceFormat"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "TransactionSourceFormat"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("environment");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "Environment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "WebServiceEnvironment"));
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
