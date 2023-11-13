package userfeedback;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/DeletePackageServlet")
public class DeletePackageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id = request.getParameter("pid");
		boolean isTrue;
		
		isTrue = PackageDBUtil.deletePackage(id);
		
		if(isTrue == true) {
			RequestDispatcher dispatcher = request.getRequestDispatcher("createpackage.jsp");
			dispatcher.forward(request, response);
		}
		else {
			List<packages> packDetails = PackageDBUtil.getPackageDetails(id);
			request.setAttribute("packDetails", packDetails);
			
			RequestDispatcher dispatcher = request.getRequestDispatcher("packageaccount.jsp");
			dispatcher.forward(request, response);
			
		}
	}

}
