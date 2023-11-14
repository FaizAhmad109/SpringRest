package com.digit.restcontroller;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.digit.model.Company;
import com.digit.model.Customer;

@RestController
@RequestMapping("/api/customer")
public class CustomerController {

	@GetMapping("/report/{id}")
	public ResponseEntity<Customer> showAllCustomer(@PathVariable Integer id) {
		// get customer record from database
		System.out.println("customer id is :: " + id);
		Customer customer = new Customer();
		customer.setCno(id);
		customer.setCname("Faiz");
		customer.setBillAmount(28900.0f);
		customer.setTeamNames(new String[] { "KKR", "RR", "KXIP" });
		customer.setSkills(List.of("core java", "jdbc", "servlets", "hibernate"));
		customer.setNumberse(Set.of(1234567l,234567l,2345678l));
		customer.setPersonalDetails(Map.of("aadhar",4567890,"pan","ecbea1244"));
		Company company = new  Company();
		company.setCompanyName("Digit-Insurance");
		company.setCompanyType("Insurance-Based IT company");
		company.setCompanyAddress("Kormangla");
		company.setSize(2000);
		
		customer.setCompany(company);
		ResponseEntity<Customer> entity = new ResponseEntity<>(customer, HttpStatus.OK);

		return entity;
	}
	//json to java object
	@PostMapping("/save")
	public ResponseEntity<String> saveCustomer(@RequestBody Customer customer)
	{
		System.out.println(customer);
		Integer id=10;
		String body="customer registered with the id :: "+id;
		
		return new ResponseEntity<String>(body,HttpStatus.OK);
	}
	//xml to java object
	@PostMapping("/saveXml")
	public ResponseEntity<String> saveCustomer2(@RequestBody Customer customer)
	{
		System.out.println(customer);
		Integer id=10;
		String body="customer registered with the id :: "+id;
		
		return new ResponseEntity<String>(body,HttpStatus.OK);
	}
}
