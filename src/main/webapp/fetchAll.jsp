<%@page import="dto.EmpDto"%>
<%@page import="java.util.List"%>
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
List<EmpDto> data1= (List<EmpDto>)request.getAttribute("key");
for(EmpDto dto:data1){
%>
<tr>
<td><%=dto.getEmail() %></td>
<td><%=dto.getPwd() %></td>
<td><%=dto.getName() %></td>
</tr>
<%
}
%>
</table>

</body>
</html>