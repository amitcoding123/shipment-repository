package com.logistics.courierchargesmicroservices.repositories;

import com.logistics.courierchargesmicroservices.model.Currency;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CurrencyRepository extends JpaRepository<Currency, Long> {
}
