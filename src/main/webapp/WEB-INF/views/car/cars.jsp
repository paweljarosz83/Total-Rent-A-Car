<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title><spring:message code="car.cars.title" /></title>

<link rel="stylesheet"
	href="<spring:url value="/resources/css/global.css"/>" type="text/css" />
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>
<script
	src="<spring:url value="/resources/js/bootstrap-select.min.js"/>"></script>

</head>
<body>
	<jsp:include page="../../views/fragments/header.jsp"></jsp:include>
	<div class="container">

		<table class="table table-hover">
			<tbody>
				<tr>
					<th><spring:message code="car.cars.registration" /></th>
					<th><spring:message code="car.cars.model" /></th>
					<th><spring:message code="car.cars.make" /></th>
					<th><spring:message code="car.cars.body" /></th>
					<th><spring:message code="car.cars.fuel" /></th>
					<th><spring:message code="car.cars.horsepower" /></th>
					<th><spring:message code="car.cars.engine" /></th>
					<th><spring:message code="car.cars.price" /></th>
				</tr>
				<c:forEach items="${cars}" var="car">
					<tr>
						<td><a href="<spring:url value="/cars/car/${car.carId}"/>">${car.registration}</a></td>
						<td>${car.model}</td>
						<td>${car.make}</td>
						<td>${car.body}</td>
						<td>${car.fuel}</td>
						<td>${car.engine.power}</td>
						<td>${car.engine.type}</td>
						<td>${car.price}</td>
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