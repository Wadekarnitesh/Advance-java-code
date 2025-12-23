package com.qsp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteEmp {

	public static void main(String[] args) {
		try {
			Class.forName("org.postgresql.Driver");
			
			Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/qsp", "postgres", "root");
			
			Statement stm=con.createStatement();
			
			int rs=stm.executeUpdate("delete from emp where id in(10,17,19)");
			System.out.println(rs);
			
	
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
