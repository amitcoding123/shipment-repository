package com.logistics.shipmentmanagementmicroservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.logistics.shipmentmanagementmicroservice.domain.HistoricalCustomer;

@Repository
public interface HistoricalCustomerRepository extends JpaRepository<HistoricalCustomer, Long> {

}
