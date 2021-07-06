package com;
// Class to Insert rows in the table
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class InsertRows {

	/*
	 * pstmt is an object of PreparedStatement which is holding query q. "?" here represents the variable which is missing in the query, which is added dynamically by using setString().
	 * executeUpdate() is a method in PreparedStatement interface which is used to execute the insert query in database
	 */
	void insertRow() {
	Scanner s = new Scanner(System.in);
	try {
	Connection con = ConnectionProvider.getConnection();
	String q = "insert into table1(name,mob_Num,address) values(?,?,?)";
	PreparedStatement pstmt = con.prepareStatement(q);
	System.out.println("Please Enter name of the user");
	String name=s.nextLine();
	System.out.println("Please Enter mobile number of the user");
	String mob=s.nextLine();
	System.out.println("Please Enter address of the user");
	String add=s.nextLine();
	pstmt.setString(1, name);
	pstmt.setString(2, mob);
	pstmt.setString(3, add);
	int result=pstmt.executeUpdate();
	System.out.println(result+" no of rows affected..");
	con.close();
	}
	
	catch(Exception e )
	{
		System.out.println(e);
	}
	}
}
