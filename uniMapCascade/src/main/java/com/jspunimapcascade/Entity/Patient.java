package com.jspunimapcascade.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Patient {

	@Id
	private int pid;
	
	private String name;
	
	private String diseses;
	
	public Patient() {
		// TODO Auto-generated constructor stub
	}

	public Patient(int pid, String name, String diseses) {
		super();
		this.pid = pid;
		this.name = name;
		this.diseses = diseses;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDiseses() {
		return diseses;
	}

	public void setDiseses(String diseses) {
		this.diseses = diseses;
	}
	
	
	
}
