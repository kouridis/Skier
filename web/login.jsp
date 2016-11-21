<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<link href="style.css" rel="stylesheet" type="text/css">
<title>Skier</title>
<body>
    <%@ include file="header.jsp" %>
    <div align="center">
        <div class="form">
            <h1 align="center">Login</h1>
            <form  method="POST" action="Login.do">
                <input type="hidden" name="from" value="${param.from}">
                <input type="text" placeholder="Username" name="username" required><br>
                <input type="password" placeholder="Password" name="password" required><br>
                <input type="submit" name="skierlogin" value="Log In"><br>
                <a href="forgot.jsp">Forgot password?</a><br>
                ------ or ------<br>
            </form>
            <form method="GET" action="UTHLogin.do">
                <input type="submit" name="skierlogin" value="UTH Log In">
            </form>
            <form method="GET" action="GoogleLogin.do">
                <input type="submit" name="skierlogin" value="Google account">
            </form>
            <br>
            <form method="GET" action="signup.jsp">
                Don't have an account?<br>
                <input type="submit" name="skiersignup" value="Sign Up">
            </form>
        </div>
    </div>
</body>
</html>

