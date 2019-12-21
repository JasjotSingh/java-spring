<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>demo</title>
</head>
<body>
	<jsp:useBean id="user" class="org.test.bean.User" scope="session" ></jsp:useBean>
	<% String path = request.getContextPath(); %>
	in home!!<br>
	Welcome <jsp:getProperty property="firstName" name="user"/> <jsp:getProperty property="lastName" name="user"/>!!!<br>
	<a href = "<%= path %>/servelet1?page=Login" >Login</a><br>
	<a href = "<%= path %>/servelet1?page=Signup">Sign up</a><br>
	<a href = "<%= path %>/servelet1?page=About">About</a><br>
	<a href = "<%= path %>/servelet1?page=JSPForm">JSP Form</a><br>
	<a href = "<%= path %>/servelet1?page=ServeletForm">Servelet Form</a><br>
	<a href = "<%= path %>/servelet1?page=setUserBean">Set Bean</a><br>
	<a href = "<%= path %>/servelet1?page=getUserBean">Get Bean</a>
</body>
</html>