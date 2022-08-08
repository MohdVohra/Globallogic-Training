package com.globallogic.maven.MyMaven;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MyJDBC {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String username="root";
			String password="root";
			String url="jdbc:mysql://localhost:3306/buddy";
			Connection con=DriverManager.getConnection(url, username, password);
		    Statement st=con.createStatement();
			String query="select * from Employee";
			ResultSet rs = st.executeQuery(query);
			while(rs.next()) {
				System.out.println("ID:"+rs.getInt(1)+" Name:"+rs.getString(2)+" Surname:"+rs.getString(3)+" Salary:"+rs.getString(4));
				
			}
			
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
