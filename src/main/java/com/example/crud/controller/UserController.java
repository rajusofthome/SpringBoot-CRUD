package com.example.crud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.crud.model.User;
import com.example.crud.repository.UserRepository;
import com.example.crud.util.Constants;

@RestController
public class UserController {
	
	@Autowired
	private UserRepository userRepository;

	@Autowired
	private BCryptPasswordEncoder passwordEncoder;
	
	
	@PostMapping(value="/saveuser")
	public ResponseEntity<User> saveUser(@RequestBody User user)
	{
		user.setActive(true);
		user.setRole(Constants.ROLE_USER);
		String encryptdPwd = passwordEncoder.encode(user.getPassword());
		user.setPassword(encryptdPwd);
		User us = userRepository.save(user);
		return new ResponseEntity<User>(us, HttpStatus.CREATED);
	}
	
	
	@GetMapping(value="/getuser")
	public ResponseEntity<User> getUser(String username)
	{
		return new ResponseEntity<User>(userRepository.findByUserName(username).get(), HttpStatus.OK);
	}
	
	
	
	
	
	
}
