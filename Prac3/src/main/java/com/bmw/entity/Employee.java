package com.bmw.entity;

import java.util.Date;

public class Employee {
	private int id;
	private String name;
	private String department;
	private Date joiningDate;
	public Employee() {
	}
	public Employee(int id, String name, String department, Date joiningDate) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		this.joiningDate = joiningDate;
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
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public Date getJoiningDate() {
		return joiningDate;
	}
	public void setJoiningDate(Date joiningDate) {
		this.joiningDate = joiningDate;
	}
	

}
