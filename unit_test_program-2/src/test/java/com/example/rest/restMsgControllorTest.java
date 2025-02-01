package com.example.rest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.example.demo.MsgServices;
import com.example.demo.rest.restMsgControllor;

@WebMvcTest(restMsgControllor.class)
public class restMsgControllorTest {
	
	@MockitoBean
	private MsgServices services;
	
	@Autowired
	private MockMvc mockmvc;
	
	@Test
	public void testWelcome() throws Exception{
		
       when(services.getWelcomeMsg()).thenReturn("Welcome to");
		
		MockHttpServletRequestBuilder reqbilder = MockMvcRequestBuilders.get("/welcome");
		
		MvcResult result = mockmvc.perform(reqbilder).andReturn();
		MockHttpServletResponse response = result.getResponse();
		
		int actualResponse = response.getStatus();
		int exceptedResponse = 200;
		
		assertEquals(actualResponse, exceptedResponse);
	}
	
	@Test
    public void testGetGreet() throws Exception {
        
		when(services.getGreetMsg()).thenReturn("Good Afternoon");
		
		MockHttpServletRequestBuilder builder = MockMvcRequestBuilders.get("/greet");
		
		MvcResult result = mockmvc.perform(builder).andReturn();
		MockHttpServletResponse response = result.getResponse();
		int actual = response.getStatus();
		int excepted = 200;
		assertEquals(actual, excepted);
       
	}

		
	}
	
	


