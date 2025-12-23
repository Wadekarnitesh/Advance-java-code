package com.qsp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDriver {
	public static void main(String[] args) {
		
		try {
			//1
			Class.forName("org.postgresql.Driver");
			System.out.println("Class loadaed");
			
			//2
			Connection conn=DriverManager.getConnection("jdbc:postgresql://localhost:5432/qsp","postgres", "root");
			System.out.println("db found");
			
			//3
			Statement stm=conn.createStatement();
			
			//4
			boolean b=stm.execute("insert into student values(45,'vishal')");
			System.out.println(b);
			
			//5
			conn.close();
		
			
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println("class not found");
		}
	}

}
