package com.jsp.springcore.driver;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jsp.springcore.College;
import com.jsp.springcore.Config;

public class Driver {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(Config.class);
//		College c = ac.getBean(College.class);
		
	}

}
