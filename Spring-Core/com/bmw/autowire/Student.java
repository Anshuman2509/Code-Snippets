package com.bmw.autowire;

public class Student {
	private int id;
	private String name;
	private Department department;
	private Address address;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Student(int id, String name, Department department, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		this.address = address;
	}

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
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", department=" + department + ", address=" + address + "]";
	}
	

}
