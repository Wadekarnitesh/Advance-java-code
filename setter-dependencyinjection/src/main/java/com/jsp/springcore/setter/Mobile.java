package com.jsp.springcore.setter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Mobile {
	
	private Sim sim;
	public Mobile() {

		System.out.println("MOblie Object are created..");
	}
	@Autowired
	public void setSim(Sim sim) {
		this.sim = sim;
	}
	
	public void call( String name) {
		sim.active(name);
		System.out.println("Mobile is calling...");
	}
	
	

	
	
	

}
