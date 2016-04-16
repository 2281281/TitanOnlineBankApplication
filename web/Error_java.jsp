<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1.0">

</head>
<link rel="stylesheet" type="text/css" href="toba.css">

<body>

<div class="header">
<h1>Titan Online Banking</h1>
</div>

<div class="row">

<div class="col-9">

<section>

    <h1>Java Error</h1>
    <p>Sorry, Java has thrown an exception.</p>
    <p>To continue, click the back button or select a link from this page.</p>

    <!-- NOTE: When you're done with testing, you can disable 
    any of the following details about the exception. -->      
    <h2>Details</h2>
    <code>
    ${pageContext.errorData.servletName} threw a <br>
    ${pageContext.exception}<br>
    <c:forEach var="line" items="${pageContext.errorData.throwable.stackTrace}">
        &nbsp;&nbsp;&nbsp;&nbsp;at ${line}<br>
    </c:forEach>
    </code>

</section>
</div>

</div>
</body>
</html>
