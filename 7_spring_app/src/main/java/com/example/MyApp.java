package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

	public static void main(String[] args) {

		ApplicationContext ctxt = new ClassPathXmlApplicationContext("Beans.xml");
		
		UserServices services = ctxt.getBean(UserServices.class);
		services.AccountCreate();
	}

}
