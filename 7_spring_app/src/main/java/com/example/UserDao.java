package com.example;

public class UserDao implements IuserDao {
	
	public UserDao() {
		
		System.out.println("UserDao :: constructor");
	}
	@Override
	public void SaveUser() {
		
		System.out.println("User save in database");
	}
	
	

}
