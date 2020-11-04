package com.ashokit.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Data;

@Data
@Entity
@Table(name = "SSN_DTLS")
public class SSNRegistrationEntity {

	@Id
	@Column(name = "SSN_NO")
	@GenericGenerator(name = "ssn_id_gen", strategy = "com.ashokit.generator.SSNIdGenerator")
	@GeneratedValue(generator = "ssn_id_gen")
	private String ssnNo;

	@Column(name = "FIRST_NAME")
	private String firstName;

	@Column(name = "LAST_NAME")
	private String lastName;

	@Column(name = "GENDER")
	private String gender;

	@Column(name = "DOB")
	private Date dob;

	@Column(name = "STATE_NAME")
	private String stateName;

	
	/*
	 * @Column(name="PHOTO", length = 1000)
	 * 
	 * @Lob private byte[] image;
	 */
	@Column(name = "REGISTRATION_DATE")
	@CreationTimestamp
	private Date registeredDate;

	@Column(name = "UPDATE_DATE")
	@UpdateTimestamp
	private Date updateDate;

}
