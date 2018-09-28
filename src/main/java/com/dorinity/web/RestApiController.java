package com.dorinity.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class RestApiController {
	@GetMapping("/")
	public String ApiTestHandler(){
		return "REST API TEST";
	}
}
