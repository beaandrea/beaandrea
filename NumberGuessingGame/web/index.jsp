<%@ page import="classes.GameLogic" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome Page</title>
        <link rel="stylesheet" href="https://fonts.googleapis.com/css2?family=Poppins:wght@700&display=swap">
        <style>
            body {
                font-family: 'Poppins', sans-serif;
                background: #E5C3D1;
                background: radial-gradient(circle, #E5C3D1 0%, #7D82B8 100%);
                margin: 0;
                padding: 0;
                display: flex;
                flex-direction: column;
                align-items: center;
                justify-content: center;
                text-align: center;
                height: 100%;
                overflow: hidden;
            }

            .game-container h1{
                color: #613F75;
                font-size: 50px;
            }

            .game-container p{
                font-size: 25px;
            }

            .game-container input{
                height: 40px;
                width: 250px;
                padding: 0;
                border-radius: 15px;
                border: none;
                text-align: center;
            }

            .game-container button{
                height: 40px;
                width: 120px;
                padding: 0;
                border-radius: 15px;
                border: none;
                background-color: #F7A9A8;
            }

            .game-container button:hover{
                background-color: #EF798A;
                color: #FFFFFF;
            }

            ::placeholder{
                text-align: center;
            }
        </style>
    </head>
    <body>
        <div class="game-container">
            <h1>Welcome to the Number Guessing Game</h1>
            <p>How would you like us to call you?</p>
            <form action="GameServlet" method="post">
                <input type="text" name="nickname" placeholder="Enter your name">
                <button type="submit">Submit name</button>
            </form>
        </div>
    </body>
</html>
