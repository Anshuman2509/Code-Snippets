package com.bmw.messageSource;

import java.util.Locale;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Api {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("context15.xml");
		System.out.println(context.getMessage("message",null,"Default message",Locale.FRANCE));
		System.out.println(context.getMessage("message", null,"Default message",Locale.US));
		System.out.println(context.getMessage("message", null,"Default message",Locale.GERMANY));

		Employee employee=(Employee)context.getBean("kia");
		employee.disp();
	}

}
