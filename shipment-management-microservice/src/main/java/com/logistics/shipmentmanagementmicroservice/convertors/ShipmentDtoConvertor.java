package com.logistics.shipmentmanagementmicroservice.convertors;

import com.logistics.shipmentmanagementmicroservice.domain.Item;
import com.logistics.shipmentmanagementmicroservice.domain.Shipment;
import com.logistics.shipmentmanagementmicroservice.dto.BoxDto;
import com.logistics.shipmentmanagementmicroservice.dto.ContentDto;
import com.logistics.shipmentmanagementmicroservice.dto.ShipmentDto;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Component
public class ShipmentDtoConvertor {

    public ShipmentDto fromShipment(Shipment shipment) {
        ShipmentDto dto = new ShipmentDto();

        dto.setConsigneeName(shipment.getConsignee().getName());
        dto.setCurrency("INR");
        dto.setCountryOfFinalDestination(shipment.getConsignee().getAddress().getCountry());
        dto.setDisclaimer("Non Commercial Contents");
        dto.setExporterRef("");
        dto.setShipmentId(shipment.getId());
        dto.setFinalDestination(shipment.getConsignee().getAddress().getCountry());
        dto.setInvoiceDate(LocalDate.now().toString());
        dto.setPhoneNumber(shipment.getShipper().getPhoneNumber());
        dto.setWeight("10");
        dto.setLotName("Box 1");
        dto.setCountryOfOrigin(shipment.getShipper().getAddress().getCountry());
        dto.setOtherReference("");
        dto.setPlaceOfReceiptPreCarriage("");
        dto.setPortOfDischarge(shipment.getShipper().getAddress().getCountry());
        dto.setPortOfLoading(shipment.getShipper().getAddress().getCountry());
        dto.setPreCarriageBy(shipment.getUserId());
        dto.setShipperAadharCardNumber(Long.parseLong(shipment.getShipper().getAadharNumber()));
        dto.setTerms("Terms & Conditions Apply");
        dto.setVesselFlightNo("");
        dto.setShipperName(shipment.getShipper().getName());
        List<BoxDto> boxes = new ArrayList<BoxDto>();
        for (Item item: shipment.getItems()) {
            BoxDto boxDto = new BoxDto();
            boxDto.setName(item.getItemType().getDescription());
            boxDto.setRate(item.getPrice());
            boxDto.setWeight(String.valueOf(item.getQuantity()));
            ContentDto contentDto = new ContentDto();
            contentDto.setDescription(item.getItemType().getDescription());
            contentDto.setCurrency("INR");
            contentDto.setRate(String.valueOf(item.getPrice()));
            List<ContentDto> list = new ArrayList<ContentDto>();
            list.add(contentDto);
            boxDto.setContents(list);
            boxes.add(boxDto);
        }
        dto.setBoxes(boxes);

        return dto;
    }

}
