package com.logistics.invoicemanagementmicroservice.services.impl;

import com.logistics.invoicemanagementmicroservice.model.Invoice;
import com.logistics.invoicemanagementmicroservice.repositories.InvoiceRepository;
import com.logistics.invoicemanagementmicroservice.services.InvoiceService;
import org.springframework.stereotype.Service;

@Service
public class InvoiceServiceImpl implements InvoiceService {

    private final InvoiceRepository invoiceRepository;

    public InvoiceServiceImpl(InvoiceRepository invoiceRepository) {
        this.invoiceRepository = invoiceRepository;
    }

    @Override
    public Invoice saveInvoice(Invoice invoice) {
        invoiceRepository.save(invoice);
        return invoice;
    }

    @Override
    public Invoice findInvoiceId(Long id) {
        return invoiceRepository.findById(id).get();
    }

    @Override
    public Invoice findInvoiceByShipmentId(Long shipmentId) {
        return invoiceRepository.findInvoiceByShipmentId(shipmentId).get();
    }

    @Override
    public void deleteInvoiceById(Long id) {
        invoiceRepository.deleteById(id);
    }

}
