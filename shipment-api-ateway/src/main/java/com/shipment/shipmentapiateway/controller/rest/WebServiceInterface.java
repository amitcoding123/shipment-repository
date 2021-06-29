package com.shipment.shipmentapiateway.controller.rest;

import com.logistics.domain.*;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.net.URISyntaxException;
import java.util.List;

public interface WebServiceInterface {

    List<UserDto> getAllUsers() throws URISyntaxException;
    UserDto authenticate(UserDto userDto) throws URISyntaxException;
    List<ShipmentDto> findUserShipments(String userId) throws URISyntaxException;
    ShipmentDto getShipmentDetails(Long id) throws URISyntaxException;
    ShipmentDto saveShipment(ShipmentDto shipmentDto) throws URISyntaxException;
    ShipmentDto deleteShipment(Long id) throws URISyntaxException;
    ShipmentDto updateShipment(ShipmentDto shipmentDto) throws  URISyntaxException;
    ChargeDto getChargeForShipment(String country, String category, String weight, String provider) throws URISyntaxException;
    List<ItemTypeDto> getAllItemTypes() throws URISyntaxException;
    Boolean generaeOtp(String userId) throws URISyntaxException;
    Boolean validateOtp(String userId, String otp) throws URISyntaxException;
    void saveNewPassword(UserDto user) throws URISyntaxException;
    InvoiceDto retrieveInvoice(Long shipmentId) throws URISyntaxException;
    List<DSRDto> getDSRs(@PathVariable String userId) throws URISyntaxException;
    DSRDto retrieveDSR(@PathVariable Long id) throws URISyntaxException;
    void uploadDocument(MultipartFile file, String shipmentId, String type) throws URISyntaxException;
}
