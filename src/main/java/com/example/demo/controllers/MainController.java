package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.services.StudentServiceImpl;

@RestController
public class MainController {
	
	@Autowired
	private StudentServiceImpl std;

	@RequestMapping("/")
	public String mainPage() {
		return std.testStudent("Hossein", "Miraftabi");
//		Student student = new Student("Hossein", "Miraftabi");
//		return student.getFullName();
	}
	
}
