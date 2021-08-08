/**
 * CreditCardTransactionDetail.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.ws.ship.v26;


/**
 * This class represents data tied to the use of a credit card in
 * a specific transaction.
 */
public class CreditCardTransactionDetail  implements java.io.Serializable {
    private java.lang.String authorizationId;

    private com.fedex.ws.ship.v26.CreditCardAuthorizationType authorizationType;

    private com.fedex.ws.ship.v26.CreditFraudDetectionDetail fraudDetectionDetail;

    /* Specifies details about the credit card transaction that drive
     * decisions about credit card processing. */
    private com.fedex.ws.ship.v26.CreditCardTransactionAttributeType[] attributesDetail;

    public CreditCardTransactionDetail() {
    }

    public CreditCardTransactionDetail(
           java.lang.String authorizationId,
           com.fedex.ws.ship.v26.CreditCardAuthorizationType authorizationType,
           com.fedex.ws.ship.v26.CreditFraudDetectionDetail fraudDetectionDetail,
           com.fedex.ws.ship.v26.CreditCardTransactionAttributeType[] attributesDetail) {
           this.authorizationId = authorizationId;
           this.authorizationType = authorizationType;
           this.fraudDetectionDetail = fraudDetectionDetail;
           this.attributesDetail = attributesDetail;
    }


    /**
     * Gets the authorizationId value for this CreditCardTransactionDetail.
     * 
     * @return authorizationId
     */
    public java.lang.String getAuthorizationId() {
        return authorizationId;
    }


    /**
     * Sets the authorizationId value for this CreditCardTransactionDetail.
     * 
     * @param authorizationId
     */
    public void setAuthorizationId(java.lang.String authorizationId) {
        this.authorizationId = authorizationId;
    }


    /**
     * Gets the authorizationType value for this CreditCardTransactionDetail.
     * 
     * @return authorizationType
     */
    public com.fedex.ws.ship.v26.CreditCardAuthorizationType getAuthorizationType() {
        return authorizationType;
    }


    /**
     * Sets the authorizationType value for this CreditCardTransactionDetail.
     * 
     * @param authorizationType
     */
    public void setAuthorizationType(com.fedex.ws.ship.v26.CreditCardAuthorizationType authorizationType) {
        this.authorizationType = authorizationType;
    }


    /**
     * Gets the fraudDetectionDetail value for this CreditCardTransactionDetail.
     * 
     * @return fraudDetectionDetail
     */
    public com.fedex.ws.ship.v26.CreditFraudDetectionDetail getFraudDetectionDetail() {
        return fraudDetectionDetail;
    }


    /**
     * Sets the fraudDetectionDetail value for this CreditCardTransactionDetail.
     * 
     * @param fraudDetectionDetail
     */
    public void setFraudDetectionDetail(com.fedex.ws.ship.v26.CreditFraudDetectionDetail fraudDetectionDetail) {
        this.fraudDetectionDetail = fraudDetectionDetail;
    }


    /**
     * Gets the attributesDetail value for this CreditCardTransactionDetail.
     * 
     * @return attributesDetail   * Specifies details about the credit card transaction that drive
     * decisions about credit card processing.
     */
    public com.fedex.ws.ship.v26.CreditCardTransactionAttributeType[] getAttributesDetail() {
        return attributesDetail;
    }


    /**
     * Sets the attributesDetail value for this CreditCardTransactionDetail.
     * 
     * @param attributesDetail   * Specifies details about the credit card transaction that drive
     * decisions about credit card processing.
     */
    public void setAttributesDetail(com.fedex.ws.ship.v26.CreditCardTransactionAttributeType[] attributesDetail) {
        this.attributesDetail = attributesDetail;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreditCardTransactionDetail)) return false;
        CreditCardTransactionDetail other = (CreditCardTransactionDetail) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.authorizationId==null && other.getAuthorizationId()==null) || 
             (this.authorizationId!=null &&
              this.authorizationId.equals(other.getAuthorizationId()))) &&
            ((this.authorizationType==null && other.getAuthorizationType()==null) || 
             (this.authorizationType!=null &&
              this.authorizationType.equals(other.getAuthorizationType()))) &&
            ((this.fraudDetectionDetail==null && other.getFraudDetectionDetail()==null) || 
             (this.fraudDetectionDetail!=null &&
              this.fraudDetectionDetail.equals(other.getFraudDetectionDetail()))) &&
            ((this.attributesDetail==null && other.getAttributesDetail()==null) || 
             (this.attributesDetail!=null &&
              java.util.Arrays.equals(this.attributesDetail, other.getAttributesDetail())));
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
        if (getAuthorizationId() != null) {
            _hashCode += getAuthorizationId().hashCode();
        }
        if (getAuthorizationType() != null) {
            _hashCode += getAuthorizationType().hashCode();
        }
        if (getFraudDetectionDetail() != null) {
            _hashCode += getFraudDetectionDetail().hashCode();
        }
        if (getAttributesDetail() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAttributesDetail());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAttributesDetail(), i);
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
        new org.apache.axis.description.TypeDesc(CreditCardTransactionDetail.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "CreditCardTransactionDetail"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authorizationId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "AuthorizationId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authorizationType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "AuthorizationType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "CreditCardAuthorizationType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fraudDetectionDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "FraudDetectionDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "CreditFraudDetectionDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attributesDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "AttributesDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "CreditCardTransactionAttributeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "Types"));
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
