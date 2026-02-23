package com.jsp.springwebmvc1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

	
	@GetMapping("/form")
	public String get()
	{
		return "home";
	}
	
	@GetMapping("/read") //used inside form action
	public String recieve( @RequestParam("name") String name,@RequestParam("password") String password 
			,@RequestParam("email") String email,@RequestParam("age") int age) 
	{
		
		System.out.println("name: "+name);
		System.out.println("pass: "+password);
		System.out.println("age "+age);
		System.out.println("email: "+email);
		return "hello";
	}
	
}
