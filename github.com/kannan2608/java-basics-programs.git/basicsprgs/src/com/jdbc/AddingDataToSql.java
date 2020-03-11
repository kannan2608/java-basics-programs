package com.jdbc;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;

public class AddingDataToSql {
	public static void main(String[] args) {

		try {
			// loading driver
			Class.forName(connectInfo.DRIVER);
			// getting
			Connection con = DriverManager.getConnection(connectInfo.Host, connectInfo.USERNAME, connectInfo.PASSWORD);
			// creating statement
			Statement obj = con.createStatement();

			String query1 = "insert into Eventparticipants values('Inba','B.E','VIT','Acting',984025478)";

			int res = obj.executeUpdate(query1);
			System.out.println(res + " row affected");

		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
