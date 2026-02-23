package com.jsp.spring_web_restApi4.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jsp.spring_web_restApi4.entity.Bank;
import com.jsp.spring_web_restApi4.service.BankService;

@Controller
@ResponseBody
public class BankController {

	@Autowired
	private BankService service;
	
	@PostMapping("/save")
	public Bank insert(@RequestBody Bank bank)
	{
		return service.save(bank);
	}
	
	@GetMapping("/fetchAll")
	public List<Bank> fetch()
	{
		return service.fetchAll();
	}
}
