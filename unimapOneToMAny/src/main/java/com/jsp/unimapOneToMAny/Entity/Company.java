package com.jsp.unimapOneToMAny.Entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Company {
	@Id
	private int id;
	
	private String name;
	private String loc;
	

	@OneToMany
	List<Employee> list;
	
	public Company() {
		// TODO Auto-generated constructor stub
	}

	
	public Company(int id, String name, String loc, List<Employee> list) {
		this.id = id;
		this.name = name;
		this.loc = loc;
		this.list = list;
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

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

	public List<Employee> getList() {
		return list;
	}

	public void setList(List<Employee> list) {
		this.list = list;
	}
	
	
	

}
