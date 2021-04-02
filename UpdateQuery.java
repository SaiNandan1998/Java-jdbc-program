package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;

public class UpdateQuery {

	public static void main(String[] args) {
		
		  
		try {
			
			Connection con= DriverManager.getConnection("jdbc:mysql://localhost/Trainee"
			+"user=minty&password=greatsqldb");
			
			String que = " UPDATE trainee set  trainee_name=? trainee_number=? wHERE id=?";
			
			PreparedStatement st = con.prepareStatement(que);
			
			st.setString(1, "mannu");
			st.setString(2, "9381166714");
			st.setString(3, "10");
			
			
			int ru=st.executeUpdate(que);
		    
			if(ru>0) {
				System.out.println("A new data is updated");
				
			}
			con.close();
		}catch(SQLException e) {
			  e.printStackTrace();
			  	  
		  }	
			
	}

}
