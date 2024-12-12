package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class app {
	
	public static void main(String[] args) {
		
		ApplicationContext ctxt = new ClassPathXmlApplicationContext("bean.xml");
		
		ATM atm = ctxt.getBean(ATM.class);
		
		atm.withdraw();
	}

}
