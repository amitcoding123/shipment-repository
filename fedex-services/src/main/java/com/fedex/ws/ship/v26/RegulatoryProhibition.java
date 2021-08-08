/**
 * RegulatoryProhibition.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.ws.ship.v26;

public class RegulatoryProhibition  implements java.io.Serializable {
    private com.fedex.ws.ship.v26.ProhibitionStatusType status;

    private com.fedex.ws.ship.v26.ProhibitionSourceType source;

    private com.fedex.ws.ship.v26.ProhibitionType type;

    private com.fedex.ws.ship.v26.ShipmentRuleType[] categories;

    /* This is a 1-based index identifying the commodity in the request
     * that resulted in this COMMODITY or DOCUMENT type prohibition. */
    private org.apache.axis.types.NonNegativeInteger commodityIndex;

    private java.lang.String derivedHarmonizedCode;

    private com.fedex.ws.ship.v26.Message advisory;

    private com.fedex.ws.ship.v26.RegulatoryWaiver waiver;

    public RegulatoryProhibition() {
    }

    public RegulatoryProhibition(
           com.fedex.ws.ship.v26.ProhibitionStatusType status,
           com.fedex.ws.ship.v26.ProhibitionSourceType source,
           com.fedex.ws.ship.v26.ProhibitionType type,
           com.fedex.ws.ship.v26.ShipmentRuleType[] categories,
           org.apache.axis.types.NonNegativeInteger commodityIndex,
           java.lang.String derivedHarmonizedCode,
           com.fedex.ws.ship.v26.Message advisory,
           com.fedex.ws.ship.v26.RegulatoryWaiver waiver) {
           this.status = status;
           this.source = source;
           this.type = type;
           this.categories = categories;
           this.commodityIndex = commodityIndex;
           this.derivedHarmonizedCode = derivedHarmonizedCode;
           this.advisory = advisory;
           this.waiver = waiver;
    }


    /**
     * Gets the status value for this RegulatoryProhibition.
     * 
     * @return status
     */
    public com.fedex.ws.ship.v26.ProhibitionStatusType getStatus() {
        return status;
    }


    /**
     * Sets the status value for this RegulatoryProhibition.
     * 
     * @param status
     */
    public void setStatus(com.fedex.ws.ship.v26.ProhibitionStatusType status) {
        this.status = status;
    }


    /**
     * Gets the source value for this RegulatoryProhibition.
     * 
     * @return source
     */
    public com.fedex.ws.ship.v26.ProhibitionSourceType getSource() {
        return source;
    }


    /**
     * Sets the source value for this RegulatoryProhibition.
     * 
     * @param source
     */
    public void setSource(com.fedex.ws.ship.v26.ProhibitionSourceType source) {
        this.source = source;
    }


    /**
     * Gets the type value for this RegulatoryProhibition.
     * 
     * @return type
     */
    public com.fedex.ws.ship.v26.ProhibitionType getType() {
        return type;
    }


    /**
     * Sets the type value for this RegulatoryProhibition.
     * 
     * @param type
     */
    public void setType(com.fedex.ws.ship.v26.ProhibitionType type) {
        this.type = type;
    }


    /**
     * Gets the categories value for this RegulatoryProhibition.
     * 
     * @return categories
     */
    public com.fedex.ws.ship.v26.ShipmentRuleType[] getCategories() {
        return categories;
    }


    /**
     * Sets the categories value for this RegulatoryProhibition.
     * 
     * @param categories
     */
    public void setCategories(com.fedex.ws.ship.v26.ShipmentRuleType[] categories) {
        this.categories = categories;
    }

    public com.fedex.ws.ship.v26.ShipmentRuleType getCategories(int i) {
        return this.categories[i];
    }

    public void setCategories(int i, com.fedex.ws.ship.v26.ShipmentRuleType _value) {
        this.categories[i] = _value;
    }


    /**
     * Gets the commodityIndex value for this RegulatoryProhibition.
     * 
     * @return commodityIndex   * This is a 1-based index identifying the commodity in the request
     * that resulted in this COMMODITY or DOCUMENT type prohibition.
     */
    public org.apache.axis.types.NonNegativeInteger getCommodityIndex() {
        return commodityIndex;
    }


    /**
     * Sets the commodityIndex value for this RegulatoryProhibition.
     * 
     * @param commodityIndex   * This is a 1-based index identifying the commodity in the request
     * that resulted in this COMMODITY or DOCUMENT type prohibition.
     */
    public void setCommodityIndex(org.apache.axis.types.NonNegativeInteger commodityIndex) {
        this.commodityIndex = commodityIndex;
    }


    /**
     * Gets the derivedHarmonizedCode value for this RegulatoryProhibition.
     * 
     * @return derivedHarmonizedCode
     */
    public java.lang.String getDerivedHarmonizedCode() {
        return derivedHarmonizedCode;
    }


    /**
     * Sets the derivedHarmonizedCode value for this RegulatoryProhibition.
     * 
     * @param derivedHarmonizedCode
     */
    public void setDerivedHarmonizedCode(java.lang.String derivedHarmonizedCode) {
        this.derivedHarmonizedCode = derivedHarmonizedCode;
    }


    /**
     * Gets the advisory value for this RegulatoryProhibition.
     * 
     * @return advisory
     */
    public com.fedex.ws.ship.v26.Message getAdvisory() {
        return advisory;
    }


    /**
     * Sets the advisory value for this RegulatoryProhibition.
     * 
     * @param advisory
     */
    public void setAdvisory(com.fedex.ws.ship.v26.Message advisory) {
        this.advisory = advisory;
    }


    /**
     * Gets the waiver value for this RegulatoryProhibition.
     * 
     * @return waiver
     */
    public com.fedex.ws.ship.v26.RegulatoryWaiver getWaiver() {
        return waiver;
    }


    /**
     * Sets the waiver value for this RegulatoryProhibition.
     * 
     * @param waiver
     */
    public void setWaiver(com.fedex.ws.ship.v26.RegulatoryWaiver waiver) {
        this.waiver = waiver;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RegulatoryProhibition)) return false;
        RegulatoryProhibition other = (RegulatoryProhibition) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.source==null && other.getSource()==null) || 
             (this.source!=null &&
              this.source.equals(other.getSource()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.categories==null && other.getCategories()==null) || 
             (this.categories!=null &&
              java.util.Arrays.equals(this.categories, other.getCategories()))) &&
            ((this.commodityIndex==null && other.getCommodityIndex()==null) || 
             (this.commodityIndex!=null &&
              this.commodityIndex.equals(other.getCommodityIndex()))) &&
            ((this.derivedHarmonizedCode==null && other.getDerivedHarmonizedCode()==null) || 
             (this.derivedHarmonizedCode!=null &&
              this.derivedHarmonizedCode.equals(other.getDerivedHarmonizedCode()))) &&
            ((this.advisory==null && other.getAdvisory()==null) || 
             (this.advisory!=null &&
              this.advisory.equals(other.getAdvisory()))) &&
            ((this.waiver==null && other.getWaiver()==null) || 
             (this.waiver!=null &&
              this.waiver.equals(other.getWaiver())));
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
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getSource() != null) {
            _hashCode += getSource().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getCategories() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCategories());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCategories(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCommodityIndex() != null) {
            _hashCode += getCommodityIndex().hashCode();
        }
        if (getDerivedHarmonizedCode() != null) {
            _hashCode += getDerivedHarmonizedCode().hashCode();
        }
        if (getAdvisory() != null) {
            _hashCode += getAdvisory().hashCode();
        }
        if (getWaiver() != null) {
            _hashCode += getWaiver().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RegulatoryProhibition.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "RegulatoryProhibition"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "Status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "ProhibitionStatusType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("source");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "Source"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "ProhibitionSourceType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "Type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "ProhibitionType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("categories");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "Categories"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "ShipmentRuleType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("commodityIndex");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "CommodityIndex"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("derivedHarmonizedCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "DerivedHarmonizedCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("advisory");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "Advisory"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "Message"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("waiver");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "Waiver"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "RegulatoryWaiver"));
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
