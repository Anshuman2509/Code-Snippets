package com.bmw;

import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.bmw.dao.EmployeeRepository;
import com.bmw.entity.Employee;

@SpringBootApplication
public class Prac2Application {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(Prac2Application.class, args);
		EmployeeRepository repository=context.getBean(EmployeeRepository.class);
		
		Employee employee=new Employee();
		employee.setName("Jack Ryan");
		employee.setDepartment("Electrical");
		employee.setAge(25);
		
		Employee employee2=new Employee();
		employee2.setName("Ethan Hunt");
		employee2.setDepartment("Mechanical");
		employee2.setAge(35);
		
		Employee employee3=new Employee();
		employee3.setName("Temp");
		employee3.setDepartment("Temp");
		employee3.setAge(45);
		
		Employee employee4=new Employee();
		employee4.setName("Ethan Mills");
		employee4.setDepartment("Electrical");
		employee4.setAge(55);
		
		//CREATE NEW RECORDS
		repository.save(employee);
		repository.save(employee2);
		repository.save(employee3);
		repository.save(employee4);
		
		//FETCH RECORDS
		Optional<Employee> optional=repository.findById(2);
		Employee employee5=optional.get();
		System.out.println(employee5);
		
		//FETCH ALL RECORDS
		System.out.println("***********");
		List<Employee> employees = repository.findAll();
		employees.forEach(emp->System.out.println(emp));
		System.out.println("***********");
		
		//UPDATE RECORDS
		Optional<Employee> optional2=repository.findById(2);
		Employee employee6=optional2.get();
		employee6.setName("Ethan Hunt New");
		employee6.setDepartment("Mechanical New");
		repository.save(employee6);
		
		//DELETE RECORDS
		repository.deleteById(3);
		
		//FETCH ALL RECORDS
		System.out.println("***********");
		List<Employee> employees2 = repository.findAll();
		employees2.forEach(emp->System.out.println(emp));
		System.out.println("***********");
		
		//FIND BY NAME
		List<Employee> employees3 = repository.findByName("Jack Ryan");
		employees3.forEach(emp->System.out.println("Find By Name "+emp));
		
		//FIND BY NAME AND DEPARTMENT
		List<Employee> employees4=repository.findByNameAndDepartment("Jack Ryan", "Electrical");
		employees4.forEach(emp->System.out.println("By Name and department "+emp));
		
		//FIND BY NAME STARTING WITH
		List<Employee> employees5=repository.findByNameStartingWith("Ethan");
		employees5.forEach(emp->System.out.println("By Name starting with "+emp));
		
		//FIND BY AGE LESS THAN
		List<Employee> employees6=repository.findByAgeLessThan(40);
		employees6.forEach(emp->System.out.println("By Age Less Than "+emp));
		
		//FIND BY AGE GREATER THAN/EQUAL
		List<Employee> employees7=repository.findByAgeGreaterThanEqual(40);
		employees7.forEach(emp->System.out.println("Greater than/Equal To "+emp));
		
		//FIND BY AGE IN
		List<Integer> ages=List.of(35,55);
		List<Employee> employees8=repository.findByAgeIn(ages);
		employees8.forEach(emp->System.out.println(" By Age in: "+emp));
		
		System.out.println("************************************");
		//JPQL QUERY 
		List<Employee> employees9=repository.getAllEmps();
		employees9.forEach(emp->System.out.println("@Query "+emp));
		
		//JPQL QUERY GET BY NAME
		List<Employee> employees10=repository.getEmpByName("Jack Ryan");
		employees10.forEach(emp->System.out.println("@Query By Name "+emp));
		
		//JPQL QUERY BY NAME AND DEPARTMENT
		List<Employee> employees11=repository.getEmpByNameAndDepartment("Jack Ryan", "Electrical");
		employees11.forEach(emp->System.out.println("@Query by Name and department "+emp));
		
		System.out.println("************************************");
		//NATIVE QUERY
		List<Employee> employees12=repository.getAllEmps1();
		employees12.forEach(emp->System.out.println("Native Query "+emp));
		
		System.out.println("Complete");
	}

}
