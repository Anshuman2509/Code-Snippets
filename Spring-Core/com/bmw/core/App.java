package com.bmw.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("context.xml");
        
        Employee employee=(Employee) applicationContext.getBean("bmw");
        Employee employee2=(Employee) applicationContext.getBean("audi");
        System.out.println(employee);
        System.out.println(employee2);
        
        Employee employee3=(Employee) applicationContext.getBean("merc");
        System.out.println(employee3);
        
        Employee employee4=(Employee)applicationContext.getBean("audi-alias");
        System.out.println(employee4);
        
        Student student=(Student)applicationContext.getBean("cc");
        System.out.println(student);
        
        Student student2=(Student)applicationContext.getBean("dd");
        System.out.println(student2);
    }
}
