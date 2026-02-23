package com.jsp.springmvc2.controller;

import java.util.Arrays;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmployeeController {

	
	@GetMapping("/employee")
	public String empPage(Model model) {

		model.addAttribute("empName", "Amit Kulkarni");
		model.addAttribute("empId", 501);
		model.addAttribute("salary", 55000.75);
		model.addAttribute("active", true);
		model.addAttribute("technologies", Arrays.asList("Spring-MVC", "Hibernate", "MySQL", "Angular"));

		return "employee";
	}
}
