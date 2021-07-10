package com.logistics.invoicemanagementmicroservice.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class DSR implements Comparable<DSR> {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Lob
    @JsonIgnore
    private byte[] dsr;
    private String userId;
    private LocalDate createdOn;    

    public DSR() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public byte[] getDsr() {
        return dsr;
    }

    public void setDsr(byte[] dsr) {
        this.dsr = dsr;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public LocalDate getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(LocalDate createdOn) {
        this.createdOn = createdOn;
    }

    @Override
    public int compareTo(DSR o) {
        if(this.createdOn.isBefore(o.createdOn))
            return -1;
        else
            return 1;
    }
}
