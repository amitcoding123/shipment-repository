package com.logistics.usermanagementmicroservice.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class OneTimePassword extends BaseEntity {

    private String otp;
    private LocalDateTime validTill;

    @ManyToOne
    @JoinColumn(name = "user_id")
    @JsonIgnore
    private User user;

    private OTPStatus status;

    public OneTimePassword() {
        this.status = OTPStatus.CREATED;
    }

    public String getOtp() {
        return otp;
    }

    public void setOtp(String otp) {
        this.otp = otp;
    }

    public LocalDateTime getValidTill() {
        return validTill;
    }

    public void setValidTill(LocalDateTime validTill) {
        this.validTill = validTill;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public OTPStatus getStatus() {
        return status;
    }

    public void setStatus(OTPStatus status) {
        this.status = status;
    }

}
