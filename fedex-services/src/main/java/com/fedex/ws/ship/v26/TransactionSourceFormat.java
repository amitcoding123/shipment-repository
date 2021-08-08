/**
 * TransactionSourceFormat.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.ws.ship.v26;

public class TransactionSourceFormat implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected TransactionSourceFormat(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _API_CTS = "API_CTS";
    public static final java.lang.String _API_XML = "API_XML";
    public static final java.lang.String _DIRECT = "DIRECT";
    public static final java.lang.String _DIRECT_XML = "DIRECT_XML";
    public static final java.lang.String _FXRS_CTS = "FXRS_CTS";
    public static final java.lang.String _UNKNOWN = "UNKNOWN";
    public static final java.lang.String _WSI_XML = "WSI_XML";
    public static final TransactionSourceFormat API_CTS = new TransactionSourceFormat(_API_CTS);
    public static final TransactionSourceFormat API_XML = new TransactionSourceFormat(_API_XML);
    public static final TransactionSourceFormat DIRECT = new TransactionSourceFormat(_DIRECT);
    public static final TransactionSourceFormat DIRECT_XML = new TransactionSourceFormat(_DIRECT_XML);
    public static final TransactionSourceFormat FXRS_CTS = new TransactionSourceFormat(_FXRS_CTS);
    public static final TransactionSourceFormat UNKNOWN = new TransactionSourceFormat(_UNKNOWN);
    public static final TransactionSourceFormat WSI_XML = new TransactionSourceFormat(_WSI_XML);
    public java.lang.String getValue() { return _value_;}
    public static TransactionSourceFormat fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        TransactionSourceFormat enumeration = (TransactionSourceFormat)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static TransactionSourceFormat fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(TransactionSourceFormat.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "TransactionSourceFormat"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
