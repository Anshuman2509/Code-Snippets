package com.bmw.dao;

import java.util.Collection;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.bmw.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Integer>{
	public List<Employee> findByName(String name);
	public List<Employee> findByDepartment(String department);
	public List<Employee> findByNameAndDepartment(String name,String deparment);
	public List<Employee> findByNameStartingWith(String prefix);
	public List<Employee> findByNameEndingWith(String suffix);
	public List<Employee> findByNameContaining(String words);
	public List<Employee> findByAgeLessThan(int age);
	public List<Employee> findByAgeGreaterThanEqual(int age);
	public List<Employee> findByAgeIn(Collection<Integer> ages);
	public List<Employee> findByNameOrderByName(String name);
	@Query("select emps from Employee emps")
	public List<Employee> getAllEmps();
	@Query("select emp from Employee emp where emp.name=:p1")
	public List<Employee> getEmpByName(@Param("p1") String name);
	@Query("select e from Employee e where e.name=:a and e.department=:b")
	public List<Employee> getEmpByNameAndDepartment(@Param("a")String name,@Param("b")String department);
	@Query(value = "select * from emp",nativeQuery = true)
	public List<Employee> getAllEmps1();

}
