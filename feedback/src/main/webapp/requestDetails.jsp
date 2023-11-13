<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>request_details</title>

    <style type="text/css">
        body {
        	background-image: url("css/bg1.jpg");
            background-size: cover; /* Cover the entire viewport */
            font-family: 'Hind SemiBold', sans-serif;
            margin: 0;
            padding: 0;
        }

        h1 {
            font-family: 'Playfair Display', serif;
            padding-top: 50px;
            text-align: center;
            font-size: 50px;
            color: white;
        }

        table {
            border-collapse: collapse;
            width: 80%;
            margin: 20px auto;
            background-color: white;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }

        th, td {
            padding: 10px;
            text-align: left;
        }

        th {
            background-color: #3e64ff;
            color: white;
        }

        tr:nth-child(even) {
            background-color: #f2f2f2;
        }

        a {
            text-decoration: none;
        }

        .button-container {
            justify-content: space-between;
            width: 80%;
            margin-top: 25px;
            padding-left: 120px;
        }

        /* Update and Delete button */
        .udbtn {
            background-color: #3e64ff;
            color: white;
            border: none;
            margin-left: 25px;
            padding: 10px 20px;
            cursor: pointer;
            transition: background-color 0.3s, transform 0.2s;
        }

        .udbtn:hover {
            background-color: #2745e9;
            transform: scale(1.05);
        }
        
        .paymentbtn{
            background-color: #3e64ff;
            color: white;
            border: none;
            margin-left: 25px;
            padding: 10px 20px;
            cursor: pointer;
            transition: background-color 0.3s, transform 0.2s;
        	
        }
        .paymentbtn:hover {
            background-color: #2745e9;
            transform: scale(1.05);
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

        /* Header */
        

        .imge {
            padding: 5px 5px;
            border-radius: 10px;
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


        @media (max-width: 600px) {
            nav, article {
                width: 100%;
                height: auto;
            }
        }
    </style>
</head>
<body>

    <!-- Header -->
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

    <h1>Request Details</h1>

    <table>
        <c:forEach var="evDetails" items="${EvDetails}">
            <c:set var="id" value="${evDetails.id}" />
            <c:set var="fname" value="${evDetails.firstName}" />
            <c:set var="lname" value="${evDetails.lastName}" />
            <c:set var="email" value="${evDetails.email}" />
            <c:set var="phone" value="${evDetails.phone}" />
            <c:set var="eType" value="${evDetails.eventType}" />
            <c:set var="gCount" value="${evDetails.guestCount}" />
            <c:set var="date" value="${evDetails.date}" />
            <c:set var="city" value="${evDetails.city}" />
            <c:set var="needs" value="${evDetails.needs}" />
            <c:set var="budget" value="${evDetails.budget}" />
            <c:set var="additionalInfo" value="${evDetails.additionalInfo}" />
            <tr>
                <td>Event ID</td>
                <td>${evDetails.id}</td>
            </tr>
            <tr>
                <td>First Name</td>
                <td>${evDetails.firstName}</td>
            </tr>
            <tr>
                <td>Last Name</td>
                <td>${evDetails.lastName}</td>
            </tr>
            <tr>
                <td>Email</td>
                <td>${evDetails.email}</td>
            </tr>
            <tr>
                <td>Phone Number</td>
                <td>${evDetails.phone}</td>
            </tr>
            <tr>
                <td>Event Type</td>
                <td>${evDetails.eventType}</td>
            </tr>
            <tr>
                <td>Guest Count</td>
                <td>${evDetails.guestCount}</td>
            </tr>
            <tr>
                <td>Date</td>
                <td>${evDetails.date}</td>
            </tr>
            <tr>
                <td>City</td>
                <td>${evDetails.city}</td>
            </tr>
            <tr>
                <td>Event Needs</td>
                <td>${evDetails.needs}</td>
            </tr>
            <tr>
                <td>Budget</td>
                <td>${evDetails.budget}</td>
            </tr>
            <tr>
                <td>Additional Informations</td>
                <td>${evDetails.additionalInfo}</td>
            </tr>
        </c:forEach>
    </table>

    <c:url value="updateEventRequest.jsp" var="requestUpdate">
        <c:param name="id" value="${id}" />
        <c:param name="fname" value="${fname}" />
        <c:param name="lname" value="${lname}" />
        <c:param name="email" value="${email}" />
        <c:param name="phone" value="${phone}" />
        <c:param name="eventType" value="${eType}" />
        <c:param name="gCount" value="${gCount}" />
        <c:param name="date" value="${date}" />
        <c:param name="city" value="${city}" />
        <c:param name="needs" value="${needs}" />
        <c:param name="budget" value="${budget}" />
        <c:param name="additionalInfo" value="${additionalInfo}" />
    </c:url>

    <div class="button-container">
        <a href="${requestUpdate}">
            <input type="button" class="udbtn" value="Update">
        </a>

        <c:url value="deleteEventRequest.jsp" var="requestDelete">
            <c:param name="id" value="${id}" />
            <c:param name="fname" value="${fname}" />
            <c:param name="lname" value="${lname}" />
            <c:param name="email" value="${email}" />
            <c:param name="phone" value="${phone}" />
            <c:param name="eventType" value="${eType}" />
            <c:param name="gCount" value="${gCount}" />
            <c:param name="date" value="${date}" />
            <c:param name="city" value="${city}" />
            <c:param name="needs" value="${needs}" />
            <c:param name="budget" value="${budget}" />
            <c:param name="additionalInfo" value="${additionalInfo}" />
        </c:url>

        <a href="${requestDelete}">
            <input type="button" class="udbtn" value="Delete Request">
        </a>
        
        <a href="payment.jsp">
            <input type="button" class="paymentbtn" value="Make Down Payment">
        </a>
    </div>

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
