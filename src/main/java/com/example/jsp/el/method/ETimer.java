package com.example.jsp.el.method;

import java.time.LocalDateTime;

public class ETimer {

	public static String getTime() {
		return LocalDateTime.now().toLocalTime().toString();
	}
}
