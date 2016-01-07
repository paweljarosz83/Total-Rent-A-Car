<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html>

	<link rel="stylesheet" href="<spring:url value="/resources/css/global.css"/>" type="text/css" />
	
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>
	<script src="<spring:url value="/resources/js/bootstrap-select.min.js"/>"></script>


<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title><spring:message code="driver.details.title" /></title>
</head>
<body>

	<jsp:include page="../../views/fragments/header.jsp"></jsp:include>

	<div class="container">
		<div class="row">

			<div class="form-group">

				<span class="details-title"><b>${driver.name} ${driver.surname}</b></span><br />
				<span class="details-sub">${driver.address.street} ${driver.address.number}<br/>
					${driver.address.post} ${driver.address.city}</span><br/>
					

				<spring:message code="driver.details.licence.number" />
				<span>${driver.licence.number}</span><br/>
				
				<spring:message code="driver.details.licence.category" />
				<span>${driver.licence.category}</span>

			</div>

			<a href="<spring:url value="/drivers/edit/${driver.driverId}"/>"
				class="btn btn-info"> <span
				class="glyphicon-info-sign glyphicon" /></span><spring:message code="button.edit" />
			</a>



		</div>
	</div>
</body>
</html>