package com.logistics.domain;

import java.io.Serializable;

public class ChargeDto implements Serializable {

    private Long id;
    private ZoneDto zone;
    private double weight;
    private Long rate;
    private ShipementCategory category;
    private CurrencyDto currency;
    private double frieghtCharge;
    private long finalCharge;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ZoneDto getZone() {
        return zone;
    }

    public void setZone(ZoneDto zone) {
        this.zone = zone;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Long getRate() {
        return rate;
    }

    public void setRate(Long rate) {
        this.rate = rate;
    }

    public CurrencyDto getCurrency() {
        return currency;
    }

    public void setCurrency(CurrencyDto currency) {
        this.currency = currency;
    }

    public ShipementCategory getCategory() {
        return category;
    }

    public void setCategory(ShipementCategory category) {
        this.category = category;
    }

    public long getFinalCharge() {
        return finalCharge;
    }

    public void setFinalCharge(long finalCharge) {
        this.finalCharge = finalCharge;
    }

    public double getFrieghtCharge() {
        return frieghtCharge;
    }

    public void setFrieghtCharge(double frieghtCharge) {
        this.frieghtCharge = frieghtCharge;
    }

}
