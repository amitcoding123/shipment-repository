package com.logistics.usermanagementmicroservice.util;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class OTPGenerator {

    public char[] generateOtp() {
        String numbers = "0123456789";
        Random random = new Random();
        char[] otp = new char[6];
        for (int counter = 0; counter < 6; counter++) {
            otp[counter] = numbers.charAt(random.nextInt(numbers.length()));
        }
        return otp;
    }

}
