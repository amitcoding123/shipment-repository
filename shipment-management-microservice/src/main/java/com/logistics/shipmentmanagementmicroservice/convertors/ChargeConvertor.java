package com.logistics.shipmentmanagementmicroservice.convertors;

import com.logistics.domain.ChargeDto;
import com.logistics.domain.CurrencyDto;
import com.logistics.domain.ZoneDto;
import com.logistics.shipmentmanagementmicroservice.domain.Charge;

public class ChargeConvertor {

    private static ChargeConvertor chargeConvertor;

    private ChargeConvertor() {
    }

    public static ChargeConvertor getInstance() {
        if(chargeConvertor == null)
            chargeConvertor = new ChargeConvertor();
        return chargeConvertor;
    }

    public ChargeDto convert(Charge charge) {
        ChargeDto dto = new ChargeDto();

        dto.setId(charge.getId());
        dto.setCategory(charge.getCategory());
        dto.setFinalCharge(charge.getFinalCharge());
        dto.setFrieghtCharge(charge.getFrieghtCharge());
        dto.setRate(charge.getRate());
        dto.setWeight(charge.getWeight());

        CurrencyDto currencyDto = new CurrencyDto();
        currencyDto.setId(charge.getCurrency().getId());
        currencyDto.setIsoCurrencyCode(charge.getCurrency().getIsoCurrencyCode());
        currencyDto.setDescription(charge.getCurrency().getDescription());

        dto.setCurrency(currencyDto);

        ZoneDto zoneDto = new ZoneDto();

        zoneDto.setId(charge.getZone().getId());
        zoneDto.setCode(charge.getZone().getCode());
        dto.setZone(zoneDto);

        return dto;
    }

}
