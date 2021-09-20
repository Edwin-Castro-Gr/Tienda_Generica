package com.co.edu.unibosque;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
public class PasswordEncoder {

	public static void main(String[] args) {
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		String rawPassword = "admin123456";
		String encondePassword = encoder.encode(rawPassword);
		
		System.out.println(encondePassword);
	}

}
