package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcProgram {
	public static void main(String[] args) {
	
try {
     
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost/Trainee" +
            "user=minty&password=greatsqldb");
	
	 if(con!=null) {
		 System.out.println("Connected to Database");
		 
	 }
	
	  Statement obj=con.createStatement();
	  
	  String strSelect ="SELECT trainee_id,trainee_name,trainee_number FROM trainee";
	  
	  ResultSet rs = obj.executeQuery(strSelect);
	  
	  
	  
	  while(rs.next()) {
		  int id = rs.getInt("trainee_id");
		  String name=rs.getString("trainee_name");
		  int num =rs.getInt("tarinee_number");
		  
	System.out.println("trainee id is "+id+" trainee name is"+name+"trainee number is"+num);
    
	 
	
	  }
	  obj.close();
	  
}     catch(SQLException e) {
		  e.printStackTrace();
          	
}

	
}
}