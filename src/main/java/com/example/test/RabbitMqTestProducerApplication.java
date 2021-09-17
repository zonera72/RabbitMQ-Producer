package com.example.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RabbitMqTestProducerApplication {

	public static void main(String[] args) {
		SpringApplication.run(RabbitMqTestProducerApplication.class, args);
		System.out.println("Producer");
	}

}
