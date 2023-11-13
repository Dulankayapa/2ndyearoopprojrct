package userfeedback;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/CustomerInsert")
public class CustomerInsert extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String Name = request.getParameter("Name");
		String Email = request.getParameter("Email");
		String Phone = request.getParameter("Phone");
		String UserName = request.getParameter("UserName");
		String Password = request.getParameter("Password");
		
		boolean isTrue;
		
		isTrue = InserDBUtil.inserteventmanagementsystem(Name, Email, Phone, UserName, Password);
		
		if(isTrue == true) {
			RequestDispatcher dis = request.getRequestDispatcher("login.jsp");
			dis.forward(request, response);
		}else {
			RequestDispatcher dis2 = request.getRequestDispatcher("unsuccesslogin.jsp");
			dis2.forward(request, response);
		}
		
	}

}
