<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
<link rel="icon" type="css/logo.png" href="css/icon.png">
<style>
    body {
        font-family: Arial, sans-serif;
        background-color: ;
        background-image: linear-gradient(rgba(0,0,0,0.4),rgba(0,0,0,0.4)),url(css/gallery7.jpg);
  		background-size: cover;
  		background-repeat: no repeat;
  		background-position: center;
        text-align: center;
        margin: 0;
        padding: 0;
    }

    form {
        max-width: 400px;
        opacity: 0.9;
        margin: 80px auto;
        padding: 50px;
        background-color: #c0c0c0;
        border: 1px solid #ccc;
        border-radius: 5px;
        box-shadow: 0 2px 5px rgba(0, 0, 0, 0.1);
    }

    form input[type="text"] {
        width: 100%;
        padding: 10px;
        margin: 10px 0;
        border: 1px solid #ccc;
        border-radius: 3px;
    }

    form input[type="submit"] {
        background-color: #007BFF;
        color: #fff;
        padding: 10px 50px;
        border: none;
        border-radius: 3px;
        cursor: pointer;
    }

    form input[type="submit"]:hover {
        background-color: #0056b3;
    }
    
    .title{
     font-weight: bold;
 	 color: #333;
 	 margin-bottom: 5px;
    }
        .form-group {
            margin: 10px 0;
        }

        .form-group label {
            display: block;
            font-weight: bold;
        }

        .form-group input {
            width: 100%;
            padding: 10px;
            border: 1px solid #ccc;
            border-radius: 3px;
        }

        .form-group button {
            background-color: #007BFF;
            color: #fff;
            border: none;
            border-radius: 3px;
            padding: 10px 15px;
            cursor: pointer;
        }
    
</style>
</head>
<body>
    <form action="adminLoginServlet" method="post">
        <h1>Log in</h1>
        <h3>* Please log in to system as a admin *</h3>
        <label class="title">User Name</label> <input  type="text" name="username" placeholder="Enter User Name"><br>
        <div class="form-group">
        <label class="title">password</label>
        <input type="password" name="password" placeholder="Enter your password">
        </div>
        <br>
        <input type="submit" name="submit" value="Login">
    </form>
</body>
</html>