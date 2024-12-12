package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.entity.employee;
import com.example.demo.repo.EmpRepo;

@SpringBootApplication
public class SpringDataJpa1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringDataJpa1Application.class, args);
		
		EmpRepo bean = context.getBean(EmpRepo.class);
		System.out.println("impclass ::" +bean.getClass().getName());
		
		employee e = new employee();
		
		e.setEmpId(102);
		e.setEmpName("jany");
		e.setEmpsal(500.6);
		
		bean.save(e);
		
	}

}
