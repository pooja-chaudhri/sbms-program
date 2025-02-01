package com.example.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailServices {

	
	 @Autowired
	    private JavaMailSender mailSender;

	    public void sendLoginSuccessEmail(String toEmail) {
	        SimpleMailMessage message = new SimpleMailMessage();
	        message.setTo(toEmail);
	        message.setSubject("Login Successful");
	        message.setText("Your login was successful!");
	        mailSender.send(message);
	    }
}
