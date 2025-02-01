package com.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class msgControllor {

	@Value("${msg}")
	private String msg;
	
	@GetMapping("/")
	public String getmsg() {
		return msg;
	}
}
