package com.logistics.courierchargesmicroservices.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Zone {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String code;

    @OneToMany
    @JoinTable(name = "zone_country",
    joinColumns = @JoinColumn(name = "zone_id"), inverseJoinColumns = @JoinColumn (name = "country_id"))
    private List<Country> countries;

    public Zone() {
    }

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

    public List<Country> getCountries() {
        return countries;
    }

    public void setCountries(List<Country> countries) {
        this.countries = countries;
    }

}
