/**
 * CreditFraudDetectionDetail.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.ws.ship.v26;


/**
 * This class is a rename of the previous VerifyCreditFraudDetail;
 * the name change reflects the fact that it is no longer tied to a "verify"
 * usage.
 */
public class CreditFraudDetectionDetail  implements java.io.Serializable {
    private java.lang.String ipAddress;

    private java.lang.Boolean clientCookiesEnabled;

    public CreditFraudDetectionDetail() {
    }

    public CreditFraudDetectionDetail(
           java.lang.String ipAddress,
           java.lang.Boolean clientCookiesEnabled) {
           this.ipAddress = ipAddress;
           this.clientCookiesEnabled = clientCookiesEnabled;
    }


    /**
     * Gets the ipAddress value for this CreditFraudDetectionDetail.
     * 
     * @return ipAddress
     */
    public java.lang.String getIpAddress() {
        return ipAddress;
    }


    /**
     * Sets the ipAddress value for this CreditFraudDetectionDetail.
     * 
     * @param ipAddress
     */
    public void setIpAddress(java.lang.String ipAddress) {
        this.ipAddress = ipAddress;
    }


    /**
     * Gets the clientCookiesEnabled value for this CreditFraudDetectionDetail.
     * 
     * @return clientCookiesEnabled
     */
    public java.lang.Boolean getClientCookiesEnabled() {
        return clientCookiesEnabled;
    }


    /**
     * Sets the clientCookiesEnabled value for this CreditFraudDetectionDetail.
     * 
     * @param clientCookiesEnabled
     */
    public void setClientCookiesEnabled(java.lang.Boolean clientCookiesEnabled) {
        this.clientCookiesEnabled = clientCookiesEnabled;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreditFraudDetectionDetail)) return false;
        CreditFraudDetectionDetail other = (CreditFraudDetectionDetail) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ipAddress==null && other.getIpAddress()==null) || 
             (this.ipAddress!=null &&
              this.ipAddress.equals(other.getIpAddress()))) &&
            ((this.clientCookiesEnabled==null && other.getClientCookiesEnabled()==null) || 
             (this.clientCookiesEnabled!=null &&
              this.clientCookiesEnabled.equals(other.getClientCookiesEnabled())));
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
        if (getIpAddress() != null) {
            _hashCode += getIpAddress().hashCode();
        }
        if (getClientCookiesEnabled() != null) {
            _hashCode += getClientCookiesEnabled().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CreditFraudDetectionDetail.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "CreditFraudDetectionDetail"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ipAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "IpAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clientCookiesEnabled");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "ClientCookiesEnabled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
