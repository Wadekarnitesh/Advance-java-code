package com.jsp.springdatajpah2.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Mobile {
	
	@Id
	 private int id;
	private String name;
	
	public Mobile() {
		// TODO Auto-generated constructor stub
	}

	public Mobile(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
	
	

}
