package com.logistics.invoicemanagementmicroservice;

import com.logistics.domain.DSRDto;
import com.logistics.domain.InvoiceDto;
import com.logistics.invoicemanagementmicroservice.model.DSR;
import com.logistics.invoicemanagementmicroservice.model.Invoice;

import java.util.ArrayList;
import java.util.List;

public class InvoiceConvertor {

    private static InvoiceConvertor convertor;

    private InvoiceConvertor () {

    }

    public static InvoiceConvertor getInstance() {
        if(convertor == null)
            convertor = new InvoiceConvertor();
        return convertor;
    }

    public InvoiceDto toInvoiceDto(Invoice invoice) {
        InvoiceDto dto = new InvoiceDto();
        dto.setId(invoice.getId());
        dto.setInvoice(invoice.getInvoice());
        dto.setShipmentId(invoice.getShipmentId());
        return dto;
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
