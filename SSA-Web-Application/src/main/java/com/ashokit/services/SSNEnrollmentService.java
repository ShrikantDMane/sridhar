package com.ashokit.services;

import com.ashokit.binding.SSNEnrollRequest;
import com.ashokit.binding.SSNEnrollResponse;

public interface SSNEnrollmentService {

	
	public String ssnEnrollment(SSNEnrollRequest ssnReg);
	
	public SSNEnrollResponse verfySSN(String ssnNo);
}
