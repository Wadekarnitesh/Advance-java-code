package com.qsp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateTable {
	
	public static void main(String[] args) {
		
		try {
			Class.forName("org.postgresql.Driver");
		
			Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/qsp", "postgres", "root");
			
			Statement stm = con.createStatement();
			
			boolean b = stm.execute("CREATE TABLE STUDENT2 (ID integer, NAME character varying)");
			System.err.println(b);
			
			con.close();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
}
