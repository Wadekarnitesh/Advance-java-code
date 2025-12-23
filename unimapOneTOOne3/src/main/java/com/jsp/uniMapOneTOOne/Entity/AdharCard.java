package com.jsp.uniMapOneTOOne.Entity;


import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class AdharCard {
	
	@Id
	private String panNumber;
	private String name;
	private String dob;
	
	
	public AdharCard () {
		// TODO Auto-generated constructor stub
	}

	public AdharCard (String panNumber, String name, String dob) {
		this.panNumber = panNumber;
		this.name = name;
		this.dob = dob;
	}

	public String getPanNumber() {
		return panNumber;
	}

	public void setPanNumber(String panNumber) {
		this.panNumber = panNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	
	
	

}