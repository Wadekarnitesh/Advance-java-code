package com.qsp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class JdbcLogic {
	
	static Connection con;
	
	
	static {
		try {
			Class.forName("org.postgresql.Driver");
			
			con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/qsp","postgres","root");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public  ResultSet showData(int id) {
		
		try {
			PreparedStatement ps=con.prepareStatement("select * from register where id=?");
			
			ps.setInt(1,id);
			
		   	return ps.executeQuery();
		   	
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		    
		
		
		
		
	}
	
	public void closeConn() {
		try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public Boolean verify(int id, String pass) {
		try {
			PreparedStatement ps=con.prepareStatement("select * from register where id=? and password=?");
			
			ps.setInt(1,id);
			ps.setString(2,pass);
		    ResultSet	rs=ps.executeQuery();	
		    if(rs.next()) {
		    	return true;
		    }
			
		
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
		
		
	}
	
	
	
	public void save(int id, String name, long phone, String pass) {
		try {
			PreparedStatement ps=con.prepareStatement("insert into register values(?,?,?,?)");
			
		ps.setInt(1, id);	
		ps.setString(2, name);
		ps.setLong(3, phone);
		ps.setString(4,pass);
		ps.execute();
	
		
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
