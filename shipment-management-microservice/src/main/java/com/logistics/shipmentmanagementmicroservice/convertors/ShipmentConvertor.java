package com.logistics.shipmentmanagementmicroservice.convertors;

import com.logistics.domain.*;
import com.logistics.shipmentmanagementmicroservice.domain.*;

import java.util.*;

public class ShipmentConvertor {

    private static ShipmentConvertor instance;

    private ShipmentConvertor() {
    }

    public static ShipmentConvertor getInstance() {
        if(instance == null)
            instance = new ShipmentConvertor();
        return instance;
    }

    public ShipmentDto convert(Shipment shipment) {
        ShipmentDto dto = new ShipmentDto();

        dto.setId(shipment.getId());
        dto.setActualWeight(shipment.getActualWeight());
        dto.setBoxHeight(shipment.getBoxHeight());
        dto.setCreatedBy(shipment.getCreatedBy());
        dto.setCreatedOn(shipment.getCreatedOn());
        dto.setModifiedBy(shipment.getModifiedBy());
        dto.setModifiedOn(shipment.getModifiedOn());
        dto.setBoxLength(shipment.getBoxLength());
        dto.setBoxWidth(shipment.getBoxWidth());
        dto.setBoxWeight(shipment.getBoxWeight());
        dto.setCategory(shipment.getCategory());
        dto.setComments(shipment.getComments());
        dto.setFrieghtCharge(shipment.getFrieghtCharge());
        dto.setInvoiceNumber(shipment.getInvoiceNumber());
        dto.setProvider(shipment.getProvider());
        dto.setSellingCost(shipment.getSellingCost());
        dto.setSpecialInstruction(shipment.getSpecialInstruction());
        dto.setStatus(shipment.getStatus());
        dto.setTrackingNumber(shipment.getTrackingNumber());
        dto.setUserId(shipment.getUserId());
        dto.setPaymentMode(shipment.getPaymentMode());
        //Set shipper
        ShipperDto shipperDto = new ShipperDto();
        shipperDto.setId(shipment.getShipper().getId());
        shipperDto.setCreatedBy(shipment.getShipper().getCreatedBy());
        shipperDto.setCreatedOn(shipment.getShipper().getCreatedOn());
        shipperDto.setModifiedBy(shipment.getShipper().getModifiedBy());
        shipperDto.setModifiedOn(shipment.getShipper().getModifiedOn());
        shipperDto.setAadharNumber(shipment.getShipper().getAadharNumber());
        shipperDto.setEmail(shipment.getShipper().getEmail());
        shipperDto.setName(shipment.getShipper().getName());
        shipperDto.setPhoneNumber(shipment.getShipper().getPhoneNumber());
        shipperDto.setPanNumber(shipment.getShipper().getPanNumber());
        shipperDto.setAadharContentType(shipment.getShipper().getAadharContentType());
        shipperDto.setAadharDocument(shipment.getShipper().getAadharDocument());
        shipperDto.setAadharFileName(shipment.getShipper().getAadharFileName());
        shipperDto.setPanContentType(shipment.getShipper().getPanContentType());
        shipperDto.setPanDocument(shipment.getShipper().getPanDocument());
        shipperDto.setPanFileName(shipment.getShipper().getPanFileName());
        shipperDto.setGstin(shipment.getShipper().getGstin());
        shipperDto.setPlace(shipment.getShipper().getPlace());
        shipperDto.setDob(shipment.getShipper().getDob());
        AddressDto shipperAddress = new AddressDto();
        shipperAddress.setId(shipment.getShipper().getAddress().getId());
        shipperAddress.setCreatedBy(shipment.getShipper().getAddress().getCreatedBy());
        shipperAddress.setCreatedOn(shipment.getShipper().getAddress().getCreatedOn());
        shipperAddress.setModifiedBy(shipment.getShipper().getAddress().getModifiedBy());
        shipperAddress.setModifiedOn(shipment.getShipper().getAddress().getModifiedOn());
        shipperAddress.setAddressLine1(shipment.getShipper().getAddress().getAddressLine1());
        shipperAddress.setAddressLine2(shipment.getShipper().getAddress().getAddressLine2());
        shipperAddress.setCity(shipment.getShipper().getAddress().getCity());
        shipperAddress.setCountry(shipment.getShipper().getAddress().getCountry());
        shipperAddress.setState(shipment.getShipper().getAddress().getState());
        shipperAddress.setZipCode(shipment.getShipper().getAddress().getZipCode());
        shipperDto.setAddress(shipperAddress);
        dto.setShipper(shipperDto);

        //Set Consignee
        ConsigneeDto consigneeDto = new ConsigneeDto();
        consigneeDto.setId(shipment.getConsignee().getId());
        consigneeDto.setCreatedBy(shipment.getConsignee().getCreatedBy());
        consigneeDto.setCreatedOn(shipment.getConsignee().getCreatedOn());
        consigneeDto.setModifiedBy(shipment.getConsignee().getModifiedBy());
        consigneeDto.setModifiedOn(shipment.getConsignee().getModifiedOn());
        consigneeDto.setEmail(shipment.getConsignee().getEmail());
        consigneeDto.setName(shipment.getConsignee().getName());
        consigneeDto.setPhoneNumber(shipment.getConsignee().getPhoneNumber());
        consigneeDto.setPlace(shipment.getConsignee().getPlace());
        AddressDto consigneeAddress = new AddressDto();
        consigneeAddress.setId(shipment.getShipper().getAddress().getId());
        consigneeAddress.setCreatedBy(shipment.getConsignee().getAddress().getCreatedBy());
        consigneeAddress.setCreatedOn(shipment.getConsignee().getAddress().getCreatedOn());
        consigneeAddress.setModifiedBy(shipment.getConsignee().getAddress().getModifiedBy());
        consigneeAddress.setModifiedOn(shipment.getConsignee().getAddress().getModifiedOn());
        consigneeAddress.setAddressLine1(shipment.getConsignee().getAddress().getAddressLine1());
        consigneeAddress.setAddressLine2(shipment.getConsignee().getAddress().getAddressLine2());
        consigneeAddress.setCity(shipment.getConsignee().getAddress().getCity());
        consigneeAddress.setCountry(shipment.getConsignee().getAddress().getCountry());
        consigneeAddress.setState(shipment.getConsignee().getAddress().getState());
        consigneeAddress.setZipCode(shipment.getConsignee().getAddress().getZipCode());
        consigneeDto.setAddress(consigneeAddress);
        dto.setConsignee(consigneeDto);

        //Items
        Set<ItemDto> itemDtos = new HashSet<>();
        for (Item item: shipment.getItems()) {
            ItemDto itemDto = new ItemDto();
            itemDto.setId(item.getId());
            itemDto.setCreatedBy(item.getCreatedBy());
            itemDto.setCreatedOn(item.getCreatedOn());
            itemDto.setModifiedBy(item.getModifiedBy());
            itemDto.setModifiedOn(item.getModifiedOn());
            itemDto.setPrice(item.getPrice());
            itemDto.setQuantity(item.getQuantity());
            ItemTypeDto typeDto = new ItemTypeDto();
            typeDto.setId(item.getItemType().getId());
            typeDto.setCreatedBy(item.getItemType().getCreatedBy());
            typeDto.setCreatedOn(item.getItemType().getCreatedOn());
            typeDto.setModifiedBy(item.getItemType().getModifiedBy());
            typeDto.setModifiedOn(item.getItemType().getModifiedOn());
            typeDto.setDescription(item.getItemType().getDescription());
            itemDto.setItemType(typeDto);
            itemDtos.add(itemDto);
        }

        dto.setItems(itemDtos);

        return dto;
    }

    public List<ShipmentDto> convertList(List<Shipment> shipments)
    {
        List<ShipmentDto> shipmentDtos = new ArrayList<>(1);

        for (Shipment shipment: shipments) {
            shipmentDtos.add(convert(shipment));
        }

        return shipmentDtos;
    }

    public Shipment reverseConvert(ShipmentDto shipment) {
        Shipment dto = new Shipment();

        dto.setId(shipment.getId());
        dto.setActualWeight(shipment.getActualWeight());
        dto.setBoxHeight(shipment.getBoxHeight());
        dto.setCreatedBy(shipment.getCreatedBy());
        dto.setCreatedOn(shipment.getCreatedOn());
        dto.setModifiedBy(shipment.getModifiedBy());
        dto.setModifiedOn(shipment.getModifiedOn());
        dto.setBoxLength(shipment.getBoxLength());
        dto.setBoxWidth(shipment.getBoxWidth());
        dto.setBoxWeight(shipment.getBoxWeight());
        dto.setCategory(shipment.getCategory());
        dto.setComments(shipment.getComments());
        dto.setFrieghtCharge(shipment.getFrieghtCharge());
        dto.setInvoiceNumber(shipment.getInvoiceNumber());
        dto.setProvider(shipment.getProvider());
        dto.setSellingCost(shipment.getSellingCost());
        dto.setSpecialInstruction(shipment.getSpecialInstruction());
        dto.setStatus(shipment.getStatus());
        dto.setTrackingNumber(shipment.getTrackingNumber());
        dto.setUserId(shipment.getUserId());
        dto.setPaymentMode(shipment.getPaymentMode());
        //Set shipper
        Shipper shipperDto = new Shipper();
        shipperDto.setId(shipment.getShipper().getId());
        shipperDto.setCreatedBy(shipment.getShipper().getCreatedBy());
        shipperDto.setCreatedOn(shipment.getShipper().getCreatedOn());
        shipperDto.setModifiedBy(shipment.getShipper().getModifiedBy());
        shipperDto.setModifiedOn(shipment.getShipper().getModifiedOn());
        shipperDto.setAadharNumber(shipment.getShipper().getAadharNumber());
        shipperDto.setPanNumber(shipment.getShipper().getPanNumber());
        shipperDto.setGstin(shipment.getShipper().getGstin());
        shipperDto.setEmail(shipment.getShipper().getEmail());
        shipperDto.setName(shipment.getShipper().getName());
        shipperDto.setPhoneNumber(shipment.getShipper().getPhoneNumber());
        shipperDto.setPlace(shipment.getShipper().getPlace());
        shipperDto.setAadharContentType(shipment.getShipper().getAadharContentType());
        shipperDto.setAadharDocument(shipment.getShipper().getAadharDocument());
        shipperDto.setAadharFileName(shipment.getShipper().getAadharFileName());
        shipperDto.setPanContentType(shipment.getShipper().getPanContentType());
        shipperDto.setPanDocument(shipment.getShipper().getPanDocument());
        shipperDto.setPanFileName(shipment.getShipper().getPanFileName());
        shipperDto.setDob(shipment.getShipper().getDob());
        Address shipperAddress = new Address();
        shipperAddress.setId(shipment.getShipper().getAddress().getId());
        shipperAddress.setCreatedBy(shipment.getShipper().getAddress().getCreatedBy());
        shipperAddress.setCreatedOn(shipment.getShipper().getAddress().getCreatedOn());
        shipperAddress.setModifiedBy(shipment.getShipper().getAddress().getModifiedBy());
        shipperAddress.setModifiedOn(shipment.getShipper().getAddress().getModifiedOn());
        shipperAddress.setAddressLine1(shipment.getShipper().getAddress().getAddressLine1());
        shipperAddress.setAddressLine2(shipment.getShipper().getAddress().getAddressLine2());
        shipperAddress.setCity(shipment.getShipper().getAddress().getCity());
        shipperAddress.setCountry(shipment.getShipper().getAddress().getCountry());
        shipperAddress.setState(shipment.getShipper().getAddress().getState());
        shipperAddress.setZipCode(shipment.getShipper().getAddress().getZipCode());
        shipperDto.setAddress(shipperAddress);
        dto.setShipper(shipperDto);

        //Set Consignee
        Consignee consigneeDto = new Consignee();
        consigneeDto.setId(shipment.getConsignee().getId());
        consigneeDto.setCreatedBy(shipment.getConsignee().getCreatedBy());
        consigneeDto.setCreatedOn(shipment.getConsignee().getCreatedOn());
        consigneeDto.setModifiedBy(shipment.getConsignee().getModifiedBy());
        consigneeDto.setModifiedOn(shipment.getConsignee().getModifiedOn());
        consigneeDto.setEmail(shipment.getConsignee().getEmail());
        consigneeDto.setName(shipment.getConsignee().getName());
        consigneeDto.setPhoneNumber(shipment.getConsignee().getPhoneNumber());
        consigneeDto.setPlace(shipment.getConsignee().getPlace());
        Address consigneeAddress = new Address();
        consigneeAddress.setId(shipment.getShipper().getAddress().getId());
        consigneeAddress.setCreatedBy(shipment.getConsignee().getAddress().getCreatedBy());
        consigneeAddress.setCreatedOn(shipment.getConsignee().getAddress().getCreatedOn());
        consigneeAddress.setModifiedBy(shipment.getConsignee().getAddress().getModifiedBy());
        consigneeAddress.setModifiedOn(shipment.getConsignee().getAddress().getModifiedOn());
        consigneeAddress.setAddressLine1(shipment.getConsignee().getAddress().getAddressLine1());
        consigneeAddress.setAddressLine2(shipment.getConsignee().getAddress().getAddressLine2());
        consigneeAddress.setCity(shipment.getConsignee().getAddress().getCity());
        consigneeAddress.setCountry(shipment.getConsignee().getAddress().getCountry());
        consigneeAddress.setState(shipment.getConsignee().getAddress().getState());
        consigneeAddress.setZipCode(shipment.getConsignee().getAddress().getZipCode());
        consigneeDto.setAddress(consigneeAddress);
        dto.setConsignee(consigneeDto);

        //Items
        Set<Item> itemDtos = new HashSet<>();
        for (ItemDto item: shipment.getItems()) {
            if(item == null) continue;
            Item itemDto = new Item();
            itemDto.setId(item.getId());
            itemDto.setCreatedBy(item.getCreatedBy());
            itemDto.setCreatedOn(item.getCreatedOn());
            itemDto.setModifiedBy(item.getModifiedBy());
            itemDto.setModifiedOn(item.getModifiedOn());
            itemDto.setPrice(item.getPrice());
            itemDto.setQuantity(item.getQuantity());
            ItemType typeDto = new ItemType();
            typeDto.setId(item.getItemType().getId());
            typeDto.setCreatedBy(item.getItemType().getCreatedBy());
            typeDto.setCreatedOn(item.getItemType().getCreatedOn());
            typeDto.setModifiedBy(item.getItemType().getModifiedBy());
            typeDto.setModifiedOn(item.getItemType().getModifiedOn());
            typeDto.setDescription(item.getItemType().getDescription());
            itemDto.setItemType(typeDto);
            itemDtos.add(itemDto);
        }

        dto.setItems(itemDtos);

        return dto;
    }

}
