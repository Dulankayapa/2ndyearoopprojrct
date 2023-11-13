<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>delete_request</title>

    <style>
        /* Style for the entire body */
        body {
            background-image: url("css/dbg.jpg");
            background-size: cover;
            background-color: #D6EAF8;
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
        }


        /* Style for the form container */
        form {
            max-width: 800px;
            margin: 0 auto;
            background-color: #fff;
            padding: 20px;
            border-radius: 5px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }

        /* Style for input fields and labels */
        input[type="text"] {
            width: 98%;
            padding: 10px;
            margin-bottom: 10px;
            border: 1px solid #ccc;
            border-radius: 5px;
        }

        /* Style for the submit button */
        input[type="submit"] {
            background-color: #007bff;
            color: #fff;
            padding: 10px 20px;
            border: none;
            border-radius: 5px;
            cursor: pointer;
        }

        /* Style for the form labels */
        label {
            display: block;
            font-weight: bold;
        }

        /* Add spacing between form elements */
        br {
            margin-bottom: 10px;
        }

        /* Style for the title */
        h1 {
            font-family: 'Playfair Display', serif;
            padding-top: 50px;
            text-align: center;
            font-size: 50px;
            color: white;
        }
        
        /* Header and Navigation Bar Styles */
        .header {
            background-color: #f1f1f1;
            padding: 10px 15px;
            font-size: 50px;
            height: 170px;
            background-image: linear-gradient(rgba(0,0,0,0.4),rgba(0,0,0,0.4)), url(css/header.jpg);
            color: white;
            display: flex;
            align-items: center;
            justify-content: space-evenly;
            color: #f5f5f5;
            text-shadow: 1px 1px 1px #919191, 1px 2px 1px #919191, 1px 3px 1px
                #919191, 1px 4px 1px #919191, 1px 5px 1px #919191, 1px 6px 1px #919191,
                1px 7px 1px #919191, 1px 8px 1px #919191, 1px 9px 1px #919191, 1px
                10px 1px #919191, 1px 18px 6px rgba(16, 16, 16, 0.4), 1px 22px 10px
                rgba(16, 16, 16, 0.2), 1px 25px 35px rgba(16, 16, 16, 0.2), 1px 30px
                60px rgba(16, 16, 16, 0.4);
        }

        .topnav {
            overflow: hidden;
            background-color: #011719;
            height: 50px;
            list-style-type: none;
            margin: 0;
        }

        .topnav a {
            float: right;
            display: block;
            color: white;
            text-align: center;
            text-decoration: none;
            padding: 14px 18px;
            margin: 5px 20px;
            font-size: 15px;
        }

        .topnav a:hover {
            background-color: #5A5A5A;
            color: black;
        }
        
        
        

        /* Style footer */
        footer {
            margin-top: 15%;
            padding: 25px;
            text-align: center;
            color: white;
            background-color: rgb(2,0,36);
			background-color: linear-gradient(180deg, rgba(2,0,36,1) 33%, rgba(4,4,75,1) 65%, rgba(8,37,164,1) 93%, rgba(0,212,255,1) 93%);
        }

        footer img {
            border-radius: 50%;
        }

        footer p {
            font-size: 20px;
        }

        .footcon {
            display: flex;
            align-items: center;
            justify-content: space-around;
            justify-items: center;
        }
    </style>
</head>
<body>

    <div class="header">
        <img class="imge" src="css/logo.png" width="200px" height="100px">
        <h2>Dreamscape</h2>
    </div>
    <div class="topnav">
        <a href="#">Profile</a>
        <a href="#">Feedback</a>
        <a href="#">Link</a>
        <a href="#">packages</a>
        <a href="#">Home</a>
    </div>


    <%
        String id = request.getParameter("id");
        String fname = request.getParameter("fname");
        String lname = request.getParameter("lname");
        String email = request.getParameter("email");
        String phone = request.getParameter("phone");
        String eventType = request.getParameter("eventType");
        String guestCount = request.getParameter("gCount");
        String date = request.getParameter("date");
        String city = request.getParameter("city");
        String needs = request.getParameter("needs");
        String budget = request.getParameter("budget");
        String additionalInfo = request.getParameter("additionalInfo");
    %>

    <br><br><br>
    <h1>Delete Event Request</h1><br><br>

    <form action="delete" method="post">
        <label for="id">Request ID:</label>
        <input type="text" name="id" value="<%=id%>" readonly><br>

        <label for="fname">First Name:</label>
        <input type="text" name="fname" value="<%= fname %>" readonly><br>

        <label for="lname">Last Name:</label>
        <input type="text" name="lname" value="<%= lname %>" readonly><br>

        <label for="email">Email:</label>
        <input type="text" name="email" value="<%= email %>" readonly><br>

        <label for="phone">Phone Number:</label>
        <input type="text" name="phone" value="<%= phone %>" readonly><br>

        <label for="eType">Event Type:</label>
        <input type="text" value="<%= eventType %>" readonly><br>

        <label for="guestCount">Guest Count:</label>
        <input type="text" name="guestCount" value="<%= guestCount %>" readonly><br>

        <label for="date">Date:</label>
        <input type="text" name="date" value="<%= date %>" readonly><br>

        <label for="city">City:</label>
        <input type="text" name="city" value="<%= city %>" readonly><br>

        <label for="needs">Event Needs:</label>
        <input type="text" name="needs" value="<%= needs %>" readonly><br>

        <label for="budget">Budget:</label>
        <input type="text" name="budget" value="<%= budget %>" readonly><br>

        <label for="additionalInfo">Additional Information:</label>
        <input type="text" name="additionalInfo" value="<%= additionalInfo %>" readonly><br><br>

        <input type="submit" name="submit" value="Delete Request"><br>
    </form>

    <!-- Footer -->
    <footer>
        <h2>Dreamscape <br>--------------------</h2>
        <p>We are here to make your dreams come true.</p>
        <div class="footcon">
            <img class="image" src="css/email.jpg" width="60px" height="60px">
            <h3>dreamscap223@gmail.com</h3>
            <img class="image" src="css/insta.jpg" width="60px" height="60px">
            <h3>Dreamscape</h3>
            <img class="image" src="css/fb.jpg" width="60px" height="60px">
            <h3>Dreamscape</h3>
        </div>
    </footer>
</body>
</html>
