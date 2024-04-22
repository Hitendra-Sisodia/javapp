package com.DB;


import java.sql.*;

public class DBConnect {
	
	private static Connection conn;
	
	public static Connection getConn() {
		try {
			String url = "jdbc:mysql://localhost:3306/todo";
			String uname = "root";
			String pass = "hitendra";
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(url,uname,pass);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
}