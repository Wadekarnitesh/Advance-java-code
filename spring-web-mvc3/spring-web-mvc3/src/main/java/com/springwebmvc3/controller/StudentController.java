package com.springwebmvc3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.springwebmvc3.entity.Student;

@Controller
public class StudentController {
	


	@GetMapping("/")
	public String get()
	{
		return "home";
	}

	
	@GetMapping("/recieve")
	public String accept(@ModelAttribute Student st) {
		System.out.println(st);
		return "home";
	}

}
