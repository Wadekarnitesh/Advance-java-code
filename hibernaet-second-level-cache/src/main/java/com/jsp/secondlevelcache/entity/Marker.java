package com.jsp.secondlevelcache.entity;

import javax.persistence.Cacheable;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Cacheable
public class Marker {
	
	@Id
	private int id;
	private String color;
	private double price;
	
	public Marker() {
		// TODO Auto-generated constructor stub
	}

	public Marker(int id, String color, double price) {
		super();
		this.id = id;
		this.color = color;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public String toString()
	{
		return "[ id: "+id+" color: "+color+" price: "+price+"]";
	}
	
	

}
