/**
 * ShipmentAdvisoryDetail.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.ws.ship.v26;

public class ShipmentAdvisoryDetail  implements java.io.Serializable {
    private com.fedex.ws.ship.v26.RegulatoryProhibition[] regulatoryAdvisory;

    public ShipmentAdvisoryDetail() {
    }

    public ShipmentAdvisoryDetail(
           com.fedex.ws.ship.v26.RegulatoryProhibition[] regulatoryAdvisory) {
           this.regulatoryAdvisory = regulatoryAdvisory;
    }


    /**
     * Gets the regulatoryAdvisory value for this ShipmentAdvisoryDetail.
     * 
     * @return regulatoryAdvisory
     */
    public com.fedex.ws.ship.v26.RegulatoryProhibition[] getRegulatoryAdvisory() {
        return regulatoryAdvisory;
    }


    /**
     * Sets the regulatoryAdvisory value for this ShipmentAdvisoryDetail.
     * 
     * @param regulatoryAdvisory
     */
    public void setRegulatoryAdvisory(com.fedex.ws.ship.v26.RegulatoryProhibition[] regulatoryAdvisory) {
        this.regulatoryAdvisory = regulatoryAdvisory;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ShipmentAdvisoryDetail)) return false;
        ShipmentAdvisoryDetail other = (ShipmentAdvisoryDetail) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.regulatoryAdvisory==null && other.getRegulatoryAdvisory()==null) || 
             (this.regulatoryAdvisory!=null &&
              java.util.Arrays.equals(this.regulatoryAdvisory, other.getRegulatoryAdvisory())));
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
        if (getRegulatoryAdvisory() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRegulatoryAdvisory());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRegulatoryAdvisory(), i);
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
        new org.apache.axis.description.TypeDesc(ShipmentAdvisoryDetail.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "ShipmentAdvisoryDetail"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("regulatoryAdvisory");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "RegulatoryAdvisory"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "RegulatoryProhibition"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "Prohibitions"));
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
