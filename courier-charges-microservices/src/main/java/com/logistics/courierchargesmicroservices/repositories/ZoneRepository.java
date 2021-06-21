package com.logistics.courierchargesmicroservices.repositories;

import com.logistics.courierchargesmicroservices.model.Zone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ZoneRepository extends JpaRepository<Zone, Long> {
}
