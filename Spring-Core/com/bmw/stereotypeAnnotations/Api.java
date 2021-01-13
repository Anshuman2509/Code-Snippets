package com.bmw.stereotypeAnnotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Api {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("context14.xml");
		Employee employee=(Employee) context.getBean("employee");
		System.out.println(employee);
		
		Department department=(Department) context.getBean("department");
		System.out.println(department);

	}

}
