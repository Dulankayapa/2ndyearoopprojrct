package userfeedback;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/UpdateRequestServlet")
public class UpdateRequestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id = request.getParameter("id");
		String fname = request.getParameter("fname");
		String lname = request.getParameter("lname");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		String eventType = request.getParameter("eType");
		int guestCount = Integer.parseInt(request.getParameter("guestCount"));
		String date = request.getParameter("date");
		String city = request.getParameter("city");
		String needs = request.getParameter("needs");
		double budget = Double.parseDouble(request.getParameter("budget"));
		String additionalInfo = request.getParameter("additionalInfo");
		
		
		boolean isTrue;	
		
		isTrue = EventRequestDBUtil.updateEventRequest(id, fname, lname, email, phone, eventType, guestCount, date, city, needs, budget, additionalInfo);
		
		
		if(isTrue == true) {
			
			List<EventRequest> erDetail = EventRequestDBUtil.getRequestDetails(id);
			request.setAttribute("EvDetails", erDetail);
			
			RequestDispatcher dis = request.getRequestDispatcher("requestDetails.jsp");
			dis.forward(request, response);
		}
		else {
			
			List<EventRequest> erDetail = EventRequestDBUtil.getRequestDetails(id);
			request.setAttribute("EvDetails", erDetail);
			
			RequestDispatcher dis = request.getRequestDispatcher("requestDetails.jsp");
			dis.forward(request, response);
		}
	}

}
