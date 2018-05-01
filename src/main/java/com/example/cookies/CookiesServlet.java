package com.example.cookies;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CookiesServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		RequestDispatcher view = req.getRequestDispatcher("/username.jsp");

		String userName = req.getParameter("username");
		Cookie cookie = new Cookie("username", userName);
		resp.addCookie(cookie);
		view.forward(req, resp);
	}

}
