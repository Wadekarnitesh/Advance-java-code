package com.jsp.springcore.primary_qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Car {
	@Autowired
	@Qualifier(value = "petrol")
	private Engine engine;
	
	public void move() {
		engine.start();
		System.out.println("Car is Moving..");
		
	}

}
