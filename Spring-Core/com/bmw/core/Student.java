package com.bmw.core;

public class Student {
	private int id;
	private String name;
	private Address permanent;
	private Address current;
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
	public Address getPermanent() {
		return permanent;
	}
	public void setPermanent(Address permanent) {
		this.permanent = permanent;
	}
	public Address getCurrent() {
		return current;
	}
	public void setCurrent(Address current) {
		this.current = current;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", permanent=" + permanent + ", current=" + current + "]";
	}
	
}
