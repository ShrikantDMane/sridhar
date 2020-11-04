package com.ashokit.exceptionhandler;


import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.ashokit.constants.AppConstants;
import com.ashokit.props.AppProperties;

@RestController
@RestControllerAdvice
public class AppExceptionHandler{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7532526297810295511L;
	
	@Autowired
	private AppProperties props;
	
	@ExceptionHandler(value = NullPointerException.class)	
	public String handleNullPointerExceptions() {
			return "";
		}
		
	@ExceptionHandler(value= NoSSNFoundException.class)	
	public ResponseEntity<AppError> handleNoSSNFoundException(){
		
		AppError apperror=new AppError(400,props.messages.get(AppConstants.INVALID_SSN), new Date());
		
		return new ResponseEntity<AppError>(apperror,HttpStatus.BAD_REQUEST);	
	
}

}
