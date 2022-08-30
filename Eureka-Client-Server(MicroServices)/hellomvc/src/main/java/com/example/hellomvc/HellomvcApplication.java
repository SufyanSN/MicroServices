package com.example.hellomvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class HellomvcApplication {

	public static void main(String[] args) {
		SpringApplication.run(HellomvcApplication.class, args);
	}

}
