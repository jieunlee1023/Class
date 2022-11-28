<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%!String adminId;
	String adminPw;%>

	<%
	adminId = config.getInitParameter("adminId");
	adminPw = config.getInitParameter("adminPw");
	%>
	
	<p>너의 아이디는 : <%= adminId %></p>
	<p>너의 비밀번호는 : <%= adminPw %></p>

</body>
</html>