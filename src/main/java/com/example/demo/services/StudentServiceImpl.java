package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

import com.example.demo.components.Student;

@Service
public class StudentServiceImpl implements StudentSerivce{

	@Autowired
	ApplicationContext ctx;

	@Override
	public String testStudent(String name, String familyName) {
		Student student = ctx.getBean(Student.class, name, familyName);
		return student.getFullName();
		
	}
	
}
