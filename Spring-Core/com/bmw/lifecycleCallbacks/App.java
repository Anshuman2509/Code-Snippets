package com.bmw.lifecycleCallbacks;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("context7.xml");
		context.registerShutdownHook();
		
		Employee employee=(Employee)context.getBean("aa");
		System.out.println(employee);
		
		Student student=(Student)context.getBean("bb");
		System.out.println(student);

	}

}
