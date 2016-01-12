<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title><spring:message code="home.title" /></title>

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

	<jsp:include page="../views/fragments/header.jsp"></jsp:include>


	<section class="container">
		<div class="row">
			<c:forEach items="${cars}" var="car">
				<div class="col-sm-6 col-md-3" style="padding-bottom: 15px">
					<div class="thumbnail">
						<!-- 
						<img
							src="<c:url value="/resources/images/${car.registration}.png"></c:url>"
							alt="image" style="width: 100%" />
						 -->	

						<div class="caption" style="width: 100%" />
						<h4>
							<strong>${car.make} ${car.model}</strong>
						</h4>
						<h5>${car.engine.capacity}${car.engine.type}</h5>
						<p>${car.color}${car.body}</p>

						<p>
							<strong><spring:message code="home.price" /></strong>${car.price}
							euro/day
						</p>

						<a href="<spring:url value="/cars/car/${car.carId}"/>"
							class="btn btn-info"> <span
							class="glyphicon-info-sign glyphicon" /></span> <spring:message
								code="home.details" />
						</a>
					</div>
				</div>
		</div>
		</c:forEach>
		<div class="home-placeholder"></div>
		</div>
	</section>

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