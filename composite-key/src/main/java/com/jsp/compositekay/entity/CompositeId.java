package com.jsp.compositekay.entity;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable

public class CompositeId  implements Serializable{

	private int id;
	private String status;
	public CompositeId() {
		// TODO Auto-generated constructor stub
	}
	public CompositeId(int id, String status) {
		this.id = id;
		this.status = status;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
	
	
}
