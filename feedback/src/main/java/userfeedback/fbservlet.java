package userfeedback;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/fbservlet")
public class fbservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {

// Get form data
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		String event = request.getParameter("event");
		String feedback = request.getParameter("feedback");
		String rating = request.getParameter("rating");
		
		// Perform data validation
        if (id == null || id.isEmpty() || name == null || name.isEmpty() || event == null || event.isEmpty() || feedback == null || feedback.isEmpty() || rating == null || rating.isEmpty()) {
            // Data is not valid, redirect to an error page
            RequestDispatcher dis2 = request.getRequestDispatcher("unsuccess.jsp");
            dis2.forward(request, response);
            return; // Exit the servlet, data is not valid
        }

        // Data is valid, proceed with database insertion
        boolean isTrue;
        isTrue = FeedbackDButil.inserteventmanagementsystem(id, name, event, feedback, rating);
		
		//getting the data
		request.setAttribute("id", id);
		request.setAttribute("name", name);
		request.setAttribute("event", event);
		request.setAttribute("feedback", feedback);
		request.setAttribute("rating", rating);

		
		

		if(isTrue == true) {
			RequestDispatcher dis =request.getRequestDispatcher("Success.jsp");
			dis.forward(request,response);
		}
		else {
			
			RequestDispatcher dis2 =request.getRequestDispatcher("unsuccess.jsp");
			dis2.forward(request,response);
		}
	}
		


}
