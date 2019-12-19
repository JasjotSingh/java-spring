<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Form</title>
</head>
<body>
	<jsp:useBean id="user" class="org.test.bean.User" scope="session"></jsp:useBean>
	<form action = "JSPSubmit.jsp" method = "get">
		First Name:<input type = "text" name="firstName" value='<jsp:getProperty property="firstName" name="user"/>' ><br>
		Last Name:<input type="text" name="lastName" value='<jsp:getProperty property="lastName" name="user"/>'><br>
		Gender:<input type="radio" name = "Gender" value="Male" checked="checked">Male
			   <input type="radio" name = "Gender" value="Female">Female<br>
		Language:<input type="checkbox" name="Language" value="English">English
				 <input type="checkbox" name="Language" value="Hindi">Hindi
				 <input type="checkbox" name="Language" value="French">French<br>
		Country:<select name="Country">
				<option value="India">India</option>
				<option value="USA">USA</option>
				<option value="UK">UK</option>
				</select><br>
		<input type="submit" name="Submit" value="Submit">
	</form>
</body>
</html>