/**
 * CustomerImageUsage.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.ws.ship.v26;

public class CustomerImageUsage  implements java.io.Serializable {
    private com.fedex.ws.ship.v26.CustomerImageUsageType type;

    private com.fedex.ws.ship.v26.ImageId id;

    /* Internal Id used by INET to identify customer provided images
     * during documents generation. Ex COO etc ... */
    private java.lang.String internalId;

    /* Internal image type used by INET to identify customer provided
     * images during documents generation. Ex COO etc .. */
    private com.fedex.ws.ship.v26.InternalImageType internalImageType;

    public CustomerImageUsage() {
    }

    public CustomerImageUsage(
           com.fedex.ws.ship.v26.CustomerImageUsageType type,
           com.fedex.ws.ship.v26.ImageId id,
           java.lang.String internalId,
           com.fedex.ws.ship.v26.InternalImageType internalImageType) {
           this.type = type;
           this.id = id;
           this.internalId = internalId;
           this.internalImageType = internalImageType;
    }


    /**
     * Gets the type value for this CustomerImageUsage.
     * 
     * @return type
     */
    public com.fedex.ws.ship.v26.CustomerImageUsageType getType() {
        return type;
    }


    /**
     * Sets the type value for this CustomerImageUsage.
     * 
     * @param type
     */
    public void setType(com.fedex.ws.ship.v26.CustomerImageUsageType type) {
        this.type = type;
    }


    /**
     * Gets the id value for this CustomerImageUsage.
     * 
     * @return id
     */
    public com.fedex.ws.ship.v26.ImageId getId() {
        return id;
    }


    /**
     * Sets the id value for this CustomerImageUsage.
     * 
     * @param id
     */
    public void setId(com.fedex.ws.ship.v26.ImageId id) {
        this.id = id;
    }


    /**
     * Gets the internalId value for this CustomerImageUsage.
     * 
     * @return internalId   * Internal Id used by INET to identify customer provided images
     * during documents generation. Ex COO etc ...
     */
    public java.lang.String getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this CustomerImageUsage.
     * 
     * @param internalId   * Internal Id used by INET to identify customer provided images
     * during documents generation. Ex COO etc ...
     */
    public void setInternalId(java.lang.String internalId) {
        this.internalId = internalId;
    }


    /**
     * Gets the internalImageType value for this CustomerImageUsage.
     * 
     * @return internalImageType   * Internal image type used by INET to identify customer provided
     * images during documents generation. Ex COO etc ..
     */
    public com.fedex.ws.ship.v26.InternalImageType getInternalImageType() {
        return internalImageType;
    }


    /**
     * Sets the internalImageType value for this CustomerImageUsage.
     * 
     * @param internalImageType   * Internal image type used by INET to identify customer provided
     * images during documents generation. Ex COO etc ..
     */
    public void setInternalImageType(com.fedex.ws.ship.v26.InternalImageType internalImageType) {
        this.internalImageType = internalImageType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CustomerImageUsage)) return false;
        CustomerImageUsage other = (CustomerImageUsage) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.internalId==null && other.getInternalId()==null) || 
             (this.internalId!=null &&
              this.internalId.equals(other.getInternalId()))) &&
            ((this.internalImageType==null && other.getInternalImageType()==null) || 
             (this.internalImageType!=null &&
              this.internalImageType.equals(other.getInternalImageType())));
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
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getInternalId() != null) {
            _hashCode += getInternalId().hashCode();
        }
        if (getInternalImageType() != null) {
            _hashCode += getInternalImageType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CustomerImageUsage.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "CustomerImageUsage"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "Type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "CustomerImageUsageType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "Id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "ImageId"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("internalId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "InternalId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("internalImageType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "InternalImageType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "InternalImageType"));
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
