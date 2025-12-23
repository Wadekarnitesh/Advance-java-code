package com.qsp_preparedstatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class DqlStudent {
	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		try {
			Class.forName("org.postgresql.Driver");
			
			Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/qsp", "postgres", "root");
			
			PreparedStatement ps2=con.prepareStatement("select * from student");
			ResultSet rs=ps2.executeQuery();
			while(rs.next()) {
				System.out.println("id:- "+rs.getInt(1));
				System.out.println("name:- "+rs.getString(2));
				System.out.println("phone:- "+rs.getLong(3));
				System.out.println("--------------------------------------");
				System.out.println();
			}
			
			con.close();		
			
			
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}



}
