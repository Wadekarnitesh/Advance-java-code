package com.jsp.uniMapOneToMany1.Entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class College {

	@Id
	private int id;
	
	private String name;
	
	private String  university;
	
	@OneToMany
	private  List<Student>  list;
	
	public College() {
	}

	
	
	public College(int id, String name, String university, List<Student> list) {
		this.id = id;
		this.name = name;
		this.university = university;
		this.list = list;
	}



	public int getId() {
		return id;
	}

	
	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUniversity() {
		return university;
	}

	public void setUniversity(String university) {
		this.university = university;
	}

	public List<Student> getList() {
		return list;
	}

	public void setList(List<Student> list) {
		this.list = list;
	}
	
	
	
	
}
