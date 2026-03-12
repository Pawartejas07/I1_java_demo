package pro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
	public static void main(String[] args) throws  ClassNotFoundException, SQLException{
		
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/db09?useSSL=false","root","tejas");
		
		Statement statement= connection.createStatement();
		
		ResultSet set= statement.executeQuery("Select * from info");
		
		while (set.next()) {
			System.out.println(set.getInt(1));
			System.out.println(set.getString(2));
			
		}
		connection.close();
	}

}
