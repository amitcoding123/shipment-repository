/**
 * ShipmentProcessingOptionsRequested.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.ws.ship.v26;


/**
 * Specifies special or custom features to be applied during the processing
 * of the enclosing RequestedShipment.
 */
public class ShipmentProcessingOptionsRequested  implements java.io.Serializable {
    /* Identifies options to be applied. */
    private com.fedex.ws.ship.v26.ShipmentProcessingOptionType[] options;

    /* Specifies custom transit time to be applied to the shipment. */
    private com.fedex.ws.ship.v26.CustomTransitTimeDetail customTransitTimeDetail;

    public ShipmentProcessingOptionsRequested() {
    }

    public ShipmentProcessingOptionsRequested(
           com.fedex.ws.ship.v26.ShipmentProcessingOptionType[] options,
           com.fedex.ws.ship.v26.CustomTransitTimeDetail customTransitTimeDetail) {
           this.options = options;
           this.customTransitTimeDetail = customTransitTimeDetail;
    }


    /**
     * Gets the options value for this ShipmentProcessingOptionsRequested.
     * 
     * @return options   * Identifies options to be applied.
     */
    public com.fedex.ws.ship.v26.ShipmentProcessingOptionType[] getOptions() {
        return options;
    }


    /**
     * Sets the options value for this ShipmentProcessingOptionsRequested.
     * 
     * @param options   * Identifies options to be applied.
     */
    public void setOptions(com.fedex.ws.ship.v26.ShipmentProcessingOptionType[] options) {
        this.options = options;
    }

    public com.fedex.ws.ship.v26.ShipmentProcessingOptionType getOptions(int i) {
        return this.options[i];
    }

    public void setOptions(int i, com.fedex.ws.ship.v26.ShipmentProcessingOptionType _value) {
        this.options[i] = _value;
    }


    /**
     * Gets the customTransitTimeDetail value for this ShipmentProcessingOptionsRequested.
     * 
     * @return customTransitTimeDetail   * Specifies custom transit time to be applied to the shipment.
     */
    public com.fedex.ws.ship.v26.CustomTransitTimeDetail getCustomTransitTimeDetail() {
        return customTransitTimeDetail;
    }


    /**
     * Sets the customTransitTimeDetail value for this ShipmentProcessingOptionsRequested.
     * 
     * @param customTransitTimeDetail   * Specifies custom transit time to be applied to the shipment.
     */
    public void setCustomTransitTimeDetail(com.fedex.ws.ship.v26.CustomTransitTimeDetail customTransitTimeDetail) {
        this.customTransitTimeDetail = customTransitTimeDetail;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ShipmentProcessingOptionsRequested)) return false;
        ShipmentProcessingOptionsRequested other = (ShipmentProcessingOptionsRequested) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.options==null && other.getOptions()==null) || 
             (this.options!=null &&
              java.util.Arrays.equals(this.options, other.getOptions()))) &&
            ((this.customTransitTimeDetail==null && other.getCustomTransitTimeDetail()==null) || 
             (this.customTransitTimeDetail!=null &&
              this.customTransitTimeDetail.equals(other.getCustomTransitTimeDetail())));
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
        if (getOptions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOptions());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOptions(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCustomTransitTimeDetail() != null) {
            _hashCode += getCustomTransitTimeDetail().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ShipmentProcessingOptionsRequested.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "ShipmentProcessingOptionsRequested"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("options");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "Options"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "ShipmentProcessingOptionType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customTransitTimeDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "CustomTransitTimeDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "CustomTransitTimeDetail"));
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
