package com.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@RestController
public class DataRestControllor {

	
	@GetMapping("/data")
	@CircuitBreaker(fallbackMethod = "getDatafromDB",name ="ashokit")
	public String getDatafromRadic() {
		
		System.out.println("**** radic method() called .... ****");
	
		return "retrived data from radic";
	}
	
	public String getDatafromDB(Throwable t) {
		
		System.out.println("**** db method() called... *****");
		
		return "retrived data from DB";
	}
}
