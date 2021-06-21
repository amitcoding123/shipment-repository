package com.logistics.shipmentmanagementmicroservice.restclientproxies;

import com.logistics.shipmentmanagementmicroservice.dto.ShipmentDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(name = "invoice-management-microservice")

public interface InvoiceManagementProxy {

    @PostMapping()
    public void generateInvoice(ShipmentDto shipmentDto);

}
