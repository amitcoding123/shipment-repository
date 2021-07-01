package com.shipment.shipmentapiateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class ShipmentApiAtewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShipmentApiAtewayApplication.class, args);
    }

    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
//                registry.addMapping("/user/authenticate").allowedOrigins("https://dev546.d1pgp8ezqowyyb.amplifyapp.com");
//                registry.addMapping("/user/authenticate/{userId}/{password}").allowedOrigins("https://dev546.d1pgp8ezqowyyb.amplifyapp.com");
//                registry.addMapping("/otp/generate/{userId}").allowedOrigins("https://dev546.d1pgp8ezqowyyb.amplifyapp.com");
//                registry.addMapping("/otp/validate/{userId}/{otp}").allowedOrigins("https://dev546.d1pgp8ezqowyyb.amplifyapp.com");
//                registry.addMapping("/saveNewPassword").allowedOrigins("https://dev546.d1pgp8ezqowyyb.amplifyapp.com");
//                registry.addMapping("/shipments/user/{userId}").allowedOrigins("https://dev546.d1pgp8ezqowyyb.amplifyapp.com");
//                registry.addMapping("/shipments/itemtypes").allowedOrigins("https://dev546.d1pgp8ezqowyyb.amplifyapp.com");
//                registry.addMapping("/shipments").allowedOrigins("https://dev546.d1pgp8ezqowyyb.amplifyapp.com").allowedMethods("POST", "PUT");
//                registry.addMapping("/shipments/{id}").allowedOrigins("https://dev546.d1pgp8ezqowyyb.amplifyapp.com").allowedMethods("GET", "DELETE");
//                registry.addMapping("/shipments/charge/{country}/{category}/{weight}/{provider}").allowedMethods("GET");
//                registry.addMapping("/invoice/{shipmentId}").allowedOrigins("https://dev546.d1pgp8ezqowyyb.amplifyapp.com");
//                registry.addMapping("/dsrs/{userId}").allowedOrigins("https://dev546.d1pgp8ezqowyyb.amplifyapp.com");
//                registry.addMapping("/dsrs/file/{id}").allowedOrigins("https://dev546.d1pgp8ezqowyyb.amplifyapp.com");
                registry.addMapping("/user/authenticate").allowedOrigins("http://localhost:4200");
                registry.addMapping("/user/authenticate/{userId}/{password}").allowedOrigins("http://localhost:4200");
                registry.addMapping("/otp/generate/{userId}").allowedOrigins("http://localhost:4200");
                registry.addMapping("/otp/validate/{userId}/{otp}").allowedOrigins("http://localhost:4200");
                registry.addMapping("/saveNewPassword").allowedOrigins("http://localhost:4200");
                registry.addMapping("/shipments/user/{userId}/{currentPage}/{pageSize}").allowedOrigins("http://localhost:4200");
                registry.addMapping("/shipments/itemtypes").allowedOrigins("http://localhost:4200");
                registry.addMapping("/shipments").allowedOrigins("http://localhost:4200").allowedMethods("POST", "PUT");
                registry.addMapping("/shipments/{id}").allowedOrigins("http://localhost:4200").allowedMethods("GET", "DELETE");
                registry.addMapping("/shipments/charge/{country}/{category}/{weight}/{provider}").allowedMethods("GET");
                registry.addMapping("/invoice/{shipmentId}").allowedOrigins("http://localhost:4200");
                registry.addMapping("/dsrs/{userId}").allowedOrigins("http://localhost:4200");
                registry.addMapping("/dsrs/file/{id}").allowedOrigins("http://localhost:4200");
                registry.addMapping("/uploadFile").allowedOrigins("http://localhost:4200").allowedMethods("POST");
                registry.addMapping("/bulkUpdate").allowedOrigins("http://localhost:4200").allowedMethods("POST");
            }
        };
    }

}
