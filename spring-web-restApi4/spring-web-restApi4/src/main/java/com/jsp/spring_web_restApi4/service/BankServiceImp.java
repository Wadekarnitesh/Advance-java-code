package com.jsp.spring_web_restApi4.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsp.spring_web_restApi4.entity.Bank;
import com.jsp.spring_web_restApi4.exception.CustomException;
import com.jsp.spring_web_restApi4.repo.BankRepo;
@Service

public class BankServiceImp implements BankService {

	
	@Autowired
	private BankRepo repo;
	
	@Override
	public Bank save(Bank bank) {
		return repo.save(bank);
	}

	@Override
	public List<Bank> fetchAll() {
		return repo.findAll();
	}

	@Override
	public Bank getById(int id) {
		
		Optional<Bank> byId = repo.findById(id);
		if(byId.isPresent())
			return byId.get();
		
		throw new CustomException(id+ " Object not found exceptionid");
	}

}
