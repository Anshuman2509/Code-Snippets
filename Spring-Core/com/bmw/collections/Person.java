package com.bmw.collections;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Person {
	private int id;
	private String name;
	private List<String> languages;
	private Set<Car> cars;
	private Map<Integer, String> locations;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getLanguages() {
		return languages;
	}
	public void setLanguages(List<String> languages) {
		this.languages = languages;
	}
	public Set<Car> getCars() {
		return cars;
	}
	public void setCars(Set<Car> cars) {
		this.cars = cars;
	}
	public Map<Integer, String> getLocations() {
		return locations;
	}
	public void setLocations(Map<Integer, String> locations) {
		this.locations = locations;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", languages=" + languages + ", cars=" + cars + ", locations="
				+ locations + "]";
	}
	

}
