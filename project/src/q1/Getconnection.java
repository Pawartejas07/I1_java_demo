package q1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Getconnection {
	
	public static Connection getconnection() {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
		} catch ( ClassNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		Connection connection= null;
	    
		try {
			
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/db09?useSSL=false","root","tejas");
			
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return connection;
		
	}

}
