package com.example.noscripting.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.noscripting.model.Person;

public class NameServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");

		Person person = new Person();
		person.setName("Maximus");
		req.setAttribute("person", person);
		RequestDispatcher view = req.getRequestDispatcher("response.jsp");
		view.forward(req, resp);
	}
}
