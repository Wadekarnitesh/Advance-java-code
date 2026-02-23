package com.jsp.springdatajpah2;


import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.jsp.springdatajpah2.entity.Mobile;
import com.jsp.springdatajpah2.repo.Mobilerepo;

@SpringBootApplication
public class Springdatajpah2Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(Springdatajpah2Application.class, args);
		
		Mobilerepo bean = run.getBean(Mobilerepo.class);
		
		Mobile m1 = new Mobile(3,"apple");
		Mobile m2 = new Mobile(2,"mi");
		
		
		bean.saveAll(Arrays.asList(m1,m2));
		
				
		
		
	}

}
