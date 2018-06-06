package com.example.coludserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ColudserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(ColudserverApplication.class, args);
	}
}
