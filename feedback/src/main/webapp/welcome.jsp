<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>DreamScape</title>
<style>
* {
	margin: 0;
	padding: 0;
}

body {
	background-image: linear-gradient(rgba(0, 0, 0, 0.3), rgba(0, 0, 0, 0.3)),
		url("pexels-pixabay-206359.jpg");
	background-repeat: no-repeat;
	background-position: center;
	background-size: cover;
	background-attachment: fixed;
}

img {
	border-radius: 40px;
	width: 120px;
	height: 80px;
	margin: 0;
	padding: 20px;
}

h2 {
	font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
	text-align: center;
	color: aliceblue;
	font-size: 32px;
	margin: 0% 0% 0% 0%;
	padding: 0%;
}

h1 {
	text-align: center;
	font-size: 90px;
	font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
	color: aliceblue;
	text-shadow: 5px 5px black;
	margin: 0%;
	padding: 0%;
}

p {
	font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
	text-align: center;
	color: azure;
	line-height: 1.4;
	margin: 50px 50px 60px 50px;
}

.showcase {
	justify-content: center;
	align-items: center;
	text-align: center;
}

.button {
	font-size: 18px;
	text-decoration: none;
	color: black;
	border: yellowgreen 2px solid;
	padding: 10px 20px;
	border-radius: 40px;
	margin-top: 5px;
}

.button:hover {
	background: green;
	color: aliceblue;
}

.nav-area {
	float: right;
	list-style: none;
	margin-top: 30px;
	padding-right: 10px;
}

.nav-area li {
	display: inline-block;
}

.nav-area li a {
	color: aliceblue;
	text-decoration: none;
	padding: 5px 10px;
	font-family: 'Trebuchet MS', 'Lucida Sans Unicode', 'Lucida Grande',
		'Lucida Sans', Arial, sans-serif;
	font-size: 18px;
	border-radius: 10px;
}

.nav-area li a:hover {
	background: aliceblue;
	color: blue;
}

.hometext {
	background-color: rgba(0, 0, 0, 0.5);
	color: white;
	padding: 10px;
	border-radius: 50px;
	box-shadow: 5px 5px 10px rgba(0, 0, 0, 0.3);
	text-align: justify;
	margin-top:50px;
}
</style>
</head>
<body>

	<img src="headerlogo.jpg" alt="logo" class="img">




	<ul class="nav-area">

		
		<li><a href="www.google.com">Contact Us</a></li>

	</ul>

	<h2>Hats off for landing to Page</h2>
	<h1>Welcome</h1>
	<div class="hometext">
		<p>Dreamscape, our innovative event management system, is your ultimate solution for turning event planning dreams into reality.
	 With a user-friendly interface, it caters to both seasoned professionals and newcomers, facilitating efficient event creation and management. 
	From venue selection to guest list coordination, Dreamscape covers every facet of event planning, 
	including budgeting, timelines, and team collaboration.
	 This comprehensive system streamlines vendor and resource management,
	  ensuring you have access to the best services and products at competitive rates. 
	Additionally, it offers secure ticketing and registration, customizable invitations, and powerful event promotion tools, making it simple to create engaging events.
	 Real-time analytics and mobile accessibility keep you informed and in control, 
	while stringent security measures protect your data and privacy. Dreamscape is your key to crafting unforgettable events, whether you're an event planner, 
	a bride and groom, or a small business owner. Make your dreams a reality with Dreamscape, the future of event management. </p>

	</div>

	<div class="showcase">
		<button class="button"> <a href="Registration.jsp">--LET'S START--</a></button>
	</div>

</body>
</html>