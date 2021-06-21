package com.logistics.courierchargesmicroservices.repositories;

import com.logistics.courierchargesmicroservices.model.Charge;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChargeRepository extends JpaRepository<Charge, Long> {
}
