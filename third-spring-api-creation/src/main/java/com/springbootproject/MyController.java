package com.springbootproject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	@GetMapping("/html")
	String firstapi() {

		return "HTML stands for Hypertext Markup Language ";
	}

	@PostMapping("/css")
	String secondapi() {

		return "CSS stands for cascading style sheets ";
	}

	@GetMapping("/javascript")
	String thirdapi() {

		return "Javascript is the most widely used language ";
	}
}
