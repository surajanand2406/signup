package com.registration.signup.service;

import java.io.Console;
import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.registration.signup.dto.User;
import com.registration.signup.entity.UserEntity;
import com.registration.signup.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repo;
	
	public ResponseEntity<String> createUser(User usr) {
		
		if(repo.existsByEmail(usr.getEmail())==false) {
		LocalDate createdDate = LocalDate.now();
		UserEntity us = new UserEntity();
		us.setFname(usr.getFirstName());
		us.setLname(usr.getLastName());
		us.setEmail(usr.getEmail());
		us.setPassword(usr.getPassword());
		us.setPhoneNo(usr.getPhoneNo());
		us.setCreationAt(createdDate);
		UserEntity data= repo.save(us);
		if(data !=null) {
			return ResponseEntity.status(HttpStatus.CREATED).body("User has been created successfully");
		}else {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Unable to create User");
		}
		}else
			return ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE).body("Email or Mobile no. already exist");
			
	}

	public ResponseEntity<String> loginUser(User usr) {
		System.out.println("login user :"+usr);
		if(repo.existsByEmail(usr.getEmail())==true) {
			UserEntity mail = repo.findByEmail(usr.getEmail());
			System.out.println("login mail :"+mail);
			if(mail.getPassword().equals(usr.getPassword())) {
				return ResponseEntity.status(HttpStatus.ACCEPTED).body("User logged in successfuly");
			}
		}
			return ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE).body("User does not exist");
		
	}
	
	public ResponseEntity<List<UserEntity>> getAllUsers(){
		List<UserEntity> res = repo.findAll();
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(res);
	}
}
