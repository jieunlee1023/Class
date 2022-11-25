<!--  서버에서 JSP 페이지 처리 하는 방법에 대한 정의
		지시자, 지시어 @, 
		@page 페이지 기본 설정
 -->
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!--  JSP 선언 태그 
멤버 변수와 메서드 등 선언 가능 , 
선언 태그에서 식 사용 불가,  선언만 가능 -->

	<%!int num = 200;
	String str = "boot camp jsp";
	ArrayList<String> list = new ArrayList<String>();%>

	<!-- if문과 HTML 태그 활용 -->
	<%
	if (num > 100) {
	%>
	<div>
		<p>num은 100보다 큰 값을 가지고 있네요!</p>
	</div>
	<%
	} else {
	%>
	<div>
		<p>num은 100보다 작은 값을 가지고 있네요!</p>
	</div>
	<%
	}
	%>

	<!-- 표현식 태그 -->
	<div>
		<p>자바 변수에 num 값은 <%=num %>입니다</p>
		<p>표현식에서 간단한 연산해보기 : <%=num %> * 100 = <%=(num*100) %>입니다</p>
	</div>



</body>
</html>