package com.qsp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertEmp {
	public static void main(String[] args) {
		
		try {
			Class.forName("org.postgresql.Driver");
			
			Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/qsp", "postgres", "root");
			
			Statement stm=con.createStatement();
			
			int rs=stm.executeUpdate("insert into emp values(11,'nitesh',45656.00,9322456789), (16,'vijay',69000.00,8765456789), (19,'kiran',61233.00,922897777)");
			System.out.println(rs);
			
	
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
