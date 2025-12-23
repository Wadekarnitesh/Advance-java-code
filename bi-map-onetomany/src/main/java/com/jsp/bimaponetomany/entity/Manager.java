package com.jsp.bimaponetomany.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Manager {

	@Id
	private int id;
	private String name;
	private double salary;
	@OneToMany
	private List<TeamLeader> list;
	
	public Manager() {
		// TODO Auto-generated constructor stub
	}

	public Manager(int id, String name, double salary, List<TeamLeader> list) {
		this.id = id;
		this.name = name;
		this.salary = salary;
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

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public List<TeamLeader> getList() {
		return list;
	}

	public void setList(List<TeamLeader> list) {
		this.list = list;
	}
	
	
	
	
}
