package com.logistics.shipmentmanagementmicroservice.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.logistics.shipmentmanagementmicroservice.domain.Shipper;

@Repository
public interface ShipperRepository extends JpaRepository<Shipper, Long> {
	
	List<Shipper> findByCreatedBy(String userId);
	Shipper findByAadharNumber(String aadharNumber);
	
}
