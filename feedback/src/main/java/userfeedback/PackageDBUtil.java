package userfeedback;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class PackageDBUtil {
	
	private static boolean isSuccess;
	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;
	
	//Validate Package
	public static boolean validate(String username, String password){
	

	try {
		con = ConnectionDB.getConnection();
		stmt = con.createStatement();
		String sql = "select * from eventmanagementsystem.adminpanel where username = '"+username+"' and  password='"+password+"'";
		rs = stmt.executeQuery(sql);
		
		if(rs.next()) {
				isSuccess = true;
			}else {
				isSuccess = false;
			}
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	
	
	return isSuccess;
	}

		
	//Insert Package
	public static boolean insertpackage(String packagename, String eventType, String description, String location, String price) {
		
		boolean isSuccess = false;
		
	
			try {
				
				con = ConnectionDB.getConnection();
				stmt = con.createStatement();
				String sql = "insert into eventmanagementsystem.package values (0, '"+packagename+"','"+eventType+"','"+description+"', '"+location+"','"+price+"')";
				int rs = stmt.executeUpdate(sql);
				
				if(rs > 0) {
					isSuccess = true;
				} else {
					isSuccess = false;
				}
				
				
				
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			
			return isSuccess;
			
	}

	
		
	//Get Package Details
    public static ArrayList<packages> getPackage(){ //String packageName

	ArrayList<packages> packages1 = new ArrayList<>();
		 
	try {
		
		//Database connection
		 con = ConnectionDB.getConnection();
		 stmt = con.createStatement();
		 String sql = "select * from package "; //where packagename='"+packageName+"'
		 rs = stmt.executeQuery(sql);
		 
		 while(rs.next()) {
			 
		
		 //assign database values
		 int id = rs.getInt(1);
		 String name = rs.getString(2);
		 String type = rs.getString(3);
		 String description = rs.getString(4);
		 String location = rs.getString(5);
		 String cost = rs.getString(6);
		 
		 packages pk = new packages(id,name,type,description,location,cost);
		 packages1.add(pk);
		 }
		 
		 
		 		 
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	
	return packages1;

}

    
    
    //Update Package
    public static boolean updatepackage(String pid, String packagename, String eventtype, String description, String location, String cost) {
    	
    	try {
    		
    	 //Database connection
   		 con = ConnectionDB.getConnection();
   		 stmt = con.createStatement();
   		 String sql = "update eventmanagementsystem.package set packagename='"+packagename+"', eventtype='"+eventtype+"', description='"+description+"', location='"+location+"', cost='"+cost+"'"
   		 		+ "where pid='"+pid+"'";
   		 int rs = stmt.executeUpdate(sql);
    		
    	 if(rs>0) {
    		 isSuccess = true;
    	 }else {
    		 isSuccess = false;
    	 }
    		
    	}catch(Exception e) {
    		e.printStackTrace();
    	}
    	
    	
    	return isSuccess;
    	
    
    }
    
    
    
    //Get Update Package Details
    public static List<packages> getPackageDetails(String ID){
    	
    	int convertedID = Integer.parseInt(ID);
    	
    	ArrayList<packages> pack = new ArrayList<>();
    	
    	try {
    		
    		 //Database connection
      		 con = ConnectionDB.getConnection();
      		 stmt = con.createStatement();
      		 String sql = "select * from eventmanagementsystem.package where pid='"+convertedID+"'";
      		 rs = stmt.executeQuery(sql);
      		 
      		 while(rs.next()) {
      			 
      			 //assign database values
      			 int id = rs.getInt(1);
      			 String name = rs.getString(2);
      			 String type = rs.getString(3);
      			 String description = rs.getString(4);
      			 String location = rs.getString(5);
      			 String cost = rs.getString(6);
      			 
      			 packages p  =  new packages(id,name,type,description,location,cost);
      			 pack.add(p);
      		 }
    		
    		
    	}catch(Exception e) {
    		e.printStackTrace();
    	}
    	
      	return pack;
    }
    
    
    
    //Delete Package
    public static boolean deletePackage(String id) {
    	
    	int convID = Integer.parseInt(id);
    	
    	try {
    		 //Database connection
     		 con = ConnectionDB.getConnection();
     		 stmt = con.createStatement();
     		 String sql = "delete from eventmanagementsystem.package where pid='"+convID+"'";
     		 int r = stmt.executeUpdate(sql);
     		 
     		 if(r > 0) {
     			 isSuccess = true;
     		 }
     		 else {
     			 isSuccess = false;
     		 }
    		
    		
    	}catch(Exception e) {
    		e.printStackTrace();
    	}
    	
    	
    	return isSuccess;
    }
}
