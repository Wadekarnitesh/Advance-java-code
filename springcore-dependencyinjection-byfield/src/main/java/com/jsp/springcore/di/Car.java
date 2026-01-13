package com.jsp.springcore.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {
	
	@Autowired
	private Engine engine;
	
	public void move()
	{
		engine.start();
		System.out.println("Car is Moving...");
	}

}
