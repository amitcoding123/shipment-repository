/**
 * AutoConfigurationType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.ws.ship.v26;

public class AutoConfigurationType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected AutoConfigurationType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _ENTERPRISE = "ENTERPRISE";
    public static final java.lang.String _SHIPPING_SERVICE_PROVIDER = "SHIPPING_SERVICE_PROVIDER";
    public static final java.lang.String _SOFTWARE_ONLY = "SOFTWARE_ONLY";
    public static final java.lang.String _TRADITIONAL = "TRADITIONAL";
    public static final AutoConfigurationType ENTERPRISE = new AutoConfigurationType(_ENTERPRISE);
    public static final AutoConfigurationType SHIPPING_SERVICE_PROVIDER = new AutoConfigurationType(_SHIPPING_SERVICE_PROVIDER);
    public static final AutoConfigurationType SOFTWARE_ONLY = new AutoConfigurationType(_SOFTWARE_ONLY);
    public static final AutoConfigurationType TRADITIONAL = new AutoConfigurationType(_TRADITIONAL);
    public java.lang.String getValue() { return _value_;}
    public static AutoConfigurationType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        AutoConfigurationType enumeration = (AutoConfigurationType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static AutoConfigurationType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(AutoConfigurationType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "AutoConfigurationType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
