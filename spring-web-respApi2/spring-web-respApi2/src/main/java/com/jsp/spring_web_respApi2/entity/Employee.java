package com.jsp.spring_web_respApi2.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employee {

	
	@Id
	private int id;
	private String name;
	private Double salary;
	private Integer yoe;
	
	private String skill;
	
	private String designation;
	
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}


	public Employee(int id, String name, Double salary, Integer yoe, String skill, String designation) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.yoe = yoe;
		this.skill = skill;
		this.designation = designation;
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


	public Double getSalary() {
		return salary;
	}


	public void setSalary(Double salary) {
		this.salary = salary;
	}


	public Integer getYoe() {
		return yoe;
	}


	public void setYoe(Integer yoe) {
		this.yoe = yoe;
	}


	public String getSkill() {
		return skill;
	}


	public void setSkill(String skill) {
		this.skill = skill;
	}


	public String getDesignation() {
		return designation;
	}


	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	
	
	
}
