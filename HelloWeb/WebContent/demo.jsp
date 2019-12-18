<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>demo</title>
</head>
<body>
	<% String path = request.getContextPath(); %>
	in home!!<br>
	<a href = "<%= path %>/servelet1?page=Login" >Login</a><br>
	<a href = "<%= path %>/servelet1?page=Signup">Sign up</a><br>
	<a href = "<%= path %>/servelet1?page=About">About</a><br>
</body>
</html>