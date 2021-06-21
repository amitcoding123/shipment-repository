package com.logistics.shipmentmanagementmicroservice.repositories;

import com.logistics.shipmentmanagementmicroservice.domain.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRepository extends JpaRepository<Country, Long> {

    Country findCountryByIsoCode(String isoCode);

}
