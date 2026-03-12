package q1;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Oprationinsert {
	
	void insert() {
		try {
			PreparedStatement preparedstatment= Getconnection.getconnection()
					.prepareStatement("insert into info values(?,?)");
			preparedstatment.setInt(1, 4);
			preparedstatment.setString(2, "Tejas");
			
			preparedstatment.executeUpdate();
			System.out.println("data insert");
			
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		Oprationinsert oprationinsert=new Oprationinsert();
		oprationinsert.insert();
	}

}
