<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Get User Bean</title>
</head>
<body>
	<jsp:useBean id="user" class="org.test.bean.User" scope="session" ></jsp:useBean>
	<jsp:setProperty property="*" name="user"/>
	<jsp:getProperty property="firstName" name="user"/>
	<jsp:getProperty property="lastName" name="user"/>
</body>
</html>