package com.jsp.springcore.primary_qualifier;

import org.springframework.stereotype.Component;

@Component(value =  "petrol")
public class PetrolEngine implements Engine {

	 @Override
	public void start() {

		 System.out.println("Petrol Engine startd...");
	}
	

}
