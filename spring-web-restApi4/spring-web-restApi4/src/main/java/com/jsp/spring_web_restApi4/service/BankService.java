package com.jsp.spring_web_restApi4.service;

import java.util.List;

import com.jsp.spring_web_restApi4.entity.Bank;

public interface BankService {

	public Bank save(Bank bank);
	
	public List<Bank> fetchAll();
	
	Bank getById(int id);
	
}
