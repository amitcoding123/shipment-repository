package com.logistics.shipmentmanagementmicroservice.utils;

public class CovidCalculatorFactory {

    public static CovidChargeCalculator getCovidCalculatory(char provider) {
        switch (provider) {
            case 'F' :
                return new FedexCovidChargeCalculator();
            case 'D' :
                return new DHLCovidChargeCalculator();
            default:
                return null;
        }
    }

}
