<%-- 
    Document   : index
    Created on : Nov 20, 2016, 12:14:59 PM
    Author     : kourt
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <link href="style.css" rel="stylesheet" type="text/css">
<!DOCTYPE html>
    <head>
        <title>Skier</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <%@ include file="header.jsp" %>
        <div align="center">
            <div class="form">
                <form method="GET" action="ActionResort.do">
                    <label for="resort">Select Resort</label>
                    <select id="resort" name="resort">
                        <option value="default"></option>
                        <option value="vigla">Viglas</option>
                        <option value="pilio">Piliou</option>
                        <option value="vasilita">Vasilitas</option>
                        <option value="test">TestResort</option>
                    </select> 
                    <br><br>
                    <input type="submit" name="act" value="Rent"/>
                    <input type="submit" name="act" value="Live"/>
                    <input type="submit" name="act" value="Select"/>
                </form>
            </div>
        </div>
    </body>
</html>
