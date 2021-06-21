package com.logistics.invoicemanagementmicroservice.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

public class BoxDto implements Serializable {
    private String name;
    private String weight;
    private String quantity;
    private BigDecimal rate;
    private List<ContentDto> contents;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public List<ContentDto> getContents() {
        return contents;
    }

    public void setContents(List<ContentDto> contents) {
        this.contents = contents;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getRate() {
        return rate;
    }

    public void setRate(BigDecimal rate) {
        this.rate = rate;
    }

}
