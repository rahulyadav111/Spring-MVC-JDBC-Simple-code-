<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
 <body>
<h1>Display all Records...</h1>
<c:forEach var="tab" items="${list}">
<hr>
<td><h4>user name :${tab.username}</h4></td>
<h4>password   :${tab.passowrd}</h4>
<h4>user email :${tab.email}</h4>
<h4>user mobile:${tab.mobile}</h4>

</c:forEach>
</body>
</html>