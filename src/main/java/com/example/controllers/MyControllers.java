package com.example.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyControllers {
	
	@RequestMapping(value="/demo")
	private String homepage() {
		return "Hello world";
	}

}
