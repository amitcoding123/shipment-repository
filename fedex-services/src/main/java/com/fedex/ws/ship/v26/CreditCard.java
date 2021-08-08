/**
 * CreditCard.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.ws.ship.v26;

public class CreditCard  implements java.io.Serializable {
    private java.lang.String number;

    private com.fedex.ws.ship.v26.CreditCardType creditCardType;

    /* Must be in one of the following formats: YYMM, YYYYMM, or YYYYMMDD. */
    private java.lang.String expirationDate;

    private java.lang.String verificationCode;

    private com.fedex.ws.ship.v26.ParsedContactAndAddress creditCardHolder;

    public CreditCard() {
    }

    public CreditCard(
           java.lang.String number,
           com.fedex.ws.ship.v26.CreditCardType creditCardType,
           java.lang.String expirationDate,
           java.lang.String verificationCode,
           com.fedex.ws.ship.v26.ParsedContactAndAddress creditCardHolder) {
           this.number = number;
           this.creditCardType = creditCardType;
           this.expirationDate = expirationDate;
           this.verificationCode = verificationCode;
           this.creditCardHolder = creditCardHolder;
    }


    /**
     * Gets the number value for this CreditCard.
     * 
     * @return number
     */
    public java.lang.String getNumber() {
        return number;
    }


    /**
     * Sets the number value for this CreditCard.
     * 
     * @param number
     */
    public void setNumber(java.lang.String number) {
        this.number = number;
    }


    /**
     * Gets the creditCardType value for this CreditCard.
     * 
     * @return creditCardType
     */
    public com.fedex.ws.ship.v26.CreditCardType getCreditCardType() {
        return creditCardType;
    }


    /**
     * Sets the creditCardType value for this CreditCard.
     * 
     * @param creditCardType
     */
    public void setCreditCardType(com.fedex.ws.ship.v26.CreditCardType creditCardType) {
        this.creditCardType = creditCardType;
    }


    /**
     * Gets the expirationDate value for this CreditCard.
     * 
     * @return expirationDate   * Must be in one of the following formats: YYMM, YYYYMM, or YYYYMMDD.
     */
    public java.lang.String getExpirationDate() {
        return expirationDate;
    }


    /**
     * Sets the expirationDate value for this CreditCard.
     * 
     * @param expirationDate   * Must be in one of the following formats: YYMM, YYYYMM, or YYYYMMDD.
     */
    public void setExpirationDate(java.lang.String expirationDate) {
        this.expirationDate = expirationDate;
    }


    /**
     * Gets the verificationCode value for this CreditCard.
     * 
     * @return verificationCode
     */
    public java.lang.String getVerificationCode() {
        return verificationCode;
    }


    /**
     * Sets the verificationCode value for this CreditCard.
     * 
     * @param verificationCode
     */
    public void setVerificationCode(java.lang.String verificationCode) {
        this.verificationCode = verificationCode;
    }


    /**
     * Gets the creditCardHolder value for this CreditCard.
     * 
     * @return creditCardHolder
     */
    public com.fedex.ws.ship.v26.ParsedContactAndAddress getCreditCardHolder() {
        return creditCardHolder;
    }


    /**
     * Sets the creditCardHolder value for this CreditCard.
     * 
     * @param creditCardHolder
     */
    public void setCreditCardHolder(com.fedex.ws.ship.v26.ParsedContactAndAddress creditCardHolder) {
        this.creditCardHolder = creditCardHolder;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreditCard)) return false;
        CreditCard other = (CreditCard) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.number==null && other.getNumber()==null) || 
             (this.number!=null &&
              this.number.equals(other.getNumber()))) &&
            ((this.creditCardType==null && other.getCreditCardType()==null) || 
             (this.creditCardType!=null &&
              this.creditCardType.equals(other.getCreditCardType()))) &&
            ((this.expirationDate==null && other.getExpirationDate()==null) || 
             (this.expirationDate!=null &&
              this.expirationDate.equals(other.getExpirationDate()))) &&
            ((this.verificationCode==null && other.getVerificationCode()==null) || 
             (this.verificationCode!=null &&
              this.verificationCode.equals(other.getVerificationCode()))) &&
            ((this.creditCardHolder==null && other.getCreditCardHolder()==null) || 
             (this.creditCardHolder!=null &&
              this.creditCardHolder.equals(other.getCreditCardHolder())));
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
        if (getNumber() != null) {
            _hashCode += getNumber().hashCode();
        }
        if (getCreditCardType() != null) {
            _hashCode += getCreditCardType().hashCode();
        }
        if (getExpirationDate() != null) {
            _hashCode += getExpirationDate().hashCode();
        }
        if (getVerificationCode() != null) {
            _hashCode += getVerificationCode().hashCode();
        }
        if (getCreditCardHolder() != null) {
            _hashCode += getCreditCardHolder().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CreditCard.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "CreditCard"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("number");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "Number"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creditCardType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "CreditCardType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "CreditCardType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expirationDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "ExpirationDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("verificationCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "VerificationCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creditCardHolder");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "CreditCardHolder"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "ParsedContactAndAddress"));
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
