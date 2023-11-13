<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Payment Form</title>
    <style>
        body {
        	background-image: url("css/paybackground.jpg");
            background-size: cover;
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
            background-size: cover;
            background-color: #D6EAF8;
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
        }
        .container {
            max-width: 400px;
            margin: 150px auto;
            padding: 20px;
            background-color: #fff;
            border-radius: 5px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.2);
        }
        h2 {
            text-align: center;
        }
        label {
            display: block;
            margin: 10px 0;
        }
        input[type="text"], input[type="number"], input[type="date"], input[type="text"] {
            width: 70%;
            padding: 10px;
            margin-bottom: 10px;
            border: 1px solid #ccc;
            border-radius: 4px;
        }
        input[type="submit"] {
            background-color: #4CAF50;
            color: white;
            padding: 10px 20px;
            border: none;
            border-radius: 4px;
            cursor: pointer;
        }
        input[type="submit"]:hover {
            background-color: #45a049;
         
        }
        
        
                body {
            font-family: Arial, sans-serif;
            background-color: #f0f0f0;
            text-align: center;
        }

        h1 {
            color: #007bff;
            font-size: 36px;
            margin-top: 100px;
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
	
    <div class="container">
        <h2>Payment Form</h2>
        <form id="payment-form">
            <label for="name">Name on Card</label>
            <input type="text" id="name" placeholder="John Doe" required>
            
            <label for="card-number">Card Number</label>
            <input type="text" id="card-number" placeholder="1234 5678 9012 3456" required>
            
            <label for="expiry">Expiration Date</label>
            <input type="text" id="expiry" placeholder="MM/YY" required>
            
            <label for="cvv">CVV</label>
            <input type="number" id="cvv" placeholder="123" required>
            
            <input type="submit" value="Submit Payment">
        </form>
    </div>

    <script>
        document.getElementById("payment-form").addEventListener("submit", function (e) {
            e.preventDefault();
            // Handle form submission, e.g., send payment data to your server for processing.
            // You would typically use a secure payment gateway for this.
            alert("Payment submitted.");
        });
    </script>
    

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
