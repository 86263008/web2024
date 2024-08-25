<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<jsp:useBean id="datetime" class="java.util.Date" />
<title>Hello JSP</title>
</head>
<body>
	<h1>Hello world, from Tomcat!</h1>
	on ${datetime}
</body>
</html>