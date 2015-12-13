<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>TRAC::Total Rent a Car</title>

	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">
	<link rel="stylesheet" href="<spring:url value="/resources/css/bootstrap-select.min.css"/>" type="text/css" />
	<link rel="stylesheet" href="<spring:url value="/resources/css/global.css"/>" type="text/css" />
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>
	<script src="<spring:url value="/resources/js/bootstrap-select.min.js"/>"></script>

	<link rel="stylesheet"href="<spring:url value="/resources/css/addCar.css"/>" type="text/css" />
</head>
<body>

    <jsp:include page="../../views/fragments/header.jsp"></jsp:include>
	
	<div class="container">
	
		<div class="row">
		
		<spring:url value="/drivers/save" var="formUrl"/>
		
			<form:form action="${formUrl}" method="POST" modelAttribute="driver">
			
				<div class="form-group">
					<label class="control-label col-lg-2 col-lg-2" for="name">
						<spring:message code="addDriver.form.name.label"/>
					</label>
					<form:input id="name" path="name" cssClass="form-control" />
				</div>

				<div class="form-group">
					<label class="control-label col-lg-2 col-lg-2" for="surname">
						<spring:message code="addDriver.form.surname.label"/>
					</label>
					<form:input id="surname" path="surname" cssClass="form-control"/>
				</div>
			
			
				<!-- Address -->
				<div class="form-group">
					<label for="street">
						<spring:message code="addDriver.form.address.street.label"/>
					</label>
					<form:input id="street" cssClass="form-control" path="address.street" />
				</div>
				<div class="form-group">
					<label for="number">
						<spring:message code="addDriver.form.address.number.label"/>
					</label>
					<form:input id="number" cssClass="form-control" path="address.number" />
				</div>
				<div class="form-group">
					<label for="city">
						<spring:message code="addDriver.form.address.city.label"/>
					</label>
					<form:input id="city" cssClass="form-control" path="address.city" />
				</div>
				<div class="form-group">
					<label for="postCode">
						<spring:message code="addDriver.form.address.postCode.label"/>
					</label>
					<form:input id="postCode" cssClass="form-control" path="address.postCode" />
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