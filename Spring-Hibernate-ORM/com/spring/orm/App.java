package com.spring.orm;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.orm.dao.StudentDao;
import com.spring.orm.entity.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){
    	ApplicationContext applicationContext=new ClassPathXmlApplicationContext("config.xml");
    	StudentDao dao=applicationContext.getBean("studentDao",StudentDao.class);
    	
    	Student student=new Student();
    	student.setStudentId(1001);
    	student.setStudentName("Jack Ryan");
    	student.setCity("Pune");
    	
    	Student student2=new Student();
    	student2.setStudentId(1002);
    	student2.setStudentName("Ethan Hunt");
    	student2.setCity("Bangalore");
    	//Insertion
    	dao.insert(student);
    	dao.insert(student2);
    	
    	Student student3=dao.getStudent(1001);
    	System.out.println(student3);
    	
    	//Update
    	Student student4=dao.getStudent(1001);
    	student4.setStudentId(1001);
    	student4.setStudentName("Jack Ryan New");
    	student4.setCity("Pune New");
    	
    	dao.update(student4);
    	
    	Student student5=dao.getStudent(1001);
    	System.out.println(student5);
    	//List all entities
    	List<Student> students=dao.getAllStudents();
    	for(Student s:students) {
    		System.out.print(s.getStudentId()+" ");
    	}
    	System.out.println();
    	
    	Student temp=new Student();
    	temp.setStudentId(9999);
    	temp.setStudentName("Temp Student");
    	temp.setCity("Temp");
    	dao.insert(temp);
    	System.out.println(dao.getStudent(9999));
    	System.out.println("****BEFORE DELETION****");
    	for(Student s:dao.getAllStudents()) {
    		System.out.print(s.getStudentId()+" ");
    	}
    	System.out.println();
    	
    	dao.delete(9999);
    	System.out.println("****AFTER DELETION****");
    	for(Student s:dao.getAllStudents()) {
    		System.out.print(s.getStudentId()+" ");
    	}
    	System.out.println();
    	
    	
    	System.out.println("complete");
    
    }
}
