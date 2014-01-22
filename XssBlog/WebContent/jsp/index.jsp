<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core_1_1" prefix="c"%>
<%@ page session="true"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="//netdna.bootstrapcdn.com/bootstrap/3.0.3/css/bootstrap.min.css" rel="stylesheet">
<link href="./css/custom.css" rel="stylesheet">

<title>XSS-Blog</title>
</head>
<body>

	<div class="navbar navbar-inverse navbar-fixed-top" role="navigation">
		<div class="container">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
					<span class="sr-only">Toggle navigation</span> <span class="icon-bar"></span> <span class="icon-bar"></span> <span class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="#">XSS-Blog</a>
			</div>
			<div class="collapse navbar-collapse">
				<ul class="nav navbar-nav">
					<li class="active"><a href="#">Home</a></li>
				</ul>

				<ul class="nav navbar-nav navbar-right">
					<c:if test="${sessionScope.username != null}">
						<li><a href="#">Username: <c:out value="${sessionScope.username}" /></a></li>
						<li><a href="/logout">Logout</a></li>
					</c:if>
					<c:if test="${sessionScope.username == null}">
						<li><a href="/login">Login</a></li>
					</c:if>
					
				</ul>
			</div>
		</div>
	</div>

	<div class="container">
		<div class="starter-template">
			<h1>XSS-Blog</h1>
			<p class="lead">
				Use this document as a way to quickly start any new project.<br> All you get is this text and a mostly barebones HTML document.
			</p>
		</div>

	</div>


	<script src="//netdna.bootstrapcdn.com/bootstrap/3.0.3/js/bootstrap.min.js"></script>

</body>
</html>