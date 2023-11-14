package com.digit.model;

import java.util.List;
import java.util.Map;
import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Customer {

	private Integer cno;
	private String cname;
	private Float billAmount;
	private String [] teamNames;
	private List<String> skills;
	private Set<Long> numberse;
	private Map<String,Object> personalDetails;
	private Company company;
}
