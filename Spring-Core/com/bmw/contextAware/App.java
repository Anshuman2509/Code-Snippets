package com.bmw.contextAware;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("context5.xml");
		Employee employee=(Employee) applicationContext.getBean("a");
		Department department=(Department) applicationContext.getBean("b");

	}

}
