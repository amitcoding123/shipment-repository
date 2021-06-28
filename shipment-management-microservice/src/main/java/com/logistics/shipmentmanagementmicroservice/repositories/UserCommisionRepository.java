package com.logistics.shipmentmanagementmicroservice.repositories;

import com.logistics.shipmentmanagementmicroservice.domain.UserCommision;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserCommisionRepository extends JpaRepository<UserCommision, Long> {

    Optional<UserCommision> findByCocourierUserId(String cocourierUserId);
}
