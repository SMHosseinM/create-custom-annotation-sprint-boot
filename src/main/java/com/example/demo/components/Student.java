package com.example.demo.components;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.example.demo.customAnnotation.Greeting;

@Component
@Scope(scopeName="prototype")
public class Student {
	private String name;
	private String familyName;
	
	public Student(String name, String familyName) {
		super();
		this.name = name;
		this.familyName = familyName;
	}
	
	@Greeting
	public String getFullName() {
		return this.name + " " + this.familyName;
	}
}
