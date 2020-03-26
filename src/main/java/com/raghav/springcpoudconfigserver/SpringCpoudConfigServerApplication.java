package com.raghav.springcpoudconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class SpringCpoudConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCpoudConfigServerApplication.class, args);
	}

}
