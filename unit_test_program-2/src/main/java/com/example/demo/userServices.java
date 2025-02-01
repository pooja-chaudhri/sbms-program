package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.user;

@Service
public class userServices {
	
	@Autowired
	private user user;
	
	
	public boolean saveUser(user u) {
		return user.save(u);
	}
	

}
