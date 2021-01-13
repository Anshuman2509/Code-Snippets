package com.bmw.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Api {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("context3.xml");
		Student student=(Student)context.getBean("cc");
		System.out.println(student);
		
		Student student2=(Student)context.getBean("dd");
		System.out.println(student2);
		
		Student student3=(Student) context.getBean("ee");
		System.out.println(student3);

	}

}
