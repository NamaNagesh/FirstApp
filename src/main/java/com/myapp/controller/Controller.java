package com.myapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	
	@GetMapping("/home")
	public Student mycontroller() {
		System.out.println("in my app");
		Student student=new Student();
		student.setId("123");
		student.setName("name");
		
		return student;
	}
	
	@GetMapping("/about")
	public String mycontroller1() {
		System.out.println("in my app");
		return "about me";
	}

}
