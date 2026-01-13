package com.jsp.hql_assignment.driver;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.hql_assignment.entity.Devloper;

public class DevloperDrivr {

	static EntityManager em = Persistence.createEntityManagerFactory("pg").createEntityManager();
	static EntityTransaction et = em.getTransaction();
	static Scanner sc = new Scanner(System.in);

	public static void insertDevloper() {
		Devloper d1 = new Devloper();
		System.out.print("Enter id of devloper:");
		d1.setId(sc.nextInt());
		System.out.print("Enter name of devloper:");
		d1.setName(sc.next());
		System.out.println("Enter Gender of devloper:");
		d1.setGender(sc.next());
		System.out.print("Enter salary of devloper:");
		d1.setSalary(sc.nextDouble());
		System.out.println("Enter skill of devloper:");
		d1.setSkill(sc.next());
		et.begin();

		em.persist(d1);
		et.commit();
		System.out.println("Data Inserted Sucsessfully!!");

	}

	public static void updateNameById() {
		et.begin();
		Query query = em.createQuery("UPDATE Devloper d set d.name=:name WHERE d.id=:id");

		System.out.println("Enter a name");
		query.setParameter("name", sc.next());
		System.out.println("Enter a id:");

		query.setParameter("id", sc.nextInt());
		query.executeUpdate();

		et.commit();
		System.out.println("Upadte successfully!!");

	}

	public static void updateGenderById() {
		et.begin();
		Query query = em.createQuery("UPDATE Devloper d set d.gender=:gen WHERE d.id=:id");
		System.out.println("Enter a Gender:");
		query.setParameter("gen", sc.next());
		System.out.println("Enter a id:");

		query.setParameter("id", sc.nextInt());
		query.executeUpdate();

		et.commit();
		System.out.println("Gender Upadte successfully!!");

	}

	public static void updateSalaryById() {
		et.begin();
		Query query = em.createQuery("UPDATE Devloper d set d.salary=:sal WHERE d.id=:id");
		System.out.println("Enter a salary:");
		query.setParameter("sal", sc.nextDouble());
		System.out.println("Enter a id:");

		query.setParameter("id", sc.nextInt());
		query.executeUpdate();

		et.commit();
		System.out.println("Salary Upadte successfully!!");

	}

	public static void updateNameAndGenderById() {
		System.out.println("Enter a ID:");
		int id = sc.nextInt();
		et.begin();
		Query query = em.createQuery("UPDATE Devloper d SET d.name=:name, d.gender=:gen WHERE d.id=:id");
		System.out.println("Enter a name:");
		query.setParameter("name", sc.next());
		System.out.println("Enter a Gender:");
		query.setParameter("gen", sc.next());
		query.setParameter("id", id);
		query.executeUpdate();

		et.commit();

		System.out.println("Name And Gender Update SucessFully..");

	}

	public static void allDevloper() {

		Query query = em.createQuery("from Devloper");
		List<Devloper> list = query.getResultList();
		list.forEach(System.out::println);

	}

	public static void deleteAllDevloper() {
		et.begin();
		Query query = em.createQuery("delete From Devloper");
		query.executeUpdate();
		et.commit();
		System.out.println("Delete All Data SuccessFully...");

	}

	public static void deleteOneDevloper() {
		et.begin();
		Query query = em.createQuery("delete from Devloper d Where d.id=:id");
		System.out.println("Enter a id to delete Devloper:");
		query.setParameter("id", sc.nextInt());
		int n = query.executeUpdate();
		et.commit();

		if (n > 0) {
			System.out.println("Delete sucessfull");
		} else {
			System.out.println("Devloper not Delete");
		}

	}

	public static void displayDevloper() {
		System.out.println("Enter a Id:");

		Devloper devloper = em.find(Devloper.class, sc.nextInt());

		System.out.println(devloper);

	}

	public static void main(String[] args) {

		loop: for (;;) {
			System.out.println();
			System.out.println(
					"---------------------------- WELCOME DEVLOPER PROFILE -----------------------------------");

			System.out.println(" 1  Insert new Devloper data  ");
			System.out.println(" 2  Upadate Devloper  name by id  ");
			System.out.println(" 3  Upadate Devloper  gender by id  ");
			System.out.println(" 4  Upadate Devloper  salary by id   ");
			System.out.println(" 5  Upadate Devloper  name and gender  by id  ");
			System.out.println(" 6  Delete All Devloper Data  ");
			System.out.println(" 7  Delete one Devloper Data  ");
			System.out.println(" 8  Display All Devloper Data  ");
			System.out.println(" 9  Display one devloper data  ");
			System.out.println(" 10 Exit ");

			System.out.println();
			System.out.print("  Select Option : ");

			switch (sc.nextInt()) {
			case 1: {
				insertDevloper();
				break;
			}
			case 2: {
				updateNameById();
				break;
			}
			case 3: {
				updateGenderById();
				break;

			}
			case 4: {
				updateSalaryById();
				break;
			}

			case 5: {
				updateNameAndGenderById();
				break;
			}
			case 6: {
				System.out.println("You Want TO Delete All Devloper ?");
				System.out.println(" 1: yes");
				System.out.println(" 2: No");

				switch (sc.nextInt()) {
				case 1: {
					deleteAllDevloper();
					break;
				}

				case 2: {
					continue loop;
				}

				default: {
					System.out.println("Invalid OPtion");
				}

				}
				break;

			}
			case 7: {
				deleteOneDevloper();
				break;
			}
			case 8: {
				allDevloper();
				break;
			}
			case 9: {
				displayDevloper();
				break;
			}
			case 10: {
				System.out.println("You want to Stop CRUD Opration: ");
				System.out.println(" 1 yes");
				System.out.println(" 2 NO ");
				System.out.print("Option: ");
				switch (sc.nextInt()) {

				case 1: {
					System.out.println("Thank you !!");
					em.close();
					sc.close();
					break loop;
				}

				default:
					continue loop;

				}
			}

			default: {
				System.out.println("Invlid Option..");
			}
			}

		}

	}

}
