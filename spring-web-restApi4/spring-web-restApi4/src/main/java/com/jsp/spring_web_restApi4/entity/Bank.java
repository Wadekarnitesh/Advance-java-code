package com.jsp.spring_web_restApi4.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Bank {

	@Id
	private int id;
	private String name;
	private String location;
	private String ifsc;
	private String manager;
	
	public Bank() {
		// TODO Auto-generated constructor stub
	}

	
	
	public Bank(int id, String name, String location, String ifsc, String manager) {
		this.id = id;
		this.name = name;
		this.location = location;
		this.ifsc = ifsc;
		this.manager = manager;
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

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getIfsc() {
		return ifsc;
	}

	public void setIfsc(String ifsc) {
		this.ifsc = ifsc;
	}

	public String getManager() {
		return manager;
	}

	public void setManager(String manager) {
		this.manager = manager;
	}
	
	
}
