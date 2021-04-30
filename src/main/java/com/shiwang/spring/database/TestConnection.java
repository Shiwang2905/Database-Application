package com.shiwang.spring.database;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestConnection {

	public static void main(String[] arg) {
				
		String url="jdbc:mysql://localhost:3306/web_customer_tracker?useSSL=false";
		String user="root";
		String password="Shiv@79872";
		
		try {
			Connection dbconnection= DriverManager.getConnection(url,user,password);	
			System.out.println("connection established with "+url);
			dbconnection.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
	}
}
