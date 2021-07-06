package com;
// This class is used for retrieving data from the table
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class SelectTable {
	/*  stmt is an object of Statement interface which has executeQuery() method used for executing query
	 *  set is an object of ResultSet class which holds the retrieved table data
	 *  We need to use next() inside ResultSet to get the next row elements
	 */
	void selectTable() {
		try {
			Connection con = ConnectionProvider.getConnection();
			String q = "select * from table1;";
			Statement stmt = con.createStatement();
			ResultSet set = stmt.executeQuery(q);
			while(set.next()) {
				int id = set.getInt(1);
				String name=set.getString(2);
				String mob = set.getString(3);
				String addr = set.getString(4);
				System.out.println(id+"\t\t"+name+"\t\t"+mob+"\t\t"+addr);
			}
			con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
