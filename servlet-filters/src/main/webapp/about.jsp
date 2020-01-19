<%@ page language="java"%>

<%@ taglib prefix="n" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>

<!doctype html>
<html lang="en">
<head>
<title>About</title>
</head>
<body>

	<link rel="stylesheet"
		href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
		integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh"
		crossorigin="anonymous">

	<h1>About Page</h1>

	<%
		boolean isLoggedin = false;
		Object username = request.getSession().getAttribute("uname");
		if (username == null) {
			out.print("Welcome to the page");
		} else {
			out.print("Hello, " + username.toString());
			isLoggedin = true;
		}
	%>

	<div class="container">
		<a href="home.jsp"><button type="Submit" class="btn btn-warning">Home</button></a>
		<a href="media.jsp"><button type="Submit" class="btn btn-warning">Media</button></a>
		<n:if test="<%=isLoggedin%>">
			<form action="Logout">
				<input type="Submit" class="btn btn-danger" value="Logout">
			</form>
		</n:if>
		<n:if test="<%=!(isLoggedin)%>">
			<a href="login.jsp"><button type="Submit" class="btn btn-primary">Login</button></a>
		</n:if>
	</div>

	<p class="text-justify">I am a Java Developer having exposure to
		Java and J2EE related frameworks and APIs, MongoDB, Spring
		Boot(Microservice Architecture). Also have entry level skills in
		Oracle Database and Angular 5. Worked with Agile Methodologies and
		TDD(Test Driven Development) strategy.</p>

</body>
</html>
