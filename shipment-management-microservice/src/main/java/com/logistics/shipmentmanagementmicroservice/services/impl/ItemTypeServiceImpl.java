package com.logistics.shipmentmanagementmicroservice.services.impl;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.stereotype.Service;

import com.logistics.domain.ItemTypeDto;
import com.logistics.shipmentmanagementmicroservice.domain.ItemType;
import com.logistics.shipmentmanagementmicroservice.repositories.ItemTypeRepository;
import com.logistics.shipmentmanagementmicroservice.services.ItemTypeService;

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

	@Override
	public ItemTypeDto createItemType(ItemTypeDto dto) {
		ItemType itemType = new ItemType();
		itemType.setDescription(dto.getDescription());
		itemType.setCreatedOn(LocalDateTime.now());
		itemType.setModifiedOn(LocalDateTime.now());
		itemType.setCreatedBy(dto.getCreatedBy());
		itemType.setModifiedBy(dto.getModifiedBy());
		itemType = itemTypeRepository.save(itemType);
		dto.setId(itemType.getId());
		dto.setCreatedOn(itemType.getCreatedOn());
		dto.setModifiedOn(itemType.getModifiedOn());
		return dto;
	}
    
    
}
