<%@ page language="java" contentType="text/html" pageEncoding="UTF-8" %>

<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>

<%
    String cliente = (String) request.getAttribute("chaveCliente");
%>


<h1><%= "Hello World!" %>
</h1>
<p>seu navegador é: <% out.print(cliente); %></p>
<br/>
<a href="hello-servlet">Hello Servlet</a>
</body>
</html>
