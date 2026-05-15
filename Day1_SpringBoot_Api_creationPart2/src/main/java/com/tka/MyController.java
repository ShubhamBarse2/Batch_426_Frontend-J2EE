package com.tka;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	@PostMapping("/html")
	public String firstApi() {
		return "html stand for hyper text markup language ... !";
	}

	@GetMapping("/java")
	public String secondApi() {
		return "JAVA is an High level language ... !";
	}

	@PutMapping("/mysql")
	public String fourthApi() {
		return "mysql is an Relational DB ... !";
	}

	@DeleteMapping("/js")
	public String thirdApi() {
		return "js stand for JavaScpript ... !";
	}

}
