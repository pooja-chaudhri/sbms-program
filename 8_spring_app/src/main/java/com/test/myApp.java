package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.BookServices;

public class myApp {

	public static void main(String[] args) throws Exception {

		ApplicationContext ctxt = new ClassPathXmlApplicationContext("beans.xml");
		
		BookServices services = ctxt.getBean(BookServices.class);
		
		services.readdata();
		
	}

}
