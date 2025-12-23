package com.jsp.uniMapOneToMany2.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Citites {

	@Id
	private int cId;
	private String name;
	
	private long population;
	
	public Citites() {
		// TODO Auto-generated constructor stub
	}

	public Citites(int cId, String name, long population) {
		super();
		this.cId = cId;
		this.name = name;
		this.population = population;
	}

	public int getcId() {
		return cId;
	}

	public void setcId(int cId) {
		this.cId = cId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getPopulation() {
		return population;
	}

	public void setPopulation(long population) {
		this.population = population;
	}
	
	
	
	
	
	
	
	
	
}
