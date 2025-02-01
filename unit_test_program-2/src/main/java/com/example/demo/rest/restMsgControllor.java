package com.example.demo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.MsgServices;

@Controller
public class restMsgControllor {
	
	@Autowired
	private MsgServices services;

	@GetMapping("/welcome")
	public String getWelcome() {
		String welcomeMsg = services.getWelcomeMsg();
		welcomeMsg = welcomeMsg.toLowerCase();
		return welcomeMsg;
	}
	
	@GetMapping("/greet")
	public String getGreet() {
		String greetMsg = services.getGreetMsg();
		greetMsg = greetMsg.toUpperCase();
		return greetMsg;
	}
}
