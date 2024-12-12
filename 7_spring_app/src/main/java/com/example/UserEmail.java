package com.example;

public class UserEmail implements IuserEmail{
	
	public UserEmail() {
		System.out.println("UserEmail :: constructor");
		
	}
	
	@Override
	public void SendEmail() {
		
		System.out.println("Email is send.....");
	}

}
