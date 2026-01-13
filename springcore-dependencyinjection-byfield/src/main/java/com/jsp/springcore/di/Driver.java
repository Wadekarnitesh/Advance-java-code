package com.jsp.springcore.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Driver {

	public static void main(String[] args) {
		
		ApplicationContext ac = new AnnotationConfigApplicationContext(MyConfig.class);
		Car car = ac.getBean(Car.class);
		car.move();
	}
}
