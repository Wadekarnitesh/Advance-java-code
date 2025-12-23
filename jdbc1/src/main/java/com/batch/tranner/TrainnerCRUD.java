package com.batch.tranner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class TrainnerCRUD {
	
	static Connection con;
	static ResultSet rs ;
	static Scanner sc=new Scanner(System.in);
	static {
		try {
			Class.forName("org.postgresql.Driver");
			
			con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/qsp","postgres","root");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	
	public static void insert()  throws SQLException{
		
		PreparedStatement ps=con.prepareStatement("insert into trainner values (?,?,?,?)");
		
		System.out.println("Enter Id,  Name,  phone number, salary -");
		ps.setInt(1, sc.nextInt());
		ps.setString(2, sc.next());
		ps.setLong(3, sc.nextLong());
		ps.setDouble(4, sc.nextDouble());
		
		
		ps.execute();
	
		System.out.println("values Inserted");
	}
	public static void update() throws SQLException {
	    System.out.println("----------- UPDATE TRAINER DETAILS -----------");
	    System.out.println("1 :- Update ID");
	    System.out.println("2 :- Update Name");
	    System.out.println("3 :- Update Phone Number");
	    System.out.println("4 :- Update Salary");
	    System.out.print("Enter your choice: ");

	    int ch = sc.nextInt();
	    PreparedStatement ps = null;

	    switch (ch) {
	        case 1: {
	            System.out.print("Enter old ID: ");
	            int o = sc.nextInt();
	            System.out.print("Enter new ID: ");
	            int n = sc.nextInt();

	            ps = con.prepareStatement("UPDATE trainner SET id=? WHERE id=?");
	            ps.setInt(1, n);
	            ps.setInt(2, o);
	            break;
	        }
	        case 2: {
	            System.out.print("Enter trainer ID: ");
	            int id = sc.nextInt();
	            System.out.print("Enter new name: ");
	            String n = sc.next();

	            ps = con.prepareStatement("UPDATE trainner SET name=? WHERE id=?");
	            ps.setString(1, n);
	            ps.setInt(2, id);
	            break;
	        }
	        case 3: {
	            System.out.print("Enter trainer ID: ");
	            int id = sc.nextInt();
	            System.out.print("Enter new phone number: ");
	            long n = sc.nextLong();

	            ps = con.prepareStatement("UPDATE trainner SET phno=? WHERE id=?");
	            ps.setLong(1, n);
	            ps.setInt(2, id);
	            break;
	        }
	        case 4: {
	            System.out.print("Enter trainer ID: ");
	            int id = sc.nextInt();
	            System.out.print("Enter new salary: ");
	            double n= sc.nextDouble();

	            ps = con.prepareStatement("UPDATE trainner SET sal=? WHERE id=?");
	            ps.setDouble(1, n);
	            ps.setInt(2, id);
	            break;
	        }
	    }

	}


	
	public static void delele() throws SQLException {
		PreparedStatement ps=con.prepareStatement("delete from trainner where ?=?");
		
		System.out.println("1:- delele by Id");
		System.out.println("2:- delele by name");
		System.out.println("3:- delele by phone number");
		
		
		switch (sc.nextInt()) {
		case 1:{
			ps.setString(1,"id");
		}

		default:
			break;
		}
	}
	
	
	public static void fetchAll() throws SQLException {
		
		Statement sm=con.createStatement();
		ResultSet rs=sm.executeQuery("select * from trainner");
		
		while (rs.next()) {
		       
	        System.out.println("ID: " +rs.getInt(1));
	        System.out.println("Name: " +rs.getString(2));
	        System.out.println("Phone: " +rs.getLong(3));
	        System.out.println("Salary: " +rs.getDouble(4));
	        System.out.println("-----------------------------------------------");
	    }
	}
	
	public static void fetch() throws SQLException {
	    String col = null;
	    System.out.println("1:- Show trainner by Id:-");
	    System.out.println("2:- Show trainner by name:-");
	    System.out.println("3:- Show trainner by phno:-");
	    System.out.println("4:- Show trainner by salary:-");

	    int choice = sc.nextInt();

	    switch (choice) {
	        case 1: {
	            col = "id";
	            System.out.println("Enter a id:");
	            PreparedStatement ps = con.prepareStatement("select * from trainner where " + col + "=?");
	            ps.setInt(1, sc.nextInt());
	            rs = ps.executeQuery();
	            print();
	            break;
	        }

	        case 2: {
	            col = "name";
	            System.out.println("Enter a name:");
	            PreparedStatement ps = con.prepareStatement("select * from trainner where " + col + "=?");
	            ps.setString(1, sc.next());
	            rs = ps.executeQuery();
	            print();
	            break;
	        }

	        case 3: {
	            col = "phno";
	            System.out.println("Enter a phone number:");
	            PreparedStatement ps = con.prepareStatement("select * from trainner where " + col + "=?");
	            ps.setLong(1, sc.nextLong());
	            rs = ps.executeQuery();
	            print();
	            break;
	        }

	        case 4: {
	            col = "sal";
	            System.out.println("Enter a salary:");
	            PreparedStatement ps = con.prepareStatement("select * from trainner where " + col + "=?");
	            ps.setDouble(1, sc.nextDouble());
	            rs = ps.executeQuery();
	            print();
	            break;
	        }

	        default:
	            System.out.println("Invalid choice!");
	    }
	}

	static void print() throws SQLException {
	  
	    while (rs.next()) {
	       
	        System.out.println("ID: " +rs.getInt(1));
	        System.out.println("Name: " +rs.getString(2));
	        System.out.println("Phone: " +rs.getLong(3));
	        System.out.println("Salary: " +rs.getDouble(4));
	        System.out.println("-----------------------------------------------");
	    }
	  
	}

	public static void main(String[] args) {
		
		try {	
			for(;;) {
				System.out.println();
				System.out.println("------------- WELCOME IN TRAINNER TABLE ------------------");
				System.out.println("  Choose a option for :- ");
				System.out.println("1 :- Insert Trainner Data");
				System.out.println("2 :- Update Trainner Data");
				System.out.println("3 :-  show All trainers.");
				System.out.println("4 :-  show perticular Trainner Data .");
		
				switch (sc.nextInt()) {
				case 1:{
					insert();
					break;
				}
					
				case 2:{
					update();
					break;
				}
				case 3 :{
					fetchAll();
					break;
				}
				
				case 4:{
					fetch();
					break;
				}
					
				
			}
				System.out.println();
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}
