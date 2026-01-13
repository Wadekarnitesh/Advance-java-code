package com.jsp.compositekay.entity;

import java.time.LocalDate;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class Employee {

	private String name;
	private double salary;
	
	private LocalDate date;
	
	@EmbeddedId
	private CompositeId kay;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(String name, double salary, LocalDate date, CompositeId kay) {
		this.name = name;
		this.salary = salary;
		this.date = date;
		this.kay = kay;
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

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public CompositeId getKay() {
		return kay;
	}

	public void setKay(CompositeId kay) {
		this.kay = kay;
	}
	
	

	
}
