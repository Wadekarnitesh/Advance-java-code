package com.jsp.springmvc.controller;

import java.util.Arrays;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

	
	@GetMapping("/index")
	public String get(Model model)
	{
		System.out.println("index page is loading..");
		model.addAttribute("name", "Nitesh Raju Wadekar");
		model.addAttribute("subject", Arrays.asList("Java","SQL","React","CSS"));
		model.addAttribute("add", "At. Post Pune");
		
		
		return "index";
	}
	
}
