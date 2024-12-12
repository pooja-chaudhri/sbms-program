package com.example;

public class Upi implements Ipayment{

	public Upi() {
		System.out.println("upi :: constructor");
	}
	
	@Override
	public int pay() {
		return 1;
	}
}
