<%@page import="dto.EmpDto"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border="1px">
<tr>
<th>email</th>
<th>pwd</th>
<th>name</th>
</tr>

<% 
EmpDto data=(EmpDto)request.getAttribute("key");
%>
<tr>
<td><%=data.getEmail() %></td>
<td><%=data.getPwd() %></td>
<td><%=data.getName() %></td>
</tr>

</table>

</body>
</html>