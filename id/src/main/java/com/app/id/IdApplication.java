package com.app.id;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@SpringBootApplication
public class IdApplication {
@GetMapping("/welcome")
	public String welcome()
	{
		return"welcome to main";
	}
	public static void main(String[] args) {
		SpringApplication.run(IdApplication.class, args);
	}

}
