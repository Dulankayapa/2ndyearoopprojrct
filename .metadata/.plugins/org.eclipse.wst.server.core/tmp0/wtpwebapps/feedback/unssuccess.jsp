<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Error Page</title>
<link rel="icon" type="css/logo.png" href="css/icon.png">
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f2f2f2;
            text-align: center;
        }
        
        .error-container {
            background-color: #fff;
            border-radius: 10px;
            padding: 20px;
            margin: 100px auto;
            max-width: 400px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.2);
        }
        
        .error-icon {
            font-size: 100px;
            color: #f00;
        }
        
        .error-message {
            font-size: 24px;
            margin: 20px 0;
        }
        
        .error-description {
            font-size: 16px;
            color: #888;
        }
        
        .error-button {
            background-color: #f00;
            color: #fff;
            border: none;
            padding: 10px 20px;
            text-align: center;
            text-decoration: none;
            font-size: 16px;
            margin-top: 20px;
            display: inline-block;
            border-radius: 5px;
            cursor: pointer;
        }

        .error-button:hover {
            background-color: #d00;
        }
    </style>
</head>
<body>
    <div class="error-container">
        <div class="error-icon">&#9888;</div>
        <div class="error-message">Oops! Something went wrong.</div>
        <div class="error-description">We're sorry, but it seems there was an error during your package create.</div>
        <a class="error-button" href="createpackage.jsp">Return to Home</a>
    </div>
</body>
</html>