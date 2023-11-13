package userfeedback;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/UpdateServlet")
public class UpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("uname");
		String password = request.getParameter("password");
		
		boolean isTrue;
		
		isTrue = CustomerDBUtil.updateCustomer(username, password);
		
		if(isTrue == true) {
			RequestDispatcher dis =request.getRequestDispatcher("successlogin.jsp");
			dis.forward(request, response);
		}else {
			RequestDispatcher dis2 =request.getRequestDispatcher("unsuccesslogin.jsp");
			dis2.forward(request, response);
		}
	}

}


