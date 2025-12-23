package com.jsp.uniMapManyToOne.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Colleges {

	@Id
	private int cid;
	
	private String name;
	
	private String loc;
	
	@ManyToOne
	private  University university;
	
	public Colleges() {
		// TODO Auto-generated constructor stub
	}

	public Colleges(int cid, String name, String loc, University university) {
		super();
		this.cid = cid;
		this.name = name;
		this.loc = loc;
		this.university = university;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

	public University getUniversity() {
		return university;
	}

	public void setUniversity(University university) {
		this.university = university;
	}
	
	
	
}
