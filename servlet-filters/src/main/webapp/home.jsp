<%@page import="org.nrj.servlets.util.UsersUtil"%>
<%@page import="org.apache.tomcat.util.buf.UriUtil"%>
<%@ page language="java"%>

<%@ taglib prefix="n" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>

<!doctype html>
<html lang="en">
<head>
<title>Home</title>
</head>
<body>

	<link rel="stylesheet"
		href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
		integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh"
		crossorigin="anonymous">

	<h1>Home Page</h1>

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
		<a href="media.jsp"><button type="Submit" class="btn btn-warning">Media</button></a>
		<a href="about.jsp"><button type="Submit" class="btn btn-warning">About</button></a>
	</div>
	<form action="Logout">
		<button type="Submit" class="btn btn-danger">Logout</button>
	</form>


</body>
</html>
