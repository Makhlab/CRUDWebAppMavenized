<%--
  Created by IntelliJ IDEA.
  User: max
  Date: 05/02/15
  Time: 20:31
  To change this template use File | Settings | File Templates.
--%>
<%--<%@ page contentType="text/html;charset=UTF-8" language="java" %>--%>
<%--<%@ include file="includes.jsp"%>--%>
<%--<html>--%>
<%--<head>--%>
    <%--<title>Student managment</title>--%>
<%--</head>--%>
<%--<body>--%>
<%--Language: <a href="?language=en">English</a> | <a href="?language=ru">Russian</a>--%>
<%--<h1>Student's details</h1>--%>
    <%--<form:form action="student.do" method="post" commandName="student">--%>
        <%--<table>--%>
            <%--<tr>--%>
                <%--<td>ID</td>--%>
                <%--<td><form:input path="studentId"/></td>--%>
            <%--</tr>--%>
            <%--<tr>--%>
                <%--<td>First name</td>--%>
                <%--<td><form:input path="firstname"/></td>--%>
            <%--</tr>--%>
            <%--<tr>--%>
                <%--<td>Last name</td>--%>
                <%--<td><form:input path="lastname"/></td>--%>
            <%--</tr>--%>
            <%--<tr>--%>
                <%--<td>Email</td>--%>
                <%--<td><form:input path="email"/></td>--%>
            <%--</tr>--%>
            <%--<tr>--%>
                <%--<td colspan="2">--%>
                    <%--<input name="action" type="submit" value="Add"/>--%>
                    <%--<input name="action" type="submit" value="Edit"/>--%>
                    <%--<input name="action" type="submit" value="Delete"/>--%>
                    <%--<input name="action" type="submit" value="Search"/>--%>
                <%--</td>--%>
            <%--</tr>--%>
        <%--</table>--%>
    <%--</form:form>--%>
<%--<br/>--%>
<%--<table>--%>
    <%--<th>ID</th>--%>
    <%--<th>First name</th>--%>
    <%--<th>Last name</th>--%>
    <%--<th>Email</th>--%>
    <%--<c:forEach items="${studentList}" var="student">--%>
        <%--<tr>--%>
            <%--<td>${student.studentId}</td>--%>
            <%--<td>${student.firstname}</td>--%>
            <%--<td>${student.lastname}</td>--%>
            <%--<td>${student.email}</td>--%>
        <%--</tr>--%>
    <%--</c:forEach>--%>

<%--</table>--%>
<%--</body>--%>
<%--</html>--%>

<%--
  Created by IntelliJ IDEA.
  User: max
  Date: 05/02/15
  Time: 20:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="includes.jsp"%>
<html>
<head>
    <title>Student managment</title>
</head>
<body>
Language: <a href="?language=en">English</a> | <a href="?language=ru">Russian</a>
<h1>Student's Form</h1>
<form:form action="student.do" method="post" commandName="student">
    <table>
        <tr>
            <td>ID</td>
            <td><form:input path="studentId"/></td>
        </tr>
        <tr>
            <td>First name</td>
            <td><form:input path="firstname"/></td>
        </tr>
        <tr>
            <td>Last name</td>
            <td><form:input path="lastname"/></td>
        </tr>
        <tr>
            <td>E-mail</td>
            <td><form:input path="email"/></td>
        </tr>
        <tr>
            <td colspan="2">
                <input name="action" type="submit" value="Add"/>
                <input name="action" type="submit" value="Edit"/>
                <input name="action" type="submit" value="Delete"/>
                <input name="action" type="submit" value="Search"/>
            </td>
        </tr>
    </table>
</form:form>
<br/>
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
[1</table>
</body>
</html>
