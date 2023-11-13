package userfeedback;

import java.io.PrintWriter;
import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/adminLoginServlet")
public class adminLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		boolean isTrue;
		
		isTrue = PackageDBUtil.validate(username, password);
		
		if(isTrue == true)
		{
			List<packages> packDetails = PackageDBUtil.getPackage();
			request.setAttribute("packDetails", packDetails);
			
			RequestDispatcher dis = request.getRequestDispatcher("createpackage.jsp"); //packageaccount.jsp
			dis.forward(request, response);
		}
		else 
		{
			
			out.println("<script type='text/javascript'>");
			out.println("alert('Your Username or Password is incorrect!');");
			out.println("location='adminlogin.jsp'");
			out.println("</script>");
			
		}
	

	}

}
 