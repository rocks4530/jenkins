package com.awesome.example;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/student")
public class StudentController {
	
	@Autowired
	StudentRepository repo;
	
	@GetMapping("/{id}")
	public Optional<Student> getStudentById (@PathVariable Long id) {
		return repo.findById(id);
	}
	
	@PostMapping
	public ResponseEntity<Student> addStudent (@RequestBody Student st) {
		Student student = repo.save(st);
		return  new ResponseEntity<>(student, HttpStatus.ACCEPTED);		
	}

}
