package com.example.kafka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KafkaProducerApplication {

	public static void main(String[] args) {
		System.out.println("HIhihi");
		SpringApplication.run(KafkaProducerApplication.class, args);
	}

}
