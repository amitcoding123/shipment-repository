package com.logistics.util.LogisticsUtility;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

public class SecurityConfig {
	
	
	public static void main (String [] args) {
		PasswordEncoder encoder = new BCryptPasswordEncoder();
		String inputString = encoder.encode("password");
		System.out.println("Encoded Passcode = " + inputString);
	}

}
