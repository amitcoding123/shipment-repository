package com.logistics.notificationserver.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.logistics.domain.WhatsAppMessageDto;
import com.logistics.notificationserver.services.WhatsAppSender;

@RestController
public class WhatsAppMessageController {
	
	WhatsAppSender service;
	
	public WhatsAppMessageController(WhatsAppSender service) {
		super();
		this.service = service;
	}



	@GetMapping("/whatsapp")
	public Boolean whatsApp(WhatsAppMessageDto dto) {
		service.sendWhatsAppMessage(dto);
		return Boolean.TRUE;
	}

}
