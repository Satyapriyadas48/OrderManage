package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OrderManagementApplication {

	public static void main(String[] args) {
		System.out.println(args[0]);
		SpringApplication.run(OrderManagementApplication.class, args);
	}

}
