package com.logistics.shipmentmanagementmicroservice.domain;

import javax.persistence.*;

@Entity
public class Shipper extends BaseEntity {

    public Shipper() {
        super();
    }

    private String place;
    private String name;
    private String phoneNumber;
    private String email;
    private String aadharNumber;
    private String panNumber;
    private String gstin;

    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "shipper_address_id")
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

    public String getAadharNumber() {
        return aadharNumber;
    }

    public void setAadharNumber(String aadharNumber) {
        this.aadharNumber = aadharNumber;
    }

	public String getPanNumber() {
		return panNumber;
	}

	public void setPanNumber(String panNumber) {
		this.panNumber = panNumber;
	}

	public String getGstin() {
		return gstin;
	}

	public void setGstin(String gstin) {
		this.gstin = gstin;
	}
    
    
}
