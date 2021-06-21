package com.logistics.invoicemanagementmicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.math.BigDecimal;

@SpringBootApplication
public class InvoiceManagementMicroserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(InvoiceManagementMicroserviceApplication.class, args);
    }

    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/invoice/{shipmentId}").allowedOrigins("https://dev546.d1pgp8ezqowyyb.amplifyapp.com");
                registry.addMapping("/dsrs/{userId}").allowedOrigins("https://dev546.d1pgp8ezqowyyb.amplifyapp.com");
                registry.addMapping("/dsrs/file/{id}").allowedOrigins("https://dev546.d1pgp8ezqowyyb.amplifyapp.com");
            }
        };
    }
}
