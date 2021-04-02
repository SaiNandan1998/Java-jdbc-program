package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;

public class DeleteQuery {

	public static void main(String[] args) {
		
		try {
			
			Connection con= DriverManager.getConnection("jdbc:mysql://localhost/Trainee"
					+"user=minty&password=greatsqldb");
					
					String qued = "DELETE FROM trainee Where id=? ";
					
					PreparedStatement st = con.prepareStatement(qued);
					st.setString(1, "prasanth");
					
					int rd=st.executeUpdate();
					
					if(rd>0) {
						System.out.println("deleted ");
					}
			
				   con.close();
			
		}catch(SQLException e) {
			  e.printStackTrace();
		

	}

}
}
