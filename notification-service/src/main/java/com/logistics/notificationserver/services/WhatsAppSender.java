package com.logistics.notificationserver.services;

import com.logistics.domain.WhatsAppMessageDto;

public interface WhatsAppSender {
	
	public void sendWhatsAppMessage(WhatsAppMessageDto message);

}
