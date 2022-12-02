package com.boot;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.MovieDAO;
import com.dto.MovieDTO;

@WebServlet("/movieinfobytitle")
public class MovieInfoByTitleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public MovieInfoByTitleServlet() {

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 요청 처리
		request.setCharacterEncoding("UTF-8");

		// 응답처리
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();

		MovieDAO dao = new MovieDAO();
		MovieDTO movie = dao.selectMovieByTitle(request.getParameter("name"));
		System.out.println(movie.toString());

		if (movie != null) {
			out.print("번호 : " + movie.get번호() + "<br>");
			out.print("영화이름 : " + movie.get이름() + "<br>");
			out.print("개봉연도 : " + movie.get개봉연도() + "<br>");
			out.print("매출액 : " + movie.get매출액() + "<br>");
			out.print("관객수 : " + movie.get관객수() + "<br>");
			out.print("평점 : " + movie.get평점() + "<br>");
			out.print("<br>");
		}else {
			out.print("잘못 입력하였습니다!");
		}


	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

}
