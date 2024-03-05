package com.ld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServerProj1Application {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServerProj1Application.class, args);
	}
}