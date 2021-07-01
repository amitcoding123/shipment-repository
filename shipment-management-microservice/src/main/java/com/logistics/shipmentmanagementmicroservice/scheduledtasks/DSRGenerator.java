package com.logistics.shipmentmanagementmicroservice.scheduledtasks;

import com.logistics.shipmentmanagementmicroservice.domain.Shipment;
import com.logistics.shipmentmanagementmicroservice.dto.DSRDto;
import com.logistics.shipmentmanagementmicroservice.dto.ShipmentDto;
import com.logistics.shipmentmanagementmicroservice.dto.UserDto;
import com.logistics.shipmentmanagementmicroservice.dto.UserDtoList;
import com.logistics.shipmentmanagementmicroservice.services.ShipmentService;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class DSRGenerator {

    private ShipmentService shipmentService;

    public DSRGenerator(ShipmentService shipmentService) {
        this.shipmentService = shipmentService;
    }

    @Scheduled(cron = "0 0 22 * * *")
    public void generateDSR() throws URISyntaxException{
        List<UserDto> users = getUsers();
        System.out.println(users);
        //For each user get shipments and generate DSR
        for (UserDto user: users) {
            List<Shipment> shipments = shipmentService.getTodaysShipmentsForUser(user.getUserId());
            if(shipments != null && shipments.size() > 0) {
                List<DSRDto> dsr = new ArrayList<>();
                for (Shipment shipment: shipments) {
                    DSRDto dto = new DSRDto();
                    dto.setBookingDate(shipment.getModifiedOn().toLocalDate());
                    dto.setAwbNumber(shipment.getInvoiceNumber());
                    dto.setConsigneeName(shipment.getConsignee().getName());
                    dto.setPurchaseCost(shipment.getFrieghtCharge().doubleValue());
                    dto.setSellingCost(shipment.getSellingCost());
                    dto.setShipperName(shipment.getShipper().getName());
                    dto.setWeight(shipment.getActualWeight().compareTo(shipment.getBoxWeight()) > -1 ? shipment.getActualWeight().toPlainString() : shipment.getBoxWeight().toPlainString());
                    dto.setUserId(user.getUserId());
                    dto.setTrackingNumber(String.valueOf(shipment.getTrackingNumber()));
                    dsr.add(dto);
                }

                createDSR(dsr);
            }
        }
    }

    private List<UserDto> getUsers() throws URISyntaxException {
        RestTemplate template = new RestTemplate();
        URI uri = new URI("http://localhost:8081//users");
        ResponseEntity<UserDto[]> response = template.getForEntity(uri, UserDto[].class);
        UserDto[] users = response.getBody();
        System.out.println(users);
        return Arrays.asList(users);
    }

    private void createDSR(List<DSRDto> dsr) throws URISyntaxException {
        RestTemplate template = new RestTemplate();
        URI uri = new URI("http://localhost:8200//dsr");
        template.postForEntity(uri, dsr, String.class);
    }

}
