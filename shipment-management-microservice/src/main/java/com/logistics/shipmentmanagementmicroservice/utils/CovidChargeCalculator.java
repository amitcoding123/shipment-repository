package com.logistics.shipmentmanagementmicroservice.utils;

import com.logistics.shipmentmanagementmicroservice.domain.CovidSurcharge;

import java.util.List;

public interface CovidChargeCalculator {

    Double getCovidSurcharge(List<CovidSurcharge> covidSurchargeList, Double weight);

}
