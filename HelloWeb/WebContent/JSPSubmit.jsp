<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSPSubmit</title>
</head>
<body>
	Name: <%= request.getParameter("Name") %><br>
	Gender: <%= request.getParameter("Gender") %><br>
	Language: <% String[] lang = request.getParameterValues("Language");
					if(lang != null) {
						for(int i = 0;i < lang.length; i++) {
							out.print(lang[i]+" ");
						}
					}
					else {
						out.print("No language selected");
					}
			%><br>
	Country: <%= request.getParameter("Country") %>
</body>
</html>