<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>SingleSeller</title>
</head>
<body>
<h1>Seller Details</h1>
	<p>ID: ${seller.id} </p>
	<p>Name: ${seller.name} </p>
	<p>Age: ${seller.age} </p>
	<p>Email: ${seller.email} </p>
	<p>Grade: ${seller.grade} </p>
</body>
</html>