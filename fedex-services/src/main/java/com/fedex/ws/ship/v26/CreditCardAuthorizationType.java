/**
 * CreditCardAuthorizationType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.ws.ship.v26;

public class CreditCardAuthorizationType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected CreditCardAuthorizationType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _AUTHORIZE_NON_ACCOUNT = "AUTHORIZE_NON_ACCOUNT";
    public static final java.lang.String _AUTHORIZE_WITH_ACCOUNT = "AUTHORIZE_WITH_ACCOUNT";
    public static final java.lang.String _VERIFY_WITH_ACCOUNT = "VERIFY_WITH_ACCOUNT";
    public static final CreditCardAuthorizationType AUTHORIZE_NON_ACCOUNT = new CreditCardAuthorizationType(_AUTHORIZE_NON_ACCOUNT);
    public static final CreditCardAuthorizationType AUTHORIZE_WITH_ACCOUNT = new CreditCardAuthorizationType(_AUTHORIZE_WITH_ACCOUNT);
    public static final CreditCardAuthorizationType VERIFY_WITH_ACCOUNT = new CreditCardAuthorizationType(_VERIFY_WITH_ACCOUNT);
    public java.lang.String getValue() { return _value_;}
    public static CreditCardAuthorizationType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        CreditCardAuthorizationType enumeration = (CreditCardAuthorizationType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static CreditCardAuthorizationType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(CreditCardAuthorizationType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "CreditCardAuthorizationType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
