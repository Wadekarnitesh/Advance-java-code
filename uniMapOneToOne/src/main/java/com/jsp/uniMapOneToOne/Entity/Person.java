package com.jsp.uniMapOneToOne.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Person {

	@Id
	private int id;
	
	private String name;
	
	private int age;
	
	private String Country;
	
	@OneToOne
	private Passport passport;
	
	
	public Person() {
		// TODO Auto-generated constructor stub
	}


	public Person(int id, String name, int age, String country, Passport passport) {
		this.id = id;
		this.name = name;
		this.age = age;
		Country = country;
		this.passport = passport;
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


	public String getCountry() {
		return Country;
	}


	public void setCountry(String country) {
		Country = country;
	}


	public Passport getPassport() {
		return passport;
	}


	public void setPassport(Passport passport) {
		this.passport = passport;
	}
	
	
	
}
