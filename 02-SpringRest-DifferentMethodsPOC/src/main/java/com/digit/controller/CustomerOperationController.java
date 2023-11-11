package com.digit.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
public class CustomerOperationController {

	@GetMapping("/report")
	public ResponseEntity<String> showCustomerReport() {
		return new ResponseEntity<String>("From GET-Show reportMethod", HttpStatus.OK);
	}

	@PostMapping("/report")
	public ResponseEntity<String> registerTheCustomer() {
		return new ResponseEntity<String>("From Post-Show registerthecustomer method", HttpStatus.OK);
	}

	// patch -> partial update
	@PatchMapping("/pmodify")
	public ResponseEntity<String> updateCustomerByNumber() {
		return new ResponseEntity<String>("From Patch-updateCustomerByNumber method", HttpStatus.OK);
	}

	// put -> complete update
	@PutMapping("/modify")
	public ResponseEntity<String> updateCustomer() {
		return new ResponseEntity<String>("From Put-updateCustomer method", HttpStatus.OK);
	}
	
	@DeleteMapping("/delete")
	public ResponseEntity<String> deleteCustomer() {
		return new ResponseEntity<String>("From Delete-deleteCustomer method", HttpStatus.OK);
	}
	
	 
}
