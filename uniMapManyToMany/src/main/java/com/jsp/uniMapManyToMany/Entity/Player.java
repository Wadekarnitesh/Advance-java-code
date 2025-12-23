package com.jsp.uniMapManyToMany.Entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Player {

	@Id
	private int pid;
	
	private String name;
	
	private String gender;
	
	@ManyToMany
	private List<Sport> list;
	
	public Player() {
		// TODO Auto-generated constructor stub
	}

	public Player(int pid, String name, String gender, List<Sport> list) {
		super();
		this.pid = pid;
		this.name = name;
		this.gender = gender;
		this.list = list;
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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public List<Sport> getList() {
		return list;
	}

	public void setList(List<Sport> list) {
		this.list = list;
	}
	
	
	
}
