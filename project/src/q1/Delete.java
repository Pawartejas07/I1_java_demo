package q1;

	
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Delete {
	
	void delete() {
		try {
			PreparedStatement preparedstatment= Getconnection.getconnection()
					.prepareStatement("Delete From info where id=?");
			preparedstatment.setInt(1,1);
			
			
			preparedstatment.execute();
			System.out.println("data deleted");
			
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
	    Delete delete=new Delete();
		delete.delete();
	}

}
