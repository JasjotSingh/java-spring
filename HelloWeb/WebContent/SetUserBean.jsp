<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Set User Bean</title>
</head>
<body>
	<jsp:useBean id="user" class="org.test.bean.User" scope="session"></jsp:useBean>
	<form action="GetUserBean.jsp">
		<input type="text" name="firstName" value='<jsp:getProperty property="firstName" name="user"/>' >
		<input type="text" name="lastName" value='<jsp:getProperty property="lastName" name="user"/>' ><br>
		<input type="submit" name="Submit">
	</form>
</body>
</html>