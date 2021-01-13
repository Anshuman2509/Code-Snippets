package com.bmw.contextAware;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Department implements ApplicationContextAware{

	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		Car car=(Car) applicationContext.getBean("c");
		System.out.println(car);
	}

}
