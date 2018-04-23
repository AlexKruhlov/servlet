package com.example.listener.simple;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DogBreedServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public static final String DOG_ATTRIBUTE = "dog";

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();
		Dog dog = (Dog) getServletContext().getAttribute(DOG_ATTRIBUTE);
		out.println("<html><body>" + dog.getBreed() + "</body></html>");
	}
}
