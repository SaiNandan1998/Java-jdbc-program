package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;

public class InsertQuery {
  public static void main(String[]args) {
	  
try {
	
	Connection con= DriverManager.getConnection("jdbc:mysql://localhost/Trainee"
	+"user=minty&password=greatsqldb");
	
	String que = "INSERT INTO trainee (trainee_id,trainee_name,trainee_number)"
			+"VALUES(?,?,?)";
	

	
	PreparedStatement st = con.prepareStatement(que);
	
	st.setString(1, "10");
	st.setString(2, "Nandan");
	st.setString(3, "9059446696");
	
	
	int ri=st.executeUpdate(que);
    
	if(ri>0) {
		System.out.println("inserted");
		
	}
	con.close();
}catch(SQLException e) {
	  e.printStackTrace();
	  	  
  }	
	
}
}
