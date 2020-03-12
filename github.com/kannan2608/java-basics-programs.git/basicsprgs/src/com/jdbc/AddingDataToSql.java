package com.jdbc;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;

public class AddingDataToSql {
	public static void main(String[] args) {

		try {
			// loading driver
			Class.forName(connectInfo.DRIVER);
			// getting connection
			Connection con = DriverManager.getConnection(connectInfo.Host, connectInfo.USERNAME, connectInfo.PASSWORD);
			// creating statement
			Statement obj = con.createStatement();

			String query1 = "insert into Eventparticipants values('Inba','B.E','VIT','Acting',984025478)";
			String query2 = "update Eventparticipants set name='krish' where name='inba'";
			String query3 = "delete from Eventparticipants where name='krish'";
			String query4 = "alter table Evenparticipats add address varchar(20);";

			int res = obj.executeUpdate(query1);
			System.out.println(res + " row affected");

			int res1 = obj.executeUpdate(query2);
			System.out.println(res1 + " row affected");

			int res3 = obj.executeUpdate(query3);
			System.out.println(res3 + "row affected");

			int res4 = obj.executeUpdate(query4);
			System.out.println(res4);

		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
