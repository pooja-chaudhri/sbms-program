package com.example;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class sendMsgController {

	@GetMapping(value = "/welcome")
	public String getWelcomemsg() {
		return "welcome to ashokit";
	}
	@GetMapping(value = "/greet")
	public ResponseEntity<String> getgreetmsg() {
		
		String msg = "good morning";
		return new ResponseEntity<>(msg,HttpStatus.OK);
		
		
	}
}
