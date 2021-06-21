package com.logistics.domain;

import java.io.Serializable;

public class CountryDto implements Serializable {

    private Long id;
    private String isoCode;
    private String description;
    private ZoneDto zone;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIsoCode() {
        return isoCode;
    }

    public void setIsoCode(String isoCode) {
        this.isoCode = isoCode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ZoneDto getZone() {
        return zone;
    }

    public void setZone(ZoneDto zone) {
        this.zone = zone;
    }

}
