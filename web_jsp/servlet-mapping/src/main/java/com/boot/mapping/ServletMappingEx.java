package com.boot.mapping;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/asvmp1")
//@WebServlet({"/asvmp1", "/asvmp2"}) : 이렇게도 가능
public class ServletMappingEx extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println(request.getContentType());
		System.out.println(request.getHeader(getServletName()));
		System.out.println(request.getMethod());
		
		//응답처리
		response.getWriter().write("<p> Hello Servlet Mapping</p>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
	
	// 하나의 서블릿에 여러 맵핑을 추가할 수 있다.

}
