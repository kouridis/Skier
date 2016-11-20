<form method="GET" action="/Skier">
    <input type="submit" value="Home"/>
</form>
<c:choose>
    <c:when test="${sessionScope.user == null}">
        <form method="GET" action="login.jsp">
            <input type="hidden" name="from" value=${pageContext.request.requestURI}>
            <input type="submit" value="Log In"/>
        </form>
    </c:when>
    <c:otherwise>
        <form method="GET" action="Logout.do">
            <input type="hidden" name="from" value=${pageContext.request.requestURI}>
            <input type="submit" value="Logout"/>
        </form>
        <form method="GET" action="profile.jsp">
            <input type="submit" value=${sessionScope.user}>
        </form>
    </c:otherwise>
</c:choose>