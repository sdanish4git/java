<%@page import="java.util.*;" %>
<%

String userName=request.getParameter("uname");
String password=request.getParameter("upass");

if("dshakil".equals(userName) && "123".equals(password)){
	RequestDispatcher rd=request.getRequestDispatcher("welcome.jsp");
	request.setAttribute("name", userName);
	rd.forward(request, response);
}else{
	RequestDispatcher rd=request.getRequestDispatcher("login.jsp");
	request.setAttribute("error", "Invalid Credential");
	rd.forward(request, response);
}
%>