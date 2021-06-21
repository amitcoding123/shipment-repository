package com.logistics.shipmentmanagementmicroservice.repositories;

import com.logistics.domain.CourierServiceProvider;
import com.logistics.shipmentmanagementmicroservice.domain.Country;
import com.logistics.shipmentmanagementmicroservice.domain.CovidSurcharge;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CovidSurchargeRepository extends JpaRepository<CovidSurcharge, Long> {

    List<CovidSurcharge> findCovidSurchargeByCountryAndProvider(Country country, CourierServiceProvider provider);

}
