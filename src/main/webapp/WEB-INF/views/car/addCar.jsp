<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title><spring:message code="car.add.title" /></title>

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

	<jsp:include page="../../views/fragments/header.jsp"></jsp:include>

	<div class="container">
		<div class="row">

			<spring:url value="/cars/save" var="formUrl" />

			<form:form action="${formUrl}" method="POST" modelAttribute="car">
				<form:errors path="*" cssClass="alert alert-danger" element="div" />
				<!--form action="<spring:url value="/car/add"/>" method="post" class="col-md-8 col-md-offset-2"-->

				<div class="form-group">
					<label for="car-model"> <spring:message
							code="addCar.form.model.label" />
					</label>
					<form:input id="model" path="model" maxlength="20"
						cssClass="form-control" />
					<form:errors path="model" />
				</div>
				<div class="form-group">
					<label for="make"> <spring:message
							code="addCar.form.make.label" />
					</label>
					<form:input id="make" path="make" maxlength="20"
						cssClass="form-control" />
					<form:errors path="make" />
				</div>
				<div class="form-group">
					<label for="registration"> <spring:message
							code="addCar.form.registration.label" />
					</label>
					<form:input id="registration" path="registration" maxlength="20"
						cssClass="form-control" />
					<form:errors path="registration" />
				</div>

				<div class="form-group">
					<label for="type"> <spring:message
							code="addCar.form.engine.type.label" />
					</label>
					<form:input id="type" path="engine.type" maxlength="20"
						cssClass="form-control" />
					<form:errors path="engine.type" />
				</div>
				<div class="form-group">
					<label for="capacity"> <spring:message
							code="addCar.form.engine.capacity.label" />
					</label>
					<form:input id="capacity" path="engine.capacity" type="number"
						min="1" max="5000" maxlength="5" step="any"
						cssClass="form-control" />
					<form:errors path="engine.capacity" />
				</div>
				<div class="form-group">
					<label for="power"> <spring:message
							code="addCar.form.engine.power.label" />
					</label>
					<form:input id="power" path="engine.power" type="number" min="1"
						max="1000" maxlength="5" cssClass="form-control" />
					<form:errors path="engine.power" />
				</div>



				<div class="form-group">
					<label for="trunkSize"> <spring:message
							code="addCar.form.trunk.label" />
					</label>
					<form:input id="trunk" path="trunk" type="number" min="1"
						max="1000" maxlength="5" cssClass="form-control" />
					<form:errors path="trunk" />
				</div>
				<div class="form-group">
					<label for="fuel"> <spring:message
							code="addCar.form.fuel.label" />
					</label>
					<form:select path="fuel" items="${fuelOptions}"
						cssClass="selectpicker" />
					<form:errors path="fuel" />
				</div>
				<div class="form-group">
					<label for="kilometers"> <spring:message
							code="addCar.form.kilometers.label" />
					</label>
					<form:input id="kilometers" path="kilometers" type="number" min="1"
						max="999999" maxlength="6" cssClass="form-control" />
					<form:errors path="kilometers" />
				</div>

				<div class="form-grup">
					<label for="color"> <spring:message
							code="addCar.form.color.label" />
					</label>
					<form:input id="color" path="color" maxlength="20"
						cssClass="form-control" />
					<form:errors path="color" />
				</div>
				</br>
				<div class="form-group">
					<label for="drive"> <spring:message
							code="addCar.form.drive.label" />
					</label>
					<form:select path="drive" items="${driveOptions}"
						cssClass="selectpicker" />
				</div>
				<div class="form-group">
					<label for="transmission"> <spring:message
							code="addCar.form.transmission.label" />
					</label>
					<form:select path="transmission" items="${transmissionOptions}"
						cssClass="selectpicker" />
				</div>
				<div class="form-group">
					<label for="body"> <spring:message
							code="addCar.form.body.label" />
					</label>
					<form:radiobuttons path="body" items="${radios}" />
				</div>
				<div class="form-group">
					<label for="equipments"> <spring:message
							code="addCar.form.equipment.label" />
					</label>
					<form:checkboxes path="equipments" id="equipments"
						items="${equipments}" />
				</div>

				<div class="form-group">
					<label for="description"> <spring:message
							code="addCar.form.description.label" />
					</label>
					<form:textarea id="description" path="description" maxlength="200"
						class="form-control" />
				</div>

				<div class="form-grup">
					<label for="price"> <spring:message
							code="addCar.form.price.label" />
					</label>
					<form:input id="price" path="price" type="number" min="1"
						max="1000" maxlength="5" cssClass="form-control" />
					<form:errors path="price" />
				</div>
				</br>
				<!--  
				<spring:url value="/resource/upload" var="uploadUrl"/>
				<form method="POST" enctype="multipart/form-data" action="${uploadUrl}">
				<input type="file" name="file"><br/>
				<input type="submit" value="upload">Laduj Plik</form>
-->
				<button type="submit" class="btn btn-default">
					<spring:message code="button.submit" />
				</button>
			</form:form>
			<br />
			<br />


			
			</div>
		</div>
	</div>
	
	<div class="vertical-placeholder"></div>

	<div class="navbar navbar-default navbar-fixed-bottom">
		<div class="centre">
		
		<span class="footer-company"> 
			<spring:message code="footer.company" /> 
			<spring:message code="footer.phone" />
			</span>
		</div>
	</div>
	
</body>
</html>
