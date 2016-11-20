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
        <%@ include file="header.jsp" %>
        <form method="POST" action="Profile.do">
            First name: ${firstName}<br>
            Last name: ${lastName}<br>
            E-mail: ${email}<br>
            Gender: ${gender}<br>
            Height in cm: ${height}<br>
            Weight in kg: ${weight}<br>
            Foot size: ${foot}<br>
            Experience: ${exp}<br>
            
            <input type="submit" name="update" value="Update info">
            <input type="submit" name="password" value="Change password">
        </form>
    </body>
</html>
