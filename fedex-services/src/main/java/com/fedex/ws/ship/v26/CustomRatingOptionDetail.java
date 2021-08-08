/**
 * CustomRatingOptionDetail.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.ws.ship.v26;

public class CustomRatingOptionDetail  implements java.io.Serializable {
    private com.fedex.ws.ship.v26.CustomRatingOptionType[] options;

    private com.fedex.ws.ship.v26.RateDiscountType[] customDiscountExclusionDetail;

    public CustomRatingOptionDetail() {
    }

    public CustomRatingOptionDetail(
           com.fedex.ws.ship.v26.CustomRatingOptionType[] options,
           com.fedex.ws.ship.v26.RateDiscountType[] customDiscountExclusionDetail) {
           this.options = options;
           this.customDiscountExclusionDetail = customDiscountExclusionDetail;
    }


    /**
     * Gets the options value for this CustomRatingOptionDetail.
     * 
     * @return options
     */
    public com.fedex.ws.ship.v26.CustomRatingOptionType[] getOptions() {
        return options;
    }


    /**
     * Sets the options value for this CustomRatingOptionDetail.
     * 
     * @param options
     */
    public void setOptions(com.fedex.ws.ship.v26.CustomRatingOptionType[] options) {
        this.options = options;
    }

    public com.fedex.ws.ship.v26.CustomRatingOptionType getOptions(int i) {
        return this.options[i];
    }

    public void setOptions(int i, com.fedex.ws.ship.v26.CustomRatingOptionType _value) {
        this.options[i] = _value;
    }


    /**
     * Gets the customDiscountExclusionDetail value for this CustomRatingOptionDetail.
     * 
     * @return customDiscountExclusionDetail
     */
    public com.fedex.ws.ship.v26.RateDiscountType[] getCustomDiscountExclusionDetail() {
        return customDiscountExclusionDetail;
    }


    /**
     * Sets the customDiscountExclusionDetail value for this CustomRatingOptionDetail.
     * 
     * @param customDiscountExclusionDetail
     */
    public void setCustomDiscountExclusionDetail(com.fedex.ws.ship.v26.RateDiscountType[] customDiscountExclusionDetail) {
        this.customDiscountExclusionDetail = customDiscountExclusionDetail;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CustomRatingOptionDetail)) return false;
        CustomRatingOptionDetail other = (CustomRatingOptionDetail) obj;
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
            ((this.customDiscountExclusionDetail==null && other.getCustomDiscountExclusionDetail()==null) || 
             (this.customDiscountExclusionDetail!=null &&
              java.util.Arrays.equals(this.customDiscountExclusionDetail, other.getCustomDiscountExclusionDetail())));
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
        if (getCustomDiscountExclusionDetail() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCustomDiscountExclusionDetail());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCustomDiscountExclusionDetail(), i);
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
        new org.apache.axis.description.TypeDesc(CustomRatingOptionDetail.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "CustomRatingOptionDetail"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("options");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "Options"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "CustomRatingOptionType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customDiscountExclusionDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "CustomDiscountExclusionDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "RateDiscountType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "ExcludedTypes"));
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
