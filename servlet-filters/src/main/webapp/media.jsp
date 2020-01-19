<%@ page language="java"%>

<%@ taglib prefix="n" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>

<!doctype html>
<html lang="en">
<head>
<title>Media</title>
</head>
<body>

	<link rel="stylesheet"
		href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
		integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh"
		crossorigin="anonymous">

	<h1>Media Page</h1>

	<%
	
		response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
		response.setHeader("Pragma", "no-cache");//Http-1.1
		response.setHeader("Expires", "0");//Proxies

		
		Object username = request.getSession().getAttribute("uname");
		if (username == null) {
			response.sendRedirect("login.jsp");
		} else {
			out.print("Welcome, " + username.toString());
		}
	%>

	<div class="container">
		<a href="home.jsp"><button type="Submit" class="btn btn-warning">Home</button></a>
		<a href="about.jsp"><button type="Submit" class="btn btn-warning">About</button></a>
	</div>

	<form action="Logout">
		<button type="Submit" class="btn btn-danger">Logout</button>
	</form>

	<div class="container">
		<!-- <video width="320" height="240" controls>
			<source src="https://www.youtube.com/watch?v=OykXhUK2S04"
				type="video/mp4">
			Your browser does not support the video tag.
		</video> -->

		<iframe width="560" height="315"
			src="https://www.youtube.com/embed/hMUoRwDDEjo" frameborder="0"
			allow="accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture"
			allowfullscreen></iframe>
	</div>


</body>
</html>
