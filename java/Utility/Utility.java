package Utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Utility {
	Connection con;
	public Connection getconnection()
	{
	
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "prakhya", "prakhya");
		
		} catch (ClassNotFoundException|SQLException e) {

			e.printStackTrace();
		}
	
		return con;
		
	
	}
}
