package com.jsp.uniMapManyToOne.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class University {

	@Id
	private int uid;
	
	private String name;
	
	private String uLoc;
	
	public University() {
		// TODO Auto-generated constructor stub
	}

	public University(int uid, String name, String uLoc) {
		super();
		this.uid = uid;
		this.name = name;
		this.uLoc = uLoc;
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getuLoc() {
		return uLoc;
	}

	public void setuLoc(String uLoc) {
		this.uLoc = uLoc;
	}
	
	
	
}

