package com.logistics.domain;

import java.time.LocalDate;

public class DSRDto {

    private Long id;
    private byte[] dsr;
    private String userId;
    private LocalDate createdOn;

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
}
