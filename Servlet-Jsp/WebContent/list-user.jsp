<%@page import="java.sql.ResultSet"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>List of Users</h1>
	<table width="80%" align="center" border="2">
		<tr bgcolor="green">
			<td>UserId</td>
			<td>password</td>
			<td colspan="2">Action</td>
		</tr>
		
		<%
		ResultSet result=(ResultSet)request.getAttribute("data");
		while(result.next()){
		%>
		<tr>
			<td><%=result.getString(1) %></td>
			<td><%=result.getString(1) %></td>
			<td><a href="/deleteUser?userId=<%=result.getString(1) %>">delete</a></td>
			<td><a href="">update</a></td>
		</tr>
		<% } %>
		<!-- <tr>
			<td>user1</td>
			<td>pass11</td>
		</tr>
		<tr>
			<td>user2</td>
			<td>pass22</td>
		</tr> -->
	</table>

</body>
</html>