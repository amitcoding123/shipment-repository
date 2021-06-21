package com.logistics.shipmentmanagementmicroservice.services;

import com.logistics.domain.CourierServiceProvider;
import com.logistics.domain.ShipementCategory;
import com.logistics.shipmentmanagementmicroservice.domain.Charge;

public interface ChargeService {

    public Charge getCharge(String countryCode, ShipementCategory category, Double weight, CourierServiceProvider provider);

}
