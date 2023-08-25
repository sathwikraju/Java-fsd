<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="header.jsp" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>JSP Directives Example</title>
</head>
<body>
    <%-- JSP Directives --%>
    <h1>JSP Directives Example</h1>

    <%-- Page Directive --%>
    <h2>Page Directive</h2>
    <p>This is a demonstration of the page directive.</p>
    <p>Current Date: <%= new java.util.Date() %></p>

    <%-- Include Directive --%>
    <h2>Include Directive</h2>
    <%@ include file="content.jsp" %>

</body>
</html>
