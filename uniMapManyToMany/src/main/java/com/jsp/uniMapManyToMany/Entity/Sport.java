package com.jsp.uniMapManyToMany.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Sport {

	@Id
	private int sid;
	
	private String sportName;
	private int teamSize;
	
	public Sport() {
		// TODO Auto-generated constructor stub
	}

	public Sport(int sid, String sportName, int teamSize) {
		super();
		this.sid = sid;
		this.sportName = sportName;
		this.teamSize = teamSize;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSportName() {
		return sportName;
	}

	public void setSportName(String sportName) {
		this.sportName = sportName;
	}

	public int getTeamSize() {
		return teamSize;
	}

	public void setTeamSize(int teamSize) {
		this.teamSize = teamSize;
	}
	
	
}
