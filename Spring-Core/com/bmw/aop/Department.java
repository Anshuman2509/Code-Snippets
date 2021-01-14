package com.bmw.aop;

public class Department {
	private int id;
	private String name;
	public int getId() {
		return id;
	}
	@CustomAspectAnnotation
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

}
