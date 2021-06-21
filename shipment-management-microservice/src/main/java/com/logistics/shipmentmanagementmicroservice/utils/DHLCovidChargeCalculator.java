package com.logistics.shipmentmanagementmicroservice.utils;

import com.logistics.shipmentmanagementmicroservice.domain.CovidSurcharge;

import java.util.List;

public class DHLCovidChargeCalculator implements CovidChargeCalculator {

    @Override
    public Double getCovidSurcharge(List<CovidSurcharge> covidSurchargeList, Double weight) {
        Double totalCharge = weight * covidSurchargeList.get(0).getAmount();
        return totalCharge;
    }
}
