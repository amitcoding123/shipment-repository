/**
 * ShipmentProcessingOptionType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.ws.ship.v26;

public class ShipmentProcessingOptionType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ShipmentProcessingOptionType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _BYPASS_CLEARANCE_PROHIBITS = "BYPASS_CLEARANCE_PROHIBITS";
    public static final java.lang.String _BYPASS_REGULATORY_VALIDATION = "BYPASS_REGULATORY_VALIDATION";
    public static final java.lang.String _CONVENIENCE_MULTIPLE_PACKAGES = "CONVENIENCE_MULTIPLE_PACKAGES";
    public static final java.lang.String _CUSTOM_TRANSIT_TIME = "CUSTOM_TRANSIT_TIME";
    public static final java.lang.String _FUTURE_DAY_SHIPMENT = "FUTURE_DAY_SHIPMENT";
    public static final java.lang.String _IATA_CLASS_AND_AIRCRAFT_ONLY = "IATA_CLASS_AND_AIRCRAFT_ONLY";
    public static final java.lang.String _NO_COMMITMENT_DATE_REQUESTED = "NO_COMMITMENT_DATE_REQUESTED";
    public static final java.lang.String _PRE_EIG_PROCESSING = "PRE_EIG_PROCESSING";
    public static final java.lang.String _PRE_ETD_ENHANCEMENTS = "PRE_ETD_ENHANCEMENTS";
    public static final java.lang.String _PRE_FXF2020_HANDLING_UNIT_DETAILS = "PRE_FXF2020_HANDLING_UNIT_DETAILS";
    public static final java.lang.String _PRE_MULTIPLIER_PROCESSING = "PRE_MULTIPLIER_PROCESSING";
    public static final ShipmentProcessingOptionType BYPASS_CLEARANCE_PROHIBITS = new ShipmentProcessingOptionType(_BYPASS_CLEARANCE_PROHIBITS);
    public static final ShipmentProcessingOptionType BYPASS_REGULATORY_VALIDATION = new ShipmentProcessingOptionType(_BYPASS_REGULATORY_VALIDATION);
    public static final ShipmentProcessingOptionType CONVENIENCE_MULTIPLE_PACKAGES = new ShipmentProcessingOptionType(_CONVENIENCE_MULTIPLE_PACKAGES);
    public static final ShipmentProcessingOptionType CUSTOM_TRANSIT_TIME = new ShipmentProcessingOptionType(_CUSTOM_TRANSIT_TIME);
    public static final ShipmentProcessingOptionType FUTURE_DAY_SHIPMENT = new ShipmentProcessingOptionType(_FUTURE_DAY_SHIPMENT);
    public static final ShipmentProcessingOptionType IATA_CLASS_AND_AIRCRAFT_ONLY = new ShipmentProcessingOptionType(_IATA_CLASS_AND_AIRCRAFT_ONLY);
    public static final ShipmentProcessingOptionType NO_COMMITMENT_DATE_REQUESTED = new ShipmentProcessingOptionType(_NO_COMMITMENT_DATE_REQUESTED);
    public static final ShipmentProcessingOptionType PRE_EIG_PROCESSING = new ShipmentProcessingOptionType(_PRE_EIG_PROCESSING);
    public static final ShipmentProcessingOptionType PRE_ETD_ENHANCEMENTS = new ShipmentProcessingOptionType(_PRE_ETD_ENHANCEMENTS);
    public static final ShipmentProcessingOptionType PRE_FXF2020_HANDLING_UNIT_DETAILS = new ShipmentProcessingOptionType(_PRE_FXF2020_HANDLING_UNIT_DETAILS);
    public static final ShipmentProcessingOptionType PRE_MULTIPLIER_PROCESSING = new ShipmentProcessingOptionType(_PRE_MULTIPLIER_PROCESSING);
    public java.lang.String getValue() { return _value_;}
    public static ShipmentProcessingOptionType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ShipmentProcessingOptionType enumeration = (ShipmentProcessingOptionType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ShipmentProcessingOptionType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(ShipmentProcessingOptionType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "ShipmentProcessingOptionType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
