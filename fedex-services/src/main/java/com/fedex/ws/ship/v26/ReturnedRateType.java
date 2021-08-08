/**
 * ReturnedRateType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.ws.ship.v26;

public class ReturnedRateType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ReturnedRateType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _INCENTIVE = "INCENTIVE";
    public static final java.lang.String _NEGOTIATED = "NEGOTIATED";
    public static final java.lang.String _PAYOR_ACCOUNT_PACKAGE = "PAYOR_ACCOUNT_PACKAGE";
    public static final java.lang.String _PAYOR_ACCOUNT_SHIPMENT = "PAYOR_ACCOUNT_SHIPMENT";
    public static final java.lang.String _PAYOR_CUSTOM_PACKAGE = "PAYOR_CUSTOM_PACKAGE";
    public static final java.lang.String _PAYOR_CUSTOM_SHIPMENT = "PAYOR_CUSTOM_SHIPMENT";
    public static final java.lang.String _PAYOR_LIST_PACKAGE = "PAYOR_LIST_PACKAGE";
    public static final java.lang.String _PAYOR_LIST_SHIPMENT = "PAYOR_LIST_SHIPMENT";
    public static final java.lang.String _PAYOR_RETAIL_PACKAGE = "PAYOR_RETAIL_PACKAGE";
    public static final java.lang.String _PAYOR_RETAIL_SHIPMENT = "PAYOR_RETAIL_SHIPMENT";
    public static final java.lang.String _PREFERRED_ACCOUNT_PACKAGE = "PREFERRED_ACCOUNT_PACKAGE";
    public static final java.lang.String _PREFERRED_ACCOUNT_SHIPMENT = "PREFERRED_ACCOUNT_SHIPMENT";
    public static final java.lang.String _PREFERRED_CUSTOM_PACKAGE = "PREFERRED_CUSTOM_PACKAGE";
    public static final java.lang.String _PREFERRED_CUSTOM_SHIPMENT = "PREFERRED_CUSTOM_SHIPMENT";
    public static final java.lang.String _PREFERRED_INCENTIVE = "PREFERRED_INCENTIVE";
    public static final java.lang.String _PREFERRED_LIST_PACKAGE = "PREFERRED_LIST_PACKAGE";
    public static final java.lang.String _PREFERRED_LIST_SHIPMENT = "PREFERRED_LIST_SHIPMENT";
    public static final java.lang.String _PREFERRED_NEGOTIATED = "PREFERRED_NEGOTIATED";
    public static final java.lang.String _PREFERRED_RETAIL_PACKAGE = "PREFERRED_RETAIL_PACKAGE";
    public static final java.lang.String _PREFERRED_RETAIL_SHIPMENT = "PREFERRED_RETAIL_SHIPMENT";
    public static final java.lang.String _RATED_ACCOUNT_PACKAGE = "RATED_ACCOUNT_PACKAGE";
    public static final java.lang.String _RATED_ACCOUNT_SHIPMENT = "RATED_ACCOUNT_SHIPMENT";
    public static final java.lang.String _RATED_CUSTOM_PACKAGE = "RATED_CUSTOM_PACKAGE";
    public static final java.lang.String _RATED_CUSTOM_SHIPMENT = "RATED_CUSTOM_SHIPMENT";
    public static final java.lang.String _RATED_LIST_PACKAGE = "RATED_LIST_PACKAGE";
    public static final java.lang.String _RATED_LIST_SHIPMENT = "RATED_LIST_SHIPMENT";
    public static final java.lang.String _RATED_RETAIL_PACKAGE = "RATED_RETAIL_PACKAGE";
    public static final java.lang.String _RATED_RETAIL_SHIPMENT = "RATED_RETAIL_SHIPMENT";
    public static final ReturnedRateType INCENTIVE = new ReturnedRateType(_INCENTIVE);
    public static final ReturnedRateType NEGOTIATED = new ReturnedRateType(_NEGOTIATED);
    public static final ReturnedRateType PAYOR_ACCOUNT_PACKAGE = new ReturnedRateType(_PAYOR_ACCOUNT_PACKAGE);
    public static final ReturnedRateType PAYOR_ACCOUNT_SHIPMENT = new ReturnedRateType(_PAYOR_ACCOUNT_SHIPMENT);
    public static final ReturnedRateType PAYOR_CUSTOM_PACKAGE = new ReturnedRateType(_PAYOR_CUSTOM_PACKAGE);
    public static final ReturnedRateType PAYOR_CUSTOM_SHIPMENT = new ReturnedRateType(_PAYOR_CUSTOM_SHIPMENT);
    public static final ReturnedRateType PAYOR_LIST_PACKAGE = new ReturnedRateType(_PAYOR_LIST_PACKAGE);
    public static final ReturnedRateType PAYOR_LIST_SHIPMENT = new ReturnedRateType(_PAYOR_LIST_SHIPMENT);
    public static final ReturnedRateType PAYOR_RETAIL_PACKAGE = new ReturnedRateType(_PAYOR_RETAIL_PACKAGE);
    public static final ReturnedRateType PAYOR_RETAIL_SHIPMENT = new ReturnedRateType(_PAYOR_RETAIL_SHIPMENT);
    public static final ReturnedRateType PREFERRED_ACCOUNT_PACKAGE = new ReturnedRateType(_PREFERRED_ACCOUNT_PACKAGE);
    public static final ReturnedRateType PREFERRED_ACCOUNT_SHIPMENT = new ReturnedRateType(_PREFERRED_ACCOUNT_SHIPMENT);
    public static final ReturnedRateType PREFERRED_CUSTOM_PACKAGE = new ReturnedRateType(_PREFERRED_CUSTOM_PACKAGE);
    public static final ReturnedRateType PREFERRED_CUSTOM_SHIPMENT = new ReturnedRateType(_PREFERRED_CUSTOM_SHIPMENT);
    public static final ReturnedRateType PREFERRED_INCENTIVE = new ReturnedRateType(_PREFERRED_INCENTIVE);
    public static final ReturnedRateType PREFERRED_LIST_PACKAGE = new ReturnedRateType(_PREFERRED_LIST_PACKAGE);
    public static final ReturnedRateType PREFERRED_LIST_SHIPMENT = new ReturnedRateType(_PREFERRED_LIST_SHIPMENT);
    public static final ReturnedRateType PREFERRED_NEGOTIATED = new ReturnedRateType(_PREFERRED_NEGOTIATED);
    public static final ReturnedRateType PREFERRED_RETAIL_PACKAGE = new ReturnedRateType(_PREFERRED_RETAIL_PACKAGE);
    public static final ReturnedRateType PREFERRED_RETAIL_SHIPMENT = new ReturnedRateType(_PREFERRED_RETAIL_SHIPMENT);
    public static final ReturnedRateType RATED_ACCOUNT_PACKAGE = new ReturnedRateType(_RATED_ACCOUNT_PACKAGE);
    public static final ReturnedRateType RATED_ACCOUNT_SHIPMENT = new ReturnedRateType(_RATED_ACCOUNT_SHIPMENT);
    public static final ReturnedRateType RATED_CUSTOM_PACKAGE = new ReturnedRateType(_RATED_CUSTOM_PACKAGE);
    public static final ReturnedRateType RATED_CUSTOM_SHIPMENT = new ReturnedRateType(_RATED_CUSTOM_SHIPMENT);
    public static final ReturnedRateType RATED_LIST_PACKAGE = new ReturnedRateType(_RATED_LIST_PACKAGE);
    public static final ReturnedRateType RATED_LIST_SHIPMENT = new ReturnedRateType(_RATED_LIST_SHIPMENT);
    public static final ReturnedRateType RATED_RETAIL_PACKAGE = new ReturnedRateType(_RATED_RETAIL_PACKAGE);
    public static final ReturnedRateType RATED_RETAIL_SHIPMENT = new ReturnedRateType(_RATED_RETAIL_SHIPMENT);
    public java.lang.String getValue() { return _value_;}
    public static ReturnedRateType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ReturnedRateType enumeration = (ReturnedRateType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ReturnedRateType fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_;}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ReturnedRateType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "ReturnedRateType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
