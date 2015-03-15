package com.myspringproject.data.test;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.repository.CrudRepository;

import com.javanoob.myspringproject.data.domain.StudentRecord;
import com.javanoob.myspringproject.data.repository.StudentRepository;

public class IntegrationTest {
	private static CrudRepository repository;
	
	public static void main(String[] args) {
		AbstractApplicationContext appContext = new ClassPathXmlApplicationContext("spring-beans.xml");
		repository = appContext.getBean(StudentRepository.class);
		
		createStudent("Jennnifer", "Student", "Merrillville", 12345L);
		
		appContext.close();
	}
	
	private static void createStudent(String fname, String lname, String address, Long courseId) {
		StudentRecord studentRecord = new StudentRecord(address, fname, lname, courseId);
		
		repository.save(studentRecord);
	}
}
