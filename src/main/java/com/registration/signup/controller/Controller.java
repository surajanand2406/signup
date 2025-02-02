package com.registration.signup.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.registration.signup.dto.User;
import com.registration.signup.service.UserService;

@RestController
@RequestMapping("/register")
public class Controller {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/health")
	public String health() {
		return "Healthy";
	}
	
	@PostMapping("/signup")
	public ResponseEntity<String> registerUser(@RequestBody User usr) {
		ResponseEntity<String> response= userService.createUser(usr);
		return response;
	}
	
	@GetMapping("/login")
	public ResponseEntity<String> login(@RequestBody User usr){
		ResponseEntity<String> response= userService.loginUser(usr);
		return response;
	}
}
