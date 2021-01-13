package com.bmw.autowiredAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Api {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("context12.xml");
		Employee employee=(Employee) context.getBean("cc");
		System.out.println(employee);

	}

}
