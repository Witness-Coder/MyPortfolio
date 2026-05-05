package com.example.portfolio.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PortfolioController {
	 
	@GetMapping("")
	public String home() {
		return "home";
	}
	
	@GetMapping("/contact")
	public String contact() {
		return "contact";
	}
	
	@GetMapping("/about")
	public String about() {
	    return "about";
	}
	
	@GetMapping("/projects")
	public String proj() {
	    return "projects";
	}
}
