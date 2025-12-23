package com.jsp.bionetomany.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Api {
	@Id
	private int aid;
	private String apiName;
	private String endPoint;
	
	private String version;
	
	@OneToMany(cascade = CascadeType.PERSIST)
	private List<Request> list;

	public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

	public String getApiName() {
		return apiName;
	}

	public void setApiName(String apiName) {
		this.apiName = apiName;
	}

	public String getEndPoint() {
		return endPoint;
	}

	public void setEndPoint(String endPoint) {
		this.endPoint = endPoint;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public List<Request> getList() {
		return list;
	}

	public void setList(List<Request> list) {
		this.list = list;
	}
	

	
	

}
