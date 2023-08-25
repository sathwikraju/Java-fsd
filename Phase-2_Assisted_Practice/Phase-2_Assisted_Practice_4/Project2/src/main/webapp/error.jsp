<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
    <title>Error Handling</title>
</head>
<body>
    <h1>Error Handling</h1>
    <p>An error occurred: <%= request.getAttribute("errorMessage") %></p>
</body>
</html>
