package com.ashokit.exceptionhandler;

import java.util.Date;

import lombok.Data;

@Data
public class AppError {

	
	
	public AppError(Integer errorCode, String errorDesc, Date date) {
		super();
		this.errorCode = errorCode;
		this.errorDesc = errorDesc;
		this.date = date;
	}
	private Integer errorCode;
	private String errorDesc;
	private Date date;
}
