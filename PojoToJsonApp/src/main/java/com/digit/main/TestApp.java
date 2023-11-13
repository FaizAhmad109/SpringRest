package com.digit.main;

import com.digit.model.Product;
import com.fasterxml.jackson.databind.ObjectMapper;

public class TestApp {

	public static void main(String[] args) {

		try {
			//create object mapper
			ObjectMapper mapper = new ObjectMapper();
			Product product = new Product();
			product=getObjectData(product);
			//converting java object into json string
			String jsonData = mapper.writeValueAsString(product);
			System.out.println(jsonData);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public static Product getObjectData(Product product)
	{
		product.setPid(11);
		product.setPname("Faiz");
		product.setPrice(28900.0);
		return product;
	}

}
