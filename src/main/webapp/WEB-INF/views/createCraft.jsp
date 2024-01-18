<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>CreateCraft</title>
</head>
<body>
<h1>Create craft</h1>
<form:form method="post" action="${pageContext.request.contextPath}/crafts/create" modelAttribute="crafts">

	<label for="name">Name</label>
	<form:input path="name"/>

<br/>
    <label for="amount">Amount</label>
	<form:input type="number" path="amount"/>
<br/>
    <label for="price">Price</label>
	<form:input type="number" path="price"/>
<br/>
<br/>
    <label for="manufactured">Manufactured</label>
	<form:input type="date" path="manufactured"/>
<br/>

	<input type="submit" value="Save"/>
</form:form>
</body>
</html>