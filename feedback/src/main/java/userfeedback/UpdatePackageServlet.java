package userfeedback;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/UpdatePackageServlet")
public class UpdatePackageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String pid = request.getParameter("pid");
		String packagename = request.getParameter("packagename");
		String eventtype = request.getParameter("radio");
		String description = request.getParameter("description");
		String location = request.getParameter("location");
		String cost = request.getParameter("cost");
		
		boolean isTrue;
		
		isTrue = PackageDBUtil.updatepackage(pid, packagename, eventtype, description, location, cost);
		
		if(isTrue == true) {
			
			List<packages> packDetails = PackageDBUtil.getPackageDetails(pid);
			request.setAttribute("packDetails", packDetails);
			
			RequestDispatcher dis = request.getRequestDispatcher("packageaccount.jsp");
			dis.forward(request, response);
		}
		else {
			
			List<packages> packDetails = PackageDBUtil.getPackageDetails(pid);
			request.setAttribute("packDetails", packDetails);
			
			RequestDispatcher dis = request.getRequestDispatcher("packageaccount.jsp");
			dis.forward(request, response);
		}
	}

}
