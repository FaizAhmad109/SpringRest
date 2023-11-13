package com.digit.model;

import lombok.Data;

@Data
public class Customer {

	private Integer id;
	private String firstName;
	private String lastName;
	private String active;
	
	private Address address;
	private String [] languages;
	
	private String company ;
}
