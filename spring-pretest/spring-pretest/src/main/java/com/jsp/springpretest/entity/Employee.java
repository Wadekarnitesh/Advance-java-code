package com.jsp.springpretest.entity;

import org.hibernate.annotations.GenericGenerator;

import com.jsp.springpretest.config.EmpCustomConfig;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Employee {

	@Id
	@GeneratedValue(generator = "custom_id")
	@GenericGenerator(name = "custom_id",type = EmpCustomConfig.class)
	private String id;

	private String name;

	private double salary;

	private String skill;

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	
	public Employee(String id, String name, double salary, String skill) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.skill = skill;
	}
	
	
	public Employee(String name, double salary, String skill) {
		this.name = name;
		this.salary = salary;
		this.skill = skill;
	}


	public String getId() {
		return id;
	}

	public void setId(String id) {
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

	public String getSkill() {
		return skill;
	}

	public void setSkill(String skill) {
		this.skill = skill;
	}

	

}
