package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@SpringBootApplication
public class HelloFreemarkerApplication {
	public static void main(String[] args) {
		SpringApplication.run(HelloFreemarkerApplication.class, args);
	}

}
