package com;
// This class establishes connection between my java program and the MySQL database
import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionProvider {
	
	private static Connection con;
	/*
	 * We have a static getConnection() which uses methods of Connection interface and returns Connection object.
	 */
	
	public static Connection getConnection() {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/exampledb";
			String username="root";
			String pass="Trimax@123";
			con = DriverManager.getConnection(url,username,pass);
		
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
		return con;
}

}