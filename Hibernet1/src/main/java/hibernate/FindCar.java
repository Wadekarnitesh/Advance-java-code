package hibernate;



import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FindCar {

	public static void main(String[] args) {
		
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("pg");
		EntityManager em=emf.createEntityManager();
		
		Car c=em.find(Car.class, 10);
		
		System.out.println(c.getId());

		System.out.println(c.getBrand());
		System.out.println(c.getPrice());
		
		
		Query q = em.createQuery("from Car");

        List<Car> cars = q.getResultList();

        for (Car c1 : cars) {
            System.out.println(c1.getId());
            System.out.println(c1.getBrand());
            System.out.println(c1.getPrice());
            System.out.println("-------------");
        }
		
	}
}
