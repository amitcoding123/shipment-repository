package com.logistics.shipmentmanagementmicroservice.services.impl;

import com.logistics.domain.CourierServiceProvider;
import com.logistics.domain.ShipementCategory;
import com.logistics.shipmentmanagementmicroservice.domain.*;
import com.logistics.shipmentmanagementmicroservice.repositories.ChargeRepository;
import com.logistics.shipmentmanagementmicroservice.repositories.CountryRepository;
import com.logistics.shipmentmanagementmicroservice.repositories.CovidSurchargeRepository;
import com.logistics.shipmentmanagementmicroservice.services.ChargeService;
import com.logistics.shipmentmanagementmicroservice.utils.CovidCalculatorFactory;
import com.logistics.shipmentmanagementmicroservice.utils.CovidChargeCalculator;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class ChargeServiceImpl implements ChargeService {

    private ChargeRepository chargeRepository;
    private CountryRepository countryRepository;
    private CovidSurchargeRepository covidSurchargeRepository;

    public ChargeServiceImpl(ChargeRepository chargeRepository, CountryRepository countryRepository, CovidSurchargeRepository covidSurchargeRepository) {
        this.chargeRepository = chargeRepository;
        this.countryRepository = countryRepository;
        this.covidSurchargeRepository = covidSurchargeRepository;
    }

    @Override
    public Charge getCharge(String countryCode, ShipementCategory category, Double weight, CourierServiceProvider provider) {
        Country country = countryRepository.findCountryByIsoCode(countryCode);
        Zone zone = country.getZone();
        //Make it dependent on service provider
        //Admin will charge different amount and co-courier will charge different amount.
        //Parent child relationship and %extra will be between a parent and child.
        //Persist amount to be given to parent.
        Charge charge = chargeRepository.findChargeByZoneAndCategoryAndWeight(zone, category, weight); //Purchase rate
        //Add Covid Surcharge
        List<CovidSurcharge> covidSurcharge = covidSurchargeRepository.findCovidSurchargeByCountryAndProvider(country, provider);
        //Double totalSurcharge = covidSurcharge.getAmount() * weight;
        CovidChargeCalculator calculator = CovidCalculatorFactory.getCovidCalculatory(provider.equals(CourierServiceProvider.FEDEX) ? 'F' : 'D');
        Double totalSurcharge = calculator.getCovidSurcharge(covidSurcharge, weight);
        charge.setCovidSurcharge(totalSurcharge);
        Double totalCharge = charge.getRate() + totalSurcharge;
        //Add fuel surchange
        //Make it configurable
        totalCharge = totalCharge + (totalCharge * 15)/100;
        charge.setFuelSurcharge((totalCharge * 15)/100);
        charge.setFuelChargePercentage(15d);
        //Add GST
        totalCharge = totalCharge + (totalCharge * 18)/100;//Purchase rate
        charge.setFrieghtCharge(totalCharge);
        //Add 25% more charge
        //Make it user configurable
        totalCharge = totalCharge + (totalCharge * 25) / 100;//Selling rate
        charge.setFinalCharge(Math.round(totalCharge));
        return charge;
    }
}
