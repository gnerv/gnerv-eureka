package com.gnerv.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class GnervEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(GnervEurekaApplication.class, args);
	}
}
