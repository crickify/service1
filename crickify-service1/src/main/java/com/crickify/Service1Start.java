package com.crickify;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@SpringBootApplication
@EnableDiscoveryClient
public class Service1Start {
	
	public static void main(String[] args) {
		SpringApplication.run(Service1Start.class, args);
	}

}
