package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class SuperApplication {

	public static void main(String[] args) {
		SpringApplication.run(WordController.class, args);
			//SpringApplication.run(HelloWorldController.class, args);
	}

}
