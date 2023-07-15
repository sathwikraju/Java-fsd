<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>JSP Implicit Objects</title>
</head>
<body>
    <%-- JSP Implicit Objects --%>
    <h1>JSP Implicit Objects Example</h1>

    <%-- request implicit object --%>
    <h2>Request Implicit Object</h2>
    <p>Request URI: <%= request.getRequestURI() %></p>
    <p>Context Path: <%= request.getContextPath() %></p>

    <%-- response implicit object --%>
    <h2>Response Implicit Object</h2>
    <p>Content Type: <%= response.getContentType() %></p>
    <p>Character Encoding: <%= response.getCharacterEncoding() %></p>

    <%-- out implicit object --%>
    <h2>Out Implicit Object</h2>
    <% out.println("This is printed using the out implicit object."); %>

    <%-- session implicit object --%>
    <h2>Session Implicit Object</h2>
    <% session.setAttribute("username", "Virat Kohli"); %>
    <p>Username: <%= session.getAttribute("username") %></p>

    <%-- application implicit object --%>
    <h2>Application Implicit Object</h2>
    <% application.setAttribute("appVar", "Application Variable"); %>
    <p>App Variable: <%= application.getAttribute("appVar") %></p>

    <%-- config implicit object --%>
    <h2>Config Implicit Object</h2>
    <p>Servlet Name: <%= config.getServletName() %></p>

    <%-- pageContext implicit object --%>
    <h2>PageContext Implicit Object</h2>
    <% pageContext.setAttribute("pageVar", "Page Variable"); %>
    <p>Page Variable: <%= pageContext.getAttribute("pageVar") %></p>

    <%-- Error Handling --%>
    <% int x = 3;
       try {
           int result = 10 / x;
       } catch (ArithmeticException e) {
           // Forwarding the request to error.jsp
           request.setAttribute("errorMessage", "An arithmetic error occurred: " + e.getMessage());
           request.getRequestDispatcher("error.jsp").forward(request, response);
       }
    %>

    <%-- Redirection to Another JSP --%>
    <h2>Redirect</h2>
    <a href="redirect.jsp">Go to Redirect Page</a>

</body>
</html>
