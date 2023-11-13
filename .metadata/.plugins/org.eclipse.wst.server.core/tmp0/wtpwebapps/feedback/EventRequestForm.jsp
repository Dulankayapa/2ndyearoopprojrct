<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>EventRequestForm</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <style>
        body {
            background-image: url("css/background.jpg");
            background-size: cover;
            background-color: #D6EAF8;
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
        }

        form {
            background-color: rgba(255, 255, 255, 0.7);
            border: 1px solid #ccc;
            border-radius: 10px;
            padding: 20px;
            width: 60%;
            margin: 0 auto;
        }

        h1 {
            font-family: 'Playfair Display', serif;
            padding-top: 50px;
            text-align: center;
            font-size: 50px;
            color: white;
        }

        label {
            display: block;
            margin-top: 10px;
        }

        input[type="text"],
        input[type="email"],
        input[type="tel"],
        input[type="number"],
        input[type="date"] {
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
            background-color: black;
            color: white;
            padding: 15px 55px;
            border: none;
            border-radius: 5px;
            cursor: pointer;
            display: block;
            margin: 0 auto;
            margin-top: 20px;
            transition: background-color 0.3s ease;
        }

        input[type="submit"]:hover {
            background-color: #0056b3;
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

        /* Media Queries for Responsiveness */
        @media (max-width: 768px) {
            .header {
                height: 100px;
                font-size: 30px;
            }

            .topnav {
                height: auto;
                padding: 10px;
            }

            .topnav a {
                display: inline-block;
                margin: 0 10px;
                font-size: 12px;
            }

            h1 {
                font-size: 40px;
            }

            form {
                width: 80%;
            }
        }

        @media (max-width: 480px) {
            .header {
                height: 80px;
                font-size: 20px;
            }

            .topnav a {
                display: inline-block;
                margin: 0 5px;
                font-size: 10px;
            }

            h1 {
                font-size: 30px;
            }

            form {
                width: 90%;
            }
        }
    </style>
</head>
<body>
    <div class="header">
        <img class="imge" src="css/logo.png" width="200px" height="100px">
        <h2>Dreamscape</h2>
    </div>
    <div class="topnav">
         <a href="fform.jsp">feedback</a><a href="EventGallery.jsp">Gallery</a>
			<a href="EventRequestForm.jsp">let's chat</a> <a href="packageaccount.jsp">Package</a> <a href="home.jsp">Home</a>
    </div>

    <h1 >Event Request Form</h1>

    <br><br>

    <form action="requestInsert" method="post">
        <label for="fname">First name:</label>
        <input type="text" name="fname"><br>

        <label for="lname">Last name:</label>
        <input type="text" name="lname"><br>

        <label for="email">Email:</label>
        <input type="email" name="email"><br>

        <label for="phone">Phone:</label>
        <input type="tel" name="phone"><br>

        <label>Event type:</label><br><br>
        <input type="radio" name="radio" value="Personal Event" checked> Personal Event<br>
        <input type="radio" name="radio" value="Parties and Social Gatherings"> Parties and Social Gatherings<br>
        <input type="radio" name="radio" value="Concerts and Music Festivals"> Concerts and Music Festivals<br>
        <input type="radio" name="radio" value="Sport Event"> Sport Event<br>
        <input type="radio" name="radio" value="Wedding Event"> Wedding Event<br>
        <input type="radio" name="radio" value="Educational Event"> Educational Event<br>
        <br><br>

        <label for="guestCount">Estimated Guest Count:</label>
        <input type="number" name="guestCount"><br>

        <label for="date">Event Date :</label>
        <input type="text" name="date"><br>

        <label for="city">In what city do you plan to celebrate?</label>
        <input type="text" name="city"><br>

        <label for="needs">Planning needs:</label>
        <input type="text" name="needs"><br>

        <label for="budget">Estimated budget:</label>
        <input type="number" name="budget"><br>

        <label for="additionals">Additional Information:</label>
        <input type="text" name="additionals"><br><br>

        <input type="submit" name="submit" value="Submit">
    </form>

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
