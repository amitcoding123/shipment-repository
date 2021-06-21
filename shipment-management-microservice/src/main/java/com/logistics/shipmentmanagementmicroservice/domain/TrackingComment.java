package com.logistics.shipmentmanagementmicroservice.domain;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class TrackingComment implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String comment;

    @ManyToOne
    private TrackingHistory history;

    public TrackingComment() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public TrackingHistory getHistory() {
        return history;
    }

    public void setHistory(TrackingHistory history) {
        this.history = history;
    }

}
