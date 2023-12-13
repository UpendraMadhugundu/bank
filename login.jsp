<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>My WorldBank</title>
<style>
        body{
            width: 1000px;
            height: 700px;
            text-align: center;
            background-image: linear-gradient(120deg,#a629b9,#6544ad);

        }
        .container{
            width: 400px;
            height: 400px;
            background-color: #ffff;
            border: 1px solid black;
            border-radius: 30px;
            position: relative;
            top: 150px;
            left: 250px;
        }
        .stage{
            margin-top: 100px;
        }
        .inputs{
            width: 300px;
            height: 40px;
            border-radius: 13px;
            font-size: 20px;
            
        }
        #button{
            width: 100px;
            height: 40px;
            font-size: 20px;
            color: black;
            background-color: #ffff;
            border-radius: 10px;
            position: relative;
            top: 0px;
        }
        #button:hover {
            background-color: lightgray;
        }
        a{
            color: deepskyblue;
        }
        p{
            position: relative;
            top: 70px;
        }

    </style>
</head>
<body>

	<% 
		String msg =(String) request.getAttribute("msg");
		if(msg != null){
	%>
	<%= msg %>
	<%
		}
	%>

<center>
    <div class="container">
        <div class="stage">
        <form action="loginjsp" method="post">
            <input class="inputs" type="text" name="accountNo" placeholder="Enter account Number" required>
        	<br><br>
            <input class="inputs" type="password" name="password" placeholder="Enter password" required>
            <br><br>
            <input id="button" type="submit" value="login">
            <p>If you don't have account <a href="register.html">signup</a> here</p>
        </form>
        </div>
    </div>
</center>

</body>
</html>