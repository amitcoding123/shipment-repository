package com.logistics.usermanagementmicroservice.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Component
public class PasswordManager {
	
	private BCryptPasswordEncoder encoder;
	
	public PasswordManager() {
		super();
		this.encoder = new BCryptPasswordEncoder();
	}
	
	public Boolean comparePassword(String input, String raw) {
		System.out.println("Raw Password " +  raw);
		System.out.println("input Password " +  input);
		Boolean result = encoder.matches(raw, input);
		System.out.println("result " +  result);
		System.out.println("Encoded again " +  encoder.encode(raw));
		return encoder.matches(raw, input);
	}
	
}
