package com.example.demo.components;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class GreetingAspect {
	@After("execution(* com.example.demo..*.* (..)) && @annotation(com.example.demo.customAnnotation.Greeting)")
	public void sendGreetingMessage() {
		System.out.println("Welcome to AOP!");
	}
}
