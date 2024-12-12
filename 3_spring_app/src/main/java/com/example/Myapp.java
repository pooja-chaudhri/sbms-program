package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Myapp {

	public static void main(String[] args) {

		ApplicationContext ctxt = new ClassPathXmlApplicationContext("string_bean.xml");
		
		Car car = ctxt.getBean(Car.class);
		
		car.drive();
		
	}

}
