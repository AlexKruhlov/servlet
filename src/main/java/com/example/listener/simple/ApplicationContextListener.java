package com.example.listener.simple;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class ApplicationContextListener implements ServletContextListener {
	public static final String DOG_PARAMETER = "dog";

	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		String dogBreed = arg0.getServletContext().getInitParameter(DOG_PARAMETER);
		Dog dog = new Dog(dogBreed);
		arg0.getServletContext().setAttribute(DOG_PARAMETER, dog);
	}

	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
	}
}
