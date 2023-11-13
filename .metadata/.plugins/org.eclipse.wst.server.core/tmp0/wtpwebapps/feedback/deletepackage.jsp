<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Package Delete</title>
<link rel="icon" type="css/logo.png" href="css/icon.png">
<style>
  body {
    margin: 0;
 	padding: 0;
 	background-size: cover;
  	background-repeat: no repeat;
  	background-position: center;
  	background-image: linear-gradient(rgba(0,0,0,0.4),rgba(0,0,0,0.4)),url(css/gallery2.jpg);
    background-color: #add8e6;
    font-family: Arial, sans-serif;
  }
  
  form {
    opacity: 0.8;
    background-color: #ffff;
    border: 1px solid #ccc;
    border-radius: 10px;
    padding: 20px;
    width: 60%;
    margin: 0 auto;
  }


  label {
    display: block;
    margin-top: 10px;
  }

  input[type="text"],
  input[type="text"],
  input[type="text"],
  input[type="text"],
  input[type="text"] {
    width: 100%;
    max-width: 97%;
    padding: 10px;
    margin: 5px 0;
    
    border: 1px solid #ddd;
    border-radius: 5px;
  }

  input[type="radio"] {
    margin: 5px 10px 5px 0;
  }

  input[type="submit"] {
  	font-size: 20px;
    background-color: red;
    color: #fff;
    padding: 15px 55px; /* Increase button size */
    border: none;
    border-radius: 5px;
    cursor: pointer;
    display: block;
    margin: 0 auto;
    margin-top: 20px;
    transition: background-color 0.3s ease; /* Add animation */
  }

  input[type="submit"]:hover {
    background-color: #5c1212;
  }
  
  /*header*/
.header {
	background-color: #f1f1f1;
	padding: 0px 0px;
	font-size: 50px;
	height: 170px;
	background-image: linear-gradient(rgba(0,0,0,0.4),rgba(0,0,0,0.4)),url(css/header.jpg);
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
	
h1 {
    font-family: "Helvetica", sans-serif;
    font-size: 36px;
    color: white; /* Text color */
    text-align: center; /* Center align the text */
    text-shadow: 2px 2px 4px rgba(0, 0, 0, 0.5); /* Text shadow */
  }
  
 
  .lform {
  font-weight: bold;
  color: #333;
  margin-bottom: 5px;
}
  
</style>
  
</head>
<body>

   <div class="header">
		<img class="imge" src="css/logo.png" width="200px" height="100px" >
		<h2>Dreamscape</h2>
	</div>
	<div class="topnav">
		<a href="#">Profile</a> <a href="#">Feedback</a> <a href="#">Link</a> <a
			href="#">packages</a> <a href="#">Home</a>
	</div>

<h1>Delete the Package</h1>

	<%
	
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		String type = request.getParameter("type");
		String description = request.getParameter("desc");
		String location = request.getParameter("loc");
		String cost = request.getParameter("cost");
	
	%>
	
	<form action="DeletePackageServlet" method="post">

	<label class="lform" for="pid">Package ID:</label>
    <input type="text" name="pid" value="<%= id%>" readonly><br>

	<label class="lform" for="pname">Package name:</label>
    <input type="text" name="packagename" value="<%= name%>" readonly><br>
    
      <label class="lform">Event type:</label><br>
      <input type="text"  value="<%= type%>" readonly><br>
    <input type="radio" name="radio" value="Personal Event"> Personal Event<br>
    <input type="radio" name="radio" value="Parties and Social Gatherings"> Parties and Social Gatherings<br>
    <input type="radio" name="radio" value="Concerts and Music Festivals"> Concerts and Music Festivals<br>
    <input type="radio" name="radio" value="Sport Event"> Sport Event<br>
    <input type="radio" name="radio" value="Wedding Event"> Wedding Event<br>
    <input type="radio" name="radio" value="Educational Event"> Educational Event<br>
    <br><br>

    <label class="lform" for="desc">Description:</label>
    <input type="text" name="description" value="<%= description%>"readonly><br>

    <label class="lform" for="location">Location:</label>
    <input type="text" name="location" value="<%= location%>"readonly><br>

    <label class="lform" for="cost">Cost:</label>
    <input type="text" name="cost" value="<%= cost%>"readonly><br>

    <input type="submit" name="submit" value="Delete package">
</form>
	
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