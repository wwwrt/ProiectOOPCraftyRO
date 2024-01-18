<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>allCrafts</title>

</head>
<body>
<h1>All Crafts</h1>
<table border=1>
	<tr>
		<th>ID</th>
		<th>NAME</th>
		<th>AMOUNT</th>
		<th>PRICE</th>
		<th>MANUFACTURED</th>
		<th colspan=3>ACTIONS</th>
	</tr>
	<c:forEach var="craft" items="${crafts}" varStatus="idx" >
<tr ${idx.index%2==0? "style='background-color:indianred;color:white'":"style='background-color:lightgreen'" }>
		
			<td> <c:out value="${craft.id}"/></td>
			<td> <c:out value="${craft.name}"/></td>
			<td> <c:out value="${craft.amount}"/></td>
			<td> <c:out value="${craft.price}"/></td>
			<td> <c:out value="${craft.manufactured}"/></td>

			<td> <a href="<c:url value="/crafts/${craft.id}"/>"> Details </a></td>
			<td> <a href="<c:url value="/crafts/delete/${craft.id}"/>"> Delete </a></td>
			<td> <a href="<c:url value="/crafts/edit/${craft.id}"/>"> Edit </a></td>
		</tr>
	</c:forEach>
	
</table>
<a href="<c:url value="/crafts/create"/>">Create Craft</a><br>
<a href="<c:url value="/sellers/all"/>">All Sellers </a> <br>
<a href="<c:url value="/buyers/all"/>">All Buyers </a>
</body>
</html>