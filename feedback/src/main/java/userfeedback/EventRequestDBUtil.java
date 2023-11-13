

package userfeedback;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;



public class EventRequestDBUtil {
	private static boolean isSuccess = false;
	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;
	
	
	
	public static boolean insertRequestDetails(String fname, String lname, String email, String phone, String eventType, int guestCount, String date , String city, String needs, double budget, String additionalInfo) {
		
		
		//create database connection
		
		
		
		try {
			con = ConnectionDB.getConnection();
			stmt = con.createStatement();
			
			String sql = "insert into event_requests  values (0, '"+fname+"', '"+lname+"', '"+email+"', '"+phone+"', '"+eventType+"',"+ guestCount + ", '"+ date+"', '"+city+"', '"+needs+"'," + budget + ", '"+additionalInfo+"')";
			int rs = stmt.executeUpdate(sql);
			
			if(rs > 0) {
				isSuccess = true;
			} else {
				isSuccess = false;
			}
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		
		return isSuccess;
	}
	
	
	
	
	

	
	
	
	
	public static List<EventRequest> selectAllDetails() {

		// using try-with-resources to avoid closing resources (boiler plate code)
		List<EventRequest> ER = new ArrayList<>();
		// Step 1: Establishing a Connection
		try (Connection connection = ConnectionDB.getConnection();
				
				
				
				
				// Step 2:Create a statement using connection object
			PreparedStatement preparedStatement = connection.prepareStatement("select * from eventmanagementsystem.event_requests;");) {
			System.out.println(preparedStatement);
			// Step 3: Execute the query or update query
			rs = preparedStatement.executeQuery();

			// Step 4: Process the ResultSet object.
			if(rs.next()) {
				int id = rs.getInt("request_id");
				String fname = rs.getString("first_name");
				String lname = rs.getString("last_name");
				String email = rs.getString("email");
				String phone = rs.getString("phone");
				String eType = rs.getString("event_type");
				int gCount = rs.getInt("guest_count");
				String date = rs.getString("date");
				String city = rs.getString("city");
				String needs = rs.getString("event_needs");
				double budget = rs.getDouble("budget");
				String additionals = rs.getString("additional_information");
				
				EventRequest EvReq = new EventRequest(id, fname, lname, email, phone, eType, gCount, date, city, needs, budget, additionals);
				ER.add(EvReq); 	
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return ER;
	}
	
	
	
	
	
	//Update Part
	
	public static boolean updateEventRequest(String id, String fname, String lname, String email, String phone, String eventType, int guestCount, String date, String city, String needs, double budget, String additionalInfo) {
		try {
			
			con = ConnectionDB.getConnection();
			stmt = con.createStatement();
			String sql = "update eventmanagementsystem.event_requests set first_name='"+fname+"', last_name='"+lname+"', email='"+email+"', phone='"+phone+"', event_type='"+eventType+"', guest_count="+guestCount+", date='"+date+"', city='"+city+"', event_needs='"+needs+"', budget="+budget+", additional_information='"+additionalInfo+"'" 
						+ "where request_id='"+id+"'";
			int rs = stmt.executeUpdate(sql);
			
			if(rs > 0) {
				isSuccess = true;
			}
			else {
				isSuccess = false;
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		return isSuccess;
	}
	
	// Data Retrieve Part
	
	public static List<EventRequest>getRequestDetails(String id) {
		
		int convertedID = Integer.parseInt(id);
		
		ArrayList<EventRequest> eventReq = new ArrayList<>();
		
		try {
			con = ConnectionDB.getConnection();
			stmt = con.createStatement();
			String sql = "select * from eventmanagementsystem.event_requests where request_id = '"+convertedID+"'";
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				int req_id  = rs.getInt(1);
				String fname = rs.getString(2);
				String lname = rs.getString(3);
				String email = rs.getString(4);
				String phone = rs.getString(5);
				String eventType = rs.getString(6);
				int guestCount = rs.getInt(7);
				String date = rs.getString(8);
				String city = rs.getString(9);
				String eventNeeds = rs.getString(10);
				double budget = rs.getDouble(11);
				String additionalInfo = rs.getString(12);
				
				
				EventRequest e = new EventRequest(req_id, fname, lname, email, phone, eventType, guestCount, date, city, eventNeeds, budget, additionalInfo);
				eventReq.add(e);
			}
			
		}
		catch (Exception e){
			e.printStackTrace();
		}
		
		
		
		return eventReq;
	}
	
	//Delete Part
	
	public static boolean deleteEventRequest(String id) {
		int convertedID = Integer.parseInt(id);
		
		try {
			
			con = ConnectionDB.getConnection();
			stmt = con.createStatement();
			String sql = "delete from eventmanagementsystem.event_requests where request_id ='"+convertedID+"'";
			int r = stmt.executeUpdate(sql);
			
			if(r > 0)
			{
				isSuccess = true;
			}
			else {
				isSuccess = false;
			}
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		return isSuccess;
	}
	

}
