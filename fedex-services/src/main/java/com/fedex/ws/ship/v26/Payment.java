/**
 * Payment.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.ws.ship.v26;

public class Payment  implements java.io.Serializable {
    private com.fedex.ws.ship.v26.PaymentType paymentType;

    private com.fedex.ws.ship.v26.Payor payor;

    private com.fedex.ws.ship.v26.CreditCard creditCard;

    private com.fedex.ws.ship.v26.CreditCardTransactionDetail creditCardTransactionDetail;

    private com.fedex.ws.ship.v26.Money amount;

    public Payment() {
    }

    public Payment(
           com.fedex.ws.ship.v26.PaymentType paymentType,
           com.fedex.ws.ship.v26.Payor payor,
           com.fedex.ws.ship.v26.CreditCard creditCard,
           com.fedex.ws.ship.v26.CreditCardTransactionDetail creditCardTransactionDetail,
           com.fedex.ws.ship.v26.Money amount) {
           this.paymentType = paymentType;
           this.payor = payor;
           this.creditCard = creditCard;
           this.creditCardTransactionDetail = creditCardTransactionDetail;
           this.amount = amount;
    }


    /**
     * Gets the paymentType value for this Payment.
     * 
     * @return paymentType
     */
    public com.fedex.ws.ship.v26.PaymentType getPaymentType() {
        return paymentType;
    }


    /**
     * Sets the paymentType value for this Payment.
     * 
     * @param paymentType
     */
    public void setPaymentType(com.fedex.ws.ship.v26.PaymentType paymentType) {
        this.paymentType = paymentType;
    }


    /**
     * Gets the payor value for this Payment.
     * 
     * @return payor
     */
    public com.fedex.ws.ship.v26.Payor getPayor() {
        return payor;
    }


    /**
     * Sets the payor value for this Payment.
     * 
     * @param payor
     */
    public void setPayor(com.fedex.ws.ship.v26.Payor payor) {
        this.payor = payor;
    }


    /**
     * Gets the creditCard value for this Payment.
     * 
     * @return creditCard
     */
    public com.fedex.ws.ship.v26.CreditCard getCreditCard() {
        return creditCard;
    }


    /**
     * Sets the creditCard value for this Payment.
     * 
     * @param creditCard
     */
    public void setCreditCard(com.fedex.ws.ship.v26.CreditCard creditCard) {
        this.creditCard = creditCard;
    }


    /**
     * Gets the creditCardTransactionDetail value for this Payment.
     * 
     * @return creditCardTransactionDetail
     */
    public com.fedex.ws.ship.v26.CreditCardTransactionDetail getCreditCardTransactionDetail() {
        return creditCardTransactionDetail;
    }


    /**
     * Sets the creditCardTransactionDetail value for this Payment.
     * 
     * @param creditCardTransactionDetail
     */
    public void setCreditCardTransactionDetail(com.fedex.ws.ship.v26.CreditCardTransactionDetail creditCardTransactionDetail) {
        this.creditCardTransactionDetail = creditCardTransactionDetail;
    }


    /**
     * Gets the amount value for this Payment.
     * 
     * @return amount
     */
    public com.fedex.ws.ship.v26.Money getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this Payment.
     * 
     * @param amount
     */
    public void setAmount(com.fedex.ws.ship.v26.Money amount) {
        this.amount = amount;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Payment)) return false;
        Payment other = (Payment) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.paymentType==null && other.getPaymentType()==null) || 
             (this.paymentType!=null &&
              this.paymentType.equals(other.getPaymentType()))) &&
            ((this.payor==null && other.getPayor()==null) || 
             (this.payor!=null &&
              this.payor.equals(other.getPayor()))) &&
            ((this.creditCard==null && other.getCreditCard()==null) || 
             (this.creditCard!=null &&
              this.creditCard.equals(other.getCreditCard()))) &&
            ((this.creditCardTransactionDetail==null && other.getCreditCardTransactionDetail()==null) || 
             (this.creditCardTransactionDetail!=null &&
              this.creditCardTransactionDetail.equals(other.getCreditCardTransactionDetail()))) &&
            ((this.amount==null && other.getAmount()==null) || 
             (this.amount!=null &&
              this.amount.equals(other.getAmount())));
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
        if (getPaymentType() != null) {
            _hashCode += getPaymentType().hashCode();
        }
        if (getPayor() != null) {
            _hashCode += getPayor().hashCode();
        }
        if (getCreditCard() != null) {
            _hashCode += getCreditCard().hashCode();
        }
        if (getCreditCardTransactionDetail() != null) {
            _hashCode += getCreditCardTransactionDetail().hashCode();
        }
        if (getAmount() != null) {
            _hashCode += getAmount().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Payment.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "Payment"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "PaymentType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "PaymentType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payor");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "Payor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "Payor"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creditCard");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "CreditCard"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "CreditCard"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creditCardTransactionDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "CreditCardTransactionDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "CreditCardTransactionDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "Amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "Money"));
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
