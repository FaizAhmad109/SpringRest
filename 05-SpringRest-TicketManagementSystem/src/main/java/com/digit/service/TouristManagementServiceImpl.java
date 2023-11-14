package com.digit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.digit.dao.ITouristRepository;
import com.digit.model.Tourist;

@Service
public class TouristManagementServiceImpl implements ITouristManagementService {

	@Autowired
	private ITouristRepository repository;

	@Override
	public String registerTourist(Tourist tourist) {
		Integer tid = repository.save(tourist).getTid();
		
		return "Tourist is registered with booking id ::"+tid;
	}

	@Override
	public List<Tourist> fetchAllTourist() {
		List<Tourist> list = repository.findAll();
		 list.sort((t1,t2)->t1.getTid().compareTo(t2.getTid()));;
		 return list;
	}

}
