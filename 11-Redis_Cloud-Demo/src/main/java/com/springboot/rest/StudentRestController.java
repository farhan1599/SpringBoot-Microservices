package com.springboot.rest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.entity.Student;
import com.springboot.repository.StudentRepo;

@RestController
public class StudentRestController {

	@Autowired
	private StudentRepo studentRepo;

	@PostMapping("/student")
	public String addStudent(@RequestBody Student student) {
		studentRepo.save(student);
		return "Student Saved";
	}

	@GetMapping("/students")
	public Iterable<Student> getAllStudents() {
		return studentRepo.findAll();
	}

}
