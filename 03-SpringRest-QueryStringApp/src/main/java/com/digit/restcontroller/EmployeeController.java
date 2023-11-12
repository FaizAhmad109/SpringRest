package com.digit.restcontroller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@GetMapping("/read")
	public ResponseEntity<String> getEmployee(@RequestParam(defaultValue = "10", required =false) Integer id, @RequestParam(defaultValue = "Faiz", required =false) String name) {
		String body = "";
		System.out.println(id + "  "+ name);
		if (id == 7 && name.equalsIgnoreCase("Dhoni")) {
			body = "CSK team";
		} else if (id == 18 && name.equalsIgnoreCase("Kholi")) {
			body = "RCB team";

		} else {
			body = "Other team";
		}

		return new ResponseEntity<String>(body, HttpStatus.OK);

	}
}
