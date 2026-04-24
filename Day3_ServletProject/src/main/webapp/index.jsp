<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>Welcome</h1>

	<%
	for (int i = 1; i <= 50; i++) {

		if (i % 2 == 0) {
			out.println("<h1>" + "EVEN -> " + i + "</h1>");
		} else {
			out.println("<h1>" + "ODD -> " + i + "</h1>");
		}
	}
	%>


</body>
</html>