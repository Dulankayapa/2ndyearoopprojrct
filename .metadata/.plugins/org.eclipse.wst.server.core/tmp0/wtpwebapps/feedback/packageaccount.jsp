 <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
 <%@ page import=" userfeedback.*" %>
 <%@ page import="java.util.List" %>
    

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Packages</title>
<link rel="icon" type="css/logo.png" href="css/icon.png">
<style>
    body {
        font-family: Arial, sans-serif;
        background-image: linear-gradient(rgba(0,0,0,0.4),rgba(0,0,0,0.4)),url(css/gallery10.jpeg);
        background-color: #f0f0f0;
        image-size: cover;
        background-size: cover;
  		background-repeat: no repeat;
  		background-position: center;
        text-align: center;
        margin: 0;
        padding: 0;
    }

    h1 {
 
    font-family: "Helvetica", sans-serif;
    font-size: 36px;
    color: white; /* Text color */
    text-align: center; /* Center align the text */
    text-shadow: 2px 2px 4px rgba(0, 0, 0, 0.5); /* Text shadow */
    }

    table {
    	opcaity: 0.8;
        margin: 10px auto;
        border-collapse: collapse;
        background-color: #fff;
        border: 1px solid #ccc;
        box-shadow: 0 2px 5px rgba(0, 0, 0, 0.1);
    }

    th, td {
    	opacity: 0.8;
        padding: 10px 60px;
        text-align: left;
        border-bottom: 1px solid #ccc;
    }

    th {
    	opacity: 0.8;
        background-color: #007BFF;
        color: #fff;
    }
    


.imge {
	padding: 5px 5px;
	 border-radius: 10px;
}

/* navigation bar */
.topnav {
	overflow: hidden;
	background-color: #011719;
	height: 50px;
	list-style-type: none;
	margin: 0px;
	
}
/*  topnav links style */
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

/* Change color on hover */
.topnav a:hover {
	background-color: #5A5A5A;
	color: black;
}
    
    /*style footer*/
  
  /* Style the footer */
	footer {
		margin-top: 20%;
		background-color: #777;
		padding: 10px;
		text-align: center;
		color: white;
		background-color: #777;
		
	}
	
	footer img{
	border-radius: 50%;
	}
	
	footer p {
		font-size: 20px;
	}
	
	.footcon {
		display: flex;
		align-items: center;
		justify-content: space-around;
		justify-items: center;
		
	}
	
	 .success-button {
        display: inline-block;
        padding: 10px 20px;
        background-color: #4CAF50; /* Green background color */
        color: #fff; /* White text color */
        text-decoration: none;
        border: none;
        border-radius: 5px;
        cursor: pointer;
        font-size: 16px;
        transition: background-color 0.3s;
    }

    .success-button:hover {
        background-color: #005000; /* Darker green color on hover */
        
       }
       
       
       
    	.add-button {
        display: inline-block;
        padding: 10px 20px;
        background-color: red; /* Green background color */
        color: #fff; /* White text color */
        text-decoration: none;
        border: none;
        border-radius: 5px;
        cursor: pointer;
        font-size: 16px;
        transition: background-color 0.3s;
    }
     .add-button:hover {
        background-color: brown; /* Darker green color on hover */
    }
    .header {
	background-color: #f1f1f1;
	padding: 0px 0px;
	font-size: 50px;
	height: 170px;
	background-image: linear-gradient(rgba(0,0,0,0.4),rgba(0,0,0,0.4)),url(css/header1.jpg);
	background-size: cover;
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
		.imge {
  	padding: 0px 0px;
 	margin-right: 700px; /* Add margin to move the image to the left */
  	border-radius: 20px;
}
</style>
</head>
<body>
<div class="header">
		<img class="imge" src="css/logo.png" width="200px" height="100px" >
		<h2>Dreamscape</h2>
	</div>
	<div class="topnav">
		 <a href="fform.jsp">feedback</a><a href="EventGallery.jsp">Gallery</a>
			<a href="EventRequestForm.jsp">let's chat</a> <a href="#">Package</a> <a href="home.jsp">Home</a>
	</div>
	
    <h1>Here Our Packages</h1>
    
    <a class="add-button" href="adminlogin.jsp">Create new Package</a>
    
    <br><br>

    <table>
    
    	<thead>
					<tr class="table-warning ">
						<th>Package ID</th>
						<th>Package Name</th>
						<th>Package Type</th>
						<th>Description</th>
						<th>Location</th>
						<th>Cost</th>
						<th>Action</th>
						
					</tr>
		</thead>
    
	<c:forEach var = "pac" items="${packDetails}">
	
	
	<c:set var="id" value = "${pac.id}"/>
	<c:set var="name" value = "${pac.name}"/>
	<c:set var="type" value = "${pac.type}"/>
	<c:set var="description" value = "${pac.description}"/>
	<c:set var="location" value = "${pac.location}"/>
	<c:set var="cost" value = "${pac.cost}"/>
	

	
	<tr>
	
							<td><c:out value="${pac.id}" /></td>
							<td><c:out value="${pac.name}" /></td>
							<td><c:out value="${pac.type}" /></td>
							<td><c:out value="${pac.description}" /></td>
							<td><c:out value="${pac.location}" /></td>
							<td><c:out value="${pac.cost}" /></td>
							<td>     <c:url value="updatepackage.jsp" var="packupdate">
    	<c:param name="id" value="${id}"/>
    	<c:param name="name" value="${name}"/>
    	<c:param name="type" value="${type}"/>
    	<c:param name="desc" value="${description}"/>
    	<c:param name="loc" value="${location}"/>
    	<c:param name="cost" value="${cost}"/>
    </c:url>
   
   	<a href="${packupdate}">
   	<input class="success-button" type="button" name="update" value="Update package">
   	</a>
   	
  	    <c:url value="deletepackage.jsp" var="packdelete">
    	<c:param name="id" value="${id}"/>
    	<c:param name="name" value="${name}"/>
    	<c:param name="type" value="${type}"/>
    	<c:param name="desc" value="${description}"/>
    	<c:param name="loc" value="${location}"/>
    	<c:param name="cost" value="${cost}"/>
    </c:url>
    
      	 <c:url value="deletepackage.jsp" var="packdelete">
    	<c:param name="id" value="${id}"/>
    	<c:param name="name" value="${name}"/>
    	<c:param name="type" value="${type}"/>
    	<c:param name="desc" value="${description}"/>
    	<c:param name="loc" value="${location}"/>
    	<c:param name="cost" value="${cost}"/>
    </c:url>
    
   	<a href="${packdelete}">
   	<input class="add-button" type="button" name="delete" value="Delete package">
   	</a>
     </td>
						
					
	</tr>
    
    </c:forEach>
    </table>
    
    
    <footer>
			<h2>
				D r e a m s c a p e <br>--------------------
			</h2>

			<p>we here to make your dreams come true.</p>
			<div class="footcon">
				<img class="image" src="css/gmail.jpg" width="60px" height="60px">
				<h3>dreamscap223@gmail.com</h3>
				<img class="image" src="css/instagram.jpg" width="60px" height="60px">
				<h3>Dreamscape</h3>
				<img class="image" src="css/facebook.jpg" width="60px" height="60px">
				<h3>Dreamscape</h3>
			</div>


		</footer>
    
</body>
</html> 