<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="a" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
Scheduled Sessions
<table>
<tr>
<td>Name</td>
<td>Duration(Days)</td>
<td>Faculty</td>
<td>Mode</td>
<td>Enrollment</td>
</tr>
<a:forEach var="ses" items="${data}">
<tr>
<td> ${ses.name}</td>
<td> ${ses.duration}</td>
<td> ${ses.faculty}</td>
<td> ${ses.mode1}</td>
<td><a href="Success?name=${ses.name}">Enroll_Me</a></td>
</tr>


</a:forEach>
</table>
</body>
</html>