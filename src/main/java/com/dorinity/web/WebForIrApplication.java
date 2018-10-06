package com.dorinity.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class WebForIrApplication {

	private static final String APPLICATION_LOCATIONS =
			"classpath:application.yml,"
			+ "classpath:application.properties,"
			+ "/application/config/real-application.yml";
	
	public static void main(String[] args) {
		new SpringApplicationBuilder(WebForIrApplication.class)
		.properties(APPLICATION_LOCATIONS)
		.run(args);
	}
}
