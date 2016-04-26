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
          <li><a href="password_reset.html">
                  Reset Password</a></li>

</ul>
</div>

<div class="col-9">
<h1>Login</h1>
<section>

<p>Reset your password</p>
<form action="LoginServlet" method="post">
        <label class="pad_top">Enter Your New Password:</label>
        <input type="password" name="password"><br>
        <label>&nbsp;</label>
        <input type="submit" value="reset">
</form>

</section>
</div>

</div>
</body>
</html>