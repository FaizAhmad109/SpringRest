package com.digit.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.digit.model.Tourist;
import com.digit.service.ITouristManagementService;

@RestController
@RequestMapping("/api/tourist")
public class TouristController {

	@Autowired
	private ITouristManagementService service;
	
	@PostMapping("register")
	public ResponseEntity<String> enrollTourist(@RequestBody Tourist tourist)
	{
		try
		{
			String resultMessage = service.registerTourist(tourist);
			return new ResponseEntity<String>(resultMessage,HttpStatus.OK);
		}catch(Exception e)
		{
			return new ResponseEntity<String>("Problem in tourist enrollement ",HttpStatus.INTERNAL_SERVER_ERROR);//500
		}
		
	}
	

	@GetMapping("/findAll")
	public ResponseEntity<?> displayAllTourist()
	{
		try {
			List<Tourist> allTourist = service.fetchAllTourist();
			return new ResponseEntity<List<Tourist>>(allTourist,HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<String>("problem in fetching tourist",HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
