package com.example.session.listener;

import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;

public class SessionListen implements HttpSessionBindingListener {

	@Override
	public void valueBound(HttpSessionBindingEvent event) {
		event.getSession().getServletContext().setAttribute("myattribute",
				"I was inside the SessionBindingListener!!!");
	}

	@Override
	public void valueUnbound(HttpSessionBindingEvent event) {
	}
}
