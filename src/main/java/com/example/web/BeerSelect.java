package com.example.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.model.BeerExpert;

public class BeerSelect extends HttpServlet {
//	private static final String TEXT_AND_HTML_TYPE = "text/html";
	private static final String COLOR_PARAMETER = "color";

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String c = req.getParameter(COLOR_PARAMETER);
		BeerExpert beerExpert = new BeerExpert();
		List<String> result = beerExpert.getBrands(c);
		
//		resp.setContentType(TEXT_AND_HTML_TYPE);
//		PrintWriter out = resp.getWriter();
//		out.println("Bear Selection Advice<br>");
		
		req.setAttribute("styles", result);
		RequestDispatcher view = req.getRequestDispatcher("result.jsp");
		view.forward(req, resp);
	}
}
