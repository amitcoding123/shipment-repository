package com.logistics.usermanagementmicroservice.repositories;

import com.logistics.usermanagementmicroservice.domain.OneTimePassword;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OneTimePasswordRepository extends JpaRepository<OneTimePassword, Long> {

    public List<OneTimePassword> findByUserIdAndOtp(Long userId, String otp);

}
