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
                <a href="forgot.jsp">Forgot password?</a>
                <input type="submit" name="skierlogin" value="Log In">
                or
                <form method="GET" action="UTHlogin.jsp">
                    <input type="submit" name="skierlogin" value="UTH Log In">
                </form>
                <form method="GET" action="GoogleLogin.do">
                    <input type="submit" name="skierlogin" value="Google account">
                </form>
                <form method="GET" action="signup.jsp">
                    Don't have an account?
                    <input type="submit" name="skiersignup" value="Sign Up">
                </form>
            </form>
        </div>
    </div>
</body>
</html>

