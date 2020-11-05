package com.skillsoft.springinitilizr.controller;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

public class HelloController {
	
	@GetMapping(value = "/")
	public String index() {
		return "we've successfully used spring initializr"; 
	}
	
	@GetMapping(value = "/welcome")
	public String welcome() {
		return "welcome to spring boot";
	}
	
	@GetMapping(value = "/hello")
	public String hello() {
		return "hello spring boot!";
	}

}
