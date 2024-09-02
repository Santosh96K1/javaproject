package com.workz.Myproject.Project;
import java.sql.*;
import java.sql.DriverManager;

public class ConnectionDemo {

	public static void main(String[] args) 
	{
     try {
 		Class c= Class.forName("mysql.jdbc.driver.MySqlDriver");
        
 		Connection con=DriverManager.getConnection("jdbc:mysql-connection-j-8.0.33:")
     }catch(ClassNotFoundException e)
     {
    	 System.out.println(e);
     }
		
		 
	}

}
