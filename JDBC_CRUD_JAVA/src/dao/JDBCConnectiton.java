package dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class JDBCConnectiton {
	public static Connection getConn() {
		final String username = "root";
		final String password = "Minh17092002";
		final String url = "jdbc:mysql://localhost:3306/jdbc_java";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			return DriverManager.getConnection(url, username, password);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Loi ket noi DB");
		}
		return null;
	}
	
//	public static void main(String[] args) {
//		getConn();
//	}
}
