package com.bmw.eventHandling;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Api {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("context16.xml");
		Employee employee=(Employee) context.getBean("aa");
		System.out.println(employee);

	}

}
