package com.jsp.springweb_mvc3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MessageController {

	
	@GetMapping("/get")
	public ModelAndView sendMessge()
	{
		ModelAndView mov = new ModelAndView();
		
		mov.addObject("name", "ram");
		mov.addObject("password", "************");
		mov.setViewName("message");

		return mov;
	}
	
}
