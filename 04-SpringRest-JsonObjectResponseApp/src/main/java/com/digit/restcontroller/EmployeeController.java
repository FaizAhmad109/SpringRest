package com.digit.restcontroller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.digit.model.Employee;

@RestController
@RequestMapping("/api/employee")
public class EmployeeController {

	@PostMapping("/save")
	public ResponseEntity<String> showEmployee(@RequestBody Employee employee)
	{
		System.out.println(employee);
		return new ResponseEntity<String>("xml done",HttpStatus.OK);
	}
}
