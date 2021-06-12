package com.SpringBoot.GreetingApplication.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greeting")
public class GreetingController {
	
	@Value("${greeting-name: Mirage}")
	private String nameString;
	
	@Value("${greeting-coffee: ${greeting-name} is drinking coffee}")
	private String coffee;
	
	@GetMapping
	String getGreeting() {
		return nameString;
	}
	
	@GetMapping("/coffee")
	String getNameAndCoffee() {
		return coffee;
	}
}