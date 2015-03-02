<%--
  Created by IntelliJ IDEA.
  User: max
  Date: 16/02/15
  Time: 20:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Test JSP</title>
</head>
<body>
    <%
        String username = request.getParameter("name");
        if(!username.isEmpty()) {
            pageContext.setAttribute("AppName", username, PageContext.APPLICATION_SCOPE);
        }
    %>
<%=pageContext.getAttribute("AppName", PageContext.APPLICATION_SCOPE)%>
<%=pageContext.findAttribute("AppName")%>
<%
    getServletConfig().getInitParameter("")
%>
</body>
</html>
