package com.merc;

import org.springframework.beans.factory.annotation.Value;

public class Person {
	@Value("${fName}")
	private String firstName;
	@Value("${lName}")
	private String lastName;
	@Value("${city}")
	private String city;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", city=" + city + "]";
	}
	

}
