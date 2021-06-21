package com.logistics.shipmentmanagementmicroservice.domain;

import com.logistics.domain.ShipementCategory;

import javax.persistence.*;

@Entity
public class Charge {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToOne
    private Zone zone;
    private double weight;
    private Long rate;
    private ShipementCategory category;

    @OneToOne
    private Currency currency;

    @Transient
    private double frieghtCharge;

    @Transient
    private long finalCharge;

    public Charge() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Zone getZone() {
        return zone;
    }

    public void setZone(Zone zone) {
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

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
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
