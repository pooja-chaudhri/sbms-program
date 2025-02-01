package com.example.demo.rest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.MsgServices;

@SpringBootTest
public class MsgServicesTest {
	
	@Test
	public void getWelcomeMsgTest() {
		
		MsgServices s = new MsgServices();
		
		String result = s.getWelcomeMsg();
		assertEquals(result, "welcome to ashokit");
		
	}
	
	@Test
	public void getGreetMsgTest() {
		MsgServices s = new MsgServices();
		String result = s.getGreetMsg();
		assertEquals(result,"good morning");
	}

}
