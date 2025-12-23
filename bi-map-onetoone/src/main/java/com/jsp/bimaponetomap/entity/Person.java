package com.jsp.bimaponetomap.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Person {

	@Id 
	private int id;
	
	private String name;
	
	private int age;
	
	private String address;
	
	@OneToOne
	private AadharCard aadhar;
	public Person() {
		// TODO Auto-generated constructor stub
	}
	public Person(int id, String name, int age, String address, AadharCard aadhar) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.address = address;
		this.aadhar = aadhar;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public AadharCard getAadhar() {
		return aadhar;
	}
	public void setAadhar(AadharCard aadhar) {
		this.aadhar = aadhar;
	}
	
	
	
	
}
