package com.jsp.uniMapOneToMany1.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {

	@Id
	private int sId;
	
	private String name;
	
	private String branch;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	
	
	public Student(int sId, String name, String branch) {
		this.sId = sId;
		this.name = name;
		this.branch = branch;
	}



	public int getsId() {
		return sId;
	}

	public void setsId(int sId) {
		this.sId = sId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}
	
	
	
}
