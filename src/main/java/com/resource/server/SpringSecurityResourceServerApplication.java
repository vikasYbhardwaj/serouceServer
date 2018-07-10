package com.resource.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableResourceServer
@SpringBootApplication
@RestController
public class SpringSecurityResourceServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityResourceServerApplication.class, args);
	}

	@RequestMapping(value="/api")
	//@PreAuthorize("hasRole('SYSTEMADMIN')")
	public String success() {
		return "SUCCESS";
	}
}
