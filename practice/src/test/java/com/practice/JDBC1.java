package com.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.testng.annotations.Test;

public class JDBC1 {

    @Test
	public void Execution() throws Exception
	{
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/automation", "root", "root");
		Statement stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery("select details.name,details.role,company.cname,company.salary from details RIGHT JOIN  company ON details.id=company.id;");
		while(rs.next())
		{
			System.out.println(rs.getString("Name") +" " + rs.getString("Role") + " " + rs.getString("cname") + " " + rs.getString("salary"));
		}
		rs.close();
		stmt.close();
		con.close();
		
		aa
	}

}
