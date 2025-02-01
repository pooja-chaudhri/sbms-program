package com.example.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.user;
import com.example.userRepo.userRepo;

@Service
public class userServices implements IuserServices {

	@Autowired
	private userRepo userRepo;
	
	@Override
	public boolean saveUser(user User) {
		user save = userRepo.save(User);
		return save.getUserById() != null;
		
		
	}
	
	@Override
	public List<user> getAllUsers() {
		return userRepo.findAll();
	}
	
	@Override
	public user getUserById(Integer userId) {

		Optional<user> byId = userRepo.findById(userId);
		
		if(byId.isPresent()) {
			return byId.get();
		}
		return null;
		
	}
	
	@Override
	public boolean deleteUserById(Integer userId) {

		if(userRepo.existsById(userId)) {
			userRepo.deleteById(userId);
			return true;
		}
		
		return false;
	}
	
	
	
}
