package com.skillsoft.springinitilizr.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MessageController {
	
	@GetMapping(value = "/home")
	public String index() {
		return "home";
	}
}