package com.json.codes;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Employee {

	@JsonProperty("Age")
	private int Age;

	@JsonProperty("Name")
	private String Name;

	@JsonProperty("Place")
	private String Place;

	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		Age = age;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getPlace() {
		return Place;
	}

	public void setPlace(String place) {
		Place = place;
	}

	@Override
	public String toString() {
		return "Employee [Age=" + Age + ", Name=" + Name + ", Place=" + Place + "]";
	}
	

}