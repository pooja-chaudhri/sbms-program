package com.example.Services;

import java.util.List;

import com.example.entity.user;

public interface IuserServices {

	public boolean saveUser(user User);
	
	public List<user> getAllUsers();
	
	public user getUserById(Integer userId);
	
	public boolean deleteUserById(Integer userId);
}
