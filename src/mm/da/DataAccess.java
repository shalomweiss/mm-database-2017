package mm.da;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import mm.model.User;

public class DataAccess {

private static boolean isLoadedDriver;
	
	static {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			isLoadedDriver =true;
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			isLoadedDriver=false;
			
		}
	}
	
	final String url = "jdbc:mysql://localhost:3306/db";
	private Connection c;
	
	final String selectLogin = "Select * From users where email=";
	
	public DataAccess() 
	{
	 try {
		  c = DriverManager.getConnection(url, "root","");	//TODO: when in production make sure to have valid credentials
	 }
	 catch (SQLException e)
	 {
		 e.printStackTrace();
	 }
	
	}
	
	public User login(String email) throws SQLException 
	{
		Statement stm = c.createStatement();
		 stm.executeQuery(selectLogin);
		 ResultSet r = stm.getResultSet();
		
		 return null;
	}
	 
	
}
