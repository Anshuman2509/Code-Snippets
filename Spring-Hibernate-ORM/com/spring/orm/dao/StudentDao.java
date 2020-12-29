package com.spring.orm.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.spring.orm.entity.Student;

public class StudentDao {
	private HibernateTemplate hibernateTemplate;
	
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	// For get and read operations Transactional is not required
	@Transactional
	public void insert(Student student) {
		Integer i=(Integer) hibernateTemplate.save(student);		
	}
	
	public Student getStudent(int studentId) {
		return hibernateTemplate.get(Student.class, studentId);		
	}
	
	public List<Student> getAllStudents() {
		return hibernateTemplate.loadAll(Student.class);
	}
	@Transactional
	public void update(Student student) {
		hibernateTemplate.update(student);
	}
	@Transactional
	public void delete(int studentId) {
		Student student=hibernateTemplate.get(Student.class, studentId);
		hibernateTemplate.delete(student);		
	}
}
