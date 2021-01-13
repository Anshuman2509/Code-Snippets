package com.bmw.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("context4.xml");
		Counter counter=(Counter) applicationContext.getBean("aa");
		counter.setMessage("Hello World");
		System.out.println(counter);
		
		Counter counter2=(Counter)applicationContext.getBean("aa");
		System.out.println(counter2);
		
		Counter counter3=(Counter)applicationContext.getBean("bb");
		counter3.setMessage("Hello World");
		System.out.println(counter3);
		
		Counter counter4=(Counter)applicationContext.getBean("bb");
		System.out.println(counter4);

	}

}
