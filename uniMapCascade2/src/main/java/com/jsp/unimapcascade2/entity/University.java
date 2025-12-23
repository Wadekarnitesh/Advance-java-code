package com.jsp.unimapcascade2.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class University {
	
	@Id
	private int uid;
	
	private String uName;
	
	private String loc;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<College> college;
	
	public University() {
		// TODO Auto-generated constructor stub
	}

	public University(int uid, String uName, String loc, List<College> college) {
		this.uid = uid;
		this.uName = uName;
		this.loc = loc;
		this.college = college;
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getuName() {
		return uName;
	}

	public void setuName(String uName) {
		this.uName = uName;
	}

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

	public List<College> getCollege() {
		return college;
	}

	public void setCollege(List<College> college) {
		this.college = college;
	}
	
	

}
