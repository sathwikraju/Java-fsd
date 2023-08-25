<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
  if (request.getParameter("error") != null)
          out.println("<b>Your session has expired or is invalid.</b><br>");
%>
<form action="login.jsp" method="post">
<table>
<tr>
<td>Name</td>
<td><input name="name" id="name" maxlength=40></td>
</tr>
<tr>
<td>Password</td>
<td><input type="password" name="pwd" id="pwd" maxlength="10"><br></td>
</tr>
<tr>
<td></td>
<td><button>Submit</button></td>
</tr>
<tr>
</table>
</form>

</body>
</html>