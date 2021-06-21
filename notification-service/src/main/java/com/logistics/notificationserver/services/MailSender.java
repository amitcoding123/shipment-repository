package com.logistics.notificationserver.services;

public interface MailSender {

    public void sendMail(String email, String otp);

}
