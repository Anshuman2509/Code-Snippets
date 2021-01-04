package com.bmw.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bmw.entity.Employee;
import com.bmw.service.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/employees")
	public ResponseEntity<List<Employee>> getAllEmployees() {
		List<Employee> employees= employeeService.getEmployees();
		try {
			return ResponseEntity.status(HttpStatus.CREATED).body(employees);
		}catch(Exception e) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
	}
	@GetMapping("/employees/{id}")
	public ResponseEntity<Employee> getEmpById(@PathVariable("id")int id) {
		Employee employee=null;
		try {
			employee= employeeService.getEmpById(id);
			return ResponseEntity.of(Optional.of(employee));
		}catch(Exception e) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
	}
	@PostMapping("/employees")
	public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee) {
		Employee employee2 =null;
		try {
			employee2=employeeService.addEmployee(employee);
			return ResponseEntity.of(Optional.of(employee2));
		}catch(Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}
	@DeleteMapping("/employees/{id}")
	public ResponseEntity<Void> deleteEmp(@PathVariable("id")int empId) {
		try {
			employeeService.deleteEmployee(empId);
			return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
		}catch(Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
		
	}
	@PutMapping("/employees/{empId}")
	public ResponseEntity<Employee> updateEmp(@RequestBody Employee employee,@PathVariable("empId") int employeeId) {
		Employee employee2=null;
		try {
			employee2=employeeService.updateEmployee(employeeId, employee);
			return ResponseEntity.ok().body(employee2);
		}catch(Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}

}
