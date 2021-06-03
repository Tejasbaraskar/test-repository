package com.zensar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class CConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CConfigServerApplication.class, args);
	}

}
