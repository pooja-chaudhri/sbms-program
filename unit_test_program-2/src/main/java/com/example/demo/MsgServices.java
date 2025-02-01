package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class MsgServices {
	
	
	public String getWelcomeMsg() {
		return "welcome to ashokit";
	
	}
	public String getGreetMsg() {
		return "good morning";
	}

}
