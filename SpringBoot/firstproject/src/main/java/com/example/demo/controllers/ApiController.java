package com.example.demo.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {
	
	public ApiController() {
		
	}
	
	@RequestMapping("/option/1")
	public String option1() {
		return "option 1 request mapping";
	}
}
