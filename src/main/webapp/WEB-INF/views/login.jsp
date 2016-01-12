<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"  %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"  %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet"	href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">

<title><spring:message code="login.signin"/></title>
</head>
<body>
	<section>
		<div class="jumbotron">
			<div class="container">
				<span class="logo"><h2>Total Rent A Car</h2></span>
			</div>
		</div>
	</section>
<div class="container">
    <div class="row">
		<div class="col-md-4 col-md-offset-4">
    		<div class="panel panel-default">
			  	<div class="panel-heading">
			    	<h3 class="panel-title">
			    	
						<spring:message code="login.signin"/>
			    	
			    	</h3>
			 	</div>
			  	<div class="panel-body">
			  	<c:if test="${not empty error}">
					<div class="alert alert-danger">
						<spring:message code="AbstractUserDetailsAuthenticationProvider.badCredentials"/><br />
					</div>
				</c:if>
			    	<form action="<c:url value="/j_spring_security_check"></c:url>" method="post">
                    <fieldset>
			    	  	<div class="form-group">
			    		    <input class="form-control" placeholder="User Name" name='j_username' type="text">
			    		</div>
			    		<div class="form-group">
			    			<input class="form-control" placeholder="Password" name='j_password'  type="password" value="">
			    		</div>
			    		<input class="btn btn-lg btn-success btn-block" type="submit" value="<spring:message code="login"/>">
			    	</fieldset>
			      	</form>
			    </div>
			</div>
		</div>
	</div>
</div>
</body>
