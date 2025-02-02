package com.registration.signup.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="users")
public class UserEntity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@Column(name="fname", nullable=false, length=100)
	private String fname;
	
	@Column(name="lname", nullable=false, length=100)
	private String lname;
	
	@Column(name="email", nullable=false, unique=true)
	private String email;
	
	@Column(name="password", nullable=false)
	private String password;
	
	@Column(name="mobile_no")
	private String phoneNo;
	
	@Column(name="cretion_date", updatable=false)
	private LocalDate creationAt;
	
	

	public LocalDate getCreationAt() {
		return creationAt;
	}



	public void setCreationAt(LocalDate creationAt) {
		this.creationAt = creationAt;
	}



	public UserEntity() {
		super();
		// TODO Auto-generated constructor stub
	}



	public UserEntity(String fname, String lname, String email, String phoneNo, LocalDate creationDate) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.phoneNo = phoneNo;
		this.creationAt = creationDate;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getFname() {
		return fname;
	}



	public void setFname(String fname) {
		this.fname = fname;
	}



	public String getLname() {
		return lname;
	}



	public void setLname(String lname) {
		this.lname = lname;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getPhoneNo() {
		return phoneNo;
	}



	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}



	public LocalDate getCreationDate() {
		return creationAt;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
