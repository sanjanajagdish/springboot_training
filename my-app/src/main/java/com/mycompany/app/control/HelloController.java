package com.mycompany.app.control;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.bind.annotation.RestController;


public class HelloController {
	(value = "/", method = RequestMethod.GET)
	public String index() {
		return "this is the main page";
	}
	
	(value = "/welcome", method = RequestMethod.GET)
	public String welcome() {
		return "welcome to spring boot!";
	}
	
	(value = "/hello", method = RequestMethod.GET)
	public String hello() {
		return "hello spring boot!";
	}
	
}

