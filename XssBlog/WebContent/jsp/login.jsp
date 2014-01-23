<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="//netdna.bootstrapcdn.com/bootstrap/3.0.3/css/bootstrap.min.css" rel="stylesheet">
<link href="./css/custom.css" rel="stylesheet">

<title>XSS-Blog</title>
</head>
<body>

	<div class="container">
		<div class="starter-template">
			<div class="container">
				<div class="row">
					<div class="col-md-4 col-md-offset-4">
						<form class="form-signin" role="form" action="./login" method="post">
							<h2 class="form-signin-heading">Please sign in</h2>
							<input name="username" type="text" class="form-control" placeholder="Email address" required autofocus> 
							<input name="password" type="password" class="form-control" placeholder="Password" required> 
							<label class="checkbox"> <input type="checkbox" value="remember-me"> Remember me</label>
							<button class="btn btn-lg btn-primary btn-block" type="submit">Sign in</button>
						</form>
					</div>				
				</div>				
			</div>				
		</div>
	</div>

	<script src="//netdna.bootstrapcdn.com/bootstrap/3.0.3/js/bootstrap.min.js"></script>
</body>
</html>