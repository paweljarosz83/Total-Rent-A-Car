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
					<label for="name">
						<spring:message code="addDriver.form.name.label"/>
					</label>
					<form:input id="name" path="name" maxlength="20" cssClass="form-control" />
					<form:errors path="name"/>
				</div>
				<div class="form-group">
					<label for="surname">
						<spring:message code="addDriver.form.surname.label"/>
					</label>
					<form:input id="surname" path="surname" maxlength="20" cssClass="form-control"/>
					<form:errors path="surname"/>
				</div>
				<div class="form-group">
					<label for="personalIdentificationNumber">
						<spring:message code="addDriver.form.personalIdentificationNumber.label"/>
					</label>
					<form:input id="personalIdentificationNumber" path="personalIdentificationNumber" maxlength="20" cssClass="form-control"/>
					<form:errors path="personalIdentificationNumber"/>
				</div>
			
			
				<!-- Address -->
				<div class="form-group">
					<label for="street">
						<spring:message code="addDriver.form.address.street.label"/>
					</label>
					<form:input id="street" path="address.street" cssClass="form-control" maxlength="20"/>
					<form:errors path="address.street"/>
				</div>
				<div class="form-group">
					<label for="number">
						<spring:message code="addDriver.form.address.number.label"/>
					</label>
					<form:input id="number" path="address.number" cssClass="form-control" maxlength="20"/>
					<form:errors path="address.number"/>
				</div>
				<div class="form-group">
					<label for="city">
						<spring:message code="addDriver.form.address.city.label"/>
					</label>
					<form:input id="city" path="address.city" cssClass="form-control" maxlength="20"/>
					<form:errors path="address.city"/>
				</div>
				<div class="form-group">
					<label for="post">
						<spring:message code="addDriver.form.address.post.label"/>
					</label>
					<form:input id="post" path="address.post" cssClass="form-control" maxlength="20"/>
					<form:errors path="address.post"/>
				</div>
			
				<div class="form-group">
					<label for="licencenumber">
						<spring:message code="addDriver.form.licence.licencenumber.label"/>
					</label>
					<form:input id="licencenumber" path="licence.number" cssClass="form-control" maxlength="20"/>
					<form:errors path="licence.number"/>
				</div>
				<div class="form-group">
					<label for="category">
						<spring:message code="addDriver.form.licence.category.label"/>
					</label>
					<form:input id="category" path="licence.category" cssClass="form-control" maxlength="20"/>
					<form:errors path="licence.category"/>
				</div>
				<br/>
				
				<button type="submit" class="btn btn-default">Submit</button>
			</form:form>
			</br>
			</br>
		</div>
	</div>
	
		<section>
    	<div class="jumbotron">
      		<div class="container">
        		<h2><spring:message code="footer.driver"/></h2>
        		<p><spring:message code="footer.driver.add"/></p>
        		<h5>
        		<spring:message code="footer.company"/>
        		<spring:message code="footer.address"/>
        		<spring:message code="footer.phone"/>
        		</h5>
      		</div>
    	</div>
 	</section>
	
</body>
</html>