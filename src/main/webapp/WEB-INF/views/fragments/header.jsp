<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"  %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<head>
<link rel="stylesheet"	href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<link rel="stylesheet" href="<spring:url value="/resources/css/global.css"/>" type="text/css" />

</head>
<nav class="navbar navbar-inverse">
		<div class="container-fluid">
		
			<div class="navbar-header">
      			<a class="navbar-brand" href="/trac/home">Total Rent A Car</a>
    		</div>
    		
    		<ul class="nav navbar-nav">

    		
    			<li class="dropdown">
          			<a href="#" class="dropdown-toggle" 
          				data-toggle="dropdown" role="button" 
          				aria-expanded="false"><spring:message code="menu.cars"/> <span class="caret"></span></a>
          	
          			
          	
          			<ul class="dropdown-menu" role="menu">
            			<li><a href="<spring:url value="/cars/add"/>"><spring:message code="menu.add"/></a></li>
            			<li><a href="<spring:url value="/cars/cars"/>"><spring:message code="menu.find"/></a></li>
          			</ul>
        		</li>
        		
        		
    			<li class="dropdown">
          			<a href="#" class="dropdown-toggle" 
          				data-toggle="dropdown" role="button" 
          				aria-expanded="false"><spring:message code="menu.drivers"/> <span class="caret"></span></a>
          		
          			<ul class="dropdown-menu" role="menu">
            			<li><a href="<spring:url value="/drivers/add"/>"><spring:message code="menu.add"/></a></li>
            			<li><a href="<spring:url value="/drivers/drivers"/>"><spring:message code="menu.find"/></a></li>
          			</ul>
        		</li>
        		
        		<li class="dropdown">
          			<a href="#" class="dropdown-toggle" 
          				data-toggle="dropdown" role="button" 
          				aria-expanded="false"><spring:message code="menu.rentals"/> <span class="caret"></span></a>
          		
          			<ul class="dropdown-menu" role="menu">
            			<li><a href="<spring:url value="/rentals/add"/>"><spring:message code="menu.add"/></a></li>
            			<li><a href="<spring:url value="/rentals/rentals"/>"><spring:message code="menu.find"/></a></li>
          			</ul>
        		</li>
        		
        		
        		
        		<!-- <li><a href="<spring:url value="/cars/find/available"/>">Statistics</a></li> -->
    		</ul>
    		
    		<ul class="nav navbar-nav navbar-right">
				<li>
        			<a href="<c:url value="/j_spring_security_logout" />" class="btn btn-danger btn-mini pull-right">logout</a>
        		</li>
    		</ul>
    		
		</div>
</nav>