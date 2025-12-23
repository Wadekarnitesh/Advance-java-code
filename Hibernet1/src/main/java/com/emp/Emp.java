package com.emp;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Emp {

	@Id
	private int empId;
	private String name;
	private double salary;
	private long phno;

	public Emp() {
		// TODO Auto-generated constructor stub
	}

	public void setEmpId(int i) {
		this.empId = i;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSalary(double sal) {
		this.salary = sal;
	}

	public void setPhno(long phno) {
		this.phno = phno;
	}

	public int getEmpId() {
		return empId;
	}

	public String getEmpName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}

	public long getPhno() {
		return phno;
	}

	public String toString() {
		return "[ Emp Id: " + empId + " Name: " + name + " salary: " + salary + " Phone No: " + phno + "]";
	}

}
