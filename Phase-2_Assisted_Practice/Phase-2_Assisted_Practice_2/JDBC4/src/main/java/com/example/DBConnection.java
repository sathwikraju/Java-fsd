package com.example;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
	static Connection con;
	public static Connection getConnection() {
		try {
		//Step 1: load driver in memory
		Class.forName("com.mysql.cj.jdbc.Driver");
		//Step 2: Connection with database
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/details","root","Sathwik@@143");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return con;
	}
	public static void close(Connection conn) {
		// TODO Auto-generated method stub
		
	}

}