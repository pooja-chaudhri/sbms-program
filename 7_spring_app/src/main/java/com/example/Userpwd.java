package com.example;

public class Userpwd implements IuserPwd{
	
	
	public Userpwd() {
		System.out.println("Userpwd :: constructor");
	}
	@Override
	public void GeneratePwd() {
		System.out.println("password is generated...");
		
	}
}