package com.bmw.aop1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Api {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("context17.xml");
		Person person=context.getBean("kia",Person.class);
		person.getId();
		person.getDepartment();
		person.getName();

	}

}
