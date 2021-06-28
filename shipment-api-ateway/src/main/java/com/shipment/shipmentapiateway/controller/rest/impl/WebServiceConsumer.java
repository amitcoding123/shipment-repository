package com.shipment.shipmentapiateway.controller.rest.impl;

import com.logistics.domain.*;
import com.shipment.shipmentapiateway.controller.rest.WebServiceInterface;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Arrays;
import java.util.List;

@Service
public class WebServiceConsumer implements WebServiceInterface {

    private static final String userEndPoint;

//    private static String userEndPoint = "http://localhost:8081/";

    private static final String shipmentEndPoint;
    private static final String invoiceEndPoint;

    static {
//        userEndPoint = "http://ec2-65-2-130-228.ap-south-1.compute.amazonaws.com:8081/";
//        shipmentEndPoint = "http://ec2-65-2-130-228.ap-south-1.compute.amazonaws.com:8100/";
        userEndPoint = "http://localhost:8081/";
        shipmentEndPoint = "http://localhost:8100/";
        invoiceEndPoint = "http://localhost:8200/";
    }

    @Override
    public List<UserDto> getAllUsers() throws URISyntaxException {
        RestTemplate restTemplate = new RestTemplate();
        URI uri = new URI(userEndPoint + "users");
        ResponseEntity<UserDto[]> response = restTemplate.getForEntity(uri, UserDto[].class);
        UserDto[] users = response.getBody();
        System.out.println(Arrays.toString(users));
        return Arrays.asList(users);
    }

    @Override
    public UserDto authenticate(UserDto userDto) throws URISyntaxException {
        RestTemplate restTemplate = new RestTemplate();
        URI uri = new URI(userEndPoint + "user/authenticate");
        return restTemplate.postForObject(uri, userDto, UserDto.class);
    }

    @Override
    public List<ShipmentDto> findUserShipments(String userId) throws URISyntaxException {
        RestTemplate restTemplate = new RestTemplate();
        URI uri = new URI(shipmentEndPoint + "shipments/user/" + userId);
        ResponseEntity<ShipmentDto[]> response = restTemplate.getForEntity(uri, ShipmentDto[].class);
        ShipmentDto[] shipments = response.getBody();
        return Arrays.asList(shipments);
    }

    @Override
    public ShipmentDto getShipmentDetails(Long id) throws URISyntaxException {
        RestTemplate restTemplate = new RestTemplate();
        URI uri = new URI(shipmentEndPoint + "shipments/" + id);
        ShipmentDto shipmentDto = restTemplate.getForObject(uri, ShipmentDto.class);
        return shipmentDto;
    }

    @Override
    public ShipmentDto saveShipment(ShipmentDto shipmentDto) throws URISyntaxException {
        RestTemplate restTemplate = new RestTemplate();
        URI uri = new URI(shipmentEndPoint + "shipments");
        return restTemplate.postForObject(uri, shipmentDto, ShipmentDto.class);
    }

    @Override
    public ShipmentDto deleteShipment(Long id) throws URISyntaxException {
        RestTemplate restTemplate = new RestTemplate();
        URI uri = new URI(shipmentEndPoint + "shipments/" + id);
        restTemplate.delete(uri);
        return null;
    }

    @Override
    public ShipmentDto updateShipment(ShipmentDto shipmentDto) throws URISyntaxException {
        RestTemplate restTemplate = new RestTemplate();
        URI uri = new URI(shipmentEndPoint + "shipments");
        restTemplate.put(uri, shipmentDto);
        return shipmentDto;
    }

    @Override
    public ChargeDto getChargeForShipment(String country, String category, String weight, String provider) throws URISyntaxException {
        RestTemplate restTemplate = new RestTemplate();
        URI uri = new URI(shipmentEndPoint + "shipments/charge/" + country + "/" + category + "/" + weight + "/" + provider);
        return restTemplate.getForObject(uri, ChargeDto.class);
    }

    @Override
    public List<ItemTypeDto> getAllItemTypes() throws URISyntaxException {
        RestTemplate restTemplate = new RestTemplate();
        URI uri = new URI(shipmentEndPoint + "shipments/itemtypes");
        ResponseEntity<ItemTypeDto[]> response = restTemplate.getForEntity(uri, ItemTypeDto[].class);
        ItemTypeDto[] itemTypeDtos = response.getBody();
        return Arrays.asList(itemTypeDtos);
    }

    @Override
    public Boolean generaeOtp(String userId) throws URISyntaxException {
        RestTemplate restTemplate = new RestTemplate();
        URI uri = new URI(userEndPoint + "otp/generate/" + userId);
        return restTemplate.getForEntity(uri, Boolean.class).getBody();
    }

    @Override
    public Boolean validateOtp(String userId, String otp) throws URISyntaxException {
        RestTemplate restTemplate = new RestTemplate();
        URI uri = new URI(userEndPoint + "otp/validate/" + userId + "/" + otp);
        return restTemplate.getForEntity(uri, Boolean.class).getBody();
    }

    @Override
    public void saveNewPassword(UserDto user) throws URISyntaxException {
        RestTemplate restTemplate = new RestTemplate();
        URI uri = new URI(userEndPoint + "saveNewPassword");
        restTemplate.postForLocation(uri, user);
    }

    @Override
    public InvoiceDto retrieveInvoice(Long shipmentId) throws URISyntaxException {
        RestTemplate restTemplate = new RestTemplate();
        URI uri = new URI(invoiceEndPoint + "invoice/" + shipmentId);
        return restTemplate.getForEntity(uri, InvoiceDto.class).getBody();
    }

    @Override
    public List<DSRDto> getDSRs(String userId) throws URISyntaxException {
        RestTemplate restTemplate = new RestTemplate();
        URI uri = new URI(invoiceEndPoint + "dsrs/" + userId);
        ResponseEntity<DSRDto[]> response = restTemplate.getForEntity(uri, DSRDto[].class);
        DSRDto[] dtos = response.getBody();
        return Arrays.asList(dtos);
    }

    @Override
    public DSRDto retrieveDSR(Long id) throws URISyntaxException {
        RestTemplate restTemplate = new RestTemplate();
        URI uri = new URI(invoiceEndPoint + "dsrs/file/" + id);
        return restTemplate.getForEntity(uri, DSRDto.class).getBody();
    }

}
