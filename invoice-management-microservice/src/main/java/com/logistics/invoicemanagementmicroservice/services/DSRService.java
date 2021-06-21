package com.logistics.invoicemanagementmicroservice.services;

import com.logistics.invoicemanagementmicroservice.model.DSR;
import com.logistics.invoicemanagementmicroservice.model.Invoice;

import java.util.List;

public interface DSRService {

    DSR saveDSR(DSR dsr);
    List<DSR> getDSRsForUser(String userId);
    DSR findById(Long id);
}
