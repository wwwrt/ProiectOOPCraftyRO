<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>EditSeller</title>
</head>
<body>
<h1>Edit seller</h1>
<form:form method="post" action="${pageContext.request.contextPath}/sellers/edit/${sellers.id}" modelAttribute="sellers">
    <label for="id">ID</label>
    <form:input path="id"/>
    <label for="name">Name</label>
    <form:input path="name"/>
    <label for="age">Age</label>
    <form:input type="number" path="age"/>
    <label for="email">Email</label>
    <form:input path="email"/>
    <label for="grade">Grade</label>
    <form:input path="grade"/>

    <input type="submit" value="Submit"/><br/>
</form:form>

</body>
</html>