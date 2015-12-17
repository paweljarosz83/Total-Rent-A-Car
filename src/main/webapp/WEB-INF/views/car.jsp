<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Project Manager</title>

	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">
	<link rel="stylesheet" href="<spring:url value="/resources/css/home.css"/>" type="text/css"/>
	<link rel="stylesheet" href="<spring:url value="/resources/css/bootstrap-select.min.css"/>" type="text/css"/>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>
	<script src="<spring:url value="/resources/js/bootstrap-select.min.js"/>"></script>

</head>
<body>

	<jsp:include page="../views/fragments/header.jsp"></jsp:include>
	
	<div class="container">
		<div class="row">
			
		
			
				<div class="form-group">
					<h3>
					<span>${car.make} </span>
					<span>${car.model}</span>
					<span>${car.engine.capacity}</span>
					<span>${car.engine.type}</span><br/>
					</h3>
					
					<h4>
					<span>${car.color} </span>
					<span>${car.body}</span><br/>
					</h4>
					

					mileage: <span>${car.kilometers}</span><br/>
					fuel: <span>${car.fuel}</span><br/>
					price: <span>${car.price}</span> euro/hour<br/>
					drive: <span>${car.drive}</span><br/>
					transmission: <span>${car.transmission}</span><br/>
					trunk size: <span>${car.trunk}</span>
					<span>${car.description}</span>
				</div>
							
				<div class="form-group">
					<label for="registration">Registration number</label>
					<span>${car.registration}</span>
				</div>
				
				<a href="<spring:url value="/cars/edit/${car.carId}"/>"
								class="btn btn-info"> <span
								class="glyphicon-info-sign glyphicon" /></span> Edit
				</a>

		
			
		</div>
	</div>
</body>
</html>