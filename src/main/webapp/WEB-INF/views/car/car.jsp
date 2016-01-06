<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title><spring:message code="car.details.title" /></title>
</head>
<body>

	<jsp:include page="../../views/fragments/header.jsp"></jsp:include>

	<div class="container">
		<div class="row">

			<div class="form-group">
				
					<span class="details-title"><b>${car.make} ${car.model}</b></span><br/>
					<span class="details-sub">${car.engine.capacity} ${car.engine.type} ${car.engine.power} <spring:message code="car.details.power.unit" /></span><br/>
					<span class="details-subsub">${car.color} ${car.body}</span><br />
					</br>
				<div id="details-table">
					<table class='table borderless'>
						<tr>
							<td><spring:message code="car.details.kilometers" /></td>
							<td><span>${car.kilometers} km</span></td>
						</tr>
						<tr>
							<td><spring:message code="car.details.fuel" /></td>
							<td><span>${car.fuel}</span></td>
						</tr>
						<tr>
							<td><spring:message code="car.details.price" /></td>
							<td><span class="white">${car.price} euro/hour </span></td>
						</tr>
						<tr>
							<td><spring:message code="car.details.drive" /></td>
							<td><span>${car.drive}</span></td>
						</tr>
						<tr>
							<td><spring:message code="car.details.transmission" /></td>
							<td><span>${car.transmission}</span></td>
						</tr>
						<tr>
							<td><spring:message code="car.details.trunk" /></td>
							<td><span>${car.trunk} cm3</span></td>
						</tr>
						<tr>
							<td><spring:message code="car.details.description" /></td>
							<td><span>${car.description}  ${car.equipments}</span></td>
						</tr>
					</table>
				
			
					<div class="form-group">
						<label for="registration"><spring:message
								code="car.details.registration" /></label> <span>${car.registration}</span>
					</div>

					<a href="<spring:url value="/cars/edit/${car.carId}"/>"
						class="btn btn-info"> <span
						class="glyphicon-info-sign glyphicon" /></span>
						 <spring:message code="button.edit" />
					</a>
				</div>
			</div>
			</div>
		</div>
	</div>
</body>
</html>