package com.audi.model;

import java.util.Date;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

import com.audi.validation.CourseCode;

public class Employee {
	private int id;
	@NotEmpty(message = "First Name is a required field")
	private String firstName;
	@NotEmpty(message = "Last Name is required")
	private String lastName;
	@Min(value = 10)
	@Max(value = 50)
	private int age;
	private Address address;
	private int zipCode;
	@NotEmpty(message = "Email cannot be null")
	private String email;
	@DateTimeFormat(pattern = "MM/dd/yyyy")
	private Date dateOfBirth;
	private String[] languages;
	private char gender;
	private String department;
	private String[] departmentItems;
	private String location;
	@CourseCode
	private String course;
	@CourseCode(value = "CSR",message = "Course Name should start with CSR")
	private String course2;
	@NotNull
	private Date dateOfJoining;
	public Employee() {
		this.departmentItems= new String[4];
		this.departmentItems[0]="Electrical";
		this.departmentItems[1]="Mechanical";
		this.departmentItems[2]="Finance";
		this.departmentItems[3]="Operations";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public int getZipCode() {
		return zipCode;
	}
	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String[] getLanguages() {
		return languages;
	}
	public void setLanguages(String[] languages) {
		this.languages = languages;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String[] getDepartmentItems() {
		return departmentItems;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getCourse2() {
		return course2;
	}
	public void setCourse2(String course2) {
		this.course2 = course2;
	}
	public Date getDateOfJoining() {
		return dateOfJoining;
	}
	public void setDateOfJoining(Date dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}
	
	
	
}
