package com.logistics.invoicemanagementmicroservice.services.impl;

import com.logistics.invoicemanagementmicroservice.model.DSR;
import com.logistics.invoicemanagementmicroservice.repositories.DSRRepository;
import com.logistics.invoicemanagementmicroservice.services.DSRService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DSRServiceImpl implements DSRService {

    private DSRRepository repository;

    public DSRServiceImpl(DSRRepository repository) {
        this.repository = repository;
    }

    @Override
    public DSR saveDSR(DSR dsr) {
        DSR dsr1 = repository.save(dsr);
        return dsr1;
    }

    @Override
    public List<DSR> getDSRsForUser(String userId) {
        List<DSR> dsrs = repository.findByUserId(userId);
        return dsrs;
    }

    @Override
    public DSR findById(Long id) {
        return repository.findById(id).get();
    }
}
