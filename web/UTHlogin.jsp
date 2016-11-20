<%-- 
    Document   : UTHlogin
    Created on : Nov 20, 2016, 7:04:43 PM
    Author     : kourt
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Skier|UTH Log in</title>
    </head>
    <body>
        <form  method="POST" action="UTHLogin.do">
            <input type="hidden" name="from" value="${param.from}">
            <input type="text" placeholder="Username" name="username" required><br>
            <input type="password" placeholder="Password" name="password" required><br>
            
            <input type="submit" name="skierlogin" value="Log In"><br>
        </form>
    </body>
</html>
