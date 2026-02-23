package com.jsp.springwebmvc2.entity;

import org.hibernate.annotations.GenericGenerator;

import com.jsp.springwebmvc2.config.CustomConfig;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Student {
	
@Id
	
	@GeneratedValue(generator = "custom_id")
	@GenericGenerator(name = "custom_id",type = CustomConfig.class)
	private String id;

	private String firstName;
	private String lastName;
	private String password;

	private long phone;
	
	public Student() {
	}

	public Student( String firstName, String lastName, String password, long phone) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
		this.phone = phone;
	}

	public String getId() {
		return id;
	}

	

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}
	
	
	

}
