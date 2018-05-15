package com.example.jsp.el.init.servlet;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.jsp.el.init.model.Dog;
import com.example.jsp.el.init.model.Person;

public class InitServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Dog personDog = new Dog();
		personDog.setBreed("Greypound");

		List<String> personsId = Arrays.asList("Pasport", "TaxId", "Saylor Card");

		Map<String, String> carColors = new HashMap<>();
		carColors.put("BMW", "BLACK");
		carColors.put("MERCEDES", "RED");

		Person personForJsp = new Person();
		personForJsp.setName("Magnus");
		personForJsp.setDog(personDog);
		personForJsp.setIds(personsId);
		personForJsp.setCarColor(carColors);
		req.setAttribute("person", personForJsp);

		RequestDispatcher view = req.getRequestDispatcher("person.jsp");
		view.forward(req, resp);
	}
}
