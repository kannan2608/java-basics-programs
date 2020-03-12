package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DeletefromSql {

	public static void main(String[] args) {
		try {
			Class.forName(SqlUpdating.DRIVER);
			Connection con = DriverManager.getConnection(SqlUpdating.Host, SqlUpdating.USERNAME, SqlUpdating.PASSWORD);
			Statement obj = con.createStatement();

			String query1 = "insert into Eventparticipants values('Inba','B.E','VIT','Acting',984025478)";

			//String query3 = "select * from Eventparticipants limit 2";
			//String query3 = "select * from Eventparticipants limit 2";
			String query3 = "select count(*) from Eventparticipants";
		
			ResultSet rs = obj.executeQuery(query3);
			while (rs.next())
				//System.out.println(rs.getString(1) + rs.getString(2));
				System.out.println(rs.getString(1));

			int res = obj.executeUpdate(query1);
			System.out.println(res + " row affected");

		} catch (Exception e) {
			System.out.println(e);
		}
	}

}