package com.logistics.shipmentmanagementmicroservice.services;

import java.util.List;

import com.logistics.domain.ItemTypeDto;
import com.logistics.shipmentmanagementmicroservice.domain.ItemType;

public interface ItemTypeService {

    public List<ItemType> findAll();
    public ItemType findById(Long id);
    public ItemTypeDto createItemType(ItemTypeDto dto);

}
