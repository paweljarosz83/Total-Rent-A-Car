<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Driver</title>

	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">
	<link rel="stylesheet" href="<spring:url value="/resources/css/home.css"/>" type="text/css"/>
	<link rel="stylesheet" href="<spring:url value="/resources/css/bootstrap-select.min.css"/>" type="text/css"/>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>
	<script src="<spring:url value="/resources/js/bootstrap-select.min.js"/>"></script>

</head>
<body>

	 <jsp:include page="../../views/fragments/header.jsp"></jsp:include>
	
	<div class="container">
		<div class="row">
			
		
			
				<div class="form-group">
					<h3><span>${driver.name} ${driver.surname}</span></h3>
					<span>${driver.address.street} ${driver.address.number} ${driver.address.post} ${driver.address.city}</span>
					<span>${driver.licence.number}</span>
					<span>${driver.licence.number}</span>
				
				</div>
							
		
				
				<a href="<spring:url value="/drivers/edit/${driver.driverId}"/>"
								class="btn btn-info"> <span
								class="glyphicon-info-sign glyphicon" /></span> Edit
				</a>

		
			
		</div>
	</div>
</body>
</html>