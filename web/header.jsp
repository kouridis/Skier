<h1>Skier</h1>
<ul>
    <li>
        <form method="GET" action="/Skier">
            <input type="submit" value="Home"/>
        </form>
    </li>
    <c:choose>
        <c:when test="${sessionScope.user == null}">
            <li style="float:right">
                <form method="GET" action="login.jsp">
                    <input type="hidden" name="from" value=${pageContext.request.requestURI}>
                    <input type="submit" value="Log In"/>
                </form>
            </li>
        </c:when>
        <c:otherwise>
            <li style="float:right">
                <form method="GET" action="Logout.do">
                    <input type="hidden" name="from" value=${pageContext.request.requestURI}>
                    <input type="submit" value="Logout"/>
                </form>
            </li>
            <li style="float:right">
                <form method="GET" action="Profile.do">
                    <input type="submit" value=${sessionScope.user}>
                </form>
            </li>
        </c:otherwise>
    </c:choose>
</ul>
<br><br>