<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html>
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
				 <span class="details-sub">${driver.address.street}
					${driver.address.number} ${driver.address.post}
					${driver.address.city}</span>

				<spring:message code="driver.details.licence.number" />
				<span>${driver.licence.number}</span>
				
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