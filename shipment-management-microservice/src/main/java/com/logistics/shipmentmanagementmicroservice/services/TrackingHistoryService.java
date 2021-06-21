package com.logistics.shipmentmanagementmicroservice.services;


import com.logistics.shipmentmanagementmicroservice.domain.TrackingHistory;

public interface TrackingHistoryService {

    public TrackingHistory saveTrackingHistory(TrackingHistory trackingHistory);
    public TrackingHistory getTrackingHistoryByTrackingNumber(Long trackingHistory);

}
