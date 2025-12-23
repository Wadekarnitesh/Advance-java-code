package com.jsp.bimaponetoone2.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Citizen {
	@Id
	private int cid;
	private String name;
	
	private String address;
	
	private String nationality;
	@OneToOne
	private VoterID voter;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public VoterID getVoter() {
		return voter;
	}
	public void setVoter(VoterID voter) {
		this.voter = voter;
	}
	
	
	

}
