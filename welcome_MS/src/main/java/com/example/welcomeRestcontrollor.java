package com.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class welcomeRestcontrollor {

	@GetMapping("/")
	public String getwelcomeMsg(){
		
		String msg = "welcome to ashokit....?";
		return msg;
	}
}
