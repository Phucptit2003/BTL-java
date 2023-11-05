package com.vienmv.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCConnection {
	public static Connection getJDBCConnection() {
		Connection connection = null;
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			String user = "sa";
			String pass = "phucle";
			String url = "jdbc:sqlserver://localhost:1433;databaseName=WebApplication1;encrypt = true;trustServerCertificate = true";
			connection = DriverManager.getConnection(url, user, pass);
			System.out.println("thanh cong");
			
		} catch (ClassNotFoundException | SQLException ex) {
			ex.printStackTrace();
		}

		return connection;
	}
}
