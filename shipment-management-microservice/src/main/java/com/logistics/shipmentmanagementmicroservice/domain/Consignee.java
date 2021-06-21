package com.logistics.shipmentmanagementmicroservice.domain;

import javax.persistence.*;

@Entity
public class Consignee extends BaseEntity {

    public Consignee() {
        super();
    }

    private String place;
    private String name;
    private String phoneNumber;
    private String email;

    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "consignee_address_id")
    private Address address;


    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
