<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>allSellers</title>

</head>
<body>
<h1>All Sellers</h1>
<table border=1>
	<tr>
		<th>ID</th>
		<th>NAME</th>
		<th>AGE</th>
		<th>EMAIL</th>
		<th>GRADE</th>
		<th colspan=3>ACTIONS</th>
	</tr>
	<c:forEach var="seller" items="${sellers}" varStatus="idx" >
<tr ${idx.index%2==0? "style='background-color:indianred;color:white'":"style='background-color:lightgreen'" }>
		
			<td> <c:out value="${seller.id}"/></td>
			<td> <c:out value="${seller.name}"/></td>
			<td> <c:out value="${seller.age}"/></td>
			<td> <c:out value="${seller.email}"/></td>
			<td> <c:out value="${seller.grade}"/></td>

			<td> <a href="<c:url value="/sellers/${seller.id}"/>"> Details </a></td>
			<td> <a href="<c:url value="/sellers/delete/${seller.id}"/>"> Delete </a></td>
			<td> <a href="<c:url value="/sellers/edit/${seller.id}"/>"> Edit </a></td>
		</tr>
	</c:forEach>
	
</table>
<a href="<c:url value="/sellers/create"/>">Create Seller</a><br>
<a href="<c:url value="/crafts/all"/>">All Crafts </a> <br>
<a href="<c:url value="/buyers/all"/>">All Buyers </a>
</body>
</html>