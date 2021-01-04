package com.bmw.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.bmw.entity.Employee;
@Service
public class EmployeeService {
	private List<Employee> employees;
	
	public EmployeeService() throws ParseException {
		employees=new ArrayList<>();
		SimpleDateFormat dateFormat=new SimpleDateFormat("dd/MM/yyyy");
		Employee employee=new Employee(1001, "Jack Ryan", "Mechanical", dateFormat.parse("25/08/2018"));
		Employee employee2=new Employee(1002, "Ethan Hunt", "Electrical", dateFormat.parse("12/08/2017"));
		Employee employee3=new Employee(1003, "Peter Parker", "Finance", dateFormat.parse("10/08/2020"));
		Employee employee4=new Employee(1004, "Tony Stark", "Mechanica", dateFormat.parse("05/06/2019"));
		employees.add(employee);
		employees.add(employee2);
		employees.add(employee3);
		employees.add(employee4);
	}
	
	public List<Employee> getEmployees() {
		return employees;
	}
	
	public Employee getEmpById(int id) {
		return employees.stream().filter(a->a.getId()==id).findFirst().get();
	}
	
	public Employee addEmployee(Employee employee) {
		employees.add(employee);
		return employee;
	}
	
	public void deleteEmployee(int empId) {
		employees=employees.stream().filter(emp->emp.getId()!=empId).collect(Collectors.toList());
	}
	
	public Employee updateEmployee(int employeeId,Employee employee) {
		employees=employees.stream().map(emp->{
			if(emp.getId()==employeeId) {
				emp.setDepartment(employee.getDepartment());
				emp.setJoiningDate(employee.getJoiningDate());
				emp.setName(employee.getName());
			}
			return emp;
		}).collect(Collectors.toList());
		return employees.stream().filter(emp->emp.getId()==employeeId).findFirst().get();
	}

}
