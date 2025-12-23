package com.jspunimapcascade.Entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Doctor {

	@Id
	private int did;
	private String name;
	
	private String specialist;
	
	@OneToMany(cascade = CascadeType.ALL)
	 private List<Patient> list;
	
	public Doctor() {
		// TODO Auto-generated constructor stub
	}

	public Doctor(int did, String name, String specialist, List<Patient> list) {
		super();
		this.did = did;
		this.name = name;
		this.specialist = specialist;
		this.list = list;
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

	public String getSpecialist() {
		return specialist;
	}

	public void setSpecialist(String specialist) {
		this.specialist = specialist;
	}

	public List<Patient> getList() {
		return list;
	}

	public void setList(List<Patient> list) {
		this.list = list;
	}
	
	
}
