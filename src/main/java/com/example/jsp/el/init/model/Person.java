package com.example.jsp.el.init.model;

import java.util.List;
import java.util.Map;

public class Person {
	private String name;
	private Dog dog;
	private List<String> Ids;
	private Map<String, String> carColor;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Dog getDog() {
		return dog;
	}

	public void setDog(Dog dog) {
		this.dog = dog;
	}

	public List<String> getIds() {
		return Ids;
	}

	public void setIds(List<String> ids) {
		Ids = ids;
	}

	public Map<String, String> getCarColor() {
		return carColor;
	}

	public void setCarColor(Map<String, String> carColor) {
		this.carColor = carColor;
	}
}
