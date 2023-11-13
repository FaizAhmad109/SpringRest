package com.digit.main;

import com.digit.model.Product;

public class TestApp {

	public static void main(String[] args) {

		try {
			
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
