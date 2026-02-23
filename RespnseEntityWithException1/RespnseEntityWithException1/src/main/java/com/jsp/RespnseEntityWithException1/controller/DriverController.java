package com.jsp.RespnseEntityWithException1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.RespnseEntityWithException1.entity.DriverData;
import com.jsp.RespnseEntityWithException1.service.DriverService;

@RestController
public class DriverController {
	
	@Autowired
	private DriverService service;
	
	@PostMapping("/save")
	public ResponseEntity<DriverData> insert(@RequestBody DriverData d)
	{
		return new ResponseEntity<>(service.save(d), HttpStatusCode.valueOf(201));
	}

}
