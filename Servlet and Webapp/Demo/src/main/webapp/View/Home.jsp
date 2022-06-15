<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="com.start.model.Employee" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Details</title>
</head>
<body>
<h1>Welcome to Employee Details page</h1>

<!-- Scriptlet -->

<% 
Employee name=(Employee)request.getAttribute("employee");
  out.println((name.getId()));
  out.println((name.getName()));
  out.println((name.getSalary()));
%>

</body>
</html>