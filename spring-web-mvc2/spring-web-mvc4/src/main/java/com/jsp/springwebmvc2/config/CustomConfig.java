package com.jsp.springwebmvc2.config;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.hibernate.engine.jdbc.connections.spi.JdbcConnectionAccess;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CustomConfig implements IdentifierGenerator{

	@Override
	public Object generate(SharedSessionContractImplementor session, Object object) {

	
		String prefix="ST";
		
		int suff=0;
		
		JdbcConnectionAccess access = session.getJdbcConnectionAccess();
		try {
			Connection connection = access.obtainConnection();
			
			Statement stm = connection.createStatement();
			
			
			String sql="select nextval('stu_seq')";
			
			ResultSet query = stm.executeQuery(sql);
			if(query.next()) {
				suff=query.getInt(1);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return prefix+suff;
		
	
	
	}

}
