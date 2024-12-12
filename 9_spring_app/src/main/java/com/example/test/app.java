package com.example.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.BookServices;

public class app{
	
	public static void main(String[] args) throws Exception {
		
		ApplicationContext ctxt = new ClassPathXmlApplicationContext("beans.xml");
		
		BookServices bean = ctxt.getBean(BookServices.class);
		
		bean.generate();
		
	
		
		
	}
}