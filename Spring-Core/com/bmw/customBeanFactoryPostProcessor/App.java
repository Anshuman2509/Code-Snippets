package com.bmw.customBeanFactoryPostProcessor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("context9.xml");
		Employee employee=(Employee)context.getBean("bb");
		System.out.println(employee);

	}

}
