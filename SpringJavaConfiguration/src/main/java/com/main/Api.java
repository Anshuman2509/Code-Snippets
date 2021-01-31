package com.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.audi.Employee;
import com.bmw.Student;
import com.merc.Person;

public class Api {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(HelloConfig.class);
		Employee employee=context.getBean("employee",Employee.class);
		
		Student student=context.getBean("myStudent",Student.class);
		
		Person person=context.getBean("getPersonAnnotatedFromProperties",Person.class);
		System.out.println(person);
		
		context.close();
		
	}

}
