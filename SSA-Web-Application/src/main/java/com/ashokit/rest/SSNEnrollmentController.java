package com.ashokit.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ashokit.binding.SSNEnrollRequest;
import com.ashokit.constants.AppConstants;
import com.ashokit.props.AppProperties;
import com.ashokit.services.SSNEnrollmentService;

@RestController
public class SSNEnrollmentController {

	@Autowired
	private SSNEnrollmentService service;
	
	@Autowired
	private AppProperties props;
	
	private static final Logger logger=LoggerFactory.getLogger(SSNEnrollmentController.class);
	
	@PostMapping(value="/enrollment",consumes= {"application/json"})
	public String ssnEntrollmentDtls(@RequestBody SSNEnrollRequest req) {
		logger.info("Enrollment restController method execution started ");
		
		String ssnNo = service.ssnEnrollment(req);
		
		String ssnDtls= props.messages.get(AppConstants.ENROLLMENT_SUCC) +ssnNo;
		
		logger.info("Enrollment restcontoller method execution Completed");
		 
		return ssnDtls;
	}
	

	
}
