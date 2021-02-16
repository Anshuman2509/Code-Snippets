package com.audi.main;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.audi.model.Employee;

public class Api {
	/**
	 * @author Anshuman
	 * @param args
	 */
	public static void main(String[] args) {
		EntityManagerFactory managerFactory=Persistence.createEntityManagerFactory("myDB");
		EntityManager entityManager=managerFactory.createEntityManager();
		entityManager.getTransaction().begin();
		
		Employee employee=new Employee();
		employee.setName("Jack Ryan");
		employee.setDepartment("Mechanical");
		employee.setAge(34);
		employee.setStartDate(new Date());
		
//		entityManager.persist(employee);
		
		
		
		Employee employee2=new Employee();
		employee2.setName("Test");
		employee2.setDepartment("Test");
		employee2.setAge(0);
		employee2.setStartDate(new Date());
		
//		entityManager.persist(employee2);
		
		/**Update an Entity- Updating the employee2 class*/
		Employee employee3=new Employee();
		employee3.setId(2);
		employee3.setName("Test Updated");
		employee3.setDepartment("Test Updated");		
		
//		entityManager.merge(employee3);
		
		
		entityManager.getTransaction().commit();
		
		/**Finding an Entity */
		int primaryKey=1;
		Employee employee4=entityManager.find(Employee.class, primaryKey);
		System.out.println(employee4);
		
		/**Building a Query */
		String query="Select e from Employee e where e.name='Jack Ryan'";
		Query query2=entityManager.createQuery(query);
		Employee employee5=(Employee) query2.getSingleResult();
		System.out.println(employee5);
		
		
		/**Removing an Entity Instance*/
		int primaryKey2=2;
		Employee reference=entityManager.getReference(Employee.class, primaryKey2);
		entityManager.getTransaction().begin();
		entityManager.remove(reference);
		entityManager.getTransaction().commit();
		
		entityManager.close();
		managerFactory.close();
		System.out.println("Complete");
				
	}

}
