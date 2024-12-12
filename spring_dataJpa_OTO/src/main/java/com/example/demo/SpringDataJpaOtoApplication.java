package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringDataJpaOtoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringDataJpaOtoApplication.class, args);
		
		PersonPassportServices bean = context.getBean(PersonPassportServices.class);
		
		//bean.saveData();
		bean.getpassport();
	}

}
