package com.logistics.shipmentmanagementmicroservice.services;

import com.logistics.shipmentmanagementmicroservice.domain.ItemType;

import java.util.List;

public interface ItemTypeService {

    public List<ItemType> findAll();
    public ItemType findById(Long id);

}
