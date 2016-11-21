<%-- 
    Document   : rent
    Created on : Nov 17, 2016, 5:37:46 PM
    Author     : kourt
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <link href="style.css" rel="stylesheet" type="text/css">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Skier|Rent</title>
    </head>
    <body>
        <%@ include file="header.jsp" %>
        <div class="form">
            <form method="POST" action="Rent.do">
                First name: ${firstName}<br>
                Last name: ${lastName}<br>
                Height in cm: <input type="text" name="height" maxlength="3" size="12" value="${height}"><br>
                Weight in kg: <input type="text" name="weight" maxlength="3" size="12" value="${weight}"><br>            
                Foot size: <input type="text" name="fsize" maxlength="2" size="12" value="${foot}"><br>
                Experience<br>
                <input type="radio" name="exp" value="beginner"> Beginner<br>
                <input type="radio" name="exp" value="intermediate"> Intermediate<br>
                <input type="radio" name="exp" value="experienced"> Experienced<br>
                <input type="submit" value="Rent">
            </form>
        </div>
    </body>
</html>