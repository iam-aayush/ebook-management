package com.jsp.EbookMangement.DB;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnect {

	
private  static Connection conn;
	
	public static  Connection getConn() {
	
		
		try {
			
			
			Class.forName("com.mysql.cj.jdbc.Driver");
		
		String url="jdbc:mysql://localhost:3306/ebook-ap";
		String user="root";
		String pass="ayush3637";
		
		
		
		conn=DriverManager.getConnection(url,user,pass);
			
		} catch (Exception e) {
			e.printStackTrace();

		}
		
		return conn;
		
	}
	
}
