package com.jsp.RespnseEntityWithException1.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsp.RespnseEntityWithException1.entity.DriverData;
import com.jsp.RespnseEntityWithException1.repo.DriverRepo;

@Service
public class DriverServiceImplementatin implements DriverService {
	
	@Autowired
	private DriverRepo repo2;

	@Override
	public DriverData save(DriverData d) {
		return repo2.save(d);
	}

	

	

}
