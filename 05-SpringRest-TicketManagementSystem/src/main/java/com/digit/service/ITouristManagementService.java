package com.digit.service;

import java.util.List;

import com.digit.model.Tourist;

public interface ITouristManagementService {

	public String registerTourist(Tourist tourist);
	public List<Tourist> fetchAllTourist();
}
