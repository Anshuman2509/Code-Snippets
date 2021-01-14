package com.bmw.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Api {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("context17.xml");
		Employee employee=context.getBean("kia",Employee.class);
		System.out.println(employee.getName());
		
		Department department=context.getBean("lake",Department.class);
		System.out.println(department.getName());

	}

}
