package com.digit.main;

import java.io.File;
import java.io.IOException;

import com.digit.model.Customer;
import com.fasterxml.jackson.databind.ObjectMapper;

public class TestApp {

	public static void main(String[] args) {

		try {
			// create objectMapper
			ObjectMapper mapper = new ObjectMapper();
			// using that object read the data from json file and convert it into java
			// object
			Customer customer = mapper.readValue(new File("data/sample-full.json"), Customer.class);
			System.out.println(customer);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
