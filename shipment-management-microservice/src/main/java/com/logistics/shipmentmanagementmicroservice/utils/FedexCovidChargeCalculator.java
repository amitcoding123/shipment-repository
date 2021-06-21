package com.logistics.shipmentmanagementmicroservice.utils;

import com.logistics.shipmentmanagementmicroservice.domain.CovidSurcharge;

import java.util.List;

public class FedexCovidChargeCalculator implements CovidChargeCalculator {

    @Override
    public Double getCovidSurcharge(List<CovidSurcharge> covidSurchargeList, Double weight) {
        Double totalCharge = 0.0;
        Double staticCharge = 0.0;
        Double staticWeight = 0.0;
        Double perKgWeight = 0.0;
        for (CovidSurcharge surCharge: covidSurchargeList) {
            if(surCharge.getChargeType() == 'S') {
                staticCharge = surCharge.getAmount();
                staticWeight = surCharge.getStaticWeight();
            } else {
                perKgWeight = surCharge.getAmount();
            }
        }

        totalCharge += staticCharge;
        Long newWeight = Math.round(weight - staticWeight);
        totalCharge += newWeight * perKgWeight;

        return totalCharge;
    }
}
