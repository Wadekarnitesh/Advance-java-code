package com.jsp.mvcproductpages.entity;

import org.hibernate.annotations.GenericGenerator;

import com.jsp.mvcproductpages.config.CustomProdIdConfig;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Product {
	@Id
	@GeneratedValue(generator = "prod_id")
	@GenericGenerator(name = "prod_id",type = CustomProdIdConfig.class)
	private String id;
	private String name;
	
	private String img;
	
	private double price;
	
	
	
	public Product() {
		// TODO Auto-generated constructor stub
	}


	public Product(String name, String img, double price) {
		this.name = name;
		this.img = img;
		this.price = price;
	}


	public Product(String id, String name, String img, double price) {
		this.id = id;
		this.name = name;
		this.img = img;
		this.price = price;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getImg() {
		return img;
	}


	public void setImg(String img) {
		this.img = img;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", img=" + img + ", price=" + price + "]";
	}
	
	
	

}
