package userfeedback;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class FeedbackDButil {
	
	private static Connection con=null;
	private static Statement stmt = null;
	private static ResultSet rs = null;
	private static boolean isSuccess;
	
	
	
	public static boolean inserteventmanagementsystem(String id,String name,String event,String feedback,String rating) {
		
		boolean isSuccess = false;
		
		try {
			//create database connection
			con = ConnectionDB.getConnection();
			stmt = con.createStatement();
			
			String sql = "insert into userfeedback values('"+id+"','"+name+"','"+ event+"','"+feedback+"','"+rating+"')";
			int rs = stmt.executeUpdate(sql);
			
			if(rs>0) {
				isSuccess =true;
			}
			else {
				isSuccess = false;
			}

			
		} catch ( Exception e) {
			System.out.println(e);
		
		}
		return isSuccess;
		
	}
	
	public static boolean updateeventmanagementsystem(String id, String name, String event, String feedback, String rating) {

		try {

			con = ConnectionDB.getConnection();
			stmt = con.createStatement();
		

			String sql = "update userfeedback set name = '"+name+"', event = '"+event+"', feedback = '"+feedback+"', rating = '"+rating+"' where id = '"+id+"'";
			
			int rs = stmt.executeUpdate(sql);

				if (rs > 0) {
					isSuccess = true;
				} else {
					isSuccess = false;
				}
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			return isSuccess;

		}
	
	//create a method to delete data into DB

		public static boolean deleteeventmanagementsystem(String id) {

			try {
				// create database connection
				Connection con = ConnectionDB.getConnection();
				Statement stmt = con.createStatement();
				String sql = "delete from userfeedback  where id = '" + id + "'";
				int rs = stmt.executeUpdate(sql);

				if (rs > 0) {
					isSuccess = true;
				} else {
					isSuccess = false;
				}

			} catch (Exception e) {
				e.printStackTrace();
			}

			return isSuccess;
		}
		
		




}
