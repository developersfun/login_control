<%@ page language="java"%>

<%@ taglib prefix="n" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>

<!doctype html>
<html lang="en">
<head>
<title>Home | Sum</title>
</head>
<body>

	<link rel="stylesheet"
		href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
		integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh"
		crossorigin="anonymous">

	<div class="container">
		<h2>HEADER</h2>
	</div>

	<form action="myapp" method="get" class="form-group">

		<div class="container">
			<label class="form-label" for="name">Name</label> <input
				class="form-control" type="text" name="name"><br>
		</div>

		<div class="container">
			<button type="Submit" class="btn btn-warning">Greet</button>
		</div>


	</form>

</body>
</html>
