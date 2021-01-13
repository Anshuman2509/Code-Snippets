package com.bmw.jsr250;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Api {

	public static void main(String[] args) {
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("context13.xml");
		context.registerShutdownHook();
		Car car=(Car) context.getBean("kia");
		System.out.println(car);

	}

}
