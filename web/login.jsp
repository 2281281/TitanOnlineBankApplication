<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet" type="text/css" href="toba.css">
</head>


<body>

<div class="header">
<h1>Titan Online Banking</h1>
</div>

<div class="row">

<div class="col-3 menu">
<ul>
          <li><a href="index.jsp">
                  Home</a></li>
          <li><a href="login.jsp">
                  Login</a></li>
          <li><a href="new_customer.jsp">
                  Register</a></li>
          <li><a href="customerService.html">
                  Customer Service</a></li>
</ul>
</div>

<div class="col-9">
<h1>Login</h1>
<section>
<form action="login" method="get">
    <label>Username</label>
    <input type="text" name="name"><br>
    <label>Password</label>
    <input type="password" name="pass"><br>
    <label>&nbsp;</label>
    <input type="submit" value="Login">
</form>
</section>
<jsp:include page="/includes/footer.jsp" />