<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: max
  Date: 15/02/15
  Time: 11:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
<%
    if(request.getParameter("error") != null) {
        out.println("Authentication failed");
    }
%>
<a href="<c:url value="j_spring_security_logout" />" > Logout</a>

<%--<c:url var="logoutUrl" value="j_spring_security_logout"/>--%>
<%--<form action="${logoutUrl}" method="post">--%>
    <%--<input type="submit" value="Log out" />--%>
    <%--<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>--%>
<%--</form>--%>
<%--<c:url var="logoutUrl" value="/logout"/>--%>
<%--<form action="${logoutUrl}" method="post">--%>
    <%--<input type="submit" value="Log out" />--%>
    <%--<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>--%>
<%--</form>--%>
<form action="/logout.do?redirectTo=google.com" method="post">
    <input type="submit" value="Log out" />
    <%--<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>--%>
</form>
<a href="/logout.do?redirectTo=google.com">Log out</a>
<form action="/j_spring_security_check" method="post">
    <table>
        <tr>
            <td>Login:</td><td><input type="text" name="username"/></td>
        </tr>
        <tr>
            <td>Password:</td><td><input type="password" name="password"/></td>
        </tr>
        <tr>
            <td>Remember me:</td><td><input type="checkbox" name="remember_me" value="yes"/></td>
        </tr>
        <tr>
            <td colspan="2"><input type="submit" name="Submit"/></td>
        </tr>
    </table>
</form>
</body>
</html>
