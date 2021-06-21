package com.logistics.shipmentmanagementmicroservice.domain;

import com.logistics.domain.CourierServiceProvider;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
public class CovidSurcharge {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToOne
    private Country country;

    private CourierServiceProvider provider;
    private Double amount;
    private char chargeType;
    private Double staticWeight;


    public CovidSurcharge() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public CourierServiceProvider getProvider() {
        return provider;
    }

    public void setProvider(CourierServiceProvider provider) {
        this.provider = provider;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public char getChargeType() {
        return chargeType;
    }

    public void setChargeType(char chargeType) {
        this.chargeType = chargeType;
    }

    public Double getStaticWeight() {
        return staticWeight;
    }

    public void setStaticWeight(Double staticWeight) {
        this.staticWeight = staticWeight;
    }
}
