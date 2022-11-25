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

	<%!int num = 10;
	String str = "boot camp jsp";
	ArrayList<String> list = new ArrayList<String>();

	public void myMethod() {
		System.out.println("JSP file method");
	}
	// System.out.println("JSP file method"); < -- 사용 안됨
	//num = (100 * 100); <-- 사용 안됨%>


	<!-- 주석태그-->
	<%-- 여기는 JSP 주석입니다. HTML 응답시에 사용자는 확인 할 수 없다.--%>

	<!-- 스크립트 릿
	자바 코드 마음껏 사용 가능
	하나의 스크립트 릿은 "메서드 안"과 같다.
	 -->

	<%
	System.out.println("num : " + num);
	//public void addNumber(){} 메서드는 불가
	myMethod(); //메서드 호출은 가능
	%>

	<!-- 표현 태그 -->
	<section>
		<p>
			당신의 한국 나이는 올해 까지지만
			<%=num%>
			입니다
		</p>
	</section>

</body>
</html>