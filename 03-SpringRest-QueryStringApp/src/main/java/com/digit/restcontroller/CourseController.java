package com.digit.restcontroller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/course")
public class CourseController {

	@GetMapping("info/{id}")
	public ResponseEntity<String> getCourseInfo(@PathVariable Integer id)
	{
		String body=null;
		if(id==1)
		{
			body="hello id is :: "+id;
		}
		else if(id==2)
		{
			body="hello id is ::"+id;
		}
		else
		{
			body="bye id is ::"+id;
		}
		
		return new ResponseEntity<String>(body,HttpStatus.OK);
	}
	@GetMapping("info/{id}/JRTP/{name}")
	public ResponseEntity<String> getCourseDetails(@PathVariable Integer id , @PathVariable String name)
	{
		String body=null;
		if(id==1)
		{
			body="hello id is :: "+id+" name is "+name;
		}
		else if(id==2)
		{
			body="hello id is ::"+id+" name is "+name;
		}
		else
		{
			body="bye id is ::"+id+" name is "+name;
		}
		
		return new ResponseEntity<String>(body,HttpStatus.OK);
	}
	
	
}
