package com.logistics.shipmentmanagementmicroservice.controllers;

import com.logistics.domain.ItemTypeDto;
import com.logistics.shipmentmanagementmicroservice.convertors.ItemTypeConvertor;
import com.logistics.shipmentmanagementmicroservice.domain.ItemType;
import com.logistics.shipmentmanagementmicroservice.services.ItemTypeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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

}
