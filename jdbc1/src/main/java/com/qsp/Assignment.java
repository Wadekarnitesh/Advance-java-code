package com.qsp;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Assignment {
	
	static Scanner sc=new Scanner(System.in);
	
	static Connection con;
	static 	PreparedStatement ps;
	static  {
		try {
			con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/jsp", "postgres", "root");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	
	public static void insertProduct() throws SQLException {
		
		ps=con.prepareStatement("insert into product values(?,?,?)");
		System.out.println("enter a id : ");
		 ps.setInt(1, sc.nextInt());
		 System.out.println("enter a product name : ");
	        ps.setString(2, sc.next());
	        System.out.println("enter a price :");
	        ps.setDouble(3, sc.nextDouble());
	        ps.execute();
	        System.out.println("Product inserted");
		
		
	}
	

	public static void deleteProduct()throws SQLException {
		System.out.println(" select a delet Option : ");
		System.out.println(" 1.   delete by Id ");
		System.out.println(" 2.  delete by product name ");
		System.out.println(" 3.  delete by product price ");
		switch (sc.nextInt()) {
		case 1:{
			System.out.println("Enter a Id: ");
			int id1=sc.nextInt();
			 ps=con.prepareStatement("delete from product where pid=?");
			ps.setInt(1,id1);
			int s=ps.executeUpdate();
			if(s>0) {
				System.out.println(" product deleted sucessfully. ");
			}
			break;
		}
		case 2:{
			System.out.println("Enter a name: ");
			String n1=sc.next();
			 ps=con.prepareStatement("delete from product where pname=?");
			ps.setString(1, n1);
			int s=ps.executeUpdate();
			if(s>0) {
				System.out.println(" product deleted sucessfully. ");
			}	
			break;
		}
		
		case 3:{
			System.out.println("Enter a price: ");
			double d1=sc.nextDouble();
			 ps=con.prepareStatement("delete from product where price=?");
			ps.setDouble(1, d1);
			int s=ps.executeUpdate();
			if(s>0) {
				System.out.println(" product deleted sucessfully. ");
			}
			
					
			break;
		}
			
	

		default:
		{
			System.out.println("Invalid delete opertion..");
			break;
		}
		}
		
		
	}
	
//	public static void findById() throws SQLException{
//		
//		
//		ps=con.prepareStatement("select * from product where pid=?");
//		System.out.println("enetr a ID: ");
//		ps.setInt(1,  sc.nextInt());
//		
//		ResultSet rs=ps.executeQuery();
//		while(rs.next()) {
//			System.out.println();
//			System.out.println("product id: "+rs.getInt(1));
//			System.out.println("product name: "+rs.getString(2));
//			System.out.println("product price: "+rs.getDouble(3));
//			System.out.println("-------------------------------------------------");
//		}
//		
//	}
	
public static void findBy() throws SQLException{
		
		System.out.println("find by :");
		System.out.println("1. ID");
		System.out.println("2. Name");
		int i=sc.nextInt();
		if(i==1) {
				ps=con.prepareStatement("select * from product where pid=?");
				System.out.println("enetr a ID: ");
				ps.setInt(1,  sc.nextInt());
				
				ResultSet rs=ps.executeQuery();
				while(rs.next()) {
					System.out.println();
					System.out.println("product id: "+rs.getInt(1));
					System.out.println("product name: "+rs.getString(2));
					System.out.println("product price: "+rs.getDouble(3));
					System.out.println("-------------------------------------------------");
				}
		}
		else {
				
				ps=con.prepareStatement("select * from product where pname=?");
				System.out.println("enetr a name: ");
				ps.setString(1, sc.next());
				
				ResultSet rs=ps.executeQuery();
				while(rs.next()) {
					System.out.println();
					System.out.println("product id: "+rs.getInt(1));
					System.out.println("product name: "+rs.getString(2));
					System.out.println("product price: "+rs.getDouble(3));
					System.out.println("-------------------------------------------------");
				}
				
			}
		
			
		}
	
	
	
	public static void findAll()throws SQLException {
		
		Statement sm=con.createStatement();
		ResultSet rs=sm.executeQuery("select * from product");
		while(rs.next()) {
			System.out.println();
			System.out.println("product id: "+rs.getInt(1));
			System.out.println("product name: "+rs.getString(2));
			System.out.println("product price: "+rs.getDouble(3));
			System.out.println("-------------------------------------------------");
		}
		
	}
	
	
	
	

	public static void main(String[] args) throws SQLException{
		
 
		try {
			
			
			for(; ; ) {
				System.out.println("Choose  a option : ");
				System.out.println("1. insert Product  ");
				System.out.println("2. delete product by id ");
				System.out.println("3. find a product ");
				System.out.println("4. findAll prodct ");
				
				switch (sc.nextInt()) {
				case 1:{
					insertProduct();
					break;
				}
				case 2:{
					deleteProduct();
					break;
				}
				case 3:{
					findBy();
					break;
				}
					
				case 4:{
					findAll();
					break;
				}
				default:{
					System.out.println("Invalid option..");
					break;
				}
					
				}
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally {
			con.close();
		}
	}
	
	
}
