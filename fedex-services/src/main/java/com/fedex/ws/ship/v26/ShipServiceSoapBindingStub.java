/**
 * ShipServiceSoapBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.ws.ship.v26;

public class ShipServiceSoapBindingStub extends org.apache.axis.client.Stub implements com.fedex.ws.ship.v26.ShipPortType {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[5];
        _initOperationDesc1();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("processTag");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "ProcessTagRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "ProcessTagRequest"), com.fedex.ws.ship.v26.ProcessTagRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "ProcessTagReply"));
        oper.setReturnClass(com.fedex.ws.ship.v26.ProcessTagReply.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "ProcessTagReply"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("processShipment");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "ProcessShipmentRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "ProcessShipmentRequest"), com.fedex.ws.ship.v26.ProcessShipmentRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "ProcessShipmentReply"));
        oper.setReturnClass(com.fedex.ws.ship.v26.ProcessShipmentReply.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "ProcessShipmentReply"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("deleteTag");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "DeleteTagRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "DeleteTagRequest"), com.fedex.ws.ship.v26.DeleteTagRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "ShipmentReply"));
        oper.setReturnClass(com.fedex.ws.ship.v26.ShipmentReply.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "ShipmentReply"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("deleteShipment");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "DeleteShipmentRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "DeleteShipmentRequest"), com.fedex.ws.ship.v26.DeleteShipmentRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "ShipmentReply"));
        oper.setReturnClass(com.fedex.ws.ship.v26.ShipmentReply.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "ShipmentReply"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("validateShipment");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "ValidateShipmentRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "ValidateShipmentRequest"), com.fedex.ws.ship.v26.ValidateShipmentRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "ShipmentReply"));
        oper.setReturnClass(com.fedex.ws.ship.v26.ShipmentReply.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "ShipmentReply"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[4] = oper;

    }

    public ShipServiceSoapBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public ShipServiceSoapBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public ShipServiceSoapBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
        addBindings0();
        addBindings1();
        addBindings2();
        addBindings3();
        addBindings4();
    }

    private void addBindings0() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "AccessorRoleType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.AccessorRoleType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "AdditionalLabelsDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.AdditionalLabelsDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "AdditionalLabelsType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.AdditionalLabelsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "Address");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.Address.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "AdrLicenseDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.AdrLicenseDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "AlcoholDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.AlcoholDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "AlcoholRecipientType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.AlcoholRecipientType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "AncillaryFeeAndTax");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.AncillaryFeeAndTax.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "AncillaryFeeAndTaxType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.AncillaryFeeAndTaxType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "AssociatedAccount");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.AssociatedAccount.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "AssociatedAccountNumberType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.AssociatedAccountNumberType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "AssociatedFreightLineItemDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.AssociatedFreightLineItemDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "AssociatedShipmentDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.AssociatedShipmentDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "AssociatedShipmentType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.AssociatedShipmentType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "AutoConfigurationType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.AutoConfigurationType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "B13AFilingOptionType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.B13AFilingOptionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "BarcodeSymbologyType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.BarcodeSymbologyType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "BatteryClassificationDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.BatteryClassificationDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "BatteryMaterialType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.BatteryMaterialType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "BatteryPackingType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.BatteryPackingType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "BatteryRegulatorySubType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.BatteryRegulatorySubType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "BinaryBarcode");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.BinaryBarcode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "BinaryBarcodeType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.BinaryBarcodeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "BrokerDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.BrokerDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "BrokerType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.BrokerType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "CarrierCodeType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.CarrierCodeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "CertificateOfOriginDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.CertificateOfOriginDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "ChargeBasisLevelType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.ChargeBasisLevelType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "ClearanceBrokerageType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.ClearanceBrokerageType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "ClientDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.ClientDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "CodAddTransportationChargeBasisType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.CodAddTransportationChargeBasisType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "CodAddTransportationChargesDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.CodAddTransportationChargesDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "CodAdjustmentType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.CodAdjustmentType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "CodCollectionType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.CodCollectionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "CodDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.CodDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "CodReturnPackageDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.CodReturnPackageDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "CodReturnReferenceIndicatorType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.CodReturnReferenceIndicatorType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "CommercialInvoice");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.CommercialInvoice.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "CommercialInvoiceDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.CommercialInvoiceDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "Commodity");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.Commodity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "CommodityPurposeType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.CommodityPurposeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "CompletedCodDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.CompletedCodDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "CompletedEtdDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.CompletedEtdDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "CompletedEtdType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.CompletedEtdType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "CompletedHazardousPackageDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.CompletedHazardousPackageDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "CompletedHazardousShipmentDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.CompletedHazardousShipmentDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "CompletedHazardousSummaryDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.CompletedHazardousSummaryDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "CompletedHoldAtLocationDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.CompletedHoldAtLocationDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "CompletedPackageDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.CompletedPackageDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "CompletedShipmentDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.CompletedShipmentDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "CompletedSmartPostDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.CompletedSmartPostDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "CompletedTagDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.CompletedTagDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "ConfigurableLabelReferenceEntry");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.ConfigurableLabelReferenceEntry.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "Contact");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.Contact.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "ContactAndAddress");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.ContactAndAddress.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "ContentRecord");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.ContentRecord.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "CreditCard");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.CreditCard.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "CreditCardAuthorizationType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.CreditCardAuthorizationType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "CreditCardTransactionAttributesDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.CreditCardTransactionAttributeType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "CreditCardTransactionAttributeType");
            qName2 = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "Types");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "CreditCardTransactionAttributeType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.CreditCardTransactionAttributeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "CreditCardTransactionDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.CreditCardTransactionDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "CreditCardType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.CreditCardType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "CreditFraudDetectionDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.CreditFraudDetectionDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "CurrencyExchangeRate");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.CurrencyExchangeRate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "CustomDeliveryWindowDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.CustomDeliveryWindowDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "CustomDeliveryWindowType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.CustomDeliveryWindowType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "CustomDiscountExclusionDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.RateDiscountType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "RateDiscountType");
            qName2 = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "ExcludedTypes");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "CustomDocumentDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.CustomDocumentDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "CustomerImageUsage");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.CustomerImageUsage.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "CustomerImageUsageType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.CustomerImageUsageType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "CustomerReference");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.CustomerReference.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "CustomerReferenceType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.CustomerReferenceType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "CustomerSpecifiedLabelDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.CustomerSpecifiedLabelDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "CustomerSpecifiedLabelGenerationOptionType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.CustomerSpecifiedLabelGenerationOptionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "CustomLabelBarcodeEntry");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.CustomLabelBarcodeEntry.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "CustomLabelBoxEntry");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.CustomLabelBoxEntry.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "CustomLabelCoordinateUnits");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.CustomLabelCoordinateUnits.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "CustomLabelDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.CustomLabelDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "CustomLabelGraphicEntry");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.CustomLabelGraphicEntry.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "CustomLabelPosition");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.CustomLabelPosition.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "CustomLabelTextBoxEntry");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.CustomLabelTextBoxEntry.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "CustomLabelTextEntry");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.CustomLabelTextEntry.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "CustomRatingOptionDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.CustomRatingOptionDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "CustomRatingOptionType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.CustomRatingOptionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "CustomsClearanceDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.CustomsClearanceDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "CustomsDeclarationStatementDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.CustomsDeclarationStatementDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "CustomsDeclarationStatementType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.CustomsDeclarationStatementType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "CustomsOptionDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.CustomsOptionDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "CustomsOptionType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.CustomsOptionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "CustomsRoleType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.CustomsRoleType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "CustomTransitTimeDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.CustomTransitTimeDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "DangerousGoodsAccessibilityType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.DangerousGoodsAccessibilityType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "DangerousGoodsContainer");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.DangerousGoodsContainer.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "DangerousGoodsDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.DangerousGoodsDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "DangerousGoodsPackingOptionType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.DangerousGoodsPackingOptionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "DangerousGoodsShippersDeclarationDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.DangerousGoodsShippersDeclarationDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "DangerousGoodsSignatory");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.DangerousGoodsSignatory.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "DateRange");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.DateRange.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "DayOfWeekType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.DayOfWeekType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "DeleteShipmentRequest");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.DeleteShipmentRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }
    private void addBindings1() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "DeleteTagRequest");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.DeleteTagRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "DeletionControlType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.DeletionControlType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "DeliveryOnInvoiceAcceptanceDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.DeliveryOnInvoiceAcceptanceDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "DestinationControlDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.DestinationControlDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "DestinationControlStatementType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.DestinationControlStatementType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "DetentionDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.DetentionDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "Dimensions");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.Dimensions.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "DocTabContent");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.DocTabContent.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "DocTabContentBarcoded");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.DocTabContentBarcoded.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "DocTabContentType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.DocTabContentType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "DocTabContentZone001");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.DocTabZoneSpecification[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "DocTabZoneSpecification");
            qName2 = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "DocTabZoneSpecifications");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "DocTabZoneJustificationType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.DocTabZoneJustificationType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "DocTabZoneSpecification");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.DocTabZoneSpecification.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "DocumentFormatOptionsRequested");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.DocumentFormatOptionType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "DocumentFormatOptionType");
            qName2 = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "Options");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "DocumentFormatOptionType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.DocumentFormatOptionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "DocumentGenerationDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.DocumentGenerationDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "DocumentRequirementsDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.DocumentRequirementsDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "DropoffType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.DropoffType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "EdtCommodityTax");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.EdtCommodityTax.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "EdtExciseCondition");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.EdtExciseCondition.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "EdtRequestType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.EdtRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "EdtTaxDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.EdtTaxDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "EdtTaxType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.EdtTaxType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "EMailDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.EMailDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "EMailLabelDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.EMailLabelDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "EMailNotificationRecipientType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.EMailNotificationRecipientType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "EmailOptionsRequested");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.EmailOptionType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "EmailOptionType");
            qName2 = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "Options");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "EmailOptionType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.EmailOptionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "EMailRecipient");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.EMailRecipient.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "EnterpriseDocumentType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.EnterpriseDocumentType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "ErrorLabelBehaviorType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.ErrorLabelBehaviorType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "EtdAttributeType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.EtdAttributeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "EtdConfirmationType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.EtdConfirmationType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "EtdDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.EtdDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "ExportDeclarationDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.ExportDeclarationDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "ExportDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.ExportDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "ExpressFreightDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.ExpressFreightDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "ExpressFreightDetailContact");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.ExpressFreightDetailContact.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "ExpressRegionCode");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.ExpressRegionCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "ExtraLaborDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.ExtraLaborDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "FedExLocationType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.FedExLocationType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "FlatbedTrailerDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.FlatbedTrailerOption[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "FlatbedTrailerOption");
            qName2 = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "Options");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "FlatbedTrailerOption");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.FlatbedTrailerOption.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "FreightAddressLabelDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.FreightAddressLabelDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "FreightBaseCharge");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.FreightBaseCharge.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "FreightBaseChargeCalculationType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.FreightBaseChargeCalculationType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "FreightBillOfLadingDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.FreightBillOfLadingDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "FreightChargeBasisType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.FreightChargeBasisType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "FreightClassType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.FreightClassType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "FreightCollectTermsType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.FreightCollectTermsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "FreightGuaranteeDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.FreightGuaranteeDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "FreightGuaranteeType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.FreightGuaranteeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "FreightOnValueType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.FreightOnValueType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "FreightRateDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.FreightRateDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "FreightRateNotation");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.FreightRateNotation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "FreightRateQuoteType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.FreightRateQuoteType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "FreightShipmentDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.FreightShipmentDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "FreightShipmentLineItem");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.FreightShipmentLineItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "FreightShipmentRoleType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.FreightShipmentRoleType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "FreightSpecialServicePayment");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.FreightSpecialServicePayment.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "GeneralAgencyAgreementDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.GeneralAgencyAgreementDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "GroundDeliveryEligibilityType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.GroundDeliveryEligibilityType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "HazardousCommodityAttributeType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.HazardousCommodityAttributeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "HazardousCommodityContent");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.HazardousCommodityContent.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "HazardousCommodityDescription");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.HazardousCommodityDescription.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "HazardousCommodityDescriptionProcessingOptionType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.HazardousCommodityDescriptionProcessingOptionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "HazardousCommodityInnerReceptacleDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.HazardousCommodityInnerReceptacleDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "HazardousCommodityLabelTextOptionType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.HazardousCommodityLabelTextOptionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "HazardousCommodityOptionDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.HazardousCommodityOptionDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "HazardousCommodityOptionType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.HazardousCommodityOptionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "HazardousCommodityPackagingDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.HazardousCommodityPackagingDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "HazardousCommodityPackingDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.HazardousCommodityPackingDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "HazardousCommodityPackingGroupType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.HazardousCommodityPackingGroupType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "HazardousCommodityQuantityDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.HazardousCommodityQuantityDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "HazardousCommodityQuantityType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.HazardousCommodityQuantityType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "HazardousCommodityRegulationType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.HazardousCommodityRegulationType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "HazardousContainerPackingType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.HazardousContainerPackingType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "HoldAtLocationDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.HoldAtLocationDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "HomeDeliveryPremiumDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.HomeDeliveryPremiumDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "HomeDeliveryPremiumType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.HomeDeliveryPremiumType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "ImageId");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.ImageId.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "InternalImageType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.InternalImageType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "InternationalControlledExportDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.InternationalControlledExportDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "InternationalControlledExportType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.InternationalControlledExportType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "InternationalDocumentContentType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.InternationalDocumentContentType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "InternationalTrafficInArmsRegulationsDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.InternationalTrafficInArmsRegulationsDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "LabelFormatType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.LabelFormatType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "LabelMaskableDataType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.LabelMaskableDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "LabelOrderType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.LabelOrderType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "LabelPrintingOrientationType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.LabelPrintingOrientationType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "LabelRotationType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.LabelRotationType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "LabelSpecification");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.LabelSpecification.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "LabelStockType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.LabelStockType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "LiabilityCoverageDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.LiabilityCoverageDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "LiabilityCoverageType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.LiabilityCoverageType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "LicenseOrPermitDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.LicenseOrPermitDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "LinearMeasure");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.LinearMeasure.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "LinearUnits");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.LinearUnits.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "Localization");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.Localization.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "MarkingOrTaggingDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.MarkingOrTaggingDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }
    private void addBindings2() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "Measure");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.Measure.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "Message");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.Message.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "MessageParameter");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.MessageParameter.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "MinimumChargeType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.MinimumChargeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "Money");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.Money.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "NaftaCertificateOfOriginDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.NaftaCertificateOfOriginDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "NaftaCommodityDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.NaftaCommodityDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "NaftaImporterSpecificationType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.NaftaImporterSpecificationType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "NaftaLowValueStatementDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.NaftaLowValueStatementDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "NaftaNetCostMethodCode");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.NaftaNetCostMethodCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "NaftaPreferenceCriterionCode");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.NaftaPreferenceCriterionCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "NaftaProducer");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.NaftaProducer.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "NaftaProducerDeterminationCode");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.NaftaProducerDeterminationCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "NaftaProducerSpecificationType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.NaftaProducerSpecificationType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "NetExplosiveClassificationType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.NetExplosiveClassificationType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "NetExplosiveDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.NetExplosiveDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "NonBusinessTimeDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.NonBusinessTimeDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "Notification");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.Notification.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "NotificationDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.NotificationDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "NotificationEventType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.NotificationEventType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "NotificationFormatType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.NotificationFormatType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "NotificationParameter");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.NotificationParameter.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "NotificationSeverityType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.NotificationSeverityType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "NotificationType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.NotificationType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "OfferingIdentifierDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.OfferingIdentifierDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "Op900Detail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.Op900Detail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "OperationalInstruction");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.OperationalInstruction.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "OversizeClassType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.OversizeClassType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "PackageBarcodes");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.PackageBarcodes.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "PackageOperationalDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.PackageOperationalDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "PackageRateDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.PackageRateDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "PackageRating");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.PackageRating.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "PackageSpecialServicesRequested");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.PackageSpecialServicesRequested.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "PackagingDescription");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.PackagingDescription.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "PageQuadrantType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.PageQuadrantType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "PalletShrinkwrapDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.PalletShrinkwrapDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "PalletsProvidedDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.PalletsProvidedDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "ParsedContact");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.ParsedContact.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "ParsedContactAndAddress");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.ParsedContactAndAddress.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "ParsedPersonName");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.ParsedPersonName.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "Party");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.Party.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "Payment");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.Payment.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "PaymentType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.PaymentType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "Payor");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.Payor.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "PendingShipmentAccessDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.PendingShipmentAccessorDetail[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "PendingShipmentAccessorDetail");
            qName2 = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "AccessorDetails");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "PendingShipmentAccessorDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.PendingShipmentAccessorDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "PendingShipmentDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.PendingShipmentDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "PendingShipmentProcessingOptionsRequested");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.PendingShipmentProcessingOptionType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "PendingShipmentProcessingOptionType");
            qName2 = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "Options");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "PendingShipmentProcessingOptionType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.PendingShipmentProcessingOptionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "PendingShipmentType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.PendingShipmentType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "PhysicalFormType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.PhysicalFormType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "PhysicalPackagingType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.PhysicalPackagingType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "PickupDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.PickupDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "PickupRequestSourceType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.PickupRequestSourceType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "PickupRequestType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.PickupRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "PricingCodeType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.PricingCodeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "PrintedReference");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.PrintedReference.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "PrintedReferenceType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.PrintedReferenceType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "PriorityAlertDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.PriorityAlertDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "PriorityAlertEnhancementType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.PriorityAlertEnhancementType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "ProcessShipmentReply");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.ProcessShipmentReply.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "ProcessShipmentRequest");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.ProcessShipmentRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "ProcessTagReply");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.ProcessTagReply.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "ProcessTagRequest");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.ProcessTagRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "ProductName");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.ProductName.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "ProhibitionSourceType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.ProhibitionSourceType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "ProhibitionStatusType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.ProhibitionStatusType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "ProhibitionType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.ProhibitionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "PurposeOfShipmentType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.PurposeOfShipmentType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "RadioactiveContainerClassType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.RadioactiveContainerClassType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "RadioactiveLabelType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.RadioactiveLabelType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "RadioactivityDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.RadioactivityDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "RadioactivityUnitOfMeasure");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.RadioactivityUnitOfMeasure.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "RadionuclideActivity");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.RadionuclideActivity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "RadionuclideDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.RadionuclideDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "RateDimensionalDivisorType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.RateDimensionalDivisorType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "RateDiscount");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.RateDiscount.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "RateDiscountType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.RateDiscountType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "RatedWeightMethod");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.RatedWeightMethod.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "RateElementBasisType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.RateElementBasisType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "RateRequestType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.RateRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "RateTypeBasisType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.RateTypeBasisType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "Rebate");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.Rebate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "RebateType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.RebateType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "RecipientCustomsId");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.RecipientCustomsId.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "RecipientCustomsIdType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.RecipientCustomsIdType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "RecommendedDocumentSpecification");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.RecommendedDocumentType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "RecommendedDocumentType");
            qName2 = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "Types");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "RecommendedDocumentType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.RecommendedDocumentType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "RegulatoryAdvisoryDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.RegulatoryProhibition[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "RegulatoryProhibition");
            qName2 = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "Prohibitions");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "RegulatoryControlType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.RegulatoryControlType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "RegulatoryLabelContentDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.RegulatoryLabelContentDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "RegulatoryLabelType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.RegulatoryLabelType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "RegulatoryProhibition");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.RegulatoryProhibition.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "RegulatoryWaiver");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.RegulatoryWaiver.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "RelativeVerticalPositionType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.RelativeVerticalPositionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "RequestedPackageLineItem");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.RequestedPackageLineItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "RequestedShipment");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.RequestedShipment.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "RequestedShippingDocumentType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.RequestedShippingDocumentType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "RequiredDocumentType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.RequiredDocumentType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "RequirementType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.RequirementType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

    }
    private void addBindings3() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "ReturnAssociationDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.ReturnAssociationDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "ReturnedRateType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.ReturnedRateType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "ReturnedShippingDocumentType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.ReturnedShippingDocumentType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "ReturnEMailAllowedSpecialServiceType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.ReturnEMailAllowedSpecialServiceType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "ReturnEMailDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.ReturnEMailDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "ReturnInstructionsDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.ReturnInstructionsDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "ReturnShipmentDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.ReturnShipmentDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "ReturnType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.ReturnType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "Rma");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.Rma.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "RotationType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.RotationType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "SecondaryBarcodeType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.SecondaryBarcodeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "ServiceDescription");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.ServiceDescription.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "ShipmentAdvisoryDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.ShipmentAdvisoryDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "ShipmentAssemblyDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.ShipmentAssemblyDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "ShipmentAuthorizationDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.ShipmentAuthorizationDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "ShipmentConfigurationData");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.DangerousGoodsDetail[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "DangerousGoodsDetail");
            qName2 = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "DangerousGoodsPackageConfigurations");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "ShipmentDryIceDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.ShipmentDryIceDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "ShipmentDryIceProcessingOptionsRequested");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.ShipmentDryIceProcessingOptionType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "ShipmentDryIceProcessingOptionType");
            qName2 = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "Options");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "ShipmentDryIceProcessingOptionType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.ShipmentDryIceProcessingOptionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "ShipmentEventNotificationDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.ShipmentEventNotificationDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "ShipmentEventNotificationSpecification");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.ShipmentEventNotificationSpecification.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "ShipmentLegRateDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.ShipmentLegRateDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "ShipmentManifestDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.ShipmentManifestDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "ShipmentNotificationAggregationType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.ShipmentNotificationAggregationType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "ShipmentNotificationFormatSpecification");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.ShipmentNotificationFormatSpecification.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "ShipmentNotificationRoleType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.ShipmentNotificationRoleType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "ShipmentOperationalDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.ShipmentOperationalDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "ShipmentProcessingOptionsRequested");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.ShipmentProcessingOptionsRequested.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "ShipmentProcessingOptionType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.ShipmentProcessingOptionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "ShipmentRateDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.ShipmentRateDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "ShipmentRating");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.ShipmentRating.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "ShipmentReply");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.ShipmentReply.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "ShipmentRuleType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.ShipmentRuleType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "ShipmentSpecialServicesRequested");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.ShipmentSpecialServicesRequested.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "ShipmentVariationOptionDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.ShipmentVariationOptionDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "ShipperConveyanceDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.ShipperConveyanceDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "ShippingDocument");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.ShippingDocument.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "ShippingDocumentDispositionDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.ShippingDocumentDispositionDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "ShippingDocumentDispositionType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.ShippingDocumentDispositionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "ShippingDocumentEMailDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.ShippingDocumentEMailDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "ShippingDocumentEMailGroupingType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.ShippingDocumentEMailGroupingType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "ShippingDocumentEMailRecipient");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.ShippingDocumentEMailRecipient.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "ShippingDocumentFormat");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.ShippingDocumentFormat.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "ShippingDocumentGroupingType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.ShippingDocumentGroupingType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "ShippingDocumentImageType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.ShippingDocumentImageType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "ShippingDocumentNamingType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.ShippingDocumentNamingType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "ShippingDocumentPart");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.ShippingDocumentPart.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "ShippingDocumentPrintDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.ShippingDocumentPrintDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "ShippingDocumentSpecification");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.ShippingDocumentSpecification.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "ShippingDocumentStockType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.ShippingDocumentStockType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "ShippingDocumentStorageDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.ShippingDocumentStorageDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "ShippingDocumentStorageDetailType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.ShippingDocumentStorageDetailType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "SignatureOptionDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.SignatureOptionDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "SignatureOptionType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.SignatureOptionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "SmartPostAncillaryEndorsementType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.SmartPostAncillaryEndorsementType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "SmartPostIndiciaType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.SmartPostIndiciaType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "SmartPostShipmentDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.SmartPostShipmentDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "SmartPostShipmentProcessingOptionsRequested");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.SmartPostShipmentProcessingOptionType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "SmartPostShipmentProcessingOptionType");
            qName2 = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "Options");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "SmartPostShipmentProcessingOptionType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.SmartPostShipmentProcessingOptionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "SmartPostShipmentSpecialServiceType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.SmartPostShipmentSpecialServiceType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "SortAndSegregateDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.SortAndSegregateDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "SpecialEquipmentDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.SpecialEquipmentLineItem[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "SpecialEquipmentLineItem");
            qName2 = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "LineItems");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "SpecialEquipmentLineItem");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.SpecialEquipmentLineItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "SpecialEquipmentType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.SpecialEquipmentType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "SpecialRatingAppliedType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.SpecialRatingAppliedType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "SpecialServiceDescription");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.SpecialServiceDescription.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "StorageDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.StorageDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "StringBarcode");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.StringBarcode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "StringBarcodeType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.StringBarcodeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "Surcharge");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.Surcharge.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "SurchargeLevelType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.SurchargeLevelType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "SurchargeType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.SurchargeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "Tax");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.Tax.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "TaxesOrMiscellaneousChargeType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.TaxesOrMiscellaneousChargeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "TaxpayerIdentification");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.TaxpayerIdentification.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "TaxType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.TaxType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "TinType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.TinType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "TrackingId");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.TrackingId.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "TrackingIdType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.TrackingIdType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "TransactionDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.TransactionDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "TransactionSourceFormat");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.TransactionSourceFormat.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "TransitTimeType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.TransitTimeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "UploadDocumentIdProducer");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.UploadDocumentIdProducer.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "UploadDocumentProducerType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.UploadDocumentProducerType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "UploadDocumentReferenceDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.UploadDocumentReferenceDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "UploadDocumentType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.UploadDocumentType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "UserDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.UserDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "ValidatedHazardousCommodityContent");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.ValidatedHazardousCommodityContent.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "ValidatedHazardousCommodityDescription");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.ValidatedHazardousCommodityDescription.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "ValidatedHazardousContainer");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.ValidatedHazardousContainer.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "ValidateShipmentRequest");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.ValidateShipmentRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "VariableHandlingChargeDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.VariableHandlingChargeDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "VariableHandlingCharges");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.VariableHandlingCharges.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "VersionId");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.VersionId.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "Volume");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.Volume.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "VolumeUnits");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.VolumeUnits.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "WebAuthenticationCredential");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.WebAuthenticationCredential.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "WebAuthenticationDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.WebAuthenticationDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "WebServiceEnvironment");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.WebServiceEnvironment.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "WeighingDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.WeighingDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }
    private void addBindings4() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "WeighingScaleType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.WeighingScaleType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "Weight");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.Weight.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "WeightSource");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.WeightSource.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "WeightUnits");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.ship.v26.WeightUnits.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public com.fedex.ws.ship.v26.ProcessTagReply processTag(com.fedex.ws.ship.v26.ProcessTagRequest processTagRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://fedex.com/ws/ship/v26/processTag");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "processTag"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {processTagRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.fedex.ws.ship.v26.ProcessTagReply) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.fedex.ws.ship.v26.ProcessTagReply) org.apache.axis.utils.JavaUtils.convert(_resp, com.fedex.ws.ship.v26.ProcessTagReply.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.fedex.ws.ship.v26.ProcessShipmentReply processShipment(com.fedex.ws.ship.v26.ProcessShipmentRequest processShipmentRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://fedex.com/ws/ship/v26/processShipment");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "processShipment"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {processShipmentRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.fedex.ws.ship.v26.ProcessShipmentReply) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.fedex.ws.ship.v26.ProcessShipmentReply) org.apache.axis.utils.JavaUtils.convert(_resp, com.fedex.ws.ship.v26.ProcessShipmentReply.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.fedex.ws.ship.v26.ShipmentReply deleteTag(com.fedex.ws.ship.v26.DeleteTagRequest deleteTagRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://fedex.com/ws/ship/v26/deleteTag");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "deleteTag"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {deleteTagRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.fedex.ws.ship.v26.ShipmentReply) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.fedex.ws.ship.v26.ShipmentReply) org.apache.axis.utils.JavaUtils.convert(_resp, com.fedex.ws.ship.v26.ShipmentReply.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.fedex.ws.ship.v26.ShipmentReply deleteShipment(com.fedex.ws.ship.v26.DeleteShipmentRequest deleteShipmentRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://fedex.com/ws/ship/v26/deleteShipment");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "deleteShipment"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {deleteShipmentRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.fedex.ws.ship.v26.ShipmentReply) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.fedex.ws.ship.v26.ShipmentReply) org.apache.axis.utils.JavaUtils.convert(_resp, com.fedex.ws.ship.v26.ShipmentReply.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.fedex.ws.ship.v26.ShipmentReply validateShipment(com.fedex.ws.ship.v26.ValidateShipmentRequest validateShipmentRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://fedex.com/ws/ship/v26/validateShipment");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "validateShipment"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {validateShipmentRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.fedex.ws.ship.v26.ShipmentReply) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.fedex.ws.ship.v26.ShipmentReply) org.apache.axis.utils.JavaUtils.convert(_resp, com.fedex.ws.ship.v26.ShipmentReply.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
