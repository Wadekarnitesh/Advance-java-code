package com.jsp.uniMapOneTOOne.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Employee {

	@Id
	private int empId;
	
	private String name;
	
	private long phno;
	
	@OneToOne
	private AdharCard  pancard;
	
	public Employee() {
		

	}	

	public Employee(int empId, String name, long phno, AdharCard  pancard) {
		
		this.empId = empId;
		this.name = name;
		this.phno = phno;
		this.pancard = pancard;
	}



	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getPhno() {
		return phno;
	}

	public void setPhno(long phno) {
		this.phno = phno;
	}

	public AdharCard  getPancard() {
		return pancard;
	}

	public void setPancard(AdharCard  pancard) {
		this.pancard = pancard;
	}
	
	
	
	
	
	
	
	

}
