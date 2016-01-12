<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title><spring:message code="driver.drivers.title" /></title>

<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">
<link rel="stylesheet"
	href="<spring:url value="/resources/css/home.css"/>" type="text/css" />
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>

</head>
<body>

	<jsp:include page="../../views/fragments/header.jsp"></jsp:include>

	<div class="container">

		<table class="table table-hover">
			<tbody>
				<tr>
					<th><spring:message code="driver.drivers.driver" /></th>
					<th><spring:message code="driver.drivers.street" /></th>
					<th><spring:message code="driver.drivers.number" /></th>
					<th><spring:message code="driver.drivers.city" /></th>
					<th><spring:message code="driver.drivers.post" /></th>
					<th><spring:message code="driver.drivers.licence" /></th>
					<th><spring:message code="driver.drivers.category" /></th>
				</tr>
				<c:forEach items="${drivers}" var="driver">
					<tr>
						<td><a
							href="<spring:url value="/drivers/driver/${driver.driverId}"/>">${driver.name}
								${driver.surname}</a></td>
						<td>${driver.address.street}</td>
						<td>${driver.address.number}</td>
						<td>${driver.address.city}</td>
						<td>${driver.address.post}</td>
						<td>${driver.licence.number}</td>
						<td>${driver.licence.category}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
	<div class="vertical-placeholder"></div>
	
	<div class="navbar navbar-default navbar-fixed-bottom">
		<div class="centre">
		
		<span class="footer-company"> 
			<spring:message code="footer.company" /> 
			<spring:message code="footer.phone" />
			</span>
		</div>
	</div>

</body>
</html>