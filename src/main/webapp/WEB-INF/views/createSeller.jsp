<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>CreateSeller</title>
</head>
<body>
<h1>Create seller</h1>
<form:form method="post" action="${pageContext.request.contextPath}/sellers/create" modelAttribute="sellers">

	<label for="name">Name</label>
	<form:input path="name"/>

<br/>
    <label for="age">Age</label>
	<form:input type="number" path="age"/>
<br/>
    <label for="email">Email</label>
	<form:input path="email"/>
<br/>
    <label for="grade">Grade</label>
	<form:input path="grade"/>
<br/>

	<input type="submit" value="Save"/>
</form:form>
</body>
</html>