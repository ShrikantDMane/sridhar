package com.ashokit.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ashokit.entity.SSNRegistrationEntity;

public interface SSNRegistrationRepository extends JpaRepository<SSNRegistrationEntity, Serializable> {

	
	
}
