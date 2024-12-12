package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.services.UserServices;

@SpringBootApplication
public class SpringDataJpa2Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringDataJpa2Application.class, args);
		
		UserServices bean = context.getBean(UserServices.class);
		
		//bean.saveuser();
		//bean.deleteAll();
		//bean.saveUsers();
		//bean.finduser();
		//bean.countUser();
		bean.findid();
		
	}

}
