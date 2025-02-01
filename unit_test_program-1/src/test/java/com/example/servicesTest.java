package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class servicesTest {
	
	@Test
	public void additionTest() {
		services s = new services();
		
		int actual = s.addition(5, 5);
		int excepted = 10;
		
		assertEquals(actual, excepted);
		
	}

}
