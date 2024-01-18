<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>allBuyers</title>

</head>
<body>
<h1>All Buyers</h1>
<table border=1>
	<tr>
		<th>ID</th>
		<th>NAME</th>
		<th>AGE</th>
		<th>EMAIL</th>
		<th colspan=3>ACTIONS</th>
	</tr>
	<c:forEach var="buyer" items="${buyers}" varStatus="idx" >
<tr ${idx.index%2==0? "style='background-color:indianred;color:white'":"style='background-color:lightgreen'" }>
		
			<td> <c:out value="${buyer.id}"/></td>
			<td> <c:out value="${buyer.name}"/></td>
			<td> <c:out value="${buyer.age}"/></td>
			<td> <c:out value="${buyer.email}"/></td>

			<td> <a href="<c:url value="/buyers/${buyer.id}"/>"> Details </a></td>
			<td> <a href="<c:url value="/buyers/delete/${buyer.id}"/>"> Delete </a></td>
			<td> <a href="<c:url value="/buyers/edit/${buyer.id}"/>"> Edit </a></td>
		</tr>
	</c:forEach>
	
</table>
<a href="<c:url value="/buyers/create"/>">Create Buyer</a><br>
<a href="<c:url value="/sellers/all"/>">All Sellers </a> <br>
<a href="<c:url value="/crafts/all"/>">All Crafts </a>
</body>
</html>