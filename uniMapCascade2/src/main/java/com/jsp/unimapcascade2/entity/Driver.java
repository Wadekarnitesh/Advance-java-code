package com.jsp.unimapcascade2.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Driver {

	@Id
	private int did;
	
	private String name;
	private String licenNumber;
	private int experience;
	
	public Driver() {
		// TODO Auto-generated constructor stub
	}

	public Driver(int did, String name, String licenNumber, int experience) {
		this.did = did;
		this.name = name;
		this.licenNumber = licenNumber;
		this.experience = experience;
	}

	public int getDid() {
		return did;
	}

	public void setDid(int did) {
		this.did = did;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLicenNumber() {
		return licenNumber;
	}

	public void setLicenNumber(String licenNumber) {
		this.licenNumber = licenNumber;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}
	
	
	
}
