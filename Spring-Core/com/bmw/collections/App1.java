package com.bmw.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App1 {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("context2.xml");
		Person person=(Person) context.getBean("cc");
		System.out.println(person);

	}

}
