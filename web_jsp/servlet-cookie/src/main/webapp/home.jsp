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
	Cookie[] cookies = request.getCookies();
	String userId = "";

	if (cookies != null ){
		for (Cookie c : cookies) { 
			System.out.print("c name : " +c.getName());
			System.out.print("c age : " +c.getMaxAge());
			if (c.getName().equals("memberId")){
				userId = c.getValue();
			}
		}
	}
	%>
	<h1>
		여기는
		<%=userId%>홈 화면 입니다!
	</h1>

</body>
</html>