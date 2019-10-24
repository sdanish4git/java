<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"  %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%-- 
<%
out.print("this is scriptlet");
int i=10;


%>  
<%=new java.util.Date() %> 
<%=i+"using expression" %>
<%! int count=0; %>    --%>

<form action="second.jsp"  >
User Name <input type="text" name="uname"/> <br/>
Password <input type="password" name="upass"/> <br/>
<input type="submit" value="Login" />

</form>
<% String errMsg=(String)request.getAttribute("error"); 
if(errMsg!=null){
%>
<font color='red'>
<%=errMsg %>
</font>
<% } %>


</body>
</html>