package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
	@RequestMapping("/hi")
	public String doHi(Model model) {
		model.addAttribute("welcome", "Hello Spring Boot!");
		return "hi";
	}
}
