<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Beautiful Login Page</title>
    <style>
        body {
             background-image: url("Case-Event-economics.jpg");
    background-size: cover;
    background-position: center;
    background-repeat: no-repeat;
            font-family: Arial, sans-serif;
             margin: 0;
        }

        .login-container {
            background: rgba(147, 145, 145, 0.8);
            border-radius: 10px;
            text-align: center;
            padding: 20px;
            width: 350px;
             margin: 170px auto;
           
           
         
        }

        h2 {
            color: #0b0707;
        }

        input[type="text"],
        input[type="password"] {
            width: 300px;
            padding: 10px;
            margin: 10px 0;
            border: none;
            border-bottom: 1px solid #333;
            outline: none;
        }

        input[type="submit"] {
            background-color: #333;
            color: #fff;
            padding: 10px 20px;
            border: none;
            border-radius: 5px;
            cursor: pointer;
            margin:10px;
        }

        input[type="submit"]:hover {
            background-color: #0a0808;
        }
        .back{
        text-align:left;
        margin-left:30px;
        font-size: 40px;
        
        }
        
    </style>
</head>
<body>
 <a style="text-decoration: none; " href="home.jsp">
<span class="back">&#11160;</span></a>
<div class="login-container">
    <form action="log" method="post">
        <h2>Login</h2>
        User Name <input type="text" name="uid" required><br>
        Password <input type="password" name="pass" required><br>
        <input type="submit" name="submit" value="Login"><br>
        <a href ="updateaccount.jsp">Forgot Password</a><br>
        <a href="Registration.jsp">   Register </a>
    </form>
    </div>
</body>
</html>
