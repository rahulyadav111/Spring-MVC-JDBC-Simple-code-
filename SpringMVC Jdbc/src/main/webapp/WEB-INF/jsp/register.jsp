<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Registration form</h1>
<form:form action="stor" method="post" modelAttribute="bean">
user name :<br>
<form:input path="username"/><br>
password :<br>
<form:input path="passowrd"/><br>
Email :<br>
<form:input path="email"/><br>
Mobile :<br>
<form:input path="mobile"/><br>
<input type="submit" value="submit!">
</form:form>

</body>
</html>