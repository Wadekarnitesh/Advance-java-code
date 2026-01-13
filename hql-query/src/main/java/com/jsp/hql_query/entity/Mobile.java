package com.jsp.hql_query.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Mobile {

	@Id
	private int id;
	
	private String brand;
	
	private double price;
	
	public Mobile() {
		// TODO Auto-generated constructor stub
	}

	public Mobile(int id, String brand, double price) {
		this.id = id;
		this.brand = brand;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public String toString()
	{
		return "[ ID: "+id+" BRAND: "+brand+" PRICE: "+price+"]";
	}
	
}
