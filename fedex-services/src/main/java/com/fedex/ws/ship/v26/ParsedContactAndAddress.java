/**
 * ParsedContactAndAddress.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.ws.ship.v26;


/**
 * This type contains equivalent data to ContactAndAddress, but uses
 * a form of person name with separate first, middle and last names.
 */
public class ParsedContactAndAddress  implements java.io.Serializable {
    private com.fedex.ws.ship.v26.ParsedContact contact;

    private com.fedex.ws.ship.v26.Address address;

    public ParsedContactAndAddress() {
    }

    public ParsedContactAndAddress(
           com.fedex.ws.ship.v26.ParsedContact contact,
           com.fedex.ws.ship.v26.Address address) {
           this.contact = contact;
           this.address = address;
    }


    /**
     * Gets the contact value for this ParsedContactAndAddress.
     * 
     * @return contact
     */
    public com.fedex.ws.ship.v26.ParsedContact getContact() {
        return contact;
    }


    /**
     * Sets the contact value for this ParsedContactAndAddress.
     * 
     * @param contact
     */
    public void setContact(com.fedex.ws.ship.v26.ParsedContact contact) {
        this.contact = contact;
    }


    /**
     * Gets the address value for this ParsedContactAndAddress.
     * 
     * @return address
     */
    public com.fedex.ws.ship.v26.Address getAddress() {
        return address;
    }


    /**
     * Sets the address value for this ParsedContactAndAddress.
     * 
     * @param address
     */
    public void setAddress(com.fedex.ws.ship.v26.Address address) {
        this.address = address;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ParsedContactAndAddress)) return false;
        ParsedContactAndAddress other = (ParsedContactAndAddress) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.contact==null && other.getContact()==null) || 
             (this.contact!=null &&
              this.contact.equals(other.getContact()))) &&
            ((this.address==null && other.getAddress()==null) || 
             (this.address!=null &&
              this.address.equals(other.getAddress())));
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
        if (getContact() != null) {
            _hashCode += getContact().hashCode();
        }
        if (getAddress() != null) {
            _hashCode += getAddress().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ParsedContactAndAddress.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "ParsedContactAndAddress"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contact");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "Contact"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "ParsedContact"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("address");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "Address"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "Address"));
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