package com.example.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
	//starts the spring boot process to host the wepage
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
