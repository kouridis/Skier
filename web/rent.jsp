<%-- 
    Document   : rent
    Created on : Nov 17, 2016, 5:37:46 PM
    Author     : kourt
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Skier|Rent</title>
    </head>
    <body>
        <%@ include file="header.jsp" %>
        <form method="POST" action="Rent.do">
            <%-- 
            <input type="text" placeholder="First name" name="fname" required><br>
            <input type="text" placeholder="Last name" name="lname" required><br>
            <input type="email" placeholder="Email" name="email" required><br>
            <input type="radio" name="gender" value="male" > Male<br>
            <input type="radio" name="gender" value="female"> Female<br>
            --%>
            <input type="text" placeholder="Height in cm" name="height" maxlength="3" size="12"><br>
            <input type="text" placeholder="Foot size" name="fsize" maxlength="2" size="12"><br>
            <input type="text" placeholder="Weight in kg" name="weight" maxlength="2" size="12"><br>
            <input type="radio" name="exp" value="beginner" checked> Beginner<br>
            <input type="radio" name="exp" value="intermediate"> Intermediate<br>
            <input type="radio" name="exp" value="experienced"> Experienced<br>
            
            <input type="submit" value="Rent">
        </form>
    </body>
</html>