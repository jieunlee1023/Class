package com.boot;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.MovieDAO;
import com.dto.MovieDTO;

@WebServlet("/movieInfo")
public class MovieInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public MovieInfoServlet() {

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// get
		// 요청 처리
		request.setCharacterEncoding("UTF-8");

		// 응답처리
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();

		MovieDAO dao = new MovieDAO();
		ArrayList<MovieDTO> movieList = (ArrayList<MovieDTO>) dao.selectMovie();

		request.setAttribute("movieList", movieList);
		ServletContext context = getServletContext();
		//dispatcher 요청 + 관리자 (배치 운행자)
//		RequestDispatcher dispatcher = context.getRequestDispatcher("/movie_info.jsp");
//		dispatcher.forward(request, response);
		
		//response.sendRedirect("movie_info.jsp");
		// 이렇게 갈 수는 없다. 바로 jsp로 가는 것이 아니라
		// 브라우저를 거쳐 가기때문 Connectionless

		for (int i = 0; i < movieList.size(); i++) {
			out.print(movieList.get(i).get번호()+"번 / ");
			out.print(movieList.get(i).get이름()+" / ");
			out.print(movieList.get(i).get개봉연도()+" / ");
			out.print(movieList.get(i).get매출액()+" / ");
			out.print(movieList.get(i).get관객수()+" / ");
			out.print(movieList.get(i).get평점());
			out.print("<br>");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}
}
