<%@page import="java.io.PrintWriter"%>
<%@page import="java.util.Enumeration"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>여기는 login_form.html에서 넘어온 데이터를 처리하는 곳</h3>
	<p>넘어온 데이터를 처리하고 다시 사용자 한테 응답 처리까지 진행한다.</p>

	<%!String email;
	String pwd;%>
	<%
	// 요청 응답시에 한글 처리를 위해서 셋팅 할 필요가 있다.
	// get 방식 때 한글 처리를 따로 해야하고,
	// post 방식 때 한글 처리를 따로 해야한다.
	//request.setCharacterEncoding("UTF-8");

	// 스트립트 릿에서 request 객체를 이용해서 값을 받아보자
	// 문제: 전체 key 값을 받고 싶다면 ?
	Enumeration<String> key = request.getParameterNames();
	while (key.hasMoreElements()) {
		String data = key.nextElement();
		System.out.println("key 값 확인 : " + data);
	}

	email = request.getParameter("email");
	pwd = request.getParameter("pwd");
	String hobby = request.getParameter("hobby");
	String[] likes = request.getParameterValues("like");
	
	response.setCharacterEncoding("UTF-8");

	//응답을 처리하기 위해서 response 객체를 사용 가능하다.
	PrintWriter printWriter = response.getWriter();
	printWriter.write("email : " + email + "\n" + "<br>");
	printWriter.write("pwd : " + pwd + "\n" + "<br>");
	printWriter.write("hobby : " + hobby + "\n" + "<br>");
	printWriter.write("likes : " + likes.length + "<br>");

	for (int i = 0; i < likes.length; i++) {
		printWriter.print("like : " + likes[i] + "\n" + "<br>");
		//write()도 print()도 사용 가능하다.
	}

	/* 	//out : 내장되어있는 메서드
		out.write("email : " + email + "\n" + "<br>");
		out.write("pwd : " + pwd + "\n" + "<br>");
		out.write("hobby : " + hobby + "\n" + "<br>");
		out.write("likes : " + likes.length + "<br>");

		for (int i = 0; i < likes.length; i++) {
			out.print("like : " + likes[i] + "\n" + "<br>");
		} */
		
		response.sendRedirect("home.jsp");
	%>
</body>
</html>


