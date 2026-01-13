package com.jsp.springcore.constructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {

	private Engine engine;
	public Car() {
		System.out.println("car no- arg argument..");
		}

	@Autowired
	public Car(Engine engine) {
		System.out.println("car arg argument..");
		this.engine = engine;
	}

	public void move() {
		engine.start();
		System.out.println("car is moving..");
		
	}
}
