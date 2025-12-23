package hibernate;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Car {
	
	@Id
	private int id;
	private  String brand;
	private double price;
	
	public Car() {
		// TODO Auto-generated constructor stub
	}
	
	
	public void setId(int id) {
		this.id=id;
	}
	
	public void setBrand(String brand) {
		this.brand=brand;
	}
	
	public void setPrice(double price) {
		this.price=price;
	}
	
	public int  getId() {
		return id;
	}
	public String  getBrand() {
		return brand;
	}
	
	public double getPrice() {
		return price;
	}

	
}
