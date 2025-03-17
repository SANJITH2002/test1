package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {
        
	int x = 10;
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
