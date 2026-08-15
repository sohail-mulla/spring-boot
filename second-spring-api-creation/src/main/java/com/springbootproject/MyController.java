package com.springbootproject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MyController {
	
	
	
	
	@GetMapping("/html")
	public String htmlAPI() {
		
		return "HTML stands for HyperText Markup Language......";
		
	}
	
	@PostMapping("/java")
	public String javaAPI() {
		
		return "Java is a good and robust Object oriented language......";
		
	}
	
	@PostMapping("/python")
	public String pythonAPI() {
		
		return "Python is one the widely used language......";
		
	}

}
