package com.jsp.uniMapOneToMany2.Entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Country{

	@Id
	private int id;
	
	private String name;
	
	private String capital;
	
	@OneToMany
	private  List<Citites> list;
	
	
	public Country() {
		// TODO Auto-generated constructor stub
	}


	public Country(int id, String name, String capital, List<Citites> list) {
		super();
		this.id = id;
		this.name = name;
		this.capital = capital;
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


	public String getCapital() {
		return capital;
	}


	public void setCapital(String capital) {
		this.capital = capital;
	}


	public List<Citites> getList() {
		return list;
	}


	public void setList(List<Citites> list) {
		this.list = list;
	}
	
	
	
	
	
	
	
}
