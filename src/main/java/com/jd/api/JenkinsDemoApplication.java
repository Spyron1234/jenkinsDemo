package com.jd.api;

import javax.annotation.PostConstruct;

import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinsDemoApplication {
	
	@PostConstruct
	public void init() {
		LoggerFactory.getLogger(JenkinsDemoApplication.class).info("Application started");
	}

	public static void main(String[] args) {
		LoggerFactory.getLogger(JenkinsDemoApplication.class).info("Application execution starts");
		SpringApplication.run(JenkinsDemoApplication.class, args);
	}

}
