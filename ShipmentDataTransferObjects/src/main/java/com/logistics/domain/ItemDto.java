package com.logistics.domain;

import java.math.BigDecimal;

public class ItemDto extends BaseDto {

    private ItemTypeDto itemType;
    private Long quantity;
    private BigDecimal price;

    public ItemTypeDto getItemType() {
        return itemType;
    }

    public void setItemType(ItemTypeDto itemType) {
        this.itemType = itemType;
    }

    public Long getQuantity() {
        return quantity;
    }

    public void setQuantity(Long weight) {
        this.quantity = weight;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

}
