package com;
//In this Class we will use JDBC to create a table in database.
import java.sql.Connection;
import java.sql.Statement;
import java.util.Scanner;

public class CreateTable {
	Scanner s = new Scanner(System.in);
	
	/*con is an object used in all these programs which establishes the connection between database by using a method getConnection in the ConnectionProvider class.
	 * q is a variable holding query, we are passing query dynamically here.
	 * s is an object of Statement class which has executeUpdate() will be used for executing the create table command.
	 * 
	 */
	void createTable() {
		try {
	
			Connection con=ConnectionProvider.getConnection();
			System.out.println("Please Write query to create a table : : ");
			String q = s.nextLine();
			//String q="create table Student (SID int primary key auto_increment, Name varchar(20) not null, Mob_Num int(14), Address varchar(50))";
			Statement s = con.createStatement();
			s.executeUpdate(q);
			System.out.println("table created successfullt !!1");
			con.close();
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
