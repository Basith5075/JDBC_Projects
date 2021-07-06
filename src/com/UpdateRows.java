package com;
// this class is used for updating row data of the tables
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class UpdateRows {
	Scanner s = new Scanner(System.in);
	/* pstmt is an object of PreparedStatement class which contains executeUpdate() used for updating rows. 
	 */
	
	void uppdateRows() {
		try {
			Connection con = ConnectionProvider.getConnection();
			String q = "update table1 set mob_num=? where name = ?;";
			PreparedStatement pstmt = con.prepareStatement(q);
			System.out.println("Please Enter the name of the user whose mob num needs to be updated !!");
			String name=s.nextLine();
			System.out.println("Please Enter the new mob num of the user!!");
			String mob = s.nextLine();
			pstmt.setString(1, mob);
			pstmt.setString(2, name);
			int a = pstmt.executeUpdate();
			System.out.println(a+" Rows Updated Succesfully !!");
			con.close();
			}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
