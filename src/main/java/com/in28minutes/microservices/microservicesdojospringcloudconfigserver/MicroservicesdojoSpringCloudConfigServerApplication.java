package com.in28minutes.microservices.microservicesdojospringcloudconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class MicroservicesdojoSpringCloudConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicesdojoSpringCloudConfigServerApplication.class, args);
	}

}
