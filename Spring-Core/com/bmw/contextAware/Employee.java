package com.bmw.contextAware;

import org.springframework.beans.factory.BeanNameAware;

public class Employee implements BeanNameAware{

	public void setBeanName(String name) {
		System.out.println("Bean Name: "+name);
		
	}

}
