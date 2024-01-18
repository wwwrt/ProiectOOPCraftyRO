<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>SingleCraft</title>
</head>
<body>
<h1>Craft Details</h1>
	<p>ID: ${craft.id} </p>
	<p>Name: ${craft.name} </p>
	<p>Amount: ${craft.amount} </p>
	<p>Price: ${craft.price} </p>
	<p>Manufactured: ${craft.manufactured} </p>
</body>
</html>