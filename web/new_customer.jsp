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
          <li><a href="index.html">
                  Home</a></li>
          <li><a href="login.html">
                  Login</a></li>
          <li><a href="new_customer.jsp">
                  Register</a></li>
          <li><a href="customerService.html">
                  Customer Service</a></li>
</ul>
</div>

<div class="col-9">
<h1>New Customer Registration</h1>
    <form action="NewCustomer" method="post">
    <input type="hidden" name="action" value="add">
    <label>First Name:</label>
        <input type="text" name="firstName" value="${user.firstName}" required><br>
    <label>Last Name:</label>
        <input type="text" name="lastName" value="${user.lastName}" required><br>
    <label>Phone:</label>
         <input type="text" name="phone" value="${user.phone}" required><br>
    <label>Address:</label>
	<input type="text" name="address" value="${user.address}" required><br>
    <label>Address2:</label>
	<input type="text" name="address2" value="${user.address2}" required><br>
    <label>City:</label>
	<input type="text" name="city" value="${user.city}" required><br>
    <label>State:</label>
	<input type="text" name="state" value="${user.state}" required><br>
    <label>Zip Code:</label>
	<input type="text" name="zip" value="${user.zip}" required><br>
    <label>EMail:</label>
    	<input type="email" name="email" value="${user.email}" required><br>
    <label>&nbsp;</label><br>
    <input type="submit" value="Register">
    </form>
</div>
</div>
</body>
</html>
