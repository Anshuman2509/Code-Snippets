package com.bmw.propertySourcesConfigurer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("context10.xml");
		Employee employee=(Employee) context.getBean("aa");
		System.out.println(employee);

	}

}
