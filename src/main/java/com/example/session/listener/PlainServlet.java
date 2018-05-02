package com.example.session.listener;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PlainServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		req.getSession().setAttribute("myattribute", new SessionListen());
		resp.getWriter().println(getServletContext().getAttribute("myattribute").toString());
	}
}
