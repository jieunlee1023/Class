<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	session = request.getSession();
	String myId = (String) session.getAttribute("mId");
	out.print("session mId : " + myId);

	if (myId == null) {
		response.sendRedirect("login.jsp");
	}
	%>

	<br>
	<form action="log-out" method="get">
		<input type="submit" value="로그아웃">
	</form>

</body>
</html>