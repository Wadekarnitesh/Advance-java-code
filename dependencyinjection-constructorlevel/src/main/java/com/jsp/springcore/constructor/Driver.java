package com.jsp.springcore.constructor;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Driver {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(Config.class);
		
		Car car = ac.getBean(Car.class);
		car.move();
	}
}
