package com.logistics.shipmentmanagementmicroservice.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public class TrackingHistory implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Long trackingNumber;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "history")
    private List<TrackingComment> comments;

    public TrackingHistory() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getTrackingNumber() {
        return trackingNumber;
    }

    public void setTrackingNumber(Long trackingNumber) {
        this.trackingNumber = trackingNumber;
    }

    public List<TrackingComment> getComments() {
        return comments;
    }

    public void setComments(List<TrackingComment> comments) {
        this.comments = comments;
    }
}
