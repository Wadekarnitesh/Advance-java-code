package com.jsp.unimapcascade2.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class BranchHead {

	@Id
	private int bid;
	
	private String name;
	
	private String department;
	
	private double salary;
	
	public BranchHead() {
		// TODO Auto-generated constructor stub
	}

	public BranchHead(int bid, String name, String dept, double salary) {
		this.bid = bid;
		this.name = name;
		this.department=dept;
		this.salary = salary;
	}

	public int getBid() {
		return bid;
	}

	public void setBid(int bid) {
		this.bid = bid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
}
