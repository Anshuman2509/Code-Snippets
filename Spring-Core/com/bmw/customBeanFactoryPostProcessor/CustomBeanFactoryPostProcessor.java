package com.bmw.customBeanFactoryPostProcessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

public class CustomBeanFactoryPostProcessor implements BeanFactoryPostProcessor{

	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		System.out.println("Custom Bean Factory Post Processor called");
	}
	

}
