package com.ashokit.rest;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ashokit.binding.SSNEnrollResponse;
import com.ashokit.services.SSNEnrollmentService;

@RestController
public class SSNVerificationController {

	@Autowired
	private SSNEnrollmentService service;
	
	@GetMapping(value="/verify/{ssnNo}")
	public ResponseEntity<SSNEnrollResponse> verificationOfSNN(@PathVariable(value="ssnNo") String ssnNo) {
		
		SSNEnrollResponse response = service.verfySSN(ssnNo);
		
		return new ResponseEntity<SSNEnrollResponse>(response,HttpStatus.OK);
	}
	
}
