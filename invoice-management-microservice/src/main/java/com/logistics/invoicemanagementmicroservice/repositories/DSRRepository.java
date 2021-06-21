package com.logistics.invoicemanagementmicroservice.repositories;

import com.logistics.invoicemanagementmicroservice.model.DSR;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DSRRepository extends JpaRepository<DSR, Long> {

    List<DSR> findByUserId(String userId);

}
