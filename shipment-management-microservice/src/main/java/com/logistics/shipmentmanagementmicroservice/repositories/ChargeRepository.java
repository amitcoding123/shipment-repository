package com.logistics.shipmentmanagementmicroservice.repositories;

import com.logistics.domain.ShipementCategory;
import com.logistics.shipmentmanagementmicroservice.domain.Charge;
import com.logistics.shipmentmanagementmicroservice.domain.Zone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

@Repository
public interface ChargeRepository extends JpaRepository<Charge, Long> {

    Charge findChargeByZoneAndCategoryAndWeight(Zone zone, ShipementCategory category, Double weight);

}
