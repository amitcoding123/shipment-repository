package com.logistics.usermanagementmicroservice.services;

import com.logistics.usermanagementmicroservice.domain.OneTimePassword;

public interface OneTimePasswordService {

    public void saveOneTimePassword(OneTimePassword otp);
    public Boolean validateOtp(Long userId, String otp);

}
