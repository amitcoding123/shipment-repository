package com.logistics.courierchargesmicroservices.services;

import com.logistics.courierchargesmicroservices.model.Charge;

import java.util.List;

public interface ChargeService {

    public List<Charge> findAll();

}
