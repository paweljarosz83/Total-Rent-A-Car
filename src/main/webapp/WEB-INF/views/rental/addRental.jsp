<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>TRAC::Total Rent a Car</title>

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

<link rel="stylesheet"
	href="<spring:url value="/resources/css/addCar.css"/>" type="text/css" />
</head>
<body>

	<jsp:include page="../../views/fragments/header.jsp"></jsp:include>

	<div class="container">

		<div class="row">

			<spring:url value="/rentals/save" var="formUrl" />

			<form:form action="${formUrl}" method="POST" modelAttribute="rental">


				<div class="form-group">
					<label for="driverName"> <spring:message
							code="addCar.form.rental.driver.label" />
					</label>
					<form:select path="nameAndSurname" items="${driverNames}"
						cssClass="selectpicker" />
				</div>

				<div class="form-group">
					<label for="carRegistration"> <spring:message
							code="addCar.form.rental.car.label" />
					</label>
					<form:select path="carRegistrations" items="${carRegistrations}"
						cssClass="selectpicker" />
				</div>
				<
				<div class="form-group">
					<label for="pickupDate"> <spring:message
							code="addRental.form.rental.returnDate" />
					</label>
					<form:input id="pickupDate" path="pickupDate"
						cssClass="form-control" />
				</div>

		

				<button type="submit" class="btn btn-default">Submit</button>

			</form:form>
		</div>
	</div>

	<section>
		<div class="jumbotron">
			<div class="container">
				<h1>Drivers</h1>
				<p>Add new driver</p>
			</div>
		</div>
	</section>

</body>
</html>