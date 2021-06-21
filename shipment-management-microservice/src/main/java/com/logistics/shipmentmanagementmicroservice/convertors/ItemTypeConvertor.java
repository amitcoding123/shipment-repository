package com.logistics.shipmentmanagementmicroservice.convertors;

import com.logistics.domain.ItemTypeDto;
import com.logistics.shipmentmanagementmicroservice.domain.ItemType;

import java.util.ArrayList;
import java.util.List;

public class ItemTypeConvertor {

    private static ItemTypeConvertor itemTypeConvertor;

    private ItemTypeConvertor () {}

    public static ItemTypeConvertor getInstance() {
        if(itemTypeConvertor == null)
            itemTypeConvertor = new ItemTypeConvertor();
        return itemTypeConvertor;
    }

    public ItemTypeDto convert(ItemType itemType) {
        ItemTypeDto dto = new ItemTypeDto();

        dto.setId(itemType.getId());
        dto.setCreatedBy(itemType.getCreatedBy());
        dto.setCreatedOn(itemType.getCreatedOn());
        dto.setModifiedBy(itemType.getModifiedBy());
        dto.setModifiedOn(itemType.getModifiedOn());
        dto.setDescription(itemType.getDescription());

        return dto;
    }

    public List<ItemTypeDto> convertList(List<ItemType> itemTypes) {
        List<ItemTypeDto> itemTypeDtos = new ArrayList<>(1);

        for (ItemType itemType: itemTypes) {
            itemTypeDtos.add(convert(itemType));
        }

        return  itemTypeDtos;
    }

}
