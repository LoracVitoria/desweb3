<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>JSP - MINHA SERVLET DA REQUISIÇÃO</title>
</head>
<body>
<h1><%= "Minha Servlet da Requisição!" %> </h1>


<%
    String b1 = (String) request.getAttribute("metodo");
%>
<%
    String b2 = (String) request.getAttribute("uri");
%>
<%
    String b3 = (String) request.getAttribute("protocolo");
%>
<p>seu metodo é: <% out.print(b1); %> </p>
<p>seu uri é: <% out.print(b2); %> </p>
<p>seu protocolo é: <% out.print(b3); %> </p>

<a href="hello-servlet">hello servlet</a>
</body>
</html>
