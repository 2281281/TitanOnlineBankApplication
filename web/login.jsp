<jsp:include page="/includes/header.jsp" />

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
<section>
<div class="col-9">
        <h1>Login Form</h1>
        <p>Please enter your username and password to continue.</p>
<section>

<p>Please enter a username and password to continue.</p>
<form action="LoginServlet" method="post">
        <input type="hidden" name="action" value="add">        
        <label class="pad_top">Username:</label>
        <input type="text" name="username"><br>
        <label class="pad_top">Password:</label>
        <input type="password" name="password"><br>
        <label>&nbsp;</label>
        <input type="submit" value="login">
</form>

</section>
        <br><br>
        <p><b>Reset Password</b></p>
<form action="password_reset.jsp" method="post">
        <label>&nbsp;</label>
    <input type="submit" value="Reset" class="left_margin">
</form>
</section><br>
</div>
    <br><br><br><br><br><br><br><br><br>
<jsp:include page="/includes/footer.jsp" />