package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {
	
	@GetMapping("/login")
	public String login() {
		return "/login.html";
	}
	
	@GetMapping("/signin")
	public String signin() {
		return "/signin.html";
	}
	
	@GetMapping("/index")
	public String index() {
		return "/index.html";
	}
}
