package com.bmw.inheritance;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("context6.xml");
		Employee employee=(Employee)context.getBean("bb");
		System.out.println(employee);
		
		Employee employee2=(Employee)context.getBean("cc");
		System.out.println(employee2);

	}

}
