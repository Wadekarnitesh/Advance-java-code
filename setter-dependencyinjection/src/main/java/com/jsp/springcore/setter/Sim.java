package com.jsp.springcore.setter;

import org.springframework.stereotype.Component;

@Component
public class Sim {

	public Sim() {
		System.out.println("SIM obj are created..");
	}
	
	public void active(String sim) {
		System.out.println(sim+" is active..");
		
	}
	

}
