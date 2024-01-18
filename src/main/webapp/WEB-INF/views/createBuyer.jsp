<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>CreateBuyer</title>
</head>
<body>
<h1>Create buyer</h1>
<form:form method="post" action="${pageContext.request.contextPath}/buyers/create" modelAttribute="buyers">

	<label for="name">Name</label>
	<form:input path="name"/>

<br/>
    <label for="age">Age</label>
	<form:input type="number" path="age"/>
<br/>
    <label for="email">Email</label>
	<form:input  path="email"/>
<br/>

	<input type="submit" value="Save"/>
</form:form>
</body>
</html>