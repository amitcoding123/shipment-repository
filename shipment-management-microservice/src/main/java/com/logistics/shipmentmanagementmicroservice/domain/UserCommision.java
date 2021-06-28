package com.logistics.shipmentmanagementmicroservice.domain;

import javax.persistence.Entity;

@Entity
public class UserCommision extends BaseEntity {

    private String cocourierUserId;
    private String parentUserId;
    private double percentage;

    public UserCommision() {
    }

    public String getCocourierUserId() {
        return cocourierUserId;
    }

    public void setCocourierUserId(String cocourierUserId) {
        this.cocourierUserId = cocourierUserId;
    }

    public String getParentUserId() {
        return parentUserId;
    }

    public void setParentUserId(String parentUserId) {
        this.parentUserId = parentUserId;
    }

    public double getPercentage() {
        return percentage;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }
}
