package q1;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Update {
	 void update() {
		 try {
			 PreparedStatement preparedstatment= Getconnection.getconnection().prepareStatement("update info set name=? where id =?");
			 preparedstatment.setString(1, "Pawar");
			 preparedstatment.setInt(2, 3);
			 preparedstatment.execute();
			 
			 System.out.println("Update done");
			
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	 }
	 public static void main(String[] args) {
		Update update=new Update();
	    update.update();
	}

}
