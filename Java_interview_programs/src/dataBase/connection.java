package dataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class connection {

	public Connection conn=null;
	public Statement stmt=null;
	public Statement getConnection() throws SQLException
	{
		
		 conn=DriverManager.getConnection("jdbc:mysql://localhost:3308/hb-01-one-to-one-uni","hbstudent","hbstudent");
		 stmt = conn.createStatement();
		 return stmt;
	
	}
}
