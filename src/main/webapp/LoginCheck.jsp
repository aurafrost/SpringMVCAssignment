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
String name=request.getParameter("username");
String pw=request.getParameter("password");
if(name.equals("admin")&&pw.equals("admin")){
	RequestDispatcher rd=request.getRequestDispatcher("login.html");
	rd.forward(request,response);
}
else{
	RequestDispatcher rd=request.getRequestDispatcher("WEB-INF/jsp/error.jsp");
	response.getWriter().append("Invalid username or password");
	rd.include(request,response);
}
%>
</body>
</html>