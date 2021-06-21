package com.logistics.invoicemanagementmicroservice.controllers;

import com.logistics.domain.InvoiceDto;
import com.logistics.domain.ShipmentDto;
import com.logistics.invoicemanagementmicroservice.InvoiceConvertor;
import com.logistics.invoicemanagementmicroservice.dto.DSRDto;
import com.logistics.invoicemanagementmicroservice.helpers.DSRExcelHelper;
import com.logistics.invoicemanagementmicroservice.helpers.InvoiceExcelHelper;
import com.logistics.invoicemanagementmicroservice.model.DSR;
import com.logistics.invoicemanagementmicroservice.model.Invoice;
import com.logistics.invoicemanagementmicroservice.services.DSRService;
import com.logistics.invoicemanagementmicroservice.services.InvoiceService;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.time.LocalDate;
import java.util.Collections;
import java.util.List;

@RestController
public class InvoiceController {

    private InvoiceExcelHelper invoiceExcelHelper;
    private InvoiceService invoiceService;
    private DSRExcelHelper dsrExcelHelper;
    private DSRService dsrService;

    public InvoiceController(InvoiceExcelHelper invoiceExcelHelper, InvoiceService invoiceService, DSRExcelHelper dsrExcelHelper, DSRService dsrService) {
        this.invoiceExcelHelper = invoiceExcelHelper;
        this.invoiceService = invoiceService;
        this.dsrExcelHelper = dsrExcelHelper;
        this.dsrService = dsrService;
    }

    @PostMapping("/invoice")
    public String generateInvoice(@RequestBody ShipmentDto shipmentDto) {
        ByteArrayOutputStream invoiceBytes = invoiceExcelHelper.generateInvoice(shipmentDto);
        Invoice invoice = new Invoice();
        invoice.setShipmentId(shipmentDto.getId());
        invoice.setInvoice(invoiceBytes.toByteArray());
        invoice = invoiceService.saveInvoice(invoice);
        return "ok";
    }

    @PostMapping("/dsr")
    public String createDSR(@RequestBody List<DSRDto> dsr) {
        ByteArrayInputStream dsrBytes = null;
        dsrBytes = dsrExcelHelper.generateDSR(dsr);
        DSR data = new DSR();
        data.setDsr(dsrBytes.readAllBytes());
        data.setUserId(dsr.get(0).getUserId());
        data.setCreatedOn(LocalDate.now());
        data = dsrService.saveDSR(data);
        return "ok";
    }

    @GetMapping("/invoice/{shipmentId}")
    public InvoiceDto retrieveInvoice(@PathVariable Long shipmentId) {
        Invoice invoice = invoiceService.findInvoiceByShipmentId(shipmentId);
        InvoiceDto dto = InvoiceConvertor.getInstance().toInvoiceDto(invoice);
        return dto;
    }

    @GetMapping("/dsrs/file/{id}")
    public com.logistics.domain.DSRDto retrieveDSR(@PathVariable Long id) {
        com.logistics.domain.DSRDto dsr = InvoiceConvertor.getInstance().toDSRDto(dsrService.findById(id));
        return dsr;
    }

    @GetMapping("/dsrs/{userId}")
    public List<com.logistics.domain.DSRDto> getDSRs(@PathVariable String userId) {
        List<DSR> list = dsrService.getDSRsForUser(userId);
        Collections.sort(list);
        List<com.logistics.domain.DSRDto> list1 = InvoiceConvertor.getInstance().toDSRDtoList(list);
        return list1;
    }

}
