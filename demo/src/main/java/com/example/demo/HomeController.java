package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//@RestController
public class HomeController {
	
	@RequestMapping("/")
	public String home() {
		return "home.html";
	}
}
