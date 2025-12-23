package com.qsp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class UpdateEmp {
	public static void main(String[] args) {
	
				
				try {
					Class.forName("org.postgresql.Driver");
					
					Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/qsp", "postgres", "root");
					
					Statement stm=con.createStatement();
					
					int n=stm.executeUpdate("update emp set id=80 where id=11");
					System.out.println(n);
					con.close();				} catch (ClassNotFoundException | SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}



}
