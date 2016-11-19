<%-- 
    Document   : index
    Created on : Nov 19, 2016, 11:47:36 AM
    Author     : kourt
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Skier</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        Skier
        <form method="GET" action="login.jsp">
            <input type="submit" value="Log In"/>
        </form>
        <form  method="POST" action="SelectResort.do">
            <label for="resort">Select Resort</label>
            <select id="resort" name="resort">
                <option value="vigla">Viglas</option>
                <option value="pilio">Piliou</option>
                <option value="vasilita">Vasilitas</option>
            </select> 
            <br><br>
            <button type="submit" name="rent">Rent</button>
            <button type="submit" name="rent">Live</button>
            <button type="submit" name="select">Select</button>
        </form>
    </body>
</html>
