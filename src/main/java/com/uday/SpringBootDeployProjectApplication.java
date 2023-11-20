package com.uday;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootDeployProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDeployProjectApplication.class, args);
	}
	
	@GetMapping("/")
	public String welcome()
	{
		return "Deploy Spring Boot Application in AWS";
	}

}
