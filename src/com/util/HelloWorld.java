package com.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class HelloWorld {
	public static void main(String[] args) throws Exception{
		System.out.println("Hello World");
		
		Class.forName("com.mysql.jdbc.Driver");
		
		
		Connection con = DriverManager.getConnection("jdbc:mysql://192.168.64.5:3306/test", "mysql", "mysql");
		
		System.out.println(con);
		
	}
}
