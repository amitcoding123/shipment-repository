package com.shipment.shipmentapiateway.controller;

import com.logistics.domain.*;
import com.shipment.shipmentapiateway.controller.rest.WebServiceInterface;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.ByteArrayInputStream;
import java.net.URISyntaxException;
import java.util.Collections;
import java.util.List;

@RestController
public class ApiGatewayController {

    private WebServiceInterface webServiceInterface;

    public ApiGatewayController(WebServiceInterface webServiceInterface) {
        this.webServiceInterface = webServiceInterface;
    }

    @GetMapping("/users")
    public List<UserDto> getUsers() throws URISyntaxException {
        List<UserDto> users = webServiceInterface.getAllUsers();
        return users;
    }

    @PostMapping("/user/authenticate")
    public UserDto authenticateUser(@RequestBody UserDto user) throws URISyntaxException {
        System.out.println("In the user controller. UserId = " + user.getUserId());
        UserDto user1 = webServiceInterface.authenticate(user);
        System.out.println("API Gateway: Returning user = " + user1.getUserId());
        return user1;
    }

    @GetMapping("/otp/generate/{userId}")
    public Boolean generateOtp(@PathVariable String userId) throws URISyntaxException {
        return webServiceInterface.generaeOtp(userId);
    }

    @GetMapping("/otp/validate/{userId}/{otp}")
    public Boolean validateOtp(@PathVariable String userId, @PathVariable String otp) throws URISyntaxException {
        return webServiceInterface.validateOtp(userId, otp);
    }

    @PostMapping("/saveNewPassword")
    public void saveNewPassword(@RequestBody UserDto user) throws URISyntaxException {
        webServiceInterface.saveNewPassword(user);
    }

    @GetMapping("/shipments/user/{userId}")
    public List<ShipmentDto> getShipmentsForUser(@PathVariable String userId) throws URISyntaxException {
        return webServiceInterface.findUserShipments(userId);
    }

    @GetMapping("/shipments/{id}")
    public ShipmentDto getShipmentDetails(@PathVariable Long id) throws URISyntaxException {
        return webServiceInterface.getShipmentDetails(id);
    }

    @PostMapping("/shipments")
    public ShipmentDto saveShipment(@RequestBody ShipmentDto shipment) throws URISyntaxException {
        shipment = webServiceInterface.saveShipment(shipment);
        return shipment;
    }

    @DeleteMapping("/shipments/{id}")
    public ShipmentDto deleteShipment(@PathVariable Long id) throws URISyntaxException {
        webServiceInterface.deleteShipment(id);
        return null;
    }

    @PutMapping("/shipments")
    public ShipmentDto updateShipment(@RequestBody ShipmentDto shipment) throws URISyntaxException {
        return webServiceInterface.updateShipment(shipment);
    }

    @GetMapping("/shipments/charge/{country}/{category}/{weight}/{provider}")
    public ChargeDto getChargeForShipment(@PathVariable String country, @PathVariable String category, @PathVariable String weight, @PathVariable String provider) throws URISyntaxException {
        return webServiceInterface.getChargeForShipment(country, category, weight, provider);
    }

    @GetMapping("/shipments/itemtypes")
    public List<ItemTypeDto> getAllItemType() throws URISyntaxException {
        return webServiceInterface.getAllItemTypes();
    }

    @GetMapping("/invoice/{shipmentId}")
    public ResponseEntity<ByteArrayResource> retrieveInvoice(@PathVariable Long shipmentId) throws URISyntaxException {
        String name = "invoice_" + shipmentId + ".xslx";
        InvoiceDto invoice = webServiceInterface.retrieveInvoice(shipmentId);
        ByteArrayInputStream stream = new ByteArrayInputStream(invoice.getInvoice());
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(new MediaType("vnd.ms-excel", "force-download"));
        headers.add("Content-Disposition", "attachment; filename=" + name);
        return new ResponseEntity<>(new ByteArrayResource(invoice.getInvoice()), headers
        , HttpStatus.CREATED);
    }

    @GetMapping("/dsrs/{userId}")
    public List<DSRDto> getDSRs(@PathVariable String userId) throws URISyntaxException {
        return webServiceInterface.getDSRs(userId);
    }

    @GetMapping("/dsrs/file/{id}")
    public ResponseEntity<InputStreamResource> retrieveDSR(@PathVariable Long id) throws URISyntaxException {
        String name = "dsr_" + id + ".xslx";
        DSRDto dsr = webServiceInterface.retrieveDSR(id);
        ByteArrayInputStream stream = new ByteArrayInputStream(dsr.getDsr());
        HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Disposition", "attachment; filename=" + name);
        return ResponseEntity.ok().headers(headers).body(new InputStreamResource(stream));
    }

}
