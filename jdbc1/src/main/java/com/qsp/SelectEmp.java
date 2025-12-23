package com.qsp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectEmp {

	public static void main(String[] args) {
		
		try {
			Class.forName("org.postgresql.Driver");
			
			Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/qsp", "postgres", "root");
			
			Statement stm=con.createStatement();
			
			ResultSet rs=stm.executeQuery("select * from emp");
			int ct=1;
			while(rs.next()) {
				System.out.println("row "+ct++);
				System.out.println("id- "+rs.getInt("id"));
				System.out.println("name- "+rs.getString("name"));
				System.out.println("salary- "+rs.getDouble("sal"));
				System.out.println("Phone no- "+rs.getLong("phno"));
				System.out.println();
			}
	
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	

}
