package com.example.fismovieadmin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class FismovieadminApplication {

	public static void main(String[] args) {
		SpringApplication.run(FismovieadminApplication.class, args);
	}

}
