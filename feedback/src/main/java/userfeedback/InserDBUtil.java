package userfeedback;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InserDBUtil {

	public static boolean inserteventmanagementsystem(String Name,String Email,String Phone,String UserName,String Password) {
		boolean isSuccess = false;
		
		//create DB connection
		String url = "jdbc:mysql://localhost:3306/eventmanagementsystem";
		String user = "root";
		String pass = "password1234";
		 
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con = DriverManager.getConnection(url, user, pass);
			Statement stmt = con.createStatement();
			
			String sql = "insert into register values (0,'"+Name+"','"+Email+"','"+Phone+"','"+UserName+"','"+Password+"')";
			int rs = stmt.executeUpdate(sql);
			
			if(rs > 0) {
				isSuccess = true;
			}else {
				isSuccess = false;
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return isSuccess;
	}
}	
