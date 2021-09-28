<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - MINHA SERVLET DO CABEÇALHO</title>
</head>
<body>
<%
    String cliente = (String) request.getAttribute("chaveCliente");
%>
<%
    String a1 = (String) request.getAttribute("host");
%>
<%
    String a2 = (String) request.getAttribute("accept-encoding");
%>
<%
    String a3 = (String) request.getAttribute("accept-language");
%>

<h1><%= "Minha Servlet do Cabeçalho!" %>
</h1>
<p>seu navegador é: <% out.print(cliente); %> </p>

<p>seu host é: <% out.print(a1); %> </p>
<p>seu accept-encoding é: <% out.print(a2); %> </p>
<p>seu accept-language é: <% out.print(a3); %> </p>

<br/>
<a href="hello-servlet">hello servlet</a>
</body>
</html>