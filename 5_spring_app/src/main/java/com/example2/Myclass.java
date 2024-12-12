package com.example2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.Restaurant;

public class Myclass {

	public static void main(String[] args) {

		ApplicationContext ctxt = new ClassPathXmlApplicationContext("spring_bean.xml");
		
		Restaurant restaurant = ctxt.getBean(Restaurant.class);
		
		restaurant.bill();
		
	}

}
