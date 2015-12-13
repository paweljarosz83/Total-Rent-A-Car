<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet"
  href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
<title>Products</title>
</head>
<body>
  <section>
    <div class="jumbotron">
      <div class="container">
        <h1>Products</h1>
      </div>
    </div>
  </section>
  <section class="container">

  
  
    <div class="row">
      <div class="col-md-5">
        <h3>${driver.name}</h3>
        <p>${driver.name}</p>
        <p>
          <strong>Item Code : </strong><span class="label label-warning">${driver.surname}</span>
        </p>
        <p>
          <strong>manufacturer</strong> : ${driver.name}
        </p>
        <p>
          <strong>category</strong> : ${driver.surname}
        </p>
        <p>
          <strong>Availble units in stock </strong> : ${driver.name}
        </p>
        <h4>${driver.name} USD</h4>
        <p>
          <a href="#" class="btn btn-warning btn-large"> <span
            class="glyphicon-shopping-cart glyphicon"></span> Order Now
          </a>
        </p>
      </div>
    </div>
  </section>
</body>
</html>