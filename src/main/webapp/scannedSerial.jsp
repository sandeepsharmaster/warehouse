<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<c:set var="contextPath" value="${pageContext.request.contextPath}" />

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
<meta name="description" content="">
<meta name="author" content="">

<title>Upload Scanned Serial Numbers</title>

<link href="${contextPath}/resources/css/bootstrap.min.css"
	rel="stylesheet">
<link href="${contextPath}/resources/css/common.css" rel="stylesheet">

<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
<!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
    <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>

<body>
	<div class="container">

		<div class="form-container">
		
		<h1>File Upload </h1>
			<form:form method="POST" modelAttribute="fileBucket" enctype="multipart/form-data" class="form-horizontal">

				<div class="row">
					<div class="form-group col-md-12">
						<label class="col-md-3 control-lable" for="file">Upload a file </label>
						<div class="col-md-7">
							<form:input type="file" path="file" id="file" class="form-control input-sm" />
							<div class="has-error">
								<form:errors path="file" class="help-inline" />
							</div>
							<div class="row">
								<div class="form-actions floatRight">
									<input type="submit" value="Upload" class="btn btn-primary btn-sm">
								</div>
							</div>
						</div>
					</div>
				</div>

				<!-- <button class="btn btn-lg btn-primary btn-block" type="submit">Submit</button> -->
			</form:form>
			
	 <form:form method="POST" modelAttribute="fileBucket" class="form-signin">
        <h1 class="form-signin-heading">Initiate Upload from local directory</h1>
        <spring:bind path="fileName">
            <div class="form-group ${status.error ? 'has-error' : ''}">
                <form:input type="text" path="fileName" class="form-control" placeholder="fileName"  autofocus="true"></form:input>
                <form:errors path="fileName"></form:errors>
            </div>
        </spring:bind> 

        <button class="btn btn-lg btn-primary btn-block" type="submit">Submit</button>
    </form:form>
    	

			<h4 class="text-center">
				<a href="${contextPath}/welcome">Home</a>
			</h4>
		</div>
		
	</div>
	<!-- /container -->
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
	<script src="${contextPath}/resources/js/bootstrap.min.js"></script>
</body>
</html>
