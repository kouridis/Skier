<%-- 
    Document   : profile
    Created on : Nov 20, 2016, 7:19:06 PM
    Author     : kourt
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Skier|Profile</title>
    </head>
    <body>
        <input type="text" placeholder="First name" name="fname" required><br>
        <input type="text" placeholder="Last name" name="lname" required><br>
        <input type="email" placeholder="Email" name="email" required><br>
        <input type="radio" name="gender" value="male" > Male<br>
        <input type="radio" name="gender" value="female"> Female<br>
    </body>
</html>
