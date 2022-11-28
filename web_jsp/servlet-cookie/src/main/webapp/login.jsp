<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인 페이지</title>
</head>
<body>
	<!-- 
    로그인 페이지 왔을 때 쿠키 값을 확인해서 값이 있다면
    그대로 화면에 출력처리,
    최초 요청시에는 value값을 안 찍으면 된다.
     -->
	<%
	String saveId = null;
	Cookie[] cookies = request.getCookies();
	if ( cookies != null){
		for (Cookie c : cookies) {
			if (c.getName().equals("memberId")) {
				saveId = c.getValue();
			}
		}
	}

	%>
	<form action="loginProc" method="post">
		<%
		if (saveId != null) {
		%>
		id : <input type="text" name="mId" value="<%=saveId%>">
		<%
		} else {
		%>
		id : <input type="text" name="mId" value="">
		<%
		}
		%>
		pw : <input type="text" name="mPw">
		<div>
			rememberMe <input type="checkbox" name="isSaveId">
		</div>
		<input type="submit" value="login">
	</form>
</body>
</html>