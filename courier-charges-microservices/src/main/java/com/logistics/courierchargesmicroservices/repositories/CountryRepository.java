package com.logistics.courierchargesmicroservices.repositories;

import com.logistics.courierchargesmicroservices.model.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRepository extends JpaRepository<Country, Long> {
}
