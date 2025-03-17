package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {
        String name = "mike";
	int x = 10;
	iny y = 12;
	double z = 10.8;
	boolean isPresent = false;
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
