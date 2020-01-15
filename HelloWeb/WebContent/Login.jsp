<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<body>
	
	<jsp:useBean id="user" class="org.test.bean.User" scope="session"></jsp:useBean>
	<%@ page import="org.test.bean.User" %>
	<% String path = request.getContextPath(); 
	   User usr = (User)request.getSession().getAttribute("user");
	   if(!usr.getFirstName().equals("First Name") ){
		   response.sendRedirect("demo.jsp");
	   }
	%>
	<form  action = "<%= path %>/TestLoginController" method = "post">
		UserName: <input name = "userName" type="text" required><br>
		PassWord:<input name = "password" type="password" required><br>
		<input type="submit" name="submit">
	</form>
</body>
</html>