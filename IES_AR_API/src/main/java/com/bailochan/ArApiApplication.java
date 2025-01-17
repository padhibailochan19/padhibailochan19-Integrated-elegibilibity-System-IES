package com.bailochan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ArApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ArApiApplication.class, args);
	}
	
}
