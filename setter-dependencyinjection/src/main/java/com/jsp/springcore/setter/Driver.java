package com.jsp.springcore.setter;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Driver {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(Config.class);
		
		Mobile m1 = ac.getBean(Mobile.class);
	
		System.out.println(m1);
		m1.call("Jio");
		m1.call("Jio2");
	}
	
}
