<%-- 
    Document   : login
    Created on : Oct 20, 2016, 12:59:44 AM
    Author     : kouridis
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<link href="style.css" rel="stylesheet" type="text/css">
<title>Skier</title>
<body>
    <br><br>
    <div align="center">
        <div class="form">
            <h1 align="center">Login</h1>
            <form  method="POST" action="Login.do">
                <input type="text" placeholder="Email or Username" name="username" required>
                <input type="password" placeholder="Password" name="password" required>
                <a href="">Forgot password?</a>
                <button type="submit">Log In</button>
                <form method="GET" action="Signup.do">
                    <button type="submit">Sign Up</button>
                </form>
            </form>
        </div>
    </div>
</body>
</html>

