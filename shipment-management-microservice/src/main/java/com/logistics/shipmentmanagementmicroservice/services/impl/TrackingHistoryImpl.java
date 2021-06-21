package com.logistics.shipmentmanagementmicroservice.services.impl;

import com.logistics.shipmentmanagementmicroservice.domain.TrackingHistory;
import com.logistics.shipmentmanagementmicroservice.repositories.TrackingHistoryRepository;
import com.logistics.shipmentmanagementmicroservice.services.TrackingHistoryService;
import org.springframework.stereotype.Service;

@Service
public class TrackingHistoryImpl implements TrackingHistoryService {

    private TrackingHistoryRepository trackingHistoryRepository;

    public TrackingHistoryImpl(TrackingHistoryRepository trackingHistoryRepository) {
        this.trackingHistoryRepository = trackingHistoryRepository;
    }

    @Override
    public TrackingHistory saveTrackingHistory(TrackingHistory trackingHistory) {
        return trackingHistoryRepository.save(trackingHistory);
    }

    @Override
    public TrackingHistory getTrackingHistoryByTrackingNumber(Long trackingHistory) {
        return trackingHistoryRepository.findByTrackingNumber(trackingHistory);
    }
}
