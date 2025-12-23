package hibernate;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class InsertCar {
	
	public static void main(String[] args) {
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("pg");
		
		EntityManager em=emf.createEntityManager();
		
		EntityTransaction et=em.getTransaction();
		
		Car c1=new Car();
		
		c1.setId(14);
		c1.setBrand("MARUTI");
		c1.setPrice(483934);
		
		et.begin();
		em.persist(c1);
		et.commit();
		System.out.println("inserted");
		
		
	}

}
