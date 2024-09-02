package com.workz.Myproject.Project;
import  java.sql.*;
import java.sql.DriverManager;
public class Demo {
	
	
	public static void main(String[] args)
	{
	try{
	Class c=Class.forName(mysql-connector-java-8.0.XX.jar.XX);
	Connection con=(Connection) DriverManager.getConnection("jdbc:oracle:oci8:@xe","root","Santu@123"); 
	System.out.println("Connection Established Successfully");
	}catch(Exception e)
	{
	System.err.println(e);
	}
	}


}
