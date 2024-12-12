package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringDataJpaOtmApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringDataJpaOtmApplication.class, args);
		
		EmployeeAddressServices bean = context.getBean(EmployeeAddressServices.class);
		
		bean.saveData();
	}

}
