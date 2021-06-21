package com.logistics.courierchargesmicroservices.services.impl;

import com.logistics.courierchargesmicroservices.model.Charge;
import com.logistics.courierchargesmicroservices.repositories.ChargeRepository;
import com.logistics.courierchargesmicroservices.services.ChargeService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChargeServiceImpl implements ChargeService {

    private final ChargeRepository repository;

    public ChargeServiceImpl(ChargeRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Charge> findAll() {
        return repository.findAll();
    }

}
