package com.logistics.shipmentmanagementmicroservice.repositories;

import com.logistics.shipmentmanagementmicroservice.domain.TrackingHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrackingHistoryRepository extends JpaRepository<TrackingHistory, Long> {

    public TrackingHistory findByTrackingNumber(Long trackingNumber);

}
