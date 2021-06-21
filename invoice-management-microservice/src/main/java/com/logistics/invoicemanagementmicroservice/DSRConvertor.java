package com.logistics.invoicemanagementmicroservice;

import com.logistics.domain.DSRDto;
import com.logistics.invoicemanagementmicroservice.model.DSR;

import java.util.ArrayList;
import java.util.List;

public class DSRConvertor {

    private static DSRConvertor convertor;

    private DSRConvertor () {

    }

    public static DSRConvertor getInstance() {
        if(convertor == null)
            convertor = new DSRConvertor();
        return convertor;
    }

    public DSRDto toDSRDto(DSR dsr) {
        DSRDto dto = new DSRDto();
        dto.setId(dsr.getId());
        dto.setDsr(dsr.getDsr());
        dto.setCreatedOn(dsr.getCreatedOn());
        dto.setUserId(dsr.getUserId());

        return dto;
    }

    public List<DSRDto> toDSRDtoList(List<DSR> dsrs) {
        List<DSRDto> dtos = new ArrayList<>(1);
        for (DSR dsr: dsrs) {
            dtos.add(toDSRDto(dsr));
        }

        return dtos;
    }

}
