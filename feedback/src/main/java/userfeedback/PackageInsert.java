package userfeedback;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/PackageInsert")
public class PackageInsert extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String packagename = request.getParameter("pname");
		String eventType = request.getParameter("radio");
		String description = request.getParameter("desc");
		String location = request.getParameter("loc");
		String cost = request.getParameter("cost");
		
		boolean isTrue;

		isTrue = PackageDBUtil.insertpackage(packagename, eventType, description, location, cost);
		
		if(isTrue == true) {
			
			try {
				
				List<packages> packDetails = PackageDBUtil.getPackage();
				request.setAttribute("packDetails", packDetails);
				
			}catch(Exception e) {
				e.printStackTrace();
			}
			
			// redirect
			RequestDispatcher dis = request.getRequestDispatcher("packageaccount.jsp");
			dis.forward(request, response);
			
		}
		else
		{
			RequestDispatcher dis1 = request.getRequestDispatcher("unssuccess.jsp");
			dis1.forward(request, response);
		}
		
		
	}

}
