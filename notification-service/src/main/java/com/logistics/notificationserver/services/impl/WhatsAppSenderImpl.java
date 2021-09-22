package com.logistics.notificationserver.services.impl;

import com.logistics.domain.ShipmentDto;
import com.logistics.domain.WhatsAppMessageDto;
import com.twilio.Twilio; 
import com.twilio.converter.Promoter; 
import com.twilio.rest.api.v2010.account.Message; 
import com.twilio.type.PhoneNumber; 
 
import java.net.URI; 
import java.math.BigDecimal;
import com.logistics.notificationserver.services.WhatsAppSender;

public class WhatsAppSenderImpl implements WhatsAppSender {
	
	public static final String ACCOUNT_SID = "AC1be2ce687224b0299de495963a36e18f"; 
    public static final String AUTH_TOKEN = "cf4b162348417a55bf92ef2a8d121694";
    
	@Override
	public void sendWhatsAppMessage(WhatsAppMessageDto wMessage) {
		Twilio.init(ACCOUNT_SID, AUTH_TOKEN); 
        Message message = Message.creator( 
                new com.twilio.type.PhoneNumber("whatsapp:" + wMessage.getShipperNumber()), 
                new com.twilio.type.PhoneNumber("whatsapp:+14155238886"),  
                wMessage.getMessage())      
            .create(); 
 
        System.out.println(message.getSid()); 		
	} 

	public static void main(String args[]) {
		WhatsAppSenderImpl impl = new WhatsAppSenderImpl();
		impl.sendWhatsAppMessage(null);
	}

}
