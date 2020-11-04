package com.ashokit.binding;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;


@Data
@XmlRootElement
public class SSNEnrollResponse {

	    private String ssnNO;
		
		
		private String firstName;
		
		
		private String lastName;
		
		
		private String gender;
		
		
		private Date dob;
		
		
		private String stateName;
		
		//private byte[] image;
		

	
}
