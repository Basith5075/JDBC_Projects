package com;

/*	This program is used for understanding the JDBC concepts by using a MySQL database.
	This is the main program which is used as a catalog.
	We connect, create a table, insert rows, update rows and retrieve rows in this application.
	There are five classes: 1. ConnectionProvider used for connection purposes.
							2. Create table used for creating table in db.
							3. InsertRows used for inserting data in tables.
							4. SelectTable used for retrieving data.
							5. UpdateRows used for updating row data.
*/

import java.util.Scanner;

public class JDBC{
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Welcome to Database (JDBC) Software !!");
		System.out.println("****************************************");
		boolean continueProgram =true ;
		while(continueProgram)
		{
		System.out.println("Select any one Operation you wish to perform");
		System.out.println("****************************************");
		System.out.println("1. Create a table ");
		System.out.println("2. Insert data into table1");
		System.out.println("3. Update data of table1");
		System.out.println("4. Show data of table1");
		int choice = s.nextInt();
		switch (choice) {
			
			case 1: 
				CreateTable ct = new CreateTable();
				ct.createTable();
				break;
			case 2:
				InsertRows ir = new InsertRows();
				ir.insertRow();
				break;
			case 3:
				UpdateRows ur = new UpdateRows();
				ur.uppdateRows();
				break;
			case 4:
				SelectTable st = new SelectTable();
				st.selectTable();
				break;	
				
		} 
		System.out.println("If you want to continue, please press 1 otherwise press 0");
		int echoice=s.nextInt();
		if(echoice==1)
		{
			continueProgram=true;
		}
		else
			continueProgram=false;
		
		}
	}

}
