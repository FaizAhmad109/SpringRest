package com.digit.model;

import lombok.Data;

@Data
public class Product {

	private Integer pid;
	private String pname;
	private Double price;
	private String [] types;
}
