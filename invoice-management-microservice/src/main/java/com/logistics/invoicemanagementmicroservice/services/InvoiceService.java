package com.logistics.invoicemanagementmicroservice.services;

import com.logistics.invoicemanagementmicroservice.model.Invoice;

public interface InvoiceService {

    public Invoice saveInvoice(Invoice invoice);
    public Invoice findInvoiceId(Long id);
    public Invoice findInvoiceByShipmentId(Long shipmentId);
    public void deleteInvoiceById(Long id);

}
