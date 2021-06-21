package com.logistics.usermanagementmicroservice.controllers;

import com.logistics.usermanagementmicroservice.domain.OneTimePassword;
import com.logistics.usermanagementmicroservice.domain.User;
import com.logistics.usermanagementmicroservice.services.OneTimePasswordService;
import com.logistics.usermanagementmicroservice.services.UserService;
import com.logistics.usermanagementmicroservice.util.OTPGenerator;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.net.URISyntaxException;
import java.time.LocalDateTime;

@RestController
public class ForgotPasswordController {

    private OTPGenerator otpGenerator;
    private UserService userService;
    private OneTimePasswordService otpService;

    public ForgotPasswordController(OTPGenerator otpGenerator, UserService userService, OneTimePasswordService otpService) {
        this.otpGenerator = otpGenerator;
        this.otpService = otpService;
        this.userService = userService;
    }

    @GetMapping("/otp/generate/{userId}")
    public Boolean generateOtp(@PathVariable String userId) {
        char[] otp = otpGenerator.generateOtp();
        LocalDateTime currentTime = LocalDateTime.now();
        LocalDateTime validTill = currentTime.plusMinutes(5);
        OneTimePassword oneTimePassword = new OneTimePassword();
        User user = userService.retrieveUser(userId);
        oneTimePassword.setOtp(String.valueOf(otp));
        oneTimePassword.setValidTill(validTill);
        oneTimePassword.setUser(user);
        otpService.saveOneTimePassword(oneTimePassword);
        try {
            sendMail(user.getEmail(), oneTimePassword.getOtp());
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
        return true;
    }

    @GetMapping("/otp/validate/{userId}/{otp}")
    public Boolean validateOtp(@PathVariable String userId, @PathVariable String otp) throws Exception {
        User user = userService.retrieveUser(userId);
        Boolean valid = otpService.validateOtp(user.getId(), otp);
        if(!valid)
            throw new Exception("OTP Invaid");
        return valid;
    }

    private void sendMail(String email, String otp) throws URISyntaxException {
        RestTemplate template = new RestTemplate();
        URI uri = new URI("http://localhost:8400//mail//sender//" + email + "//" + otp);
        template.getForEntity(uri, Boolean.class);
    }
}
