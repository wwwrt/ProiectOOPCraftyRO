<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>EditCraft</title>
</head>
<body>
<h1>Edit craft</h1>
<form:form method="post" action="${pageContext.request.contextPath}/crafts/edit/${crafts.id}" modelAttribute="crafts">
    <label for="id">ID</label>
    <form:input path="id"/>
    <label for="name">Name</label>
    <form:input path="name"/>
    <label for="amount">Amount</label>
    <form:input type="number" path="amount"/>
    <label for="price">Price</label>
    <form:input type="number" path="price"/>
    <label for="manufactured">Manufactured</label>
    <form:input type="date" path="manufactured"/>

    <input type="submit" value="Submit"/><br/>
</form:form>

</body>
</html>