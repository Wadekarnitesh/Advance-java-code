package com.jsp.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeControllers {

	
//	@GetMapping("/home")
//	public String get()
//	{
//		System.out.println("Home controller");
//		return "home";
//	}
	
	@GetMapping("/home")
	public String get(Model model)
	{
		
		model.addAttribute("username", "postgres");
		model.addAttribute("password", "root");
		return "home";
	}
}
