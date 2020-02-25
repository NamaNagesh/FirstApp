package com.myapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	
	@PostMapping("/about")
	public Details mycontroller1(@RequestBody Details details) {
		System.out.println("in my app");
		
		details.setName("changeName");
		return details;
	}

}
