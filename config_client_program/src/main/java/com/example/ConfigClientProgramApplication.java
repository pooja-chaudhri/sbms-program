package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;

@RefreshScope
@SpringBootApplication
public class ConfigClientProgramApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigClientProgramApplication.class, args);
	}

}
