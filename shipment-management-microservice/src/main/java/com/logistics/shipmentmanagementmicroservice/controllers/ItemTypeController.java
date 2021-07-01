package com.logistics.shipmentmanagementmicroservice.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.logistics.domain.ItemTypeDto;
import com.logistics.shipmentmanagementmicroservice.convertors.ItemTypeConvertor;
import com.logistics.shipmentmanagementmicroservice.services.ItemTypeService;

@RestController
public class ItemTypeController {

    private final ItemTypeService itemTypeService;

    public ItemTypeController(ItemTypeService itemTypeService) {
        this.itemTypeService = itemTypeService;
    }

    @GetMapping("/shipments/itemtypes")
    public List<ItemTypeDto> getAllItemType() {
        return ItemTypeConvertor.getInstance().convertList(itemTypeService.findAll());
    }
    
    @PostMapping("/shipments/itemtypes")
    public ItemTypeDto createItemType(@RequestBody ItemTypeDto itemType) {
    	return itemTypeService.createItemType(itemType);
    }

}
