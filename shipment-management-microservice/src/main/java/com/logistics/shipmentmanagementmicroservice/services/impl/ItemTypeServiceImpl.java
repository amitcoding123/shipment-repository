package com.logistics.shipmentmanagementmicroservice.services.impl;

import com.logistics.shipmentmanagementmicroservice.domain.Item;
import com.logistics.shipmentmanagementmicroservice.domain.ItemType;
import com.logistics.shipmentmanagementmicroservice.repositories.ItemTypeRepository;
import com.logistics.shipmentmanagementmicroservice.services.ItemTypeService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemTypeServiceImpl implements ItemTypeService {

    private ItemTypeRepository itemTypeRepository;

    public ItemTypeServiceImpl(ItemTypeRepository itemTypeRepository) {
        this.itemTypeRepository = itemTypeRepository;
    }

    @Override
    public List<ItemType> findAll() {
        return itemTypeRepository.findAll();
    }

    @Override
    public ItemType findById(Long id) {
        return itemTypeRepository.findById(id).get();
    }
}
