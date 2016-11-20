<%-- 
    Document   : signup
    Created on : Nov 19, 2016, 8:39:19 PM
    Author     : kourt
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Skier | Sign up</title>
    </head>
    <body>
        <%@ include file="header.jsp" %>
        <form method="POST" action="Signup.do">
            <input type="text" placeholder="Username" name="username" required><br>
            <input type="password" placeholder="Password" name="password" required><br>
            <input type="email" placeholder="Email" name="email" required><br>
            
            <input type="submit" value="Create account">
        </form>
        
    </body>
</html>
