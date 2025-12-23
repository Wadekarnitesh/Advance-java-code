package com.jsp.bimaponetomap.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class AadharCard {

	@Id
	private int id;
	private long aadharNumber;
	
	@OneToOne
	private Person person;
	
	public AadharCard() {
		// TODO Auto-generated constructor stub
	}

	public AadharCard(int id, long aadharNumber, Person person) {
		this.id = id;
		this.aadharNumber = aadharNumber;
		this.person = person;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public long getAadharNumber() {
		return aadharNumber;
	}

	public void setAadharNumber(long aadharNumber) {
		this.aadharNumber = aadharNumber;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}
	
	
	
	
}
