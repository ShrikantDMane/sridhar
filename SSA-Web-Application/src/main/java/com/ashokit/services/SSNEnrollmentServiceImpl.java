package com.ashokit.services;

import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ashokit.binding.SSNEnrollRequest;
import com.ashokit.binding.SSNEnrollResponse;
import com.ashokit.entity.SSNRegistrationEntity;
import com.ashokit.exceptionhandler.NoSSNFoundException;
import com.ashokit.repository.SSNRegistrationRepository;
@Service
public class SSNEnrollmentServiceImpl implements SSNEnrollmentService {

	@Autowired
	private SSNRegistrationRepository repo;
	
	@Override
	public String ssnEnrollment(SSNEnrollRequest ssnEnroll) {
		SSNRegistrationEntity entity= new SSNRegistrationEntity();
		BeanUtils.copyProperties(ssnEnroll, entity);
		SSNRegistrationEntity ssnEntity = repo.save(entity);
		return ssnEntity.getSsnNo();
	}

	@Override
	public SSNEnrollResponse verfySSN(String ssnNo) {
		Optional<SSNRegistrationEntity> entity = repo.findById(ssnNo);
		SSNEnrollResponse resp=new SSNEnrollResponse();
		if(entity.isPresent()) {
			SSNRegistrationEntity ssnEntity = entity.get();
			BeanUtils.copyProperties(ssnEntity, resp);
			return resp;
		}else {
			throw new NoSSNFoundException("Provided SSN NO Not Existed Enter Valid NO..");
		}
		
}
}