package com.atcs.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC {
public static void main(String args[]) throws ClassNotFoundException, SQLException {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection cnn=DriverManager.getConnection("jdbc:mysql://localhost:3306/atcs","root","root");
	
	if(cnn!=null) {
		System.out.println("Database Connected");
		Statement st=cnn.createStatement();
		
		int id=5;
		String name="Dev";
		int salary= 45555;
		
		String query="select * from employee";
		
		String insrtquery="insert into employee values(?,?,?)";
		PreparedStatement ps=cnn.prepareStatement(insrtquery);
		ps.setInt(1,id);
		ps.setString(2, name);
		ps.setInt(3,salary);
		ps.executeUpdate();
		
		
		
 		String updatequery="update employee set name = ? where id=?";
 		PreparedStatement psup=cnn.prepareStatement(updatequery);
 		psup.setString(1,"Atul");
		psup.setInt(2, 2);
		psup.executeUpdate();
 		
 		String deletequery="delete from employee where id=?";
 		PreparedStatement psde=cnn.prepareStatement(deletequery);
 		psde.setInt(1, 4);
		psde.executeUpdate();
		
 		
		ResultSet rs= st.executeQuery(query);
		
		while(rs.next())
		{
			System.out.println("ID "+rs.getInt(1)  +" name "+rs.getString(2)+" salary "+rs.getString(3));
			
		}
		
	}
	else {
		System.out.println("Not Connected");
	}
}
}
