package com.dorinity.web;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestApiController {
	
	@Autowired
	private Environment environment;
	
	@GetMapping("/")
	public String apiTestHandler(){
		return "REST API TEST";
	}
	
	@GetMapping("/profile")
	public String showCurrentProfile(){
		return Arrays.stream(environment.getActiveProfiles())
				.findFirst()
				.orElse("default profile");
	}

	public void setEnvironment(Environment environment) {
		this.environment = environment;
	}
	
	
}
