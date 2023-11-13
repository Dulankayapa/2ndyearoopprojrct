package userfeedback;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/requestInsert")
public class requestInsert extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String firstName = request.getParameter("fname");
        String lastName = request.getParameter("lname");
        String email = request.getParameter("email");
        String phone = request.getParameter("phone");
        String eventType = request.getParameter("radio");
        
        int guestCount = 0; // Default value for guestCount
        String guestCountParam = request.getParameter("guestCount");
        if (guestCountParam != null && !guestCountParam.isEmpty()) {
            try {
                guestCount = Integer.parseInt(guestCountParam);
            } catch (NumberFormatException e) {
                // Handle the case when the parameter is not a valid integer
                // You can log an error or provide a user-friendly error message
            }
        }

        //date
        String date = request.getParameter("date");
        String city = request.getParameter("city");
        String needs = request.getParameter("needs");

        double budget = 0.0; // Default value for budget
        String budgetParam = request.getParameter("budget");
        if (budgetParam != null && !budgetParam.isEmpty()) {
            try {
                budget = Double.parseDouble(budgetParam);
            } catch (NumberFormatException e) {
                // Handle the case when the parameter is not a valid double
                // You can log an error or provide a user-friendly error message
            }
        }

        String additionalInfo = request.getParameter("additionals");

        boolean isTrue;
        isTrue = EventRequestDBUtil.insertRequestDetails(firstName, lastName, email, phone, eventType, guestCount, date, city, needs, budget, additionalInfo);

        if (isTrue == true) {
            try {
                List<EventRequest> erDetail = EventRequestDBUtil.selectAllDetails();
                request.setAttribute("EvDetails", erDetail);
            } catch (Exception e) {
                e.printStackTrace();
            }

            RequestDispatcher dis = request.getRequestDispatcher("requestDetails.jsp");
            dis.forward(request, response);
        } else {
            RequestDispatcher dis1 = request.getRequestDispatcher("unsuccessful.jsp");
            dis1.forward(request, response);
        }
    }
}

