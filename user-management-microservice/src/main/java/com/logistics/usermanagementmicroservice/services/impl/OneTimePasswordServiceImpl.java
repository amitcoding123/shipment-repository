package com.logistics.usermanagementmicroservice.services.impl;

import com.logistics.usermanagementmicroservice.domain.OneTimePassword;
import com.logistics.usermanagementmicroservice.repositories.OneTimePasswordRepository;
import com.logistics.usermanagementmicroservice.services.OneTimePasswordService;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class OneTimePasswordServiceImpl implements OneTimePasswordService {

    private OneTimePasswordRepository repository;

    public OneTimePasswordServiceImpl(OneTimePasswordRepository repository) {
        this.repository = repository;
    }

    @Override
    public void saveOneTimePassword(OneTimePassword otp) {
        repository.save(otp);
    }

    @Override
    public Boolean validateOtp(Long userId, String otp) {
        Boolean valid = false;
        List<OneTimePassword> otps = repository.findByUserIdAndOtp(userId, otp);
        if(otps != null && otps.size() > 0) {
            otps = otps.stream().filter(password ->
                    password.getValidTill().isAfter(LocalDateTime.now())).collect(Collectors.toList());
            valid = true ? otps.size() > 0 : false;
        }
        return valid;
    }
}
