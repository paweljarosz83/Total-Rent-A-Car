<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Available Cars</title>

<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">
<link rel="stylesheet"
	href="<spring:url value="/resources/css/bootstrap-select.min.css"/>"
	type="text/css" />
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
				
					  <img src="<c:url value="/resources/images/${car.registration}.png"></c:url>" alt="image"  style = "width:100%"/>
				
						<div class="caption" style="width:100%"/>
							<h3>
								<strong>Model: </strong>${car.model}</h3>
							<p>
								<strong>Description: </strong>${car.description}</p>
							<p>
								<strong>Registration: </strong><span class="label label-info">${car.registration}</span>
							</p>
							<p>
								<strong>Body: </strong>${car.body}</p>
							<p>
								<strong>Fuel type: </strong>${car.fuel}</p>
							<p>
								<strong>Color: </strong>${car.color}</p>
							<p>
								<strong>Trunk size: </strong>${car.trunk} cm3
							</p>
							<p>
								<strong>Price: </strong>${car.price} euro/day
							</p>

							<a href=" <spring:url value="/cars/car/${car.carId}"/>"
								class="btn btn-warning"> <span
								class="glyphicon-shopping-cart glyphicon" /></span> Rent Now
							</a>
							
							<a href="<spring:url value="/cars/car/${car.carId}"/>"
								class="btn btn-info"> <span
								class="glyphicon-info-sign glyphicon" /></span> Details
							</a>
						</div>
					</div>
				</div>
			</c:forEach>
		</div>
	</section>
</body>
</html>