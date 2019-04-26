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
@RequestMapping("/api/employee")
public class EmployeeController {
	
	@Autowired
	EmployeeRepository repo;
	
	@GetMapping("/{id}")
	public Optional<Employee> getEmployeeById (@PathVariable Long id) {
		return repo.findById(id);
	}
	
	@PostMapping
	public ResponseEntity<Employee> addStudent (@RequestBody Employee emp) {
		Employee employee = repo.save(emp);
		return  new ResponseEntity<>(employee, HttpStatus.ACCEPTED);		
	}
	
	

}
