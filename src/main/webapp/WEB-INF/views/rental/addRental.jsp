<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title><spring:message code="rental.add.title" /></title>

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
					<label for="driverDetails"> <spring:message
							code="addRental.form.drivers.label" />
					</label>
					<form:select path="nameAndSurname" items="${driverDetails}"
						cssClass="selectpicker" />
				</div>

				<div class="form-group">
					<label for="carRegistration"> <spring:message
							code="addRental.form.registrations.label" />
					</label>
					<form:select path="carDetails" items="${carDetails}"
						cssClass="selectpicker" />
				</div>

				<div class="form-group">
					<label for="from">
						<spring:message code="addRental.form.from.label"/>
					</label>
					<form:input id="from" path="from" maxlength="10" cssClass="form-control"/>
					<form:errors path="from"/>
				</div>

				<div class="form-group">
					<label for="to">
						<spring:message code="addRental.form.to.label"/>
					</label>
					<form:input id="to" path="to" maxlength="10" cssClass="form-control"/>
					<form:errors path="to"/>
				</div>
				
				<div class="form-group">
					<label for="returnPoint">
						<spring:message code="addRental.form.point.label"/>
					</label>
					<form:input id="returnPoint" path="returnPoint" maxlength="100" cssClass="form-control"/>
					<form:errors path="returnPoint"/>
				</div>
				<br/>
				<button type="submit" class="btn btn-default"><spring:message code="button.submit"/></button>
				<br/>
				<br/>
			</form:form>
		</div>
	</div>

	<section>
    	<div class="jumbotron">
      		<div class="container">
      			<span class="footer-info">
        			<spring:message code="footer.rental.add"/>
        		</span>
				<br/>
				<span class="footer-company">
					<spring:message code="footer.company" /> <spring:message code="footer.address" />
					<spring:message code="footer.phone" />
				</span>
      		</div>
    	</div>
 	</section>

</body>
</html>