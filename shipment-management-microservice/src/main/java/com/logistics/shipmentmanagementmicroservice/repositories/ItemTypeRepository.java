package com.logistics.shipmentmanagementmicroservice.repositories;

import com.logistics.shipmentmanagementmicroservice.domain.ItemType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemTypeRepository extends JpaRepository<ItemType, Long> {
}
