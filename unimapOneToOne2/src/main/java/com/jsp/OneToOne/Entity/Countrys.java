package com.jsp.OneToOne.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
@Entity
public class Countrys {

	@Id
	private int countryId;
	
	private String countryName;
	
	@OneToOne
	private PrimeMinister primeMinister;
	
	public Countrys() {
		// TODO Auto-generated constructor stub
	}

	public Countrys(int countryId, String countryName, PrimeMinister primeMinister) {
		this.countryId = countryId;
		this.countryName = countryName;
		this.primeMinister = primeMinister;
	}

	public int getCountryId() {
		return countryId;
	}

	public void setCountryId(int countryId) {
		this.countryId = countryId;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public PrimeMinister getPrimeMinister() {
		return primeMinister;
	}

	public void setPrimeMinister(PrimeMinister primeMinister) {
		this.primeMinister = primeMinister;
	}
	
	
	
	
	
	
}
