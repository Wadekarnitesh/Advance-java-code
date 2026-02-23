package com.jsp.spring_web_restApi4.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.spring_web_restApi4.entity.Bank;

public interface BankRepo  extends JpaRepository<Bank, Integer>{

}
