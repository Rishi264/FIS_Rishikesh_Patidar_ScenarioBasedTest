package com.example.fismoviecustomer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients(value="com.example.fismoviecustomer.service")
@EnableEurekaClient
public class FismoviecustomerApplication {

	public static void main(String[] args) {
		SpringApplication.run(FismoviecustomerApplication.class, args);
	}

}
