package com.logistics.domain;

import java.io.Serializable;
import java.util.List;

public class ZoneDto implements Serializable {

    private Long id;
    private String code;
    private List<CountryDto> countries;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public List<CountryDto> getCountries() {
        return countries;
    }

    public void setCountries(List<CountryDto> countries) {
        this.countries = countries;
    }

}
