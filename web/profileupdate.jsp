<%-- 
    Document   : profileupdate
    Created on : Nov 20, 2016, 11:09:18 PM
    Author     : kourt
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Skier|Profile Update</title>
    </head>
    <body>
        <%@ include file="header.jsp" %>
        <form method="POST" action="Profile.do">
            First name: ${firstName}<br>
            Last name: ${lastName}<br>
            Gender<br>
            <input type="radio" name="gender" value="Male"> Male<br>
            <input type="radio" name="gender" value="Female"> Female<br>
            E-mail: <input type="email" name="email" placeholder=${email}><br>
            Height in cm: <input type="text" name="height" maxlength="3" size="12" placeholder=${height}><br>
            Weight in kg: <input type="text" name="weight" maxlength="3" size="12" placeholder=${weight}><br>            
            Foot size: <input type="text" name="foot" maxlength="2" size="12" placeholder=${foot}><br>
            Experience<br>
            <input type="radio" name="exp" value="beginner"> Beginner<br>
            <input type="radio" name="exp" value="intermediate"> Intermediate<br>
            <input type="radio" name="exp" value="experienced"> Experienced<br>
            
            <input type="submit" value="Update">
        </form>
    </body>
</html>
