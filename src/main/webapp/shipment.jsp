<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<c:set var="contextPath" value="${pageContext.request.contextPath}"/>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Log in with your account</title>

    <link href="${contextPath}/resources/css/bootstrap.min.css" rel="stylesheet">
    <link href="${contextPath}/resources/css/common.css" rel="stylesheet">

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
    <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>

<body>

<div class="container">
   
    <form:form method="POST" modelAttribute="shipmentForm" class="form-signin">
        <h1 class="form-signin-heading">Enter Shipment Details</h1>
        <spring:bind path="productId">
            <div class="form-group ${status.error ? 'has-error' : ''}">
                <form:input type="text" path="productId" class="form-control" placeholder="ProductId"  autofocus="true"></form:input>
                <form:errors path="productId"></form:errors>
            </div>
        </spring:bind>
        
        <spring:bind path="description">
            <div class="form-group ${status.error ? 'has-error' : ''}">
                <form:input type="text" path="description" class="form-control" placeholder="Description"  autofocus="true"></form:input>
                <form:errors path="description"></form:errors>
            </div>
        </spring:bind>
        
        <spring:bind path="price">
            <div class="form-group ${status.error ? 'has-error' : ''}">
                <form:input type="text" path="price" class="form-control" placeholder="Price"  autofocus="true"></form:input>
                <form:errors path="price"></form:errors>
            </div>
        </spring:bind>

       

        <button class="btn btn-lg btn-primary btn-block" type="submit">Submit</button>
    </form:form>

</div>
<!-- /container -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
<script src="${contextPath}/resources/js/bootstrap.min.js"></script>
</body>
</html>
