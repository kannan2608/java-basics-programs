package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DeletefromSql {

	public static void main(String[] args) {
	try
	{
		Class.forName(SqlUpdating.DRIVER);
		Connection con=DriverManager.getConnection(SqlUpdating.Host,SqlUpdating.USERNAME,SqlUpdating.PASSWORD);
		Statement obj=con.createStatement();
	}
	catch(Exception e) {
		System.out.println(e);
	}
	}
	

}