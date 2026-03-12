package q1;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Show {
	
	void show() {
		try {
			PreparedStatement preparedstatment= Getconnection.getconnection()
					.prepareStatement("Select * from info ");
			
			
			
			preparedstatment.executeQuery();
			System.out.println("data show");
			
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
	    Show show=new Show();
		show.show();
	}

}
