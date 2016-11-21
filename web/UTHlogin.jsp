<%-- 
    Document   : UTHlogin
    Created on : Nov 20, 2016, 7:04:43 PM
    Author     : kourt
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <link href="style.css" rel="stylesheet" type="text/css">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Skier|UTH Log in</title>
    </head>
    <body>
        <%@ include file="header.jsp" %>
        <div align="center">
            <div class="uth">
                <form  method="POST" action="UTHLogin.do">
                    <input type="hidden" name="from" value="${param.from}">
                    <input type="text" placeholder="Username" name="username" required><br>
                    <input type="password" placeholder="Password" name="password" required><br>

                    <input type="submit" name="skierlogin" value="Log In"><br>
                    </div>
                </form>
            </div>
        </div>
    </body>
</html>
