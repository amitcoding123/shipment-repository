package com.logistics.notificationserver.controllers;

import com.logistics.notificationserver.services.MailSender;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MailSenderController {

    private MailSender mailSender;


    public MailSenderController(MailSender mailSender) {
        this.mailSender = mailSender;
    }

    @GetMapping("/mail/sender/{email}/{otp}")
    public Boolean sendMail(@PathVariable String email, @PathVariable String otp) {
        Boolean sent = true;
        mailSender.sendMail(email, otp);
        return sent;
    }

}
