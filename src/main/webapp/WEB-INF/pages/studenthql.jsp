
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="includes.jsp"%>
<html>
<head>
    <title>Student managment</title>
</head>
<body>
<h1>Student's Form</h1>
<table>
    <th>ID</th>
    <th>First name</th>
    <th>Last name</th>
    <th>E-mail</th>
    <c:forEach items="${studentList}" var="student">
        <tr>
            <td>${student.studentId}</td>
            <td>${student.firstname}</td>
            <td>${student.lastname}</td>
            <td>${student.email}</td>
        </tr>
    </c:forEach>

    <%--<c:forEach items="${studentNames}" var="studentNames">--%>
        <%--<tr>--%>
            <%--<td>${studentNames}</td>--%>
        <%--</tr>--%>
    <%--</c:forEach>--%>
</table>
</body>
</html>
