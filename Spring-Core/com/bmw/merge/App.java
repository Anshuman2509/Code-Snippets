package com.bmw.merge;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("context6.xml");
		Student student=(Student)applicationContext.getBean("ee");
		System.out.println(student);
		
		Student student2=(Student)applicationContext.getBean("ff");
		System.out.println(student2);

	}

}
