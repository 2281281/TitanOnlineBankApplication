<%-- 
    Document   : success
    Created on : Apr 11, 2016, 7:59:05 PM
    Author     : Karen
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
<h1>Account Created</h1>
<section>
<p>The account has been successfully created.</p> 

<label>First Name:</label>
<span>${user.firstName}</span><br>
<label>Last Name:</label>
<span>${user.lastName}</span><br>
<label>Phone:</label>
<span>${user.phone}</span><br>
<label>Address:</label>
<span>${user.address}</span><br>
<label>Address2::</label>
<span>${user.address2}</span><br>
<label>City:</label>
<span>${user.city}</span><br>
<label>State:</label>
<span>${user.st}</span><br>
<label>Zip Code:</label>
<span>${user.zip}</span><br>
<label>Email:</label>
<span>${user.email}</span><br>
<label>User Name:</label>
<span>${user.username}</span><br>
<label>Password:</label>
<span>${user.password}</span><br>

    </section>
</div>

</div>
</body>
</html>
