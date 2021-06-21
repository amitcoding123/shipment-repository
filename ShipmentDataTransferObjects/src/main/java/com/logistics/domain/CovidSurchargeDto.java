package com.logistics.domain;

import java.io.Serializable;

public class CovidSurchargeDto implements Serializable {

    private Long id;
    private CountryDto country;
    private CourierServiceProvider provider;
    private Double amount;
    private char chargeType;
    private Double staticWeight;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public CountryDto getCountry() {
        return country;
    }

    public void setCountry(CountryDto country) {
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
