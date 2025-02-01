package com.example.demo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.dao.user;
import com.example.demo.userServices;

@RestController
public class userControllor {

	@Autowired
	public userServices services;
	
	@PostMapping("/user")
	public ResponseEntity<String> saveuser(@RequestBody user user){

		boolean saveUser = services.saveUser(user);
		
		if(saveUser) {
			sendemail();
			return new ResponseEntity<>("user saved",HttpStatus.CREATED);
		}
		else {
			return new ResponseEntity<>("not saved",HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	private void sendemail() {
		// logic
	}
}
