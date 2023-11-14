package com.digit.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.digit.model.Tourist;

public interface ITouristRepository extends JpaRepository<Tourist, Integer> {

}
