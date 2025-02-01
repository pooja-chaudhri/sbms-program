package com.example;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class greetcontrollor {
	
	@GetMapping("/greet")
	public String getgreetmsg() {
		String msg = "good morning....";
		
		String url= "http://localhost:8081/welcome";
		
		RestTemplate rt = new RestTemplate();
		ResponseEntity<String> forEntity = rt.getForEntity(url, String.class);
		String body = forEntity.getBody();
		
		return msg+" , "+body;
	}

}
