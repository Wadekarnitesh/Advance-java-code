package com.jsp.scope;

import java.text.Annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Driver {
	
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext sc = new AnnotationConfigApplicationContext(Config.class);
		
		Marker m1 = sc.getBean(Marker.class);
		
	}

}
